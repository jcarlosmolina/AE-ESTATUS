package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.PlantillaEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantillaEmailJpaRepository extends JpaRepository<PlantillaEmail, Long>, PlantillaEmailJpaRepositoryCustom {
}
