package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AnexoMat;
import com.keralty.aeestatus.persistence.AnexoNeo;
import com.keralty.aeestatus.persistence.InstitucionMatNeo;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstitucionMatNeoJpaRepository extends JpaRepository<InstitucionMatNeo, String>, InstitucionMatNeoJpaRepositoryCustom {

    List<InstitucionMatNeo> findByAnexoMat(AnexoMat anexoMat);

    List<InstitucionMatNeo> findByAnexoNeo(AnexoNeo anexoNeo);

    List<InstitucionMatNeo> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<InstitucionMatNeo> findByMunicipio(Municipio municipio);
}
