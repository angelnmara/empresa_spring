package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class PersonalData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gender_id", referencedColumnName = "id")
    private GenderCat genderCat;
    private Integer age;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_data_id", referencedColumnName = "id")
    private ContactData contactData;
}
