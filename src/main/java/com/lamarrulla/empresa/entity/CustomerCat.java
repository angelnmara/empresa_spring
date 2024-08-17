package com.lamarrulla.empresa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class CustomerCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private PersonalData personalData;
    private List<AddressCat> addressList;
    private TitleCat title;
    private Integer grade;
    private List<CustomerVehicle> customerVehicleList;
    private List<CustomerDocument> customerDocumentList;
}