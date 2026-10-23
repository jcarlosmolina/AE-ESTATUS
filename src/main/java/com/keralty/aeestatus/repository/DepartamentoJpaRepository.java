package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Contratante;
import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.DireccionC;
import com.keralty.aeestatus.persistence.DirSucursalC;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.Titular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoJpaRepository extends JpaRepository<Departamento, Long>, DepartamentoJpaRepositoryCustom {

    List<Departamento> findByPersonas(Persona personas);

    List<Departamento> findByMunicipios(Municipio municipios);

    List<Departamento> findByPersonasC(PersonaC personasC);

    List<Departamento> findByDireccionesC(DireccionC direccionesC);

    List<Departamento> findByDirecciones(Direccion direcciones);

    List<Departamento> findByContratantes(Contratante contratantes);

    List<Departamento> findByContratantesRes(Contratante contratantesRes);

    List<Departamento> findByDirSucursalC(DirSucursalC dirSucursalC);

    List<Departamento> findByTitulares(Titular titulares);
}
