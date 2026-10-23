package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.oid.ReportesDominioOid;
import com.keralty.aeestatus.persistence.ReportesDominio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportesDominioJpaRepository extends JpaRepository<ReportesDominio, ReportesDominioOid>, ReportesDominioJpaRepositoryCustom {
}
