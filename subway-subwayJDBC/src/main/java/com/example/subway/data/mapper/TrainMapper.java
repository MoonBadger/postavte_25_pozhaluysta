package com.example.subway.data.mapper;

import com.example.subway.data.model.TrainModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TrainMapper implements RowMapper<TrainModel> {
    @Override
    public TrainModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new TrainModel(
                rs.getInt("id"),
                rs.getString("serial_number"),
                rs.getInt("size"),
                null
        );
    }
}
