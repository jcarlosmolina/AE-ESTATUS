package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Funcionario;
import com.keralty.aeestatus.persistence.GrupoAsignacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupoAsignacionJpaRepository extends JpaRepository<GrupoAsignacion, Long>, GrupoAsignacionJpaRepositoryCustom {

    List<GrupoAsignacion> findByFuncionario(Funcionario funcionario);
}
