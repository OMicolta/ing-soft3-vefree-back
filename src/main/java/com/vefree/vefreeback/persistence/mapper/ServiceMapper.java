package com.vefree.vefreeback.persistence.mapper;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.persistence.entity.Service;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServiceMapper {
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "initialDate", target = "initialDate"),
            @Mapping(source = "vehicleTypeId", target = "vehicleTypeId"),
            @Mapping(source = "providerUserId", target = "providerUserId"),
            @Mapping(source = "beneficiaryUserId", target = "beneficiaryUserId"),
            @Mapping(source = "statusId", target = "statusId"),
            @Mapping(source = "routeId", target = "routeId")
    })
    ServiceDto toServiceDto(Service service);
    List<ServiceDto> toServices(List<Service> services);

    @InheritInverseConfiguration
    //@Mapping(target = "id", ignore = true)
    Service toServiceEntity(CreateServiceRequest service);
}
