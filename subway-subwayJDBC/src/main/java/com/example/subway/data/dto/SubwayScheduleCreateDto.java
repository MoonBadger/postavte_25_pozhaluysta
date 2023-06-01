package com.example.subway.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SubwayScheduleCreateDto {
    private final int trainId;
    private final int scheduleId;
    private final int employeeId;
    private final String day;
}
