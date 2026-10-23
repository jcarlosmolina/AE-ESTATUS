package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Aesolicitudes;
import com.keralty.aeestatus.persistence.Afiliaciones;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.GrupoAsociado;
import com.keralty.aeestatus.persistence.Planes;
import com.keralty.aeestatus.persistence.Productos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanesJpaRepository extends JpaRepository<Planes, Long>, PlanesJpaRepositoryCustom {

    List<Planes> findByGruposAsociados(GrupoAsociado gruposAsociados);

    List<Planes> findByAESOLICITUDES(Aesolicitudes aESOLICITUDES);

    List<Planes> findByContratosC(ContratoC contratosC);

    List<Planes> findByAfiliaciones(Afiliaciones afiliaciones);

    List<Planes> findByProductoT(Productos productoT);
}
