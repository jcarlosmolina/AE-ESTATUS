package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.Firma;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.NovedadCT;
import com.keralty.aeestatus.persistence.Pais;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NovedadCTJpaRepository extends JpaRepository<NovedadCT, Long>, NovedadCTJpaRepositoryCustom {

    List<NovedadCT> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<NovedadCT> findByFirma(Firma firma);

    List<NovedadCT> findByMunicipioNac(Municipio municipioNac);

    List<NovedadCT> findByMunicipioRes(Municipio municipioRes);

    List<NovedadCT> findByDepartamentoNac(Departamento departamentoNac);

    List<NovedadCT> findByDepartamentoRes(Departamento departamentoRes);

    List<NovedadCT> findByPais(Pais pais);
}
