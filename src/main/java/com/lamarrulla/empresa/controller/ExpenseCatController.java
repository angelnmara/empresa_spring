package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.EmployeeDocumentDto;
import com.lamarrulla.empresa.dto.ExpenseCatDto;
import com.lamarrulla.empresa.service.implement.ExpenseCatServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/expense-cat")
public class ExpenseCatController {
    private final ExpenseCatServiceImpl expenseCatService;

    public ExpenseCatController(ExpenseCatServiceImpl expenseCatService) {
        this.expenseCatService = expenseCatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExpenseCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(expenseCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<ExpenseCatDto> save(@RequestBody ExpenseCatDto expenseCatDto){
        return ResponseEntity.ok(expenseCatService.save(expenseCatDto));
    }

    @GetMapping
    public ResponseEntity<List<ExpenseCatDto>> findAll(){
        return ResponseEntity.ok(expenseCatService.findAll());
    }
}
