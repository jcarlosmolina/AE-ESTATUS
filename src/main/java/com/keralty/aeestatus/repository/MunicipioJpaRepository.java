package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Contratante;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.DireccionC;
import com.keralty.aeestatus.persistence.DirSucursalC;
import com.keralty.aeestatus.persistence.FamiliaC;
import com.keralty.aeestatus.persistence.InstitucionMatNeo;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.Titular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipioJpaRepository extends JpaRepository<Municipio, Long>, MunicipioJpaRepositoryCustom {

    List<Municipio> findByPersonas(Persona personas);

    List<Municipio> findByPersonasC(PersonaC personasC);

    List<Municipio> findByDireccionesC(DireccionC direccionesC);

    List<Municipio> findByDirecciones(Direccion direcciones);

    List<Municipio> findByContratantes(Contratante contratantes);

    List<Municipio> findByContratanteRes(Contratante contratanteRes);

    List<Municipio> findByContratosC(ContratoC contratosC);

    List<Municipio> findByDirSucursalC(DirSucursalC dirSucursalC);

    List<Municipio> findByFamiliaC(FamiliaC familiaC);

    List<Municipio> findByTitulares(Titular titulares);

    List<Municipio> findByInstitucionMatNeo(InstitucionMatNeo institucionMatNeo);

    List<Municipio> findByDepartamento(Departamento departamento);
}
