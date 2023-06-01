package com.example.subway.repository;

import com.example.subway.data.model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {
    EmployeeModel findEmployeeModelById(Integer id);
}
