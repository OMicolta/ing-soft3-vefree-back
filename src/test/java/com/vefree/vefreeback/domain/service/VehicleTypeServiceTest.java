package com.vefree.vefreeback.domain.service;

import com.vefree.vefreeback.domain.dto.VehicleTypeDto;
import com.vefree.vefreeback.persistence.VehicleTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTypeServiceTest {

    @Mock
    private VehicleTypeRepository vehicleTypeRepository;

    @InjectMocks
    private VehicleTypeService vehicleTypeService;
    private List<VehicleTypeDto> vehicleTypes = new ArrayList<>();

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getAll() {
        Mockito.when(vehicleTypeRepository.getAll()).thenReturn(vehicleTypes);
        assertNotNull(vehicleTypeService.getAll());
    }
}