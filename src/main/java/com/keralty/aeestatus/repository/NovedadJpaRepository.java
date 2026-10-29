package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Novedad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NovedadJpaRepository extends JpaRepository<Novedad, Long>, NovedadJpaRepositoryCustom {
}
