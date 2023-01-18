package com.practica.busesback.Service;


import com.practica.busesback.Exceptions.BadRequestException;
import com.practica.busesback.Repository.DestinoRepository;
import com.practica.busesback.Repository.ProgramacionRepository;
import com.practica.busesback.models.Destino;
import com.practica.busesback.models.Programacion;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProgramacionService {

    @Autowired
    private ProgramacionRepository programacionRepository;

    @Transactional
    public Programacion guardarProgramacion(Programacion programacion) {
        try {
            return programacionRepository.save(programacion);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo guardar el Programacion " + programacion.getFecha());
        }
    }

    @Transactional
    public void eliminarProgramacion(Long id) {
        try {
            programacionRepository.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo eliminar");
        }
    }

    public List<Programacion> listaProgramacion(){
        try {
            return programacionRepository.findAll();
        }catch (Exception e){
            throw new BadRequestException("No se pudo listar");
        }

    }
}
