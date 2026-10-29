package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.oid.PregCuesMedCOid;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.PregCuesMedC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PregCuesMedCJpaRepository extends JpaRepository<PregCuesMedC, PregCuesMedCOid>, PregCuesMedCJpaRepositoryCustom {

    List<PregCuesMedC> findByPersonaC(PersonaC personaC);
}
