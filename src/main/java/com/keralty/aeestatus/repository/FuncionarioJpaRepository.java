package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Funcionario;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioJpaRepository extends JpaRepository<Funcionario, Long>, FuncionarioJpaRepositoryCustom {

    List<Funcionario> findBySolicitudes(Solicitud solicitudes);

    List<Funcionario> findBySolicitudesAfiliacion(Solicitud solicitudesAfiliacion);
}
