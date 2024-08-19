package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CustomerDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private CustomerCat customer;
    @OneToOne
    @JoinColumn(name = "document_id", nullable = false)
    private DocumentCat document;
    private Boolean mandatory;
}
