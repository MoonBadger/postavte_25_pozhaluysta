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
@RequestMapping("/api")
public class TrainController {
    private final TrainService trainService;

    @PostMapping(value = "/trains")
    public ResponseEntity<?> create(@RequestBody TrainCreateDto train) {
        trainService.createTrain(train);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/trains")
    public ResponseEntity<List<TrainDto>> read() {
        final List<TrainDto> trains = trainService.readAll();

        return trains != null && !trains.isEmpty()
                ? new ResponseEntity<>(trains, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/trains/{id}")
    public ResponseEntity<TrainModel> read(@PathVariable(name = "id") Integer id) {
        final TrainModel train = trainService.read(id);

        return train != null
                ? new ResponseEntity<>(train, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestParam Integer id, @RequestBody TrainUpdateDto trainUpdateDto) {
        trainService.update(id, trainUpdateDto);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id) {
        trainService.delete(id);
    }
}
