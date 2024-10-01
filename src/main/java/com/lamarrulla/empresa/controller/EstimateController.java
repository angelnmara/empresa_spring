package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.EstimateDto;
import com.lamarrulla.empresa.service.implement.EstimateServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/private/estimate")
public class EstimateController {
    private final EstimateServiceImpl estimateService;

    public EstimateController(EstimateServiceImpl estimateService) {
        this.estimateService = estimateService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<EstimateDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(estimateService.findById(id));
    }
    @PostMapping
    public ResponseEntity<EstimateDto> save(@RequestBody EstimateDto estimateDto){
        return ResponseEntity.ok(estimateService.save(estimateDto));
    }

    @GetMapping
    public ResponseEntity<List<EstimateDto>> findAll(){
        return ResponseEntity.ok(estimateService.findAll());
    }
}
