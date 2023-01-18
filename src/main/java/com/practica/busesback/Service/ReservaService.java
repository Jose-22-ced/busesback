package com.practica.busesback.Service;

import com.practica.busesback.Exceptions.BadRequestException;
import com.practica.busesback.Repository.BusRepository;
import com.practica.busesback.Repository.ReservaRepository;
import com.practica.busesback.models.Bus;
import com.practica.busesback.models.Reserva;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Transactional
    public Reserva guardarReserva(Reserva reserva) {
        try {
            return reservaRepository.save(reserva);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo guardar la reserva " + reserva.getDestino());
        }
    }

    @Transactional
    public void eliminarReserva(Long id) {
        try {
            reservaRepository.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo eliminar");
        }
    }

    public List<Reserva> listaReserva(){
        try {
            return reservaRepository.findAll();
        }catch (Exception e){
            throw new BadRequestException("No se pudo listar");
        }

    }
}
