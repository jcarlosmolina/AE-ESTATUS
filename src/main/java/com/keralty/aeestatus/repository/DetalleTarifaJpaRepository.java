package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.DetalleTarifa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetalleTarifaJpaRepository extends JpaRepository<DetalleTarifa, Long>, DetalleTarifaJpaRepositoryCustom {
}
