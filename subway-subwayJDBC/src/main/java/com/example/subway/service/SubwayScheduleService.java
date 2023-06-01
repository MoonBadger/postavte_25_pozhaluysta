package com.example.subway.service;

import com.example.subway.data.dto.SubwayScheduleCreateDto;
import com.example.subway.data.mapper.SubwayScheduleMapper;
import com.example.subway.data.model.EmployeeModel;
import com.example.subway.data.model.ScheduleModel;
import com.example.subway.data.model.SubwayScheduleModel;
import com.example.subway.data.model.TrainModel;
import com.example.subway.repository.EmployeeRepository;
import com.example.subway.repository.ScheduleRepository;
import com.example.subway.repository.SubwayScheduleRepository;
import com.example.subway.repository.TrainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class SubwayScheduleService {

    private final TrainRepository trainRepository;

}
