package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CustomerCatDto;
import com.lamarrulla.empresa.mapper.implement.CustomerCatMapperImpl;
import com.lamarrulla.empresa.repository.ICustomerCatRepository;
import com.lamarrulla.empresa.service.ICustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService {
    private final ICustomerCatRepository iCustomerCatRepository;
    private final CustomerCatMapperImpl customerCatMapper;

    public CustomerServiceImpl(ICustomerCatRepository iCustomerCatRepository, CustomerCatMapperImpl customerCatMapper) {
        this.iCustomerCatRepository = iCustomerCatRepository;
        this.customerCatMapper = customerCatMapper;
    }

    @Override
    public CustomerCatDto save(CustomerCatDto customerCatDto) {
        return customerCatMapper.toDto(iCustomerCatRepository.save(customerCatMapper.toEntity(customerCatDto)));
    }

    @Override
    public CustomerCatDto findById(Integer id) {
        return customerCatMapper.toDto(iCustomerCatRepository.findById(id).get());
    }

    @Override
    public List<CustomerCatDto> findAll() {
        return customerCatMapper.toDtoList(iCustomerCatRepository.findAll());
    }


}
