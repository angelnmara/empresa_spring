package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.AddressCatDto;
import com.lamarrulla.empresa.dto.CityCatDto;
import com.lamarrulla.empresa.service.implement.AddressCatServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/address-cat")
public class AddressCatController {

    private final AddressCatServiceImpl addressCatService;

    public AddressCatController(AddressCatServiceImpl addressCatService) {
        this.addressCatService = addressCatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(addressCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<AddressCatDto> save(@RequestBody AddressCatDto addressCatDto){
        return ResponseEntity.ok(addressCatService.save(addressCatDto));
    }

    @GetMapping
    public ResponseEntity<List<AddressCatDto>> findAll(){
        return ResponseEntity.ok(addressCatService.findAll());
    }
}
