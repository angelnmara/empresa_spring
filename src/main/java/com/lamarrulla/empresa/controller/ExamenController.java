package com.lamarrulla.empresa.controller;

import com.lamarrulla.empresa.bussines.IBussinesExamen;
import com.lamarrulla.empresa.dto.EmployeeDto;
import com.lamarrulla.empresa.entity.ObjetoRes;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/private/examen")
public class ExamenController {
    private final IBussinesExamen iBussinesExamen;

    public ExamenController(IBussinesExamen iBussinesExamen) {
        this.iBussinesExamen = iBussinesExamen;
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ObjetoRes>> findById(@PathVariable Integer id){
        return ResponseEntity.ok(iBussinesExamen.operacion(id));
    }

}
