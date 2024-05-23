package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.entity.Alli.Result;
import com.lamarrulla.empresa.service.IAlliService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/private/alli")
public class AlliController {
    private final IAlliService iAlliService;

    public AlliController(IAlliService iAlliService) {
        this.iAlliService = iAlliService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Result> getProductById(@PathVariable String id) {
        return ResponseEntity.ok(iAlliService.getProductsById(id));
    }
}
