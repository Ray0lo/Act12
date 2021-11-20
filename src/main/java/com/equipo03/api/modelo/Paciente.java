package com.equipo03.api.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Paciente")
public class Paciente {

    @javax.persistence.idUsuario
    @Column(name = "idUsuario", nullable = false)


    private int idUsuario;

    @Column(name = "Nombre", nullable = false)

    private String Nombre;

    @Column(name = "Apellido", nullable = false)

    private String Apellido;

    @Column(name = "Telefono", nullable = false)

    private String Telefono;

    @Column(name = "Direccion", nullable = false)

    private String Direccion;

    @Column(name = "Edad", nullable = false)

    private int Edad;

    @Column(name = "Sexo", nullable = false)

    private String Sexo;

    @Column(name = "Motivo", nullable = false)

    private String Motivo;


    public Paciente() {
    }

    public Paciente(int idUsuario, String Nombre, String Apellido, String Telefono, String Direccion, int Edad , String Sexo , String Motivo) {
        this.idUsuario = idUsuario;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Edad = Edad;
        this.Sexo = Sexo;
        this.Motivo = Motivo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }
}

