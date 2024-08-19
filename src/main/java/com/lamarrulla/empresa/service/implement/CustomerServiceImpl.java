package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CustomerCatDto;
import com.lamarrulla.empresa.repository.ICustomerCatRepository;
import com.lamarrulla.empresa.service.ICustomerService;

public class CustomerServiceImpl implements ICustomerService {
    private final ICustomerCatRepository iCustomerCatRepository;

    public CustomerServiceImpl(ICustomerCatRepository iCustomerCatRepository) {
        this.iCustomerCatRepository = iCustomerCatRepository;
    }

    @Override
    public CustomerCatDto save(CustomerCatDto customerCatDto) {
        return null;
    }
}
