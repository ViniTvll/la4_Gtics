package com.lab4_gtics.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Aerolinea")
public class Aerolinea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaerolinea")
    private int id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String codigo;
}
