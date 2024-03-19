package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CommunityCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String communityName;
    private Long ZipCode;
    @ManyToOne
    @JoinColumn(name = "city_cat_id", nullable = false)
    private CityCat cityCat;
}
