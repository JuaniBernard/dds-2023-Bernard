package com.um.ejercicioBidiUnoMucho.repositorios;

import com.um.ejercicioBidiUnoMucho.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Long> {
}
