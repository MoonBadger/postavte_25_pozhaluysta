package com.example.subway.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
public class ScheduleModel {
    @Id
    private Integer id;

    private String line;

    private String startTime;

    private String endTime;

    @MappedCollection(idColumn = "id")
    private Set<SubwayScheduleModel> subways;
}
