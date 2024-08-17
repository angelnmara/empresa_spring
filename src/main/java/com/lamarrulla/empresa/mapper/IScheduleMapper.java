package com.lamarrulla.empresa.mapper;

import com.lamarrulla.empresa.dto.ScheduleDto;
import com.lamarrulla.empresa.entity.Schedule;

import java.util.List;

public interface IScheduleMapper {
    Schedule toEntity(ScheduleDto scheduleDto);
    ScheduleDto toDto(Schedule schedule);
    List<Schedule> toEntityList(List<ScheduleDto> scheduleDtoList);
    List<ScheduleDto> toDtoList(List<Schedule> scheduleList);
}
