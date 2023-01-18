package com.practica.busesback.Repository;

import com.practica.busesback.models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteReposory extends JpaRepository<Cliente, Long>{

}
