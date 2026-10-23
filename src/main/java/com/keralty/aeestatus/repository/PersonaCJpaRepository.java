package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.DireccionC;
import com.keralty.aeestatus.persistence.DirSucursalC;
import com.keralty.aeestatus.persistence.EstadoCivil;
import com.keralty.aeestatus.persistence.EstadoPersona;
import com.keralty.aeestatus.persistence.FamiliaC;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.PreexistenciaC;
import com.keralty.aeestatus.persistence.PregCuesMedC;
import com.keralty.aeestatus.persistence.ProteccionDatosC;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaCJpaRepository extends JpaRepository<PersonaC, Long>, PersonaCJpaRepositoryCustom {

    List<PersonaC> findByDireccionesC(DireccionC direccionesC);

    List<PersonaC> findByProteccionesDatosC(ProteccionDatosC proteccionesDatosC);

    List<PersonaC> findByPregsCuesMedC(PregCuesMedC pregsCuesMedC);

    List<PersonaC> findByDirSucursalesC(DirSucursalC dirSucursalesC);

    List<PersonaC> findByPreexistenciasC(PreexistenciaC preexistenciasC);

    List<PersonaC> findByEstadoCivilC(EstadoCivil estadoCivilC);

    List<PersonaC> findByEstadoPersonaC(EstadoPersona estadoPersonaC);

    List<PersonaC> findByTipoIdentificacionC(TipoIdentificacion tipoIdentificacionC);

    List<PersonaC> findByMunicipioCNac(Municipio municipioCNac);

    List<PersonaC> findByDepartamentoCNac(Departamento departamentoCNac);

    List<PersonaC> findByContratosC(ContratoC contratosC);

    List<PersonaC> findByFamiliasC(FamiliaC familiasC);

    List<PersonaC> findByBeneficiariosC(BeneficiarioC beneficiariosC);
}
