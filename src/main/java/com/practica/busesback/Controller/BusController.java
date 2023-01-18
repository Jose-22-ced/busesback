package com.practica.busesback.Controller;

import com.practica.busesback.Service.AsientosService;
import com.practica.busesback.Service.BusService;
import com.practica.busesback.models.Asiento;
import com.practica.busesback.models.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/bus")
public class BusController {

    @Autowired
    private BusService busService;

    @PostMapping("/save")
    public ResponseEntity<Bus> Save(@RequestBody Bus bus){
        busService.guardarBus(bus);
        return new ResponseEntity<>(bus, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Bus> Update(@RequestBody Bus bus){
        busService.guardarBus(bus);
        return new ResponseEntity<>(bus, HttpStatus.CREATED);
    }

    @PutMapping("/delete/{id}")
    public ResponseEntity<?> Delete(@PathVariable Long id){
        busService.eliminarBus(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping ("/listar")
    public ResponseEntity<List<Bus>> List(){
        return new ResponseEntity<List<Bus>>(busService.listaBus(), HttpStatus.OK);
    }
}
