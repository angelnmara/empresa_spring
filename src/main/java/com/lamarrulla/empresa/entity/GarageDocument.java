package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class GarageDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "garage_id", nullable = false)
    private GarageCat garage;
    @OneToOne
    @JoinColumn(name = "document_id", nullable = false)
    private DocumentCat document;
    private Boolean mandatory;
}
