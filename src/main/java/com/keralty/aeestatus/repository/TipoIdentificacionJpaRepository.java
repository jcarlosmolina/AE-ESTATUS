package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AnexoC;
import com.keralty.aeestatus.persistence.Asesor;
import com.keralty.aeestatus.persistence.Contratante;
import com.keralty.aeestatus.persistence.InstitucionMatNeo;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.PersonaC;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import com.keralty.aeestatus.persistence.Titular;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoIdentificacionJpaRepository extends JpaRepository<TipoIdentificacion, Long>, TipoIdentificacionJpaRepositoryCustom {

    List<TipoIdentificacion> findByAsesores(Asesor asesores);

    List<TipoIdentificacion> findByPersonas(Persona personas);

    List<TipoIdentificacion> findByPersonasC(PersonaC personasC);

    List<TipoIdentificacion> findByUsuarioS(Usuario usuarioS);

    List<TipoIdentificacion> findByContratantes(Contratante contratantes);

    List<TipoIdentificacion> findByAnexosC(AnexoC anexosC);

    List<TipoIdentificacion> findByTitulares(Titular titulares);

    List<TipoIdentificacion> findByInstitucionMatNeo(InstitucionMatNeo institucionMatNeo);
}
