package com.practica.busesback.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Table(name = "Destinos")
@Entity
@Getter
@Setter
public class Destino implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_destino", nullable = false)
    private Long id_destino;

    @Column(name = "ciud_dest", nullable = false)
    private String ciudad;

    @Column(name = "cost_dest", nullable = false)
    private double costo;


    @OneToMany(targetEntity = Reserva.class,mappedBy = "destino")
    private List<Reserva> reservas;

}
