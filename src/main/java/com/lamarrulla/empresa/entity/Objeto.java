package com.lamarrulla.empresa.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
public class Objeto {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String name;

    public Objeto(String name) {
        this.name = name;
    }
}
