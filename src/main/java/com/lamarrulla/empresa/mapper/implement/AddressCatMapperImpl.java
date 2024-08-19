package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.AddressCatDto;
import com.lamarrulla.empresa.entity.AddressCat;
import com.lamarrulla.empresa.mapper.IAddressCatMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class AddressCatMapperImpl implements IAddressCatMapper {
    private final CityCatMapperImpl cityCatMapper;

    public AddressCatMapperImpl(CityCatMapperImpl cityCatMapper) {
        this.cityCatMapper = cityCatMapper;
    }

    @Override
    public AddressCat toEntity(AddressCatDto addressCatDto) {
        AddressCat addressCat = new AddressCat();
        addressCat.setId(addressCatDto.getId());
        addressCat.setCity(cityCatMapper.toEntity(addressCatDto.getCityDto()));
        addressCat.setStreet(addressCatDto.getStreet());
        addressCat.setExternalNumber(addressCatDto.getExternalNumber());
        addressCat.setInternalNumber(addressCatDto.getInternalNumber());
        return addressCat;
    }

    @Override
    public AddressCatDto toDto(AddressCat addressCat) {
        AddressCatDto addressCatDto = new AddressCatDto();
        addressCatDto.setCityDto(cityCatMapper.toDto(addressCat.getCity()));
        addressCatDto.setStreet(addressCat.getStreet());
        addressCatDto.setId(addressCat.getId());
        addressCatDto.setExternalNumber(addressCat.getExternalNumber());
        addressCatDto.setInternalNumber(addressCatDto.getInternalNumber());
        return addressCatDto;
    }

    @Override
    public List<AddressCat> toEntityList(List<AddressCatDto> addressCatDtoList) {
        return addressCatDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<AddressCatDto> toDtoList(List<AddressCat> addressCatList) {
        return addressCatList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
