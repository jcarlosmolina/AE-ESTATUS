package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.EstadoBeneficiario;
import com.keralty.aeestatus.persistence.Usuario;
import com.keralty.aeestatus.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoBeneficiarioJpaRepository extends JpaRepository<EstadoBeneficiario, Long>, EstadoBeneficiarioJpaRepositoryCustom {

    List<EstadoBeneficiario> findByUsuarioS(Usuario usuarioS);

    List<EstadoBeneficiario> findByBeneficiariosC(BeneficiarioC beneficiariosC);

    List<EstadoBeneficiario> findByUsuariosReg(UsuarioReg usuariosReg);
}
