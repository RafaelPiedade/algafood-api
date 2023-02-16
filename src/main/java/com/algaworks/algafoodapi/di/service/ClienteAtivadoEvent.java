package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.modelo.Cliente;

public class ClienteAtivadoEvent {
    public Cliente getCliente() {
        return cliente;
    }

    private Cliente cliente;

    public ClienteAtivadoEvent(Cliente cliente) {
        this.cliente = cliente;
    }
}
