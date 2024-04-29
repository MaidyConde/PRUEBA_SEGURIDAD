package com.seguridad.seguridad.seguridad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class loginRequest {

    //contiene la estructura de la peticion de inicio de sesion

    String userName;
    String Password;
    
}
