package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.CuestionarioMed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuestionarioMedJpaRepository extends JpaRepository<CuestionarioMed, Long>, CuestionarioMedJpaRepositoryCustom {
}
