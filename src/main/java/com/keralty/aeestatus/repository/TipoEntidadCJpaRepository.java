package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.TipoEntidadC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEntidadCJpaRepository extends JpaRepository<TipoEntidadC, Long>, TipoEntidadCJpaRepositoryCustom {

    List<TipoEntidadC> findByPersonasC(PersonaC personasC);
}
