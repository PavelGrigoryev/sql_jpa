package com.example.sql_jpa.repository.one_to_one;

import com.example.sql_jpa.entity.one_to_one.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
