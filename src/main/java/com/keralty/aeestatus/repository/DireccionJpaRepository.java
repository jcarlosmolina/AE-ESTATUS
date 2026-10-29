package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.Pais;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.persistence.TipoDireccion;
import com.keralty.aeestatus.persistence.Titular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DireccionJpaRepository extends JpaRepository<Direccion, Long>, DireccionJpaRepositoryCustom {

    List<Direccion> findByPersona(Persona persona);

    List<Direccion> findByTipoDireccion(TipoDireccion tipoDireccion);

    List<Direccion> findByMunicipio(Municipio municipio);

    List<Direccion> findByDepartamento(Departamento departamento);

    List<Direccion> findByPais(Pais pais);

    List<Direccion> findByContrato(Solicitud contrato);

    List<Direccion> findByTitular(Titular titular);
}
