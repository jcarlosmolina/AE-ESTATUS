package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Asesor;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsesorJpaRepository extends JpaRepository<Asesor, Long>, AsesorJpaRepositoryCustom {

    List<Asesor> findByContratosC(ContratoC contratosC);

    List<Asesor> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);
}
