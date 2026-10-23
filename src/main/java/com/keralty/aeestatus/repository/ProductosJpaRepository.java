package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Aesolicitudes;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.GrupoAsociado;
import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.ProteccionDatos;
import com.keralty.aeestatus.persistence.ProteccionDatosC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosJpaRepository extends JpaRepository<Productos, Long>, ProductosJpaRepositoryCustom {

    List<Productos> findByGruposAsociados(GrupoAsociado gruposAsociados);

    List<Productos> findByAESOLICITUDES(Aesolicitudes aESOLICITUDES);

    List<Productos> findByProteccionDatosC(ProteccionDatosC proteccionDatosC);

    List<Productos> findByProteccionesDatos(ProteccionDatos proteccionesDatos);

    List<Productos> findByContratosC(ContratoC contratosC);
}
