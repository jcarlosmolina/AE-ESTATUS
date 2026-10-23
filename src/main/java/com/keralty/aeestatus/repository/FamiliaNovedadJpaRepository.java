package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.FamiliaNovedad;
import com.keralty.aeestatus.persistence.Firma;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamiliaNovedadJpaRepository extends JpaRepository<FamiliaNovedad, Long>, FamiliaNovedadJpaRepositoryCustom {

    List<FamiliaNovedad> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<FamiliaNovedad> findByFirma(Firma firma);
}
