package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.CuestionarioP;
import com.keralty.aeestatus.persistence.PreguntaP;
import com.keralty.aeestatus.persistence.SeccionP;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeccionPJpaRepository extends JpaRepository<SeccionP, Long>, SeccionPJpaRepositoryCustom {

    List<SeccionP> findByPreguntas(PreguntaP preguntas);

    List<SeccionP> findByCuestionario(CuestionarioP cuestionario);
}
