package com.vefree.vefreeback.web.controller;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.domain.service.ServiceService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/services")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @PostMapping("/create")
    @ApiOperation("Create a service")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<ServiceDto> save(@RequestBody CreateServiceRequest service) {
        return new ResponseEntity<>(serviceService.save(service), HttpStatus.CREATED);
    }

    @GetMapping("/saludar")
    public String saludar() {
        return "Hola Mundo";
    }
}
