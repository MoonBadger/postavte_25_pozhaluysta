package com.example.subway.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.UUID;

@AllArgsConstructor
@Getter
public class TrainDto {
    private final UUID serial_number;
    private final int size;
}
