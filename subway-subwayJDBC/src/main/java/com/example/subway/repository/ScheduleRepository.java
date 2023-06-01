package com.example.subway.repository;

import com.example.subway.data.model.ScheduleModel;

public interface ScheduleRepository {
    ScheduleModel findScheduleModelById(Integer id);
}
