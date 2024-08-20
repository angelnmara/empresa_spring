package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.CustomerDocumentDto;
import com.lamarrulla.empresa.service.ICountryCatService;
import com.lamarrulla.empresa.service.implement.CustomerDocumentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/customer-document")
public class CustomerDocumentController {
    private final CustomerDocumentServiceImpl customerDocumentService;

    public CustomerDocumentController(CustomerDocumentServiceImpl customerDocumentService) {
        this.customerDocumentService = customerDocumentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerDocumentDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(customerDocumentService.findById(id));
    }
    @PostMapping
    public ResponseEntity<CustomerDocumentDto> save(@RequestBody CustomerDocumentDto countryCatDto){
        return ResponseEntity.ok(customerDocumentService.save(countryCatDto));
    }

    @GetMapping
    public ResponseEntity<List<CustomerDocumentDto>> findAll(){
        return ResponseEntity.ok(customerDocumentService.findAll());
    }
}
