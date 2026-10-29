package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.GrupoAsociado;
import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupoAsociadoJpaRepository extends JpaRepository<GrupoAsociado, Long>, GrupoAsociadoJpaRepositoryCustom {

    List<GrupoAsociado> findBySolicitudes(Solicitud solicitudes);

    List<GrupoAsociado> findByContratosC(ContratoC contratosC);

    List<GrupoAsociado> findByProductoT(Productos productoT);
}
