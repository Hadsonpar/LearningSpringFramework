package com.hadsonpar.crudtestunitspringboot.entity;

import jakarta.persistence.*;

@Entity
//Estos nos servirá crear la tabla en la base de
// datos con el nombre de tbclient
@Table(name = "tbclient")
public class Client {
    // Atributos de nuestra entidad client
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    private String name;
    private String address;

    public Client(){

    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}