package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.EstadoCivil;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.PersonaC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoCivilJpaRepository extends JpaRepository<EstadoCivil, Long>, EstadoCivilJpaRepositoryCustom {

    List<EstadoCivil> findByPersonas(Persona personas);

    List<EstadoCivil> findByPersonasC(PersonaC personasC);
}
