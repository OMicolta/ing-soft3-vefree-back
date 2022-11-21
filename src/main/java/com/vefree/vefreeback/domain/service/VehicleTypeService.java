package com.vefree.vefreeback.domain.service;

import com.vefree.vefreeback.domain.dto.VehicleTypeDto;
import com.vefree.vefreeback.persistence.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    /**
     * Obtiene todos los servicios de la base de datos
     * @return
     */
    public List<VehicleTypeDto> getAll() {
        return vehicleTypeRepository.getAll();
    }
}
