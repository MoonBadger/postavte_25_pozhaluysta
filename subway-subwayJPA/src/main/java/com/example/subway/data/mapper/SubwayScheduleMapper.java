package com.example.subway.data.mapper;

import com.example.subway.data.dto.SubwayScheduleCreateDto;
import com.example.subway.data.dto.SubwayScheduleDto;
import com.example.subway.data.model.EmployeeModel;
import com.example.subway.data.model.ScheduleModel;
import com.example.subway.data.model.SubwayScheduleModel;
import com.example.subway.data.model.TrainModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface SubwayScheduleMapper {
    @Mapping(source = "train.id", target = "trainId")
    @Mapping(source = "schedule.id", target = "scheduleId")
    @Mapping(source = "employee.id", target = "employeeId")
    SubwayScheduleDto toDto(SubwayScheduleModel subwayScheduleModel);
//    @Mapping(source = "train", target = "train")
//    @Mapping(source = "schedule", target = "schedule")
//    @Mapping(source = "employee", target = "employee")
//    SubwayScheduleModel toModel(SubwayScheduleCreateDto scheduleCreateDto,
//                                TrainModel train,
//                                ScheduleModel schedule,
//                                EmployeeModel employee);
}
