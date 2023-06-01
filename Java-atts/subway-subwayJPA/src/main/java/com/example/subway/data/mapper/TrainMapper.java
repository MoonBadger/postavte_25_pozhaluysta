package com.example.subway.data.mapper;

import com.example.subway.data.dto.TrainCreateDto;
import com.example.subway.data.dto.TrainDto;
import com.example.subway.data.model.TrainModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TrainMapper {
    TrainDto toDto(TrainModel train);

    TrainModel toModel(TrainCreateDto trainCreateDto);
}
