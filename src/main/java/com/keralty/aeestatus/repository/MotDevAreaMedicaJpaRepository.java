package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.MotDevAreaMedica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MotDevAreaMedicaJpaRepository extends JpaRepository<MotDevAreaMedica, Long>, MotDevAreaMedicaJpaRepositoryCustom {
}
