package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.CityCatDto;
import com.lamarrulla.empresa.service.ICityCatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/city-cat")
public class CityCatController {
    private final ICityCatService iCityCatService;

    public CityCatController(ICityCatService iCityCatService) {
        this.iCityCatService = iCityCatService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<CityCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iCityCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<CityCatDto> save(@RequestBody CityCatDto cityCatDto){
        return ResponseEntity.ok(iCityCatService.save(cityCatDto));
    }

    @GetMapping
    public ResponseEntity<List<CityCatDto>> findAll(){
        return ResponseEntity.ok(iCityCatService.findAll());
    }
}
