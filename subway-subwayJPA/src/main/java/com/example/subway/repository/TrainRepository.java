package com.example.subway.repository;

import com.example.subway.data.model.TrainModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TrainRepository extends JpaRepository<TrainModel, Integer> {
    TrainModel findTrainModelById(Integer id);
}
