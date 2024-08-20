package com.lamarrulla.empresa.mapper.implement;

import com.lamarrulla.empresa.dto.CustomerVehicleDto;
import com.lamarrulla.empresa.entity.CustomerVehicle;
import com.lamarrulla.empresa.mapper.ICustomerVehicleMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CustomerVehicleMapper implements ICustomerVehicleMapper {
    private final CustomerCatMapperImpl customerCatMapper;
    private final VehicleCatMapperImpl vehicleCatMapper;
    private final ColorCatMapperImpl colorCatMapper;

    public CustomerVehicleMapper(CustomerCatMapperImpl customerCatMapper, VehicleCatMapperImpl vehicleCatMapper, ColorCatMapperImpl colorCatMapper) {
        this.customerCatMapper = customerCatMapper;
        this.vehicleCatMapper = vehicleCatMapper;
        this.colorCatMapper = colorCatMapper;
    }

    @Override
    public CustomerVehicle toEntity(CustomerVehicleDto customerVehicleDto) {
        CustomerVehicle customerVehicle = new CustomerVehicle();
        customerVehicle.setCustomer(customerCatMapper.toEntity(customerVehicleDto.getCustomer()));
        customerVehicle.setVehicle(vehicleCatMapper.toEntity(customerVehicleDto.getVehicle()));
        customerVehicle.setId(customerVehicleDto.getId());
        customerVehicle.setPlate(customerVehicleDto.getPlate());
        customerVehicle.setColorCat(colorCatMapper.toEntity(customerVehicleDto.getColorDto()));
        customerVehicle.setChassisNumber(customerVehicleDto.getChassisNumber());
        customerVehicle.setImageList(customerVehicleDto.getImageList());
        customerVehicle.setKilometerAge(customerVehicleDto.getKilometerAge());
        return customerVehicle;
    }

    @Override
    public CustomerVehicleDto toDto(CustomerVehicle customerVehicle) {
        CustomerVehicleDto customerVehicleDto = new CustomerVehicleDto();
        customerVehicleDto.setVehicle(vehicleCatMapper.toDto(customerVehicle.getVehicle()));
        customerVehicleDto.setCustomer(customerCatMapper.toDto(customerVehicle.getCustomer()));
        customerVehicleDto.setColorDto(colorCatMapper.toDto(customerVehicle.getColorCat()));
        customerVehicleDto.setPlate(customerVehicle.getPlate());
        customerVehicleDto.setChassisNumber(customerVehicle.getChassisNumber());
        customerVehicleDto.setImageList(customerVehicle.getImageList());
        customerVehicleDto.setId(customerVehicle.getId());
        customerVehicleDto.setKilometerAge(customerVehicle.getKilometerAge());
        return customerVehicleDto;
    }

    @Override
    public List<CustomerVehicle> toEntityList(List<CustomerVehicleDto> customerVehicleDtoList) {
        return customerVehicleDtoList.stream().map(this::toEntity).collect(Collectors.toList());
    }

    @Override
    public List<CustomerVehicleDto> toDtoList(List<CustomerVehicle> customerVehicleList) {
        return customerVehicleList.stream().map(this::toDto).collect(Collectors.toList());
    }
}
