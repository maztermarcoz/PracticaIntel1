package com.practicasolo.modelos;

import javax.persistence.*;

@Entity
@Table(name = "medicina")
public class Medicina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMedicina")
    private int id;
    @Column(name = "nombre", columnDefinition = "varchar(50)")
    private String nombre;
    @Column(name = "stock", columnDefinition = "int")
    private int stock;

    public Medicina(int id) {
        this.id = id;
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
