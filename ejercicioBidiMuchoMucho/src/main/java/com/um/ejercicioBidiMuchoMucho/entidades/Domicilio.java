package com.um.ejercicioBidiMuchoMucho.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Domicilio extends BaseEntidad{
    private String calle;
    private int numero;

    @ManyToMany(mappedBy = "domicilios")
    // OJO NO OLVIDARSE DE ESTO PORQUE NO LE GUSTA A LOMBOCK
    @Builder.Default
    private Set<Persona> personas = new HashSet<>();
}
