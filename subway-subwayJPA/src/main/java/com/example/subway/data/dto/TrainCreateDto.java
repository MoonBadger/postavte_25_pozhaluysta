package com.example.subway.data.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Getter
@AllArgsConstructor
public class TrainCreateDto {
    private final UUID serial_number;
    private final int size;

}
