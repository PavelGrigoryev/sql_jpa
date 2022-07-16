package com.example.sql_jpa.repository.many_to_many;

import com.example.sql_jpa.entity.many_to_many.Section;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SectionRepository extends JpaRepository<Section, Integer> {
}
