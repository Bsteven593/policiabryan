package com.example.policiabryan.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "weapons")
public class WeaponBryan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "code")
    public Number code;
    @Column(name = "date")
    public LocalDate date;
    @Column(name = "stady")
    public Boolean stady;


}
