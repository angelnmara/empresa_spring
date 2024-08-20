package com.lamarrulla.empresa.service;

import com.lamarrulla.empresa.dto.CustomerDocumentDto;

import java.util.List;

public interface ICustomerDocumentService {
    CustomerDocumentDto findById(Integer Id);
    CustomerDocumentDto save(CustomerDocumentDto customerDocumentDto);
    List<CustomerDocumentDto> findAll();
}
