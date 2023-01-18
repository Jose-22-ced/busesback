package com.practica.busesback.Controller;


import com.practica.busesback.Service.ClienteService;
import com.practica.busesback.models.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/save")
    public ResponseEntity<Cliente> Save(@RequestBody Cliente cliente){
        clienteService.guardarCliente(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> Update(@RequestBody Cliente cliente){
        clienteService.guardarCliente(cliente);
        return new ResponseEntity<>(cliente, HttpStatus.CREATED);
    }

    @DeleteMapping ("/delete/{id}")
    public ResponseEntity<?> Delete(@PathVariable Long id){
        clienteService.eliminarCliente(id);
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

    @GetMapping ("/listar")
    public ResponseEntity<List<Cliente>> List(){
        return new ResponseEntity<List<Cliente>>(clienteService.listaCliente(), HttpStatus.OK);
    }

}
