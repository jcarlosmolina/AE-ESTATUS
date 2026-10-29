package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.oid.PreexistenciaOid;
import com.keralty.aeestatus.persistence.Preexistencia;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreexistenciaJpaRepository extends JpaRepository<Preexistencia, PreexistenciaOid>, PreexistenciaJpaRepositoryCustom {

    List<Preexistencia> findByUsuario(Usuario usuario);
}
