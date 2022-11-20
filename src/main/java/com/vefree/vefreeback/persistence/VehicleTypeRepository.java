package com.vefree.vefreeback.persistence;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.VehicleTypeDto;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.domain.repository.IServiceRepository;
import com.vefree.vefreeback.domain.repository.IVehicleTypeRepository;
import com.vefree.vefreeback.persistence.crud.ServiceCrudRepository;
import com.vefree.vefreeback.persistence.crud.VehicleTypeCrudRepository;
import com.vefree.vefreeback.persistence.entity.Service;
import com.vefree.vefreeback.persistence.entity.VehicleType;
import com.vefree.vefreeback.persistence.mapper.ServiceMapper;
import com.vefree.vefreeback.persistence.mapper.VehicleTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Iterator;
import java.util.List;

@Repository
public class VehicleTypeRepository implements IVehicleTypeRepository {
    @Autowired
    private VehicleTypeCrudRepository vehicleTypeCrudRepository;

    @Autowired
    private VehicleTypeMapper mapper;


    @Override
    public List<VehicleTypeDto> getAll() {

        List<VehicleType> vihiTypes = (List<VehicleType>) vehicleTypeCrudRepository.findAll();
        return mapper.toVehicleTypeList(vihiTypes);
    }
}
