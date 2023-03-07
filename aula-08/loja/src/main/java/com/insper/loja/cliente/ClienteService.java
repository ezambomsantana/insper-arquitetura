package com.insper.loja.cliente;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public Cliente salvarCliente(Cliente cliente) {
        cliente.setId(UUID.randomUUID().toString());
        clientes.add(cliente);
        return cliente;
    }

    public Cliente buscaCliente(String id) {
        //for (Cliente cliente : clientes) {
        //    if (cliente.getId().equals(id)) {
        //        return cliente;
        //    }
        // } // mostrar os streams

        Optional<Cliente> op = clientes.stream().filter(c -> c.getId().equals(id)).findFirst();
        return op.get();
    }

}
