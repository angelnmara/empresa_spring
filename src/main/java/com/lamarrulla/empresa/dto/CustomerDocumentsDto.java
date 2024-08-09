package com.lamarrulla.empresa.dto;

import com.lamarrulla.empresa.entity.CustomerCat;
import com.lamarrulla.empresa.entity.DocumentsCat;

public class CustomerDocumentsDto {
    private Long id;
    private CustomerCat customer;
    private DocumentsCat document;
    private Boolean mandatory;
}
