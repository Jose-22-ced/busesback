package com.practica.busesback.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Table(name = "Clientes")
@Entity
@Getter
@Setter
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id_cliente", nullable = false)
    private Long id_cliente;

    @Column(name = "nom_cli", nullable = false)
    private String nombre;

    @Column(name = "apel_cli", nullable = false)
    private String apellido;

    @Column(name = "edad_cli", nullable = false, length = 2)
    private int edad;

    @Column(name = "sexo_cli", nullable = false, length = 1)
    private char sexo;

    @OneToMany(targetEntity = Reserva.class,mappedBy = "cliente")
    private List<Reserva> reservas;


}
