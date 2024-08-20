package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.ContactDataDto;
import com.lamarrulla.empresa.service.implement.ContactDataServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/contact-data")
public class ContactDataController {
    private final ContactDataServiceImpl contactDataService;

    public ContactDataController(ContactDataServiceImpl contactDataService) {
        this.contactDataService = contactDataService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactDataDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(contactDataService.findById(id));
    }
    @PostMapping
    public ResponseEntity<ContactDataDto> save(@RequestBody ContactDataDto contactDataDto){
        return ResponseEntity.ok(contactDataService.save(contactDataDto));
    }

    @GetMapping
    public ResponseEntity<List<ContactDataDto>> findAll(){
        return ResponseEntity.ok(contactDataService.findAll());
    }
}
