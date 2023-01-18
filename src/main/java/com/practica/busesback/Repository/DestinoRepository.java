package com.practica.busesback.Repository;

import com.practica.busesback.models.Cliente;
import com.practica.busesback.models.Destino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DestinoRepository extends JpaRepository<Destino, Long> {
}
