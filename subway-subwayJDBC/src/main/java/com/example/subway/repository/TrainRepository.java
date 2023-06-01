package com.example.subway.repository;

import com.example.subway.data.mapper.TrainMapper;
import com.example.subway.data.model.TrainModel;
import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@AllArgsConstructor
public class TrainRepository {
   private JdbcTemplate jdbcTemplate;
   public void createTrain(String serial_number, Integer size) {
       String SQL = "insert into Train (serial_number, size) values (?, ?)";
       jdbcTemplate.update(SQL, serial_number, size);
   }
    public List<TrainModel> readAll() {
        String SQL = "select * from Train";
        List<TrainModel> trains = jdbcTemplate.query(SQL, new TrainMapper());
        return trains;
    }
}
