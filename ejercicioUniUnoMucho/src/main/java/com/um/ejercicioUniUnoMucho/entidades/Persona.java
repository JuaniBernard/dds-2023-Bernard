package com.um.ejercicioUniUnoMucho.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

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

    // RELACION ONE TO ONE UNIDIRECCIONAL
    // El Cascadeo propaga las operaciones y orphanRemoval asegura que se elimine la relacionada
    // OJO COMO LA CARGA ES POR DEFECTO LAZY SI NO PONGO EAGER ME DA ERROR PORQUE CIERRA LA SESIÓN
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)
    @JoinColumn(name = "persona_id")

    // OJO ES IMPORTANTE COLOCAR ESTA ANOTACIÓN SINO ME DA ERROR

    @Builder.Default
    private List<Domicilio> domicilios = new ArrayList<>();

    public void agregarDomicilio(Domicilio domi){

        domicilios.add(domi);
    }

    public void mostrarDomicilios() {
        System.out.println("Domicilios de " + nombre + " " + apellido + ":");
        for (Domicilio domicilio : domicilios) {
            System.out.println("Calle: " + domicilio.getCalle() + ", Número: " + domicilio.getNumero());
        }
    }
}
