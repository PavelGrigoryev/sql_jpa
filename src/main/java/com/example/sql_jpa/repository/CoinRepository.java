package com.example.sql_jpa.repository;

import com.example.sql_jpa.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoinRepository extends JpaRepository<Coin, Integer> {
}
