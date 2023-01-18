package com.practica.busesback.Repository;

import com.practica.busesback.models.Cliente;
import com.practica.busesback.models.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
