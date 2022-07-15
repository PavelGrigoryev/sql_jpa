package com.example.sql_jpa.repository.one_to_one;

import com.example.sql_jpa.entity.one_to_one.Detail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
