package com.vefree.vefreeback.persistence;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.domain.repository.IServiceRepository;
import com.vefree.vefreeback.persistence.crud.ServiceCrudRepository;
import com.vefree.vefreeback.persistence.entity.Service;
import com.vefree.vefreeback.persistence.entity.VehicleType;
import com.vefree.vefreeback.persistence.mapper.ServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.ListIterator;

@Repository
public class ServiceRepository implements IServiceRepository {
    @Autowired
    private ServiceCrudRepository serviceCrudRepository;

    @Autowired
    private ServiceMapper mapper;

    @Override
    public ServiceDto save(CreateServiceRequest request) {
        Service service = mapper.toServiceEntity(request);
        return mapper.toServiceDto(serviceCrudRepository.save(service));
    }

    @Override
    public List<ServiceDto> getAll() {
        List<Service> services = (List<Service>) serviceCrudRepository.findAll();
        return mapper.toServices(services);
    }
}
