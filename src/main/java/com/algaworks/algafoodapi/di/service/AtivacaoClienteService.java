package com.algaworks.algafoodapi.di.service;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import com.algaworks.algafoodapi.di.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.di.notificacao.Notificador;
import com.algaworks.algafoodapi.di.notificacao.TipoDeNotificador;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

    public void ativarCliente(Cliente cliente) {
        cliente.ativar();
        this.eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
    }
}

