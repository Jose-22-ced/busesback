package com.practica.busesback.models;


import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;
import java.util.List;


@Table(name = "Programaciones")
@Entity
@Getter
@Setter
public class Programacion implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_programacion", nullable = false)
    private Long id_programacion;

    @Column(name = "fecha", nullable = false)
    private Date fecha;

    @Column(name = "hora", nullable = false)
    private Time hora;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "id_bus", referencedColumnName = "id_bus")
    private Bus bus;

    @OneToMany(targetEntity = Reserva.class,mappedBy = "programacion")
    private List<Reserva> reservas;
}
