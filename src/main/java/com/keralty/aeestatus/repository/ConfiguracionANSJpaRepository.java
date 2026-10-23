package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ConfiguracionANS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfiguracionANSJpaRepository extends JpaRepository<ConfiguracionANS, Long>, ConfiguracionANSJpaRepositoryCustom {
}
