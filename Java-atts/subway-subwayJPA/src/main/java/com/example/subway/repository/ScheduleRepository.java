package com.example.subway.repository;

import com.example.subway.data.model.ScheduleModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<ScheduleModel, Integer> {
    ScheduleModel findScheduleModelById(Integer id);
}
