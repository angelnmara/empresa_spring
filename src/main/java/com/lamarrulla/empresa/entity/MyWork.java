package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class MyWork {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private List<Estimate> estimateList;
    private Double totalAmount;
    private List<Double> payList;
    private TypePay typePay;
    private StatusWork statusWork;
}
