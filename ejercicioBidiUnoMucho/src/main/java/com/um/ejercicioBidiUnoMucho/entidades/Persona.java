package com.um.ejercicioBidiUnoMucho.entidades;

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
    @OneToMany(mappedBy = "persona", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)

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
