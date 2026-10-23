package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.ObservacionesC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ObservacionesCJpaRepository extends JpaRepository<ObservacionesC, Long>, ObservacionesCJpaRepositoryCustom {

    List<ObservacionesC> findByContratoC(ContratoC contratoC);
}
