package com.practica.busesback.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Table(name = "Buses")
@Entity
@Getter
@Setter
public class Bus implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_bus", nullable = false)
    private Long id_bus;

    @Column(name = "mode_bus", nullable = false, length = 15)
    private String modelo;

    @Column(name = "plac_bus", nullable = false, length = 6)
    private String placa;

    @Column(name = "capa_bus", nullable = false)
    private int capacidad;


    @OneToMany(targetEntity = Asiento.class,mappedBy = "bus")
    private List<Asiento> asientos;

    @OneToMany(targetEntity = Programacion.class,mappedBy = "bus")
    private List<Programacion> programacion;
}
