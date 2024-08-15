package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.dto.MyWorkDto;
import com.lamarrulla.empresa.entity.MyWork;

import java.util.List;

public interface IMyWorkMapper {
    MyWork toEntity(MyWorkDto myWorkDto);
    MyWorkDto toDto(MyWork myWork);
    List<MyWork> toEntityList(List<MyWorkDto> myWorkDtoList);
    List<MyWorkDto> toDtoList(List<MyWork> myWorkList);
}
