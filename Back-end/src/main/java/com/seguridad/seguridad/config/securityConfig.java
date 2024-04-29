package com.seguridad.seguridad.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;

//se indica que este es un archivo de configuracion

@Configuration
//configurar la seguridad del proyecto
@EnableWebSecurity
//se incluye el constructor con lombok
@RequiredArgsConstructor
public class securityConfig {
    //filter chain= cadena de filtrado, es el encargado de filtrar las peticiones e indicar el acceso de los end point 
    @Bean
    public SecurityFilterChain securityFilterChain(
        HttpSecurity http
    )throws Exception
    {
        return http
        .csrf(csrf->csrf.disable())
        .authorizeHttpRequests(
            authpRequests->authpRequests
            //todas las peticiones que comiencen por ("/api/v1/public") van hacer permitidas sin restrincion del usuario
            .requestMatchers("/api/v1/public/**")
            .permitAll()
            //para el resto de peticiones es requerido que se autentiquen
            .anyRequest().authenticated()
        ).build();
    }

}

