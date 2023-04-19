package com.lab4_gtics.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Vuelo")
public class Vuelo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvuelo")
    private int id;
    @Column(nullable = false)
    private String origen;
    @Column(nullable = false)
    private String destino;
    @Column(nullable = false)
    private Date fecha_salida;
    @Column(nullable = false)
    private Date fecha_llegado;
    @Column(nullable = false)
    private int duracion;
    @Column(nullable = false)
    private BigDecimal precio;

    @ManyToOne
    @JoinColumn(name = "aerolinea_idaerolinea")
    private Aerolinea aerolinea;

    @Column(nullable = false)
    private int asientos_disponibles;
    @Column(nullable = false)
    private String descripcion;

}
