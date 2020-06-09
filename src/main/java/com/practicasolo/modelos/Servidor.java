package com.practicasolo.modelos;


import javax.persistence.*;

@Entity
@Table (name = "paciente")
public class Servidor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idPaciente")
    private int id;
    @Column(name="nombre", columnDefinition = "varchar(60)")
    private String nombre;
    @Column(name="direccion", columnDefinition = "varchar(55)")
    private String direccion;
    @Column(name = "noSeguro", columnDefinition = "char(25)")
    private String noSeguro;

    public Servidor(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNoSeguro() {
        return noSeguro;
    }

    public void setNoSeguro(String noSeguro) {
        this.noSeguro = noSeguro;
    }
}




