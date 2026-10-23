package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AnexoMat;
import com.keralty.aeestatus.persistence.AnexoNeo;
import com.keralty.aeestatus.persistence.Companyia;
import com.keralty.aeestatus.persistence.CuestionarioP;
import com.keralty.aeestatus.persistence.Eps;
import com.keralty.aeestatus.persistence.EstadoBeneficiario;
import com.keralty.aeestatus.persistence.oid.UsuarioOid;
import com.keralty.aeestatus.persistence.Parentesco;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.Preexistencia;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.persistence.TipoIdentificacion;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioJpaRepository extends JpaRepository<Usuario, UsuarioOid>, UsuarioJpaRepositoryCustom {

    List<Usuario> findByCuestionarioP(CuestionarioP cuestionarioP);

    List<Usuario> findByAnexoMat(AnexoMat anexoMat);

    List<Usuario> findByAnexoNeo(AnexoNeo anexoNeo);

    List<Usuario> findByPreexistencias(Preexistencia preexistencias);

    List<Usuario> findBySolicitud(Solicitud solicitud);

    List<Usuario> findByUsuarioPersona(Persona usuarioPersona);

    List<Usuario> findByEps(Eps eps);

    List<Usuario> findByParentesco(Parentesco parentesco);

    List<Usuario> findByCompanyia(Companyia companyia);

    List<Usuario> findByTipoIdentificacion(TipoIdentificacion tipoIdentificacion);

    List<Usuario> findByEstadoBeneficiario(EstadoBeneficiario estadoBeneficiario);
}
