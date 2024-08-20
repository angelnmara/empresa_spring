package com.lamarrulla.empresa.service.implement;

import com.lamarrulla.empresa.dto.CustomerDocumentDto;
import com.lamarrulla.empresa.mapper.implement.CustomerDocumentMapperImpl;
import com.lamarrulla.empresa.repository.ICustomerDocumentRepository;
import com.lamarrulla.empresa.service.ICustomerDocumentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerDocumentServiceImpl implements ICustomerDocumentService {
    private final ICustomerDocumentRepository iCustomerDocumentRepository;
    private final CustomerDocumentMapperImpl customerDocumentMapper;

    public CustomerDocumentServiceImpl(ICustomerDocumentRepository iCustomerDocumentRepository, CustomerDocumentMapperImpl customerDocumentMapper) {
        this.iCustomerDocumentRepository = iCustomerDocumentRepository;
        this.customerDocumentMapper = customerDocumentMapper;
    }

    @Override
    public CustomerDocumentDto findById(Integer Id) {
        return customerDocumentMapper.toDto(iCustomerDocumentRepository.findById(Id).get());
    }

    @Override
    public CustomerDocumentDto save(CustomerDocumentDto customerDocumentDto) {
        return customerDocumentMapper.toDto(iCustomerDocumentRepository.save(customerDocumentMapper.toEntity(customerDocumentDto)));
    }

    @Override
    public List<CustomerDocumentDto> findAll() {
        return customerDocumentMapper.toDtoList(iCustomerDocumentRepository.findAll());
    }
}