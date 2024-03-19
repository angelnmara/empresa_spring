package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.CompanyCatDto;
import com.lamarrulla.empresa.service.ICompanyCatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/company-cat")
public class CompanyCatController {
    private final ICompanyCatService iCompanyCatService;

    public CompanyCatController(ICompanyCatService iCompanyCatService) {
        this.iCompanyCatService = iCompanyCatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CompanyCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iCompanyCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<CompanyCatDto> save(@RequestBody CompanyCatDto companyCatDto){
        return ResponseEntity.ok(iCompanyCatService.save(companyCatDto));
    }

    @GetMapping
    public ResponseEntity<List<CompanyCatDto>> findAll(){
        return ResponseEntity.ok(iCompanyCatService.findAll());
    }
}