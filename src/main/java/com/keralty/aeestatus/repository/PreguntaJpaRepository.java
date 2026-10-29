package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Pregunta;
import com.keralty.aeestatus.persistence.PreguntaP;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreguntaJpaRepository extends JpaRepository<Pregunta, Long>, PreguntaJpaRepositoryCustom {

    List<Pregunta> findByPreguntasPersona(PreguntaP preguntasPersona);
}
