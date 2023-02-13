package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@TipoDeNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(Cliente cliente, String message){
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", cliente.getNome(), cliente.getTelefone(), message);
    }
}
