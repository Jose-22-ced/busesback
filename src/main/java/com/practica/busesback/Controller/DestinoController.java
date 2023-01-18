package com.practica.busesback.Controller;


import com.practica.busesback.Service.AsientosService;
import com.practica.busesback.Service.DestinoService;
import com.practica.busesback.models.Asiento;
import com.practica.busesback.models.Destino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/destino")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    @PostMapping("/save")
    public ResponseEntity<Destino> Save(@RequestBody Destino destino){
        destinoService.guardarDestino(destino);
        return new ResponseEntity<>(destino, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Destino> Update(@RequestBody Destino destino){
        destinoService.guardarDestino(destino);
        return new ResponseEntity<>(destino, HttpStatus.CREATED);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<?> Delete(@PathVariable Long id){
        destinoService.eliminarDestino(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping ("/listar")
    public ResponseEntity<List<Destino>> List(){
        return new ResponseEntity<List<Destino>>(destinoService.listaDestino(), HttpStatus.OK);
    }
}
