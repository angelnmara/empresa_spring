package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;

public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private List<Address> address;
    private List<PersonalData> mannager;
    private Integer grade;
    private ContactData contactData;
    private List<DocumentsCat> documentsCatList;
    private List<Services> servicesList;
    private List<Budget> budgetList;
}
