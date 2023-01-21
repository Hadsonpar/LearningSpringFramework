package com.hadsonpar.conexionpostgresql.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbproduct")
public class Product {
    /*@Id: Representa a un primary key (llama primario) de
    nuestra tabla tbproduct*/
    @Id
    /*@GeneratedValue: Representa a un campo autogereado (secuencial),
    equivalente a un campo identity de una sentencia SQL.*/
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long code;
    private String description;
    private double price;
    private int stock;

    /*Constructor creado manualmente, util para realizar busqueda o no se
    quiere enviar ningún atributo*/
    public Product() {
    }

    //Constructor generado por la misma Herramienta de IntelliJ IDEA
    public Product(Long code, String description, double price, int stock) {
        this.code = code;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    //Set's y Get's generado por la misma Herramienta de IntelliJ IDEA
    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}