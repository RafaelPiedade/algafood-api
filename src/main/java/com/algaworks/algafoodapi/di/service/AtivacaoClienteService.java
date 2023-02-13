package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.di.notificacao.Notificador;
import com.algaworks.algafoodapi.di.notificacao.TipoDeNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class AtivacaoClienteService {

    @TipoDeNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

//    @PostConstruct
    public void init(){
        System.out.println("INIT");
    }

//    @PreDestroy
    public void destroy(){
        System.out.println("DESTROY");
    }

    public void ativarCliente(Cliente cliente) {
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo");

    }
}

