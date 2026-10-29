package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Firma;
import com.keralty.aeestatus.persistence.Funcionario;
import com.keralty.aeestatus.persistence.GrupoAsociado;
import com.keralty.aeestatus.persistence.Periodicidad;
import com.keralty.aeestatus.persistence.ProteccionDatos;
import com.keralty.aeestatus.persistence.SolicitudNovedad;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudNovedadJpaRepository extends JpaRepository<SolicitudNovedad, Long>, SolicitudNovedadJpaRepositoryCustom {

    List<SolicitudNovedad> findByProteccionDatos(ProteccionDatos proteccionDatos);

    List<SolicitudNovedad> findByTipoIdentContratante(TipoIdentificacion tipoIdentContratante);

    List<SolicitudNovedad> findByGrupoAsociado(GrupoAsociado grupoAsociado);

    List<SolicitudNovedad> findByPeriodicidad(Periodicidad periodicidad);

    List<SolicitudNovedad> findByAgente(Funcionario agente);

    List<SolicitudNovedad> findByPeriodicidadNueva(Periodicidad periodicidadNueva);

    List<SolicitudNovedad> findByUsrAfiliacion(Funcionario usrAfiliacion);

    List<SolicitudNovedad> findByFirma(Firma firma);
}
