package com.example.subway.data.mapper;

import com.example.subway.data.dto.EmployeeCreateDto;
import com.example.subway.data.dto.EmployeeDto;
import com.example.subway.data.model.EmployeeModel;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {
    EmployeeDto toDto(EmployeeModel employeeModel);
    EmployeeModel toModel(EmployeeCreateDto employeeCreateDto);
}
