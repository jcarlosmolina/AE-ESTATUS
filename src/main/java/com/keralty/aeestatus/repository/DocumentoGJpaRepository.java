package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.DocumentoG;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoGJpaRepository extends JpaRepository<DocumentoG, Long>, DocumentoGJpaRepositoryCustom {

    List<DocumentoG> findBySolicitud(Solicitud solicitud);

    List<DocumentoG> findByPersona(Persona persona);
}
