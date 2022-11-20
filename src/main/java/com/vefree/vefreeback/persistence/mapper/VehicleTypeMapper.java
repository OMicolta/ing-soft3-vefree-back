package com.vefree.vefreeback.persistence.mapper;

import com.vefree.vefreeback.domain.dto.VehicleTypeDto;
import com.vefree.vefreeback.domain.dto.request.CreateVehicleTypeRequest;
import com.vefree.vefreeback.persistence.entity.VehicleType;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehicleTypeMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description")
    })
    VehicleTypeDto toVehicleTypeDto(VehicleType service);
    List<VehicleTypeDto> toVehicleTypeList(List<VehicleType> vehicleTypes);

    @InheritInverseConfiguration
    VehicleType toVehicleTypeEntity(CreateVehicleTypeRequest vehicleTypeRequest);
}
