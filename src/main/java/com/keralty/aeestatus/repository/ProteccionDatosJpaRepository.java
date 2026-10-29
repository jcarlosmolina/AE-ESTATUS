package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.ProteccionDatos;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProteccionDatosJpaRepository extends JpaRepository<ProteccionDatos, Long>, ProteccionDatosJpaRepositoryCustom {

    List<ProteccionDatos> findByProductoT(Productos productoT);

    List<ProteccionDatos> findBySolicitud(Solicitud solicitud);
}
