package com.insper.loja.cliente;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Cliente salvarCliente(Cliente cliente) {
        cliente.setIdentifier(UUID.randomUUID().toString());
        return clienteRepository.save(cliente);
    }

    public Cliente buscaCliente(String id) {
        return clienteRepository.findByIdentifier(id);
    }

}
