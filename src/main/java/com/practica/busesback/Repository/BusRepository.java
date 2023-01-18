package com.practica.busesback.Repository;

import com.practica.busesback.models.Bus;
import com.practica.busesback.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRepository extends JpaRepository<Bus, Long> {
}
