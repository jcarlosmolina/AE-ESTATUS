package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ErrorWS;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorWSJpaRepository extends JpaRepository<ErrorWS, Long>, ErrorWSJpaRepositoryCustom {

    List<ErrorWS> findBySolicitud(Solicitud solicitud);
}
