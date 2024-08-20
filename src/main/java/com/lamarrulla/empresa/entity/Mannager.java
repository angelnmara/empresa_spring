package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Mannager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "personal_data_mannager_id", nullable = false)
    private PersonalData personalData;
    @OneToOne
    @JoinColumn(name = "contact_data_mannager_id", nullable = false)
    private ContactData contactData;
}
