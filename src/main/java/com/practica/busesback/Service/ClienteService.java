package com.practica.busesback.Service;

import com.practica.busesback.Exceptions.BadRequestException;
import com.practica.busesback.Repository.ClienteReposory;
import com.practica.busesback.models.Cliente;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ClienteService {
    @Autowired
    private ClienteReposory clienteReposory;

    @Transactional
    public Cliente guardarCliente(Cliente cliente) {
        try {
            return clienteReposory.save(cliente);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo guardar el cliente " + cliente.getNombre());
        }
    }

    @Transactional
    public void eliminarCliente(Long id) {
        try {
            clienteReposory.deleteById(id);
        } catch (Exception e) {
            throw new BadRequestException("No se pudo eliminar");
        }
    }

    public List<Cliente> listaCliente(){
        try {
            return clienteReposory.findAll();
        }catch (Exception e){
            throw new BadRequestException("No se pudo listar");
        }

    }


}
