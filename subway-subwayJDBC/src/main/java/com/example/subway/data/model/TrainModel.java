package com.example.subway.data.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
public class TrainModel {
    @Id
    private Integer id;

    private String serialNumber;

    private Integer size;

    @MappedCollection(idColumn = "id")
    private Set<SubwayScheduleModel> subways;
}
