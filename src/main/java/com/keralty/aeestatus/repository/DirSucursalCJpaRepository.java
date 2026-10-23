package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.DirSucursalC;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.Pais;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.TelefonoC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DirSucursalCJpaRepository extends JpaRepository<DirSucursalC, Long>, DirSucursalCJpaRepositoryCustom {

    List<DirSucursalC> findByTelefonosC(TelefonoC telefonosC);

    List<DirSucursalC> findByPersonaC(PersonaC personaC);

    List<DirSucursalC> findByMunicipioC(Municipio municipioC);

    List<DirSucursalC> findByDepartamentoC(Departamento departamentoC);

    List<DirSucursalC> findByPaisC(Pais paisC);
}
