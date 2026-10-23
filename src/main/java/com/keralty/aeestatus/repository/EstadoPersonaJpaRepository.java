package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.EstadoPersona;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.PersonaC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoPersonaJpaRepository extends JpaRepository<EstadoPersona, Long>, EstadoPersonaJpaRepositoryCustom {

    List<EstadoPersona> findByPersonas(Persona personas);

    List<EstadoPersona> findByPersonasC(PersonaC personasC);
}
