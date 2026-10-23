package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.PlantillaReporte;
import com.keralty.aeestatus.persistence.ReportesDominio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantillaReporteJpaRepository extends JpaRepository<PlantillaReporte, Long>, PlantillaReporteJpaRepositoryCustom {

    List<PlantillaReporte> findByReportesDominio(ReportesDominio reportesDominio);
}
