package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.EstadoBeneficiario;
import com.keralty.aeestatus.persistence.oid.UsuarioRegOid;
import com.keralty.aeestatus.persistence.Parentesco;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRegJpaRepository extends JpaRepository<UsuarioReg, UsuarioRegOid>, UsuarioRegJpaRepositoryCustom {

    List<UsuarioReg> findBySolicitud(Solicitud solicitud);

    List<UsuarioReg> findByEstadoBeneficiario(EstadoBeneficiario estadoBeneficiario);

    List<UsuarioReg> findByParentesco(Parentesco parentesco);
}
