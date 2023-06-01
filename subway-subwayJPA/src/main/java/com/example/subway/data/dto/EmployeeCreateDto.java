package com.example.subway.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class EmployeeCreateDto {
    private final String name;
    private final String position;
}
