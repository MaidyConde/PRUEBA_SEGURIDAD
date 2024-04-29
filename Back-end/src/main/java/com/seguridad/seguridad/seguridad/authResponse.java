package com.seguridad.seguridad.seguridad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class authResponse {
    
    //este archivo contiene la respuesta cuando el usuario se autentica 
    //cuando se inicia sesion se debe retornar el token

    String status;
    String message;
    String token;

    


}
