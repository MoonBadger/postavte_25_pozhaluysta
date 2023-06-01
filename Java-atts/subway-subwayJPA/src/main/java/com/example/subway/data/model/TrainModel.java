package com.example.subway.data.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity //указывает, что данный бин (класс) является сущностью
@Table(name = "train") //указывает на имя таблицы, которая будет отображаться в этой сущности
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TrainModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "serial_number")
    private UUID serialNumber;

    @Column(name = "size")
    private Integer size;

    @OneToMany(mappedBy = "train", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<SubwayScheduleModel> subways;
}
