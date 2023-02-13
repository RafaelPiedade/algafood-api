package com.algaworks.algafoodapi.di.notificacao;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)//por quanto tempo deve permanecer
@Qualifier
public @interface TipoDeNotificador {
    NivelUrgencia value();
}
