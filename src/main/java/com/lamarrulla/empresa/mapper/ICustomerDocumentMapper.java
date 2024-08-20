package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.CustomerDocumentDto;
import com.lamarrulla.empresa.entity.CustomerDocument;

import java.util.List;

public interface ICustomerDocumentMapper {
    CustomerDocument toEntity(CustomerDocumentDto customerDocumentDto);
    CustomerDocumentDto toDto(CustomerDocument customerDocument);
    List<CustomerDocument> toEntityList(List<CustomerDocumentDto> customerDocumentDtoList);
    List<CustomerDocumentDto> toDtoList(List<CustomerDocument> customerDocumentList);
}
