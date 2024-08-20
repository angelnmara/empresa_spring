package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CustomerDocumentDto;
import com.lamarrulla.empresa.entity.CustomerDocument;
import com.lamarrulla.empresa.mapper.ICustomerDocumentMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CustomerDocumentMapperImpl implements ICustomerDocumentMapper {
    private final CustomerCatMapperImpl customerCatMapper;
    private final DocumentCatMapperImpl documentCatMapper;

    public CustomerDocumentMapperImpl(CustomerCatMapperImpl customerCatMapper, DocumentCatMapperImpl documentCatMapper) {
        this.customerCatMapper = customerCatMapper;
        this.documentCatMapper = documentCatMapper;
    }

    @Override
    public CustomerDocument toEntity(CustomerDocumentDto customerDocumentDto) {
        CustomerDocument customerDocument = new CustomerDocument();
        customerDocument.setCustomer(customerCatMapper.toEntity(customerDocumentDto.getCustomerDto()));
        customerDocument.setDocument(documentCatMapper.toEntity(customerDocumentDto.getDocumentDto()));
        customerDocument.setId(customerDocumentDto.getId());
        customerDocument.setMandatory(customerDocumentDto.getMandatory());
        return customerDocument;
    }

    @Override
    public CustomerDocumentDto toDto(CustomerDocument customerDocument) {
        CustomerDocumentDto customerDocumentDto = new CustomerDocumentDto();
        customerDocumentDto.setCustomerDto(customerCatMapper.toDto(customerDocument.getCustomer()));
        customerDocumentDto.setMandatory(customerDocument.getMandatory());
        customerDocumentDto.setDocumentDto(documentCatMapper.toDto(customerDocument.getDocument()));
        customerDocumentDto.setId(customerDocument.getId());
        return customerDocumentDto;
    }

    @Override
    public List<CustomerDocument> toEntityList(List<CustomerDocumentDto> customerDocumentDtoList) {
        return customerDocumentDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<CustomerDocumentDto> toDtoList(List<CustomerDocument> customerDocumentList) {
        return customerDocumentList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
