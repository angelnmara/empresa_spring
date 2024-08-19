package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class AddressCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private String internalNumber;
    private String externalNumber;
    @OneToOne
    @JoinColumn(name = "address_cat_city_cat_id", nullable = false)
    private CityCat city;
}
