package com.vefree.vefreeback.domain.service;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.AcceptServiceRequest;
import com.vefree.vefreeback.domain.dto.request.CancelServiceRequest;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.persistence.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceService {

    @Autowired
    private ServiceRepository serviceRepository;


    /**
     * Guarda un servicio en base de datos
     * @param service
     * @return Servicio creado
     */
    public ServiceDto save(CreateServiceRequest service) {
        return serviceRepository.save(service);
    }

    /**
     * Obtienes todos los servicios de la base de datos
     * @return Lista de servicios
     */
    public List<ServiceDto> getAll() {
        return serviceRepository.getAll();
    }

    /**
     * Actualiza la información del usuario que acepta el servicio
     * @param data
     * @return
     */
    public Boolean acceptService(AcceptServiceRequest data) {
        return serviceRepository.acceptService(data);
    }

    /**
     * Permite cancelar servicios a proveedores y beneficiarios
     * @param data
     * @return
     */
    public Boolean cancelService(CancelServiceRequest data) {
        return serviceRepository.cancelService(data);
    }
}
