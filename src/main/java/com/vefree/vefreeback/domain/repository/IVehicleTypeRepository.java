package com.vefree.vefreeback.domain.repository;

import com.vefree.vefreeback.domain.dto.VehicleTypeDto;

import java.util.List;

public interface IVehicleTypeRepository {
    List<VehicleTypeDto> getAll();
}
