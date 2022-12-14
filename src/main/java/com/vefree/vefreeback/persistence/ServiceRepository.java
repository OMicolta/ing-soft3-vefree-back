package com.vefree.vefreeback.persistence;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.CancelServiceRequest;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.domain.dto.request.AcceptServiceRequest;
import com.vefree.vefreeback.domain.repository.IServiceRepository;
import com.vefree.vefreeback.persistence.crud.ServiceCrudRepository;
import com.vefree.vefreeback.persistence.entity.Service;
import com.vefree.vefreeback.persistence.mapper.ServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ServiceRepository implements IServiceRepository {
    @Autowired
    private ServiceCrudRepository serviceCrudRepository;
    @Autowired
    private ServiceMapper mapper;

    public static final Character AVAILABLE = 'D';
    public static final Character ACCEPTED = 'A';
    public static final Character CANCELLED = 'C';

    /**
     * Guarda un servicio en base de datos
     * @param request
     * @return Servicio creado
     */
    @Override
    public ServiceDto save(CreateServiceRequest request) {
        Service service = mapper.toServiceEntity(request);
        service.setStatus(AVAILABLE);
        return mapper.toServiceDto(serviceCrudRepository.save(service));
    }

    /**
     * Obtienes todos los servicios de la base de datos
     * @return Lista de servicios
     */
    @Override
    public List<ServiceDto> getAll() {
        List<Service> services = serviceCrudRepository.findAll(AVAILABLE);
        return mapper.toServices(services);
    }

    /**
     * Obtiene los servicios relacionados a un usuario
     * @param userId Cédula del usuario
     * @return
     */
    @Override
    public List<ServiceDto> getByUserId(String userId) {
        List<Service> services = serviceCrudRepository.findByUserId(userId);
        return mapper.toServices(services);
    }

    /**
     * Actualiza la información del usuario que acepta el servicio
     * @param data
     * @return
     */
    @Override
    public Boolean acceptService(AcceptServiceRequest data) {
        Service serviceUpdated = new Service();
        Service service;
        Optional<Service> serviceInfo = serviceCrudRepository.findById(data.getServiceId());
        if (serviceInfo.isPresent()) {
            service = serviceInfo.get();
            service.setBeneficiaryName(data.getBeneficiaryName());
            service.setBeneficiaryId(data.getBeneficiaryId());
            service.setStatus(ACCEPTED);
            serviceUpdated = serviceCrudRepository.save(service);
        }
        return serviceUpdated != null;
    }

    /**
     * Perimite cancelar un servico tanto al proveedor como al beneficiario
     * @param data
     * @return
     */
    @Override
    public Boolean cancelService(CancelServiceRequest data) {
        Service service = new Service();
        Optional<Service> serviceInfo = serviceCrudRepository.findById(data.getServiceId());
        if (serviceInfo.isPresent()) {
            service = serviceInfo.get();
        }

        if (data.getUserId().equals(service.getProviderId())) {
            service.setStatus(CANCELLED);
        } else {
            service.setBeneficiaryName(null);
            service.setBeneficiaryId(null);
            service.setStatus(AVAILABLE);
        }
        Service serviceUpdated = serviceCrudRepository.save(service);
        return serviceUpdated != null;
    }
}
