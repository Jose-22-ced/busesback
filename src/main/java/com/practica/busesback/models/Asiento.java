package com.practica.busesback.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Table(name = "Asientos")
@Entity
@Getter
@Setter
public class Asiento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_asientos", nullable = false)
    private Long id_asientos;

    @Column(name = "num_asie", nullable = false)
    private int numero;

    @Column(name = "estad_bus", nullable = false)
    private boolean estado;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_bus", referencedColumnName = "id_bus")
    private Bus bus;

}
