package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.CountryCatDto;
import com.lamarrulla.empresa.service.ICountryCatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/country-cat")
public class CountryCatController {
    private final ICountryCatService iCountryCatService;

    public CountryCatController(ICountryCatService iCountryCatService) {
        this.iCountryCatService = iCountryCatService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<CountryCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iCountryCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<CountryCatDto> save(@RequestBody CountryCatDto countryCatDto){
        return ResponseEntity.ok(iCountryCatService.save(countryCatDto));
    }

    @GetMapping
    public ResponseEntity<List<CountryCatDto>> findAll(){
        return ResponseEntity.ok(iCountryCatService.findAll());
    }
}
