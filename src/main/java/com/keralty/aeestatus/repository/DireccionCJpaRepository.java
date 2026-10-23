package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.DireccionC;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.Pais;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.TelefonoC;
import com.keralty.aeestatus.persistence.TipoDireccion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionCJpaRepository extends JpaRepository<DireccionC, Long>, DireccionCJpaRepositoryCustom {

    List<DireccionC> findByTelefonosC(TelefonoC telefonosC);

    List<DireccionC> findByPersonaC(PersonaC personaC);

    List<DireccionC> findByContratoC(ContratoC contratoC);

    List<DireccionC> findByTipoDireccionC(TipoDireccion tipoDireccionC);

    List<DireccionC> findByDepartamentoC(Departamento departamentoC);

    List<DireccionC> findByMunicipioC(Municipio municipioC);

    List<DireccionC> findByPaisC(Pais paisC);
}
