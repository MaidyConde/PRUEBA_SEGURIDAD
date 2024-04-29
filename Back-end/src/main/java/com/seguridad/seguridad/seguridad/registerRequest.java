package com.seguridad.seguridad.seguridad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class registerRequest {

    //contiene la estructuta de la peticion de registro

    String email;
    String password;
    String confirmPassword;
    
}
