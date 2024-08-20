package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.GarageCatDto;
import com.lamarrulla.empresa.entity.GarageCat;
import com.lamarrulla.empresa.mapper.IGarageCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class GarageCatMapperImpl implements IGarageCatMapper {

    /*private final GarageServiceMapperImpl garageServiceMapper;*/
    /*private final GarageBudgetMapperImpl garageBudgetMapper;*/
    /*private final GarageDocumentMapperImpl garageDocumentMapper;*/
    private final MannagerMapperImpl mannagerMapper;
    private final AddressCatMapperImpl addressCatMapper;
    private final ContactDataMapperImpl contactDataMapper;

    public GarageCatMapperImpl(MannagerMapperImpl mannagerMapper, AddressCatMapperImpl addressCatMapper, ContactDataMapperImpl contactDataMapper) {
        this.mannagerMapper = mannagerMapper;
        this.addressCatMapper = addressCatMapper;
        this.contactDataMapper = contactDataMapper;
    }

    @Override
    public GarageCat toEntity(GarageCatDto garageCatDto) {
        GarageCat garageCat = new GarageCat();
        garageCat.setId(garageCatDto.getId());
        /*garageCat.setGarageServiceList(garageServiceMapper.toEntityList(garageCatDto.getGarageServiceDtoList()));*/
        /*garageCat.setGarageBudgetList(garageBudgetMapper.toEntityList(garageCatDto.getGarageBudgetDtoList()));*/
        /*garageCat.setGarageDocumentList(garageDocumentMapper.toEntityList(garageCatDto.getGarageDocumentDtoList()));*/
        garageCat.setGrade(garageCatDto.getGrade());
        garageCat.setName(garageCatDto.getName());
        garageCat.setMannagerList(mannagerMapper.toEntityList(garageCatDto.getMannagerDtoList()));
        garageCat.setAddressList(addressCatMapper.toEntityList(garageCatDto.getAddressDtoList()));
        garageCat.setContactData(contactDataMapper.toEntity(garageCatDto.getContactDataDto()));
        garageCat.setNewCustomers(garageCatDto.getNewCustomers());
        garageCat.setTotalCustomers(garageCatDto.getTotalCustomers());
        return garageCat;
    }

    @Override
    public GarageCatDto toDto(GarageCat garageCat) {
        GarageCatDto garageCatDto = new GarageCatDto();
        garageCatDto.setAddressDtoList(addressCatMapper.toDtoList(garageCat.getAddressList()));
        garageCatDto.setId(garageCat.getId());
        garageCatDto.setContactDataDto(contactDataMapper.toDto(garageCat.getContactData()));
        garageCatDto.setGrade(garageCat.getGrade());
        garageCatDto.setName(garageCat.getName());
        /*garageCatDto.setGarageBudgetDtoList(garageBudgetMapper.toDtoList(garageCat.getGarageBudgetList()));*/
        /*garageCatDto.setGarageDocumentDtoList(garageDocumentMapper.toDtoList(garageCat.getGarageDocumentList()));*/
        garageCatDto.setNewCustomers(garageCat.getNewCustomers());
        garageCatDto.setMannagerDtoList(mannagerMapper.toDtoList(garageCat.getMannagerList()));
        garageCatDto.setTotalCustomers(garageCat.getTotalCustomers());
        /*garageCatDto.setGarageServiceDtoList(garageServiceMapper.toDtoList(garageCat.getGarageServiceList()));*/
        return garageCatDto;
    }

    @Override
    public List<GarageCat> toEntityList(List<GarageCatDto> garageCatDtoList) {
        return garageCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<GarageCatDto> toDtoList(List<GarageCat> garageCatList) {
        return garageCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}