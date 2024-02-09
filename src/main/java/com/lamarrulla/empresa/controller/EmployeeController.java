package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.EmployeeDto;
import com.lamarrulla.empresa.service.IEmployeeService;
/*import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/employee")
public class EmployeeController {
    private final IEmployeeService iEmployeeService;

    public EmployeeController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iEmployeeService.findById(id));
    }
    @PostMapping
    public ResponseEntity<EmployeeDto> save(@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(iEmployeeService.save(employeeDto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeDto>> findAll(){
        return ResponseEntity.ok(iEmployeeService.findAll());
    }

}
