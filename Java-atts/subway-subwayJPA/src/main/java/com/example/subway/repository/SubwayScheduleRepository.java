package com.example.subway.repository;

import com.example.subway.data.model.SubwayScheduleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubwayScheduleRepository extends JpaRepository<SubwayScheduleModel, Integer> {
}
