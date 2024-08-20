package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.BudgetCatDto;
import com.lamarrulla.empresa.service.implement.BudgetCatServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/budget-cat")
public class BudgetCatController {

    private final BudgetCatServiceImpl budgetCatService;

    public BudgetCatController(BudgetCatServiceImpl budgetCatService) {
        this.budgetCatService = budgetCatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<BudgetCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(budgetCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<BudgetCatDto> save(@RequestBody BudgetCatDto budgetCatDto){
        return ResponseEntity.ok(budgetCatService.save(budgetCatDto));
    }

    @GetMapping
    public ResponseEntity<List<BudgetCatDto>> findAll(){
        return ResponseEntity.ok(budgetCatService.findAll());
    }
}
