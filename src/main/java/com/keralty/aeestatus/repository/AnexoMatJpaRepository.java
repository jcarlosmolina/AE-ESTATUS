package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AnexoMat;
import com.keralty.aeestatus.persistence.InstitucionMatNeo;
import com.keralty.aeestatus.persistence.Periodicidad;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnexoMatJpaRepository extends JpaRepository<AnexoMat, Long>, AnexoMatJpaRepositoryCustom {

    List<AnexoMat> findByUsuario(Usuario usuario);

    List<AnexoMat> findByPeriodicidad(Periodicidad periodicidad);

    List<AnexoMat> findByInstitucionMaternal(InstitucionMatNeo institucionMaternal);
}
