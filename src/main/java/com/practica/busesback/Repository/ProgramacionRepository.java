package com.practica.busesback.Repository;

import com.practica.busesback.models.Cliente;
import com.practica.busesback.models.Programacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgramacionRepository extends JpaRepository<Programacion, Long> {
}
