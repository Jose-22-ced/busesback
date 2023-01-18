package com.practica.busesback.Controller;


import com.practica.busesback.Service.AsientosService;
import com.practica.busesback.Service.ClienteService;
import com.practica.busesback.models.Asiento;
import com.practica.busesback.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/asiento")
public class AsientosController {

    @Autowired
    private AsientosService asientosService;

    @PostMapping("/save")
    public ResponseEntity<Asiento> Save(@RequestBody Asiento asiento){
        asientosService.guardarAsiento(asiento);
        return new ResponseEntity<>(asiento, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Asiento> Update(@RequestBody Asiento asiento){
        asientosService.guardarAsiento(asiento);
        return new ResponseEntity<>(asiento, HttpStatus.CREATED);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<?> Delete(@PathVariable Long id){
        asientosService.eliminarAsiento(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping ("/listar")
    public ResponseEntity<List<Asiento>> List(){
        return new ResponseEntity<List<Asiento>>(asientosService.listaAsiento(), HttpStatus.OK);
    }
}
