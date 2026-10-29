package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AreaMedica;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AreaMedicaJpaRepository extends JpaRepository<AreaMedica, Long>, AreaMedicaJpaRepositoryCustom {

    List<AreaMedica> findBySolicitudesArMe(Solicitud solicitudesArMe);
}
