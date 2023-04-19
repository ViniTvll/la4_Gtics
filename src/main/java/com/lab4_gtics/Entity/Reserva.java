package com.lab4_gtics.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name="Reserva")
@Embeddable
public class Reserva implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva")
    private int id;

    @Column(nullable = false)
    private Date fecha_reserva;
    @Column(nullable = false)
    private BigDecimal precio_total;
    @Column(nullable = false)
    private String estado_pago;

    @ManyToOne
    @JoinColumn(name = "user_iduser")
    private User user;
    @ManyToOne
    @JoinColumn(name = "vuelo_idvuelo")
    private Vuelo vuelo;


}
