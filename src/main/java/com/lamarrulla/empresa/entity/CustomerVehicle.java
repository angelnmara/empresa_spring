package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Data
@Entity
public class CustomerVehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "customer_cat_id", nullable = false)
    private CustomerCat customer;
    @OneToOne
    @JoinColumn(name = "vehicle_cat_id", nullable = false)
    private VehicleCat vehicle;
    private String plate;
    @OneToOne
    @JoinColumn(name = "color_cat_id", nullable = false)
    private ColorCat colorCat;
    private Integer kilometerAge;
    private Integer chassisNumber;
    private List<String> imageList;
}
