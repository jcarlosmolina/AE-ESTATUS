package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AnexoC;
import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.Periodicidad;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnexoCJpaRepository extends JpaRepository<AnexoC, Long>, AnexoCJpaRepositoryCustom {

    List<AnexoC> findByBeneficiarioC(BeneficiarioC beneficiarioC);

    List<AnexoC> findByPeriodicidadC(Periodicidad periodicidadC);

    List<AnexoC> findByTipoIdentificacionC(TipoIdentificacion tipoIdentificacionC);
}
