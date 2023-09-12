package com.um.ejercicioBidiMuchoMucho.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Persona extends BaseEntidad{
    private String nombre;
    private String apellido;
    private int edad;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "persona_domicilio",
            joinColumns = @JoinColumn(name = "persona_id"),
            inverseJoinColumns = @JoinColumn(name = "domicilio_id")
    )

    // Se puede producir ERRORES DE RECURSIVIDAD POR ESO EN LOMBOCK HAY QUE
    // EXCLUIR LOS MÉTODOS  Equals y HashCode
    @EqualsAndHashCode.Exclude
    // OJO ES IMPORTANTE COLOCAR ESTA ANOTACIÓN SINO ME DA ERROR
    @Builder.Default
    private Set<Domicilio> domicilios = new HashSet<>();

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
