package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CustomerVehicleDto;
import com.lamarrulla.empresa.mapper.implement.CustomerVehicleMapper;
import com.lamarrulla.empresa.repository.ICustomerVehicleRepository;
import com.lamarrulla.empresa.service.ICustomerVehicleService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerVehicleServiceImpl implements ICustomerVehicleService {
    private final ICustomerVehicleRepository iCustomerVehicleRepository;
    private final CustomerVehicleMapper customerVehicleMapper;

    public CustomerVehicleServiceImpl(ICustomerVehicleRepository iCustomerVehicleRepository, CustomerVehicleMapper customerVehicleMapper) {
        this.iCustomerVehicleRepository = iCustomerVehicleRepository;
        this.customerVehicleMapper = customerVehicleMapper;
    }

    @Override
    public CustomerVehicleDto findById(Integer id) {
        return customerVehicleMapper.toDto(iCustomerVehicleRepository.findById(id).get());
    }

    @Override
    public CustomerVehicleDto save(CustomerVehicleDto customerVehicleDto) {
        return customerVehicleMapper.toDto(iCustomerVehicleRepository.save(customerVehicleMapper.toEntity(customerVehicleDto)));
    }

    @Override
    public List<CustomerVehicleDto> findAll() {
        return customerVehicleMapper.toDtoList(iCustomerVehicleRepository.findAll());
    }
}
