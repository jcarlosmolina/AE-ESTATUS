package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.LogAsignaciones;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LogAsignacionesJpaRepository extends JpaRepository<LogAsignaciones, Long>, LogAsignacionesJpaRepositoryCustom {

    List<LogAsignaciones> findBySolicitud(Solicitud solicitud);
}
