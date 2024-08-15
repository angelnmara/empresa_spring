package com.lamarrulla.empresa.dto.dto;

import com.lamarrulla.empresa.entity.Estimate;
import com.lamarrulla.empresa.entity.StatusWorkCat;
import com.lamarrulla.empresa.entity.TypePayCat;
import lombok.Data;

import java.util.List;
@Data
public class MyWorkDto {
    private Long id;
    private String description;
    private List<Estimate> estimateList;
    private Double totalAmount;
    private List<Double> payList;
    private TypePayCat typePay;
    private StatusWorkCat statusWorkCat;
}
