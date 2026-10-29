package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.LogEstado;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogEstadoJpaRepository extends JpaRepository<LogEstado, Long>, LogEstadoJpaRepositoryCustom {

    List<LogEstado> findBySolicitud(Solicitud solicitud);
}
