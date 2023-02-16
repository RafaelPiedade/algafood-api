package com.algaworks.algafoodapi.di.notificacao;

import com.algaworks.algafoodapi.di.modelo.Cliente;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@TipoDeNotificador(NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

    @Value("${notificador.email.host-servidor}")
    private String host;

    @Value("${notificador.email.port-servidor}")
    private Integer port;


    @Override
    public void notificar(Cliente cliente, String message){
        System.out.println("Host: "+host);
        System.out.println("Port: "+port);
        System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), message);
    }


}
