package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Departamento;
import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import com.keralty.aeestatus.persistence.Titular;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TitularJpaRepository extends JpaRepository<Titular, Long>, TitularJpaRepositoryCustom {

    List<Titular> findByDireccion(Direccion direccion);

    List<Titular> findBySolicitud(Solicitud solicitud);

    List<Titular> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<Titular> findByDepartamentoNac(Departamento departamentoNac);

    List<Titular> findByMunicipioNac(Municipio municipioNac);
}
