package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.GarageBudgetDto;
import com.lamarrulla.empresa.service.implement.GarageBudgetServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/garage-budget")
public class GarageBudgetController {
    private final GarageBudgetServiceImpl garageBudgetService;

    public GarageBudgetController(GarageBudgetServiceImpl garageBudgetService) {
        this.garageBudgetService = garageBudgetService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GarageBudgetDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(garageBudgetService.findById(id));
    }
    @PostMapping
    public ResponseEntity<GarageBudgetDto> save(@RequestBody GarageBudgetDto garageBudgetDto){
        return ResponseEntity.ok(garageBudgetService.save(garageBudgetDto));
    }

    @GetMapping
    public ResponseEntity<List<GarageBudgetDto>> findAll(){
        return ResponseEntity.ok(garageBudgetService.findAll());
    }
}
