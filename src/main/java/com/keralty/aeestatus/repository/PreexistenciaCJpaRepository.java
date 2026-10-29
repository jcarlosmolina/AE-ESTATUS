package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.oid.PreexistenciaCOid;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.PreexistenciaC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreexistenciaCJpaRepository extends JpaRepository<PreexistenciaC, PreexistenciaCOid>, PreexistenciaCJpaRepositoryCustom {

    List<PreexistenciaC> findByPersonaC(PersonaC personaC);
}
