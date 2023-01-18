package com.practica.busesback.models;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Table(name = "Reservas")
@Entity
@Getter
@Setter
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_reserva", nullable = false)
    private Long id_reserva;

    @Column(name = "rese_fecha", nullable = false)
    private Date fecha;

    @Column(name = "rese_tiempo", nullable = false)
    private Time tiempo;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_programacion", referencedColumnName = "id_programacion")
    private Programacion programacion;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_destino", referencedColumnName = "id_destino")
    private Destino destino;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente")
    private Cliente cliente;

}
