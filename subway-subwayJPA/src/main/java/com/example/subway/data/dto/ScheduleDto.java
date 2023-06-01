package com.example.subway.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalTime;

@Getter
@AllArgsConstructor
public class ScheduleDto {
    private final String line;
    private final LocalTime start_time;
    private final LocalTime end_time;
}
