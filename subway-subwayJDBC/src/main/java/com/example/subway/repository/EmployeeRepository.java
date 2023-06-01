package com.example.subway.repository;

import com.example.subway.data.model.EmployeeModel;

public interface EmployeeRepository {
    EmployeeModel findEmployeeModelById(Integer id);
}
