package com.vefree.vefreeback.domain.repository;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.VehicleTypeDto;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;

import java.util.List;

public interface IVehicleTypeRepository {
    List<VehicleTypeDto> getAll();
}
