package com.example.subway.data.mapper;

import com.example.subway.data.model.ScheduleModel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ScheduleMapper implements RowMapper<ScheduleModel> {
    @Override
    public ScheduleModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new ScheduleModel(
                rs.getInt("id"),
                rs.getString("line"),
                rs.getString("start_time"),
                rs.getString("end_time"),
                null
        );
    }
}
