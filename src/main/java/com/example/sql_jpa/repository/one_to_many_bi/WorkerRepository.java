package com.example.sql_jpa.repository.one_to_many_bi;

import com.example.sql_jpa.entity.one_to_many_bi.Worker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkerRepository extends JpaRepository<Worker, Integer> {
}
