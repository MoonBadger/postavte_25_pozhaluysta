package com.example.subway.data.mapper;

import com.example.subway.data.dto.ScheduleCreateDto;
import com.example.subway.data.dto.ScheduleDto;
import com.example.subway.data.model.ScheduleModel;
import org.mapstruct.Mapper;

@Mapper
public interface ScheduleMapper {
    ScheduleDto toDto(ScheduleModel scheduleModel);
    ScheduleModel toModel(ScheduleCreateDto scheduleCreateDto);
}
