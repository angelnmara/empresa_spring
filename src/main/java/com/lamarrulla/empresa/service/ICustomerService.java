package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.CustomerDto;
import com.lamarrulla.empresa.entity.Customer;

public interface ICustomerService {
    CustomerDto save(CustomerDto customerDto);
}
