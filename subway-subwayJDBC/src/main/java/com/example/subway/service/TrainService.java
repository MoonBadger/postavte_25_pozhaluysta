package com.example.subway.service;

import com.example.subway.data.dto.TrainCreateDto;
import com.example.subway.data.dto.TrainDto;
import com.example.subway.data.model.TrainModel;
import com.example.subway.repository.TrainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class TrainService {
    private final TrainRepository trainRepository;

    public void createTrain(TrainCreateDto trainCreateDto) {
        trainRepository.createTrain(trainCreateDto.getSerial_number(), trainCreateDto.getSize());
    }
    public List<TrainDto> readAll(){
        return trainRepository.readAll().stream().map(
                train -> new TrainDto(train.getSerialNumber(), train.getSize())).collect(Collectors.toList());
    }
}