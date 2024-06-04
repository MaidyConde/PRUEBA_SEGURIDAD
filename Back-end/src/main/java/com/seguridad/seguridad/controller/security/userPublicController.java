package com.seguridad.seguridad.controller.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seguridad.seguridad.interfaceService.IusuarioService;
import com.seguridad.seguridad.models.Usuario;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/api/v1/usuario/")
@RestController
public class userPublicController {
     @Autowired
    private IusuarioService usuarioService;

    //metodo register
    @PostMapping("/")
    public ResponseEntity<Object> save (@ModelAttribute("Usuario") Usuario Usuario) {
        
        usuarioService.save(Usuario);
        return new ResponseEntity<>(Usuario, HttpStatus.OK);   
    }

    @GetMapping("/")
    public  ResponseEntity<Object> login()  {
     //FALTAA
     return new ResponseEntity<>("",HttpStatus.OK);
    }
    
    //login
    @GetMapping("orgot_password")
    public ResponseEntity<Object> forgot_password(){
     //faltaaa
     return new ResponseEntity<>("",HttpStatus.OK);

    }
    
    



   
    

}
