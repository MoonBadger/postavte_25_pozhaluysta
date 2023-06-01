package com.example.subway.data.mapper;

import com.example.subway.data.model.EmployeeModel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<EmployeeModel> {
   @Override
    public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException{
       return new EmployeeModel(
               rs.getInt("id"),
               rs.getString("name"),
               rs.getString("position"),
               null
       );
   }
}
