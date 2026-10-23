package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.PreguntaP;
import com.keralty.aeestatus.persistence.SeccionP;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaPJpaRepository extends JpaRepository<PreguntaP, Long>, PreguntaPJpaRepositoryCustom {

    List<PreguntaP> findBySeccion(SeccionP seccion);
}
