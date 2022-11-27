package com.vefree.vefreeback.persistence;

import com.vefree.vefreeback.domain.dto.VehicleTypeDto;
import com.vefree.vefreeback.domain.repository.IVehicleTypeRepository;
import com.vefree.vefreeback.persistence.crud.VehicleTypeCrudRepository;
import com.vefree.vefreeback.persistence.entity.VehicleType;
import com.vefree.vefreeback.persistence.mapper.VehicleTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VehicleTypeRepository implements IVehicleTypeRepository {
    @Autowired
    private VehicleTypeCrudRepository vehicleTypeCrudRepository;

    @Autowired
    private VehicleTypeMapper mapper;


    /**
     * Obtiene todos los servicios de la base de datos
     * @return
     */
    @Override
    public List<VehicleTypeDto> getAll() {

        List<VehicleType> vihiTypes = (List<VehicleType>) vehicleTypeCrudRepository.findAll();
        return mapper.toVehicleTypeList(vihiTypes);
    }
}
