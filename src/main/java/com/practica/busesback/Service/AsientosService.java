package com.practica.busesback.Service;

import com.practica.busesback.Exceptions.BadRequestException;
import com.practica.busesback.Repository.AsientoRepository;
import com.practica.busesback.Repository.ClienteReposory;
import com.practica.busesback.models.Asiento;
import com.practica.busesback.models.Cliente;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class AsientosService {

    @Autowired
    private AsientoRepository asientoRepository;


    @Transactional
    public Asiento guardarAsiento(Asiento asiento) {
        try {
            return asientoRepository.save(asiento);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo guardar el asiento " + asiento.getNumero());
        }
    }

    @Transactional
    public void eliminarAsiento(Long id) {
        try {
            asientoRepository.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo eliminar");
        }
    }

    public List<Asiento> listaAsiento(){
        try {
            return asientoRepository.findAll();
        }catch (Exception e){
            throw new BadRequestException("No se pudo listar");
        }

    }
}
