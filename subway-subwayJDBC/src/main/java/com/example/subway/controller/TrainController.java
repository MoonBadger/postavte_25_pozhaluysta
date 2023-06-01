package com.example.subway.controller;

import com.example.subway.data.dto.TrainCreateDto;
import com.example.subway.data.dto.TrainDto;
import com.example.subway.data.dto.TrainUpdateDto;
import com.example.subway.data.model.TrainModel;
import com.example.subway.service.TrainService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/trains")
public class TrainController {
    private final TrainService trainService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> create(@RequestBody TrainCreateDto train) {
        trainService.createTrain(train);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<TrainDto>> readAll(){
        return new ResponseEntity<>(trainService.readAll(), HttpStatus.OK);
    }
}
