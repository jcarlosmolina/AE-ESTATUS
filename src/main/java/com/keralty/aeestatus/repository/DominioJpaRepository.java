package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Dominio;
import com.keralty.aeestatus.persistence.FormaPago;
import com.keralty.aeestatus.persistence.Periodicidad;
import com.keralty.aeestatus.persistence.PlantillaEmail;
import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.ReportesDominio;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DominioJpaRepository extends JpaRepository<Dominio, Long>, DominioJpaRepositoryCustom {

    List<Dominio> findByReportesDominio(ReportesDominio reportesDominio);

    List<Dominio> findByProductoT(Productos productoT);

    List<Dominio> findByPeriodicidades(Periodicidad periodicidades);

    List<Dominio> findByFormasPago(FormaPago formasPago);

    List<Dominio> findByPlantillas(PlantillaEmail plantillas);
}
