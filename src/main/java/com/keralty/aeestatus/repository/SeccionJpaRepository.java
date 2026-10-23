package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Seccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeccionJpaRepository extends JpaRepository<Seccion, Long>, SeccionJpaRepositoryCustom {
}
