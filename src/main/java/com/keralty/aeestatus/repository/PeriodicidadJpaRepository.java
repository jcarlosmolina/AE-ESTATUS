package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AnexoC;
import com.keralty.aeestatus.persistence.AnexoMat;
import com.keralty.aeestatus.persistence.AnexoNeo;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.Periodicidad;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodicidadJpaRepository extends JpaRepository<Periodicidad, Long>, PeriodicidadJpaRepositoryCustom {

    List<Periodicidad> findBySolicitudes(Solicitud solicitudes);

    List<Periodicidad> findByAnexosMat(AnexoMat anexosMat);

    List<Periodicidad> findByAnexosNeo(AnexoNeo anexosNeo);

    List<Periodicidad> findByContratosC(ContratoC contratosC);

    List<Periodicidad> findByAnexosC(AnexoC anexosC);
}
