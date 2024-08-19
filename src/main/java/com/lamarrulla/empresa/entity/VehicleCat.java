package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class VehicleCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "brand_cat_id", nullable = false)
    private BrandCat brandCat;
    @OneToOne
    @JoinColumn(name = "model_cat_id", nullable = false)
    private ModelCat modelCat;
    private Integer year;
}
