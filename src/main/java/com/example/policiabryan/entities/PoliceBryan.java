package com.example.policiabryan.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "polices")
public class PoliceBryan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    public String name;

    @Column(name = "lastname")
    public String lastname;

    @Column(name = "charge")
    public String charge;

    @ManyToOne
    @JoinColumn(name = "patrol_id", referencedColumnName = "id")
    private PatrolBryan patrol;

    @ManyToOne
    @JoinColumn(name = "weapon_id", referencedColumnName = "id")
    private WeaponBryan weapon;

    // Relación uno a muchos con PlaceBryan
    @OneToMany(mappedBy = "policeBryan", cascade = CascadeType.ALL)
    private List<PlaceBryan> places;
}