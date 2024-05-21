package com.example.policiabryan.entities;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "patrols")
public class PatrolBryan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "plate")
    public String plate;
    @Column(name = "category")
    public String category;

    @OneToMany(mappedBy = "patrol")
    private List<PoliceBryan> polices;

}
