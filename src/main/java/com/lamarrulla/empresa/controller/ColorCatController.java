package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.ColorCatDto;
import com.lamarrulla.empresa.service.implement.ColorCatServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/color-cat")
public class ColorCatController {
    private final ColorCatServiceImpl colorCatService;

    public ColorCatController(ColorCatServiceImpl colorCatService) {
        this.colorCatService = colorCatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ColorCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(colorCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<ColorCatDto> save(@RequestBody ColorCatDto colorCatDto){
        return ResponseEntity.ok(colorCatService.save(colorCatDto));
    }

    @GetMapping
    public ResponseEntity<List<ColorCatDto>> findAll(){
        return ResponseEntity.ok(colorCatService.findAll());
    }
}
