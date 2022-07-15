package com.example.sql_jpa.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity(name = "Coin")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
@Table(name = "crypto_coin")
public class Coin {

    @Id
    @Column(name = "id", updatable = false)
    private Integer id;

    @Column(name = "symbol", nullable = false, columnDefinition = "text")
    private String symbol;

    @Column(name = "name", nullable = false, columnDefinition = "text")
    private String name;

    @Column(name = "price", nullable = false)
    private Double price;

    public Coin(String symbol, String name, Double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Coin coin = (Coin) o;
        return id != null && Objects.equals(id, coin.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
