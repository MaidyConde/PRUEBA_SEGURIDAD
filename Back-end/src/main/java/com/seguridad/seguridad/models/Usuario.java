package com.seguridad.seguridad.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "primerNombre", nullable = false, length = 36)
    private String primerNombre;
 
    @Column(name = "primerApellido", nullable = false, length = 36)
    private String primerApellido;

    @Column(name = "correoElectrónicoUnico", nullable = false, length = 100)
    private String correoElectrónicoUnico;

    @Column(name = "Contraseña", nullable = false, length = 100)
    private String Contraseña;

    @Column(name = "confirmarContraseña", nullable = false, length = 100)
    private String confirmarContraseña;

    @Column(name = "Telefono", nullable = false, length = 11)
    private String Telefono;

    @Column(name = "Rol", nullable = false, length = 36)
    private String Rol;

    public Usuario() {
    }

    public Usuario(String primerNombre, String primerApellido, String correoElectrónicoUnico, String contraseña,
            String confirmarContraseña, String telefono, String rol) {
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.correoElectrónicoUnico = correoElectrónicoUnico;
        Contraseña = contraseña;
        this.confirmarContraseña = confirmarContraseña;
        Telefono = telefono;
        Rol = rol;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getCorreoElectrónicoUnico() {
        return correoElectrónicoUnico;
    }

    public void setCorreoElectrónicoUnico(String correoElectrónicoUnico) {
        this.correoElectrónicoUnico = correoElectrónicoUnico;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    public String getConfirmarContraseña() {
        return confirmarContraseña;
    }

    public void setConfirmarContraseña(String confirmarContraseña) {
        this.confirmarContraseña = confirmarContraseña;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }

    

}