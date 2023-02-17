package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@TipoDeNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {
    @Autowired
    private NotificadorProperties properties;

    @Override
    public void notificar(Cliente cliente, String message){
        System.out.println("Host: "+properties.getHostServidor());
        System.out.println("Port: "+properties.getPortaServidor());
        System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), message);
    }


}
