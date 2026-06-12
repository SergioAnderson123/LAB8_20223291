package org.example.lab8_20223291.repository;

import org.example.lab8_20223291.entity.equipo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EquipoRepository extends JpaRepository<equipo, Integer> {

    Optional<equipo> findByIdAndEstadoTrue(Integer id);

}
