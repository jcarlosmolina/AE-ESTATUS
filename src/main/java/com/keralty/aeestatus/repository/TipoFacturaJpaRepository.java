package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.persistence.TipoFactura;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoFacturaJpaRepository extends JpaRepository<TipoFactura, String>, TipoFacturaJpaRepositoryCustom {

    List<TipoFactura> findBySolicitudes(Solicitud solicitudes);
}
