package com.vefree.vefreeback.domain.repository;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;

import java.util.List;

public interface IServiceRepository {
    ServiceDto save(CreateServiceRequest service);
    List<ServiceDto> getAll();
}
