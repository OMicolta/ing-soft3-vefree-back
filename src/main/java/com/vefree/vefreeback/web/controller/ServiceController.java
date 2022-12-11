package com.vefree.vefreeback.web.controller;

import com.vefree.vefreeback.domain.dto.ServiceDto;
import com.vefree.vefreeback.domain.dto.request.AcceptServiceRequest;
import com.vefree.vefreeback.domain.dto.request.CancelServiceRequest;
import com.vefree.vefreeback.domain.dto.request.CreateServiceRequest;
import com.vefree.vefreeback.domain.service.ServiceService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
@CrossOrigin(origins = "*")
public class ServiceController {
    @Autowired
    private ServiceService serviceService;

    @PostMapping("/create")
    @ApiOperation("Create a service")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<ServiceDto> save(@RequestBody CreateServiceRequest service) {
        return new ResponseEntity<>(serviceService.save(service), HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    @ApiOperation("Get all services")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<ServiceDto>> getAll() {
        return new ResponseEntity<>(serviceService.getAll(), HttpStatus.OK);
    }

    @GetMapping("/getByUserId")
    @ApiOperation("Get all services by user")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<List<ServiceDto>> getByUserId(@RequestParam String userId) {
        return new ResponseEntity<>(serviceService.getByUserId(userId), HttpStatus.OK);
    }


    @PatchMapping("/acceptService")
    @ApiOperation("Accept a service")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<Boolean> acceptService(@RequestBody AcceptServiceRequest data) {
        return new ResponseEntity<>(serviceService.acceptService(data), HttpStatus.OK);
    }

    @PatchMapping("/cancelService")
    @ApiOperation("Cancel a service")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity<Boolean> cancelService(@RequestBody CancelServiceRequest data) {
        return new ResponseEntity<>(serviceService.cancelService(data), HttpStatus.OK);
    }
}
