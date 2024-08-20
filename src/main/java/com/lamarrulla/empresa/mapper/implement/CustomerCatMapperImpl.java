package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CustomerCatDto;
import com.lamarrulla.empresa.entity.CustomerCat;
import com.lamarrulla.empresa.mapper.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CustomerCatMapperImpl implements ICustomerCatMapper {
    /*private final ICustomerDocumentMapper iCustomerDocumentMapper;*/
    /*private final ICustomerVehicleMapper iCustomerVehicleMapper;*/
    private final ITitleCatMapper iTitleCatMapper;
    private final IAddressCatMapper iAddressCatMapper;
    private final IPersonalDataMapper personalDataMapper;

    public CustomerCatMapperImpl(ITitleCatMapper iTitleCatMapper, IAddressCatMapper iAddressCatMapper, IPersonalDataMapper personalDataMapper) {
        this.iTitleCatMapper = iTitleCatMapper;
        this.iAddressCatMapper = iAddressCatMapper;
        this.personalDataMapper = personalDataMapper;
    }


    @Override
    public CustomerCat toEntity(CustomerCatDto customerCatDto) {
        CustomerCat customerCat = new CustomerCat();
        customerCat.setId(customerCatDto.getId());
        /*customerCat.setCustomerDocumentList(iCustomerDocumentMapper.toEntityList(customerCatDto.getCustomerDocumentDtoList()));*/
        customerCat.setGrade(customerCatDto.getGrade());
        /*customerCat.setCustomerVehicleList(iCustomerVehicleMapper.toEntityList(customerCatDto.getCustomerVehicleDtoList()));*/
        customerCat.setTitle(iTitleCatMapper.toEntity(customerCatDto.getTitleDto()));
        customerCat.setAddressList(iAddressCatMapper.toEntityList(customerCatDto.getAddressDtoList()));
        customerCat.setPersonalData(personalDataMapper.toEntity(customerCatDto.getPersonalDataDto()));
        return customerCat;
    }

    @Override
    public CustomerCatDto toDto(CustomerCat customerCat) {
        CustomerCatDto customerCatDto = new CustomerCatDto();
        customerCatDto.setAddressDtoList(iAddressCatMapper.toDtoList(customerCat.getAddressList()));
        customerCatDto.setTitleDto(iTitleCatMapper.toDto(customerCat.getTitle()));
        /*customerCatDto.setCustomerDocumentDtoList(iCustomerDocumentMapper.toDtoList(customerCat.getCustomerDocumentList()));*/
        customerCatDto.setPersonalDataDto(personalDataMapper.toDTO(customerCat.getPersonalData()));
        customerCatDto.setGrade(customerCat.getGrade());
        /*customerCatDto.setCustomerVehicleDtoList(iCustomerVehicleMapper.toDtoList(customerCat.getCustomerVehicleList()));*/
        customerCatDto.setId(customerCat.getId());
        return customerCatDto;
    }

    @Override
    public List<CustomerCat> toEntityList(List<CustomerCatDto> customerCatDtoList) {
        return customerCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<CustomerCatDto> toDtoList(List<CustomerCat> customerCatList) {
        return customerCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
