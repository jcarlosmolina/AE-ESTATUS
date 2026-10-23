package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.oid.ProteccionDatosCOid;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.ProteccionDatosC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProteccionDatosCJpaRepository extends JpaRepository<ProteccionDatosC, ProteccionDatosCOid>, ProteccionDatosCJpaRepositoryCustom {

    List<ProteccionDatosC> findByPersonaC(PersonaC personaC);

    List<ProteccionDatosC> findByProductoC(Productos productoC);
}
