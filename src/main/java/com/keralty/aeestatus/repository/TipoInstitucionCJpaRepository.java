package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.TipoInstitucionC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoInstitucionCJpaRepository extends JpaRepository<TipoInstitucionC, Long>, TipoInstitucionCJpaRepositoryCustom {

    List<TipoInstitucionC> findByPersonasC(PersonaC personasC);
}
