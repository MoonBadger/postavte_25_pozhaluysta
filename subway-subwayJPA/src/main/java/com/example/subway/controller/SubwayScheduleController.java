package com.example.subway.controller;

import com.example.subway.data.dto.SubwayScheduleCreateDto;
import com.example.subway.service.SubwayScheduleService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SubwayScheduleController {
    private SubwayScheduleService subwayScheduleService;
    @PostMapping
    public void createSubwaySchedule(@RequestBody SubwayScheduleCreateDto subwayScheduleCreateDto){
        subwayScheduleService.createSubwaySchedule(subwayScheduleCreateDto);
    }
}
