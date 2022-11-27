package com.vefree.vefreeback.web.controller;

import com.vefree.vefreeback.domain.dto.VehicleTypeDto;
import com.vefree.vefreeback.domain.service.VehicleTypeService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicleType")
@CrossOrigin(origins = "*")
public class VehicleTypeController {
    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping("/getAll")
    @ApiOperation("Get all vehicle types")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<VehicleTypeDto>> getAll() {
        return new ResponseEntity<>(vehicleTypeService.getAll(), HttpStatus.CREATED);
    }
}
