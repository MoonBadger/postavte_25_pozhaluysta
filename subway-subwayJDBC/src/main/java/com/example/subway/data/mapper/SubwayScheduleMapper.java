package com.example.subway.data.mapper;


import com.example.subway.data.model.SubwayScheduleModel;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SubwayScheduleMapper implements RowMapper<SubwayScheduleModel> {
    @Override
    public SubwayScheduleModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new SubwayScheduleModel(
                rs.getInt("id"),
                rs.getInt("train_id"),
                rs.getInt("schedule_id"),
                rs.getInt("employee_id"),
                rs.getString("day")
        );
    }
}