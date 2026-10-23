package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.DocumentoG;
import com.keralty.aeestatus.persistence.EstadoCivil;
import com.keralty.aeestatus.persistence.EstadoPersona;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaJpaRepository extends JpaRepository<Persona, Long>, PersonaJpaRepositoryCustom {

    List<Persona> findBySolicitudesContratante(Solicitud solicitudesContratante);

    List<Persona> findBySolicitudesTitular(Solicitud solicitudesTitular);

    List<Persona> findByDirecciones(Direccion direcciones);

    List<Persona> findByUsuarios(Usuario usuarios);

    List<Persona> findByDocumentosG(DocumentoG documentosG);

    List<Persona> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<Persona> findByDepartamentoNacimiento(Departamento departamentoNacimiento);

    List<Persona> findByMunicipioNacimiento(Municipio municipioNacimiento);

    List<Persona> findByEstadoCivil(EstadoCivil estadoCivil);

    List<Persona> findByEstadoPersona(EstadoPersona estadoPersona);
}
