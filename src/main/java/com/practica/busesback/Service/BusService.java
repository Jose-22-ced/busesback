package com.practica.busesback.Service;


import com.practica.busesback.Exceptions.BadRequestException;
import com.practica.busesback.Repository.BusRepository;
import com.practica.busesback.models.Bus;
import com.practica.busesback.models.Cliente;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BusService{

    @Autowired
    private BusRepository busRepository;

    @Transactional
    public Bus guardarBus(Bus bus) {
        try {
            return busRepository.save(bus);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo guardar el bus " + bus.getModelo());
        }
    }

    @Transactional
    public void eliminarBus(Long id) {
        try {
            busRepository.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo eliminar");
        }
    }

    public List<Bus> listaBus(){
        try {
            return busRepository.findAll();
        }catch (Exception e){
            throw new BadRequestException("No se pudo listar");
        }

    }

}
