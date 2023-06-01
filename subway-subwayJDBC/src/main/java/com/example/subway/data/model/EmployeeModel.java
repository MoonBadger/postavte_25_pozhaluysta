package com.example.subway.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.List;

@Getter
@AllArgsConstructor
public class EmployeeModel {
    @Id
    private Integer id;

    private String name;

    private String position;

    @MappedCollection(idColumn = "id")
    private List<SubwayScheduleModel> subways;
}
