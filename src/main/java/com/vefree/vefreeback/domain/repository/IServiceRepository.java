package com.vefree.vefreeback.domain.repository;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.persistence.entity.Service;

public interface IServiceRepository {
    ServiceDto save(CreateServiceRequest service);
}
