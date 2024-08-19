package com.lamarrulla.empresa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class EmployeeCat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_data_id", referencedColumnName = "id")
    private PersonalData personalData;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_cat_id", referencedColumnName = "id")
    private List<RoleCat> roleCatList;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_data_id", referencedColumnName = "id")
    private ContactData contactData;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", referencedColumnName = "id")
    private CompanyCat companyCat;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_document_id", referencedColumnName = "id")
    private List<EmployeeDocument> employeeDocumentList;
}
