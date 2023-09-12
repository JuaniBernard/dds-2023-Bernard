package com.um.ejercicioBidiUno.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "persona")
public class Persona extends BaseEntidad{
    @Column(name = "nombre")
    private String nombre;
    private String apellido;
    private int edad;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "domicilio_id")
    private Domicilio domicilio;
}
