package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.DocumentCatDto;
import com.lamarrulla.empresa.service.implement.DocumentCatServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/document-cat")
public class DocumentCatController {

    private final DocumentCatServiceImpl documentCatService;

    public DocumentCatController(DocumentCatServiceImpl documentCatService) {
        this.documentCatService = documentCatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<DocumentCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(documentCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<DocumentCatDto> save(@RequestBody DocumentCatDto documentCatDto){
        return ResponseEntity.ok(documentCatService.save(documentCatDto));
    }

    @GetMapping
    public ResponseEntity<List<DocumentCatDto>> findAll(){
        return ResponseEntity.ok(documentCatService.findAll());
    }
}
