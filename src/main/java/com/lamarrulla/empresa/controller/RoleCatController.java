package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.dto.RoleCatDto;
import com.lamarrulla.empresa.service.IRoleCatService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/private/role-cat")
public class RoleCatController {
    private final IRoleCatService iRoleCatService;

    public RoleCatController(IRoleCatService iRoleCatService) {
        this.iRoleCatService = iRoleCatService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<RoleCatDto> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iRoleCatService.findById(id));
    }
    @PostMapping
    public ResponseEntity<RoleCatDto> save(@RequestBody RoleCatDto roleCatDto){
        return ResponseEntity.ok(iRoleCatService.save(roleCatDto));
    }

    @GetMapping
    public ResponseEntity<List<RoleCatDto>> findAll(){
        return ResponseEntity.ok(iRoleCatService.findAll());
    }
}
