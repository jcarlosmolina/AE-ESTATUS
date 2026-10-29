package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AnexoNeo;
import com.keralty.aeestatus.persistence.InstitucionMatNeo;
import com.keralty.aeestatus.persistence.Periodicidad;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnexoNeoJpaRepository extends JpaRepository<AnexoNeo, Long>, AnexoNeoJpaRepositoryCustom {

    List<AnexoNeo> findByUsuario(Usuario usuario);

    List<AnexoNeo> findByPeriodicidad(Periodicidad periodicidad);

    List<AnexoNeo> findByInstitucionNeonatal(InstitucionMatNeo institucionNeonatal);
}
