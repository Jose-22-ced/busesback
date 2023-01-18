package com.practica.busesback.Service;


import com.practica.busesback.Exceptions.BadRequestException;
import com.practica.busesback.Repository.BusRepository;
import com.practica.busesback.Repository.DestinoRepository;
import com.practica.busesback.models.Bus;
import com.practica.busesback.models.Destino;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class DestinoService {

    @Autowired
    private DestinoRepository destinoRepository;

    @Transactional
    public Destino guardarDestino(Destino destino) {
        try {
            return destinoRepository.save(destino);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo guardar el bus " + destino.getCiudad());
        }
    }

    @Transactional
    public void eliminarDestino(Long id) {
        try {
            destinoRepository.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo eliminar");
        }
    }

    public List<Destino> listaDestino(){
        try {
            return destinoRepository.findAll();
        }catch (Exception e){
            throw new BadRequestException("No se pudo listar");
        }

    }
}
