package com.example.subway.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;


@AllArgsConstructor
@Getter
@Setter
public class SubwayScheduleModel {
    @Id
    private Integer id;

    private Integer train;

    private Integer schedule;

    private Integer employee;

    private String day;
}
