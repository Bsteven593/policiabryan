package com.example.policiabryan.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "place")
public class PlaceBryan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "range")
    public String range;

    @Column(name = "date")
    public LocalDate date;

    @Column(name = "stade")
    public Boolean stade;

    @Column(name = "name")
    public String name;

    @ManyToOne
    @JoinColumn(name = "police_bryan_id", referencedColumnName = "id")
    private PoliceBryan policeBryan; 

  
}