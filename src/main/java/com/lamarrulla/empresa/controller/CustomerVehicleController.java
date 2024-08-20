package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.CustomerVehicleDto;
import com.lamarrulla.empresa.service.implement.CustomerVehicleServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/customer-vehicle")
public class CustomerVehicleController {
    private final CustomerVehicleServiceImpl customerVehicleService;

    public CustomerVehicleController(CustomerVehicleServiceImpl customerVehicleService) {
        this.customerVehicleService = customerVehicleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerVehicleDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(customerVehicleService.findById(id));
    }
    @PostMapping
    public ResponseEntity<CustomerVehicleDto> save(@RequestBody CustomerVehicleDto customerVehicleDto){
        return ResponseEntity.ok(customerVehicleService.save(customerVehicleDto));
    }

    @GetMapping
    public ResponseEntity<List<CustomerVehicleDto>> findAll(){
        return ResponseEntity.ok(customerVehicleService.findAll());
    }
}
