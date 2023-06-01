package com.example.subway.service;

import com.example.subway.data.dto.TrainCreateDto;
import com.example.subway.data.dto.TrainDto;
import com.example.subway.data.dto.TrainUpdateDto;
import com.example.subway.data.mapper.TrainMapper;
import com.example.subway.data.model.TrainModel;
import com.example.subway.repository.TrainRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TrainService {
    private final TrainRepository trainRepository;
    private final TrainMapper trainMapper;

    @Transactional
    public void createTrain(TrainCreateDto trainCreateDto) {
        trainRepository.save(trainMapper.toModel(trainCreateDto));
    }

    @Transactional
    public List<TrainDto> readAll() {
        //return new ArrayList<>(TRAIN_REPO_MAP.values());
        return trainRepository.findAll()
                .stream()
                .map(trainMapper::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public TrainModel read(Integer id) {
        return trainRepository.findTrainModelById(id);
    }

    @Transactional
    public boolean update(Integer id, TrainUpdateDto trainUpdateDto) {

        TrainModel train = trainRepository.findTrainModelById(id);
        if (train != null) {
            train.setSize(trainUpdateDto.getSize());
            trainRepository.save(train);
            return true;
        }
        return false;
    }

    @Transactional
    public void delete(Integer id) {
        trainRepository.delete(trainRepository.findTrainModelById(id));
    }
}
/* фабрика бинов, 9 стадий создания */