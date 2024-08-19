package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class EmployeeDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false)
    EmployeeCat employee;
    @OneToOne
    @JoinColumn(name = "document_id", nullable = false)
    DocumentCat document;
}
