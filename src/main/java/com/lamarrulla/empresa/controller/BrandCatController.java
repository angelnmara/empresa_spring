package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.AddressCatDto;
import com.lamarrulla.empresa.dto.BrandCatDto;
import com.lamarrulla.empresa.service.implement.BrandCatServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/brand-cat")
public class BrandCatController {

    private final BrandCatServiceImpl brandCatService;

    public BrandCatController(BrandCatServiceImpl brandCatService) {
        this.brandCatService = brandCatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BrandCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(brandCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<BrandCatDto> save(@RequestBody BrandCatDto brandCatDto){
        return ResponseEntity.ok(brandCatService.save(brandCatDto));
    }

    @GetMapping
    public ResponseEntity<List<BrandCatDto>> findAll(){
        return ResponseEntity.ok(brandCatService.findAll());
    }
}
