package com.lamarrulla.empresa.entity;

import com.lamarrulla.empresa.vo.EmployeeVO;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "personal_data_id", referencedColumnName = "id")
    private PersonalData personalData;
    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_cat_id", referencedColumnName = "id")
    private List<RoleCat> roleCat;
}
