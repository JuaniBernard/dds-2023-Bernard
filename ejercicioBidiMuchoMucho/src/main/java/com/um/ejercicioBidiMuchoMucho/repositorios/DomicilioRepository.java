package com.um.ejercicioBidiMuchoMucho.repositorios;

import com.um.ejercicioBidiMuchoMucho.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio,Long> {
}
