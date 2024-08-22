package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.EmployeeDocumentDto;
import com.lamarrulla.empresa.service.implement.EmployeeDocumentServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/employee-document")
public class EmployeeDocumentController {
    private final EmployeeDocumentServiceImpl employeeDocumentService;

    public EmployeeDocumentController(EmployeeDocumentServiceImpl employeeDocumentService) {
        this.employeeDocumentService = employeeDocumentService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDocumentDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(employeeDocumentService.findById(id));
    }
    @PostMapping
    public ResponseEntity<EmployeeDocumentDto> save(@RequestBody EmployeeDocumentDto employeeDocumentDto){
        return ResponseEntity.ok(employeeDocumentService.save(employeeDocumentDto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDocumentDto>> findAll(){
        return ResponseEntity.ok(employeeDocumentService.findAll());
    }
}
