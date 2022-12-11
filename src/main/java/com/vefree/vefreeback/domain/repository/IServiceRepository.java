package com.vefree.vefreeback.domain.repository;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.CancelServiceRequest;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.domain.dto.request.AcceptServiceRequest;

import java.util.List;

public interface IServiceRepository {
    ServiceDto save(CreateServiceRequest service);
    List<ServiceDto> getAll();
    List<ServiceDto> getByUserId(String userId);
    Boolean acceptService(AcceptServiceRequest data);
    Boolean cancelService(CancelServiceRequest data);
}
