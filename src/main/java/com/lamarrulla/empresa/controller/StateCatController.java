package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.StateCatDto;
import com.lamarrulla.empresa.service.IStateCatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/state-cat")
public class StateCatController {
    private final IStateCatService iStateCatService;

    public StateCatController(IStateCatService iStateCatService) {
        this.iStateCatService = iStateCatService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<StateCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iStateCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<StateCatDto> save(@RequestBody StateCatDto stateCatDto){
        return ResponseEntity.ok(iStateCatService.save(stateCatDto));
    }

    @GetMapping
    public ResponseEntity<List<StateCatDto>> findAll(){
        return ResponseEntity.ok(iStateCatService.findAll());
    }
}
