package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.CustomerCatDto;

import java.util.List;

public interface ICustomerService {
    CustomerCatDto save(CustomerCatDto customerCatDto);
    CustomerCatDto findById(Integer id);
    List<CustomerCatDto> findAll();
}
