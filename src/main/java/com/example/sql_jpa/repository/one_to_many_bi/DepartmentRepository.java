package com.example.sql_jpa.repository.one_to_many_bi;

import com.example.sql_jpa.entity.one_to_many_bi.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
