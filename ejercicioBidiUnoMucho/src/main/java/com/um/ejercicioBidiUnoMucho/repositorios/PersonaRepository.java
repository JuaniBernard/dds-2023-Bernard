package com.um.ejercicioBidiUnoMucho.repositorios;

import com.um.ejercicioBidiUnoMucho.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
