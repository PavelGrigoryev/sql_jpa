package com.example.sql_jpa.repository;

import com.example.sql_jpa.entity.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
