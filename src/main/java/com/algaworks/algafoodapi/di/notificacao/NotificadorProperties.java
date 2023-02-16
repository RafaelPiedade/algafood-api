package com.algaworks.algafoodapi.di.notificacao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("notificador.email")
public class NotificadorProperties {
    private String hostServidor;
    private Integer portServidor = 22;

    public String getHostServidor() {
        return hostServidor;
    }

    public void setHostServidor(String hostServidor) {
        this.hostServidor = hostServidor;
    }

    public Integer getPortaServidor() {
        return portServidor;
    }

    public void setPortaServidor(Integer portaServidor) {
        this.portServidor = portaServidor;
    }
}
