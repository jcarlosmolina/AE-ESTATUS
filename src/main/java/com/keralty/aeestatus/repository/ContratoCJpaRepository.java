package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Asesor;
import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.DireccionC;
import com.keralty.aeestatus.persistence.FamiliaC;
import com.keralty.aeestatus.persistence.FormaPago;
import com.keralty.aeestatus.persistence.GrupoAsociado;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.ObservacionesC;
import com.keralty.aeestatus.persistence.Periodicidad;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoCJpaRepository extends JpaRepository<ContratoC, Long>, ContratoCJpaRepositoryCustom {

    List<ContratoC> findBySolicitud(Solicitud solicitud);

    List<ContratoC> findByPersonaCContratante(PersonaC personaCContratante);

    List<ContratoC> findByDireccionesC(DireccionC direccionesC);

    List<ContratoC> findByObservacionesC(ObservacionesC observacionesC);

    List<ContratoC> findByBeneficiariosC(BeneficiarioC beneficiariosC);

    List<ContratoC> findByFamiliasC(FamiliaC familiasC);

    List<ContratoC> findByPeriodicidadC(Periodicidad periodicidadC);

    List<ContratoC> findByFormaPagoC(FormaPago formaPagoC);

    List<ContratoC> findByProductoC(Productos productoC);

    List<ContratoC> findByGrupoAsociadoC(GrupoAsociado grupoAsociadoC);

    List<ContratoC> findByMunicipioC(Municipio municipioC);

    List<ContratoC> findByAsesorC(Asesor asesorC);
}
