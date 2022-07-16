package com.example.sql_jpa.repository.many_to_many;

import com.example.sql_jpa.entity.many_to_many.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child, Integer> {
}
