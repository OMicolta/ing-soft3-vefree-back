package com.vefree.vefreeback.domain.service;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.AcceptServiceRequest;
import com.vefree.vefreeback.domain.dto.request.CancelServiceRequest;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.persistence.ServiceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class ServiceServiceTest {

    @Mock
    private ServiceRepository serviceRepository;
    @InjectMocks
    private ServiceService serviceService;
    private CreateServiceRequest service;
    private List<ServiceDto> services = new ArrayList<>();
    private AcceptServiceRequest acceptServiceRequest;
    private CancelServiceRequest cancelServicePrivider;
    private CancelServiceRequest cancelServiceBeneficiary;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        service = new CreateServiceRequest();
        service.setName("Cupo en moto");
        service.setDescription("Llegar puntual");
        service.setInitialDate(new Date());
        service.setProviderName("Oivar Micolta");
        service.setProviderId("123456789");
        service.setSource("Universidad");
        service.setDestination("Chipre");

        acceptServiceRequest = new AcceptServiceRequest();
        acceptServiceRequest.setServiceId(1);
        acceptServiceRequest.setBeneficiaryName("Juan Henao");
        acceptServiceRequest.setBeneficiaryId("987654321");

        cancelServicePrivider = new CancelServiceRequest();
        cancelServicePrivider.setServiceId(1);
        cancelServicePrivider.setUserId("123456789");

        cancelServiceBeneficiary = new CancelServiceRequest();
        cancelServiceBeneficiary.setServiceId(1);
        cancelServiceBeneficiary.setUserId("987654321");
    }

    @Test
    void save() {
        Mockito.when(serviceRepository.save(service)).thenReturn(new ServiceDto());
        assertNotNull(serviceService.save(service));
    }

    @Test
    void getAll() {
        Mockito.when(serviceRepository.getAll()).thenReturn(services);
        assertNotNull(serviceService.getAll());
    }

    @Test
    void getByUserId() {
        Mockito.when(serviceRepository.getByUserId("123456789")).thenReturn(services);
        assertNotNull(serviceService.getAll());
    }

    @Test
    void acceptService() {
        Mockito.when(serviceRepository.acceptService(acceptServiceRequest)).thenReturn(Boolean.TRUE);
        assertTrue(serviceService.acceptService(acceptServiceRequest));
    }

    @Test
    void cancelServiceByProvider() {
        Mockito.when(serviceRepository.cancelService(cancelServicePrivider)).thenReturn(Boolean.TRUE);
        assertTrue(serviceService.cancelService(cancelServicePrivider));
    }

    @Test
    void cancelServiceByBeneficiary() {
        Mockito.when(serviceRepository.cancelService(cancelServiceBeneficiary)).thenReturn(Boolean.TRUE);
        assertTrue(serviceService.cancelService(cancelServiceBeneficiary));
    }
}