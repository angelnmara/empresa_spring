package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.GarageBudgetDto;
import com.lamarrulla.empresa.dto.GarageCatDto;
import com.lamarrulla.empresa.service.implement.GarageCatServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/garage-cat")
public class GarageCatController {
    private final GarageCatServiceImpl garageCatService;

    public GarageCatController(GarageCatServiceImpl garageCatService) {
        this.garageCatService = garageCatService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<GarageCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(garageCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<GarageCatDto> save(@RequestBody GarageCatDto garageCatDto){
        return ResponseEntity.ok(garageCatService.save(garageCatDto));
    }

    @GetMapping
    public ResponseEntity<List<GarageCatDto>> findAll(){
        return ResponseEntity.ok(garageCatService.findAll());
    }
}
