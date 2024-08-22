package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.EmployeeCatDto;
import com.lamarrulla.empresa.service.IEmployeeService;
/*import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;*/
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/employee-cat")
public class EmployeeCatController {
    private final IEmployeeService iEmployeeService;

    public EmployeeCatController(IEmployeeService iEmployeeService) {
        this.iEmployeeService = iEmployeeService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<EmployeeCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iEmployeeService.findById(id));
    }
    @PostMapping
    public ResponseEntity<EmployeeCatDto> save(@RequestBody EmployeeCatDto employeeCatDto){
        return ResponseEntity.ok(iEmployeeService.save(employeeCatDto));
    }

    @GetMapping
    public ResponseEntity<List<EmployeeCatDto>> findAll(){
        return ResponseEntity.ok(iEmployeeService.findAll());
    }

}
