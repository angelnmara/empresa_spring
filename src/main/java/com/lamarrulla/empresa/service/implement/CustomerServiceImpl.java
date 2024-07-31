package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CustomerDto;
import com.lamarrulla.empresa.repository.ICustomerRepository;
import com.lamarrulla.empresa.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {
    private final ICustomerRepository iCustomerRepository;

    public CustomerServiceImpl(ICustomerRepository iCustomerRepository) {
        this.iCustomerRepository = iCustomerRepository;
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return null;
    }
}
