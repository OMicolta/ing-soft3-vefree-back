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

    /**
     * Guarda un servicio en base de datos
     * @param request
     * @return Servicio creado
     */
    @Override
    public ServiceDto save(CreateServiceRequest request) {
        Service service = mapper.toServiceEntity(request);
        return mapper.toServiceDto(serviceCrudRepository.save(service));
    }

    /**
     * Obtienes todos los servicios de la base de datos
     * @return Lista de servicios
     */
    @Override
    public List<ServiceDto> getAll() {
        List<Service> services = (List<Service>) serviceCrudRepository.findAll();
        return mapper.toServices(services);
    }

    /**
     * Obtiene los servicios relacionados a un usuario
     * @param userId Cédula del usuario
     * @return
     */
    @Override
    public List<ServiceDto> getByUserId(String userId) {
        List<Service> services = (List<Service>) serviceCrudRepository.findByUserId(userId);
        return mapper.toServices(services);
    }

    /**
     * Actualiza la información del usuario que acepta el servicio
     * @param data
     * @return
     */
    @Override
    public Boolean acceptService(AcceptServiceRequest data) {
        Service service = serviceCrudRepository.findById(data.getServiceId()).get();
        if (service != null) {
            service.setBeneficiaryName(data.getBeneficiaryName());
            service.setBeneficiaryId(data.getBeneficiaryId());
            service.setStatus('A');
        }
        Service serviceUpdated = serviceCrudRepository.save(service);
        return serviceUpdated != null;
    }

    /**
     * Perimite cancelar un servico tanto al proveedor como al beneficiario
     * @param data
     * @return
     */
    @Override
    public Boolean cancelService(CancelServiceRequest data) {
        Service service = serviceCrudRepository.findById(data.getServiceId()).get();
        if (service == null) {
            return false;
        }

        if (data.getUserId().equals(service.getProviderId())) {
            service.setStatus('R');
        } else {
            service.setBeneficiaryName(null);
            service.setBeneficiaryId(null);
            service.setStatus('I');
        }
        Service serviceUpdated = serviceCrudRepository.save(service);
        return serviceUpdated != null;
    }
}
