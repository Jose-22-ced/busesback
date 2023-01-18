package com.practica.busesback.Controller;


import com.practica.busesback.Service.ProgramacionService;
import com.practica.busesback.Service.ReservaService;
import com.practica.busesback.models.Programacion;
import com.practica.busesback.models.Reserva;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/reserva")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @PostMapping("/save")
    public ResponseEntity<Reserva> Save(@RequestBody Reserva reserva){
        reservaService.guardarReserva(reserva);
        return new ResponseEntity<>(reserva, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Reserva> Update(@RequestBody Reserva reserva){
        reservaService.guardarReserva(reserva);
        return new ResponseEntity<>(reserva, HttpStatus.CREATED);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<?> Delete(@PathVariable Long id){
        reservaService.eliminarReserva(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping ("/listar")
    public ResponseEntity<List<Reserva>> List(){
        return new ResponseEntity<List<Reserva>>(reservaService.listaReserva(), HttpStatus.OK);
    }
}
