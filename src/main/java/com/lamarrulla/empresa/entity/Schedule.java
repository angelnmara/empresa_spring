package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
@Data
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerCat customerCat;
    private Date date;
    private String description;
    @OneToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private EmployeeCat employeeCatAssign;
}