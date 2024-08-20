package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class CustomerCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "personal_data_custome_cat_id", nullable = false)
    private PersonalData personalData;
    @OneToMany
    @JoinColumn(name = "address_cat_customer_cat_id", nullable = false)
    private List<AddressCat> addressList;
    @OneToOne
    @JoinColumn(name = "title_cat_customer_cat_id", nullable = false)
    private TitleCat title;
    private Integer grade;
    /*@OneToMany
    @JoinColumn(name = "customer_vehicle_customer_cat_id", nullable = false)
    private List<CustomerVehicle> customerVehicleList;
    @OneToMany
    @JoinColumn(name = "document_cat_customer_cat_id", nullable = false)
    private List<CustomerDocument> customerDocumentList;*/
}