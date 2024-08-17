package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.PersonalDataDto;
import com.lamarrulla.empresa.service.IPersonalDataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/personal-data")
public class PersonalDataController {
    private final IPersonalDataService iPersonalDataService;

    public PersonalDataController(IPersonalDataService iPersonalDataService) {
        this.iPersonalDataService = iPersonalDataService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonalDataDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iPersonalDataService.findById(id));
    }
    @PostMapping
    public ResponseEntity<PersonalDataDto> save(@RequestBody PersonalDataDto personalDataDto){
        return ResponseEntity.ok(iPersonalDataService.save(personalDataDto));
    }

    @GetMapping
    public ResponseEntity<List<PersonalDataDto>> findAll(){
        return ResponseEntity.ok(iPersonalDataService.findAll());
    }
}
