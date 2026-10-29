package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.Parentesco;
import com.keralty.aeestatus.persistence.Usuario;
import com.keralty.aeestatus.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentescoJpaRepository extends JpaRepository<Parentesco, Long>, ParentescoJpaRepositoryCustom {

    List<Parentesco> findByAtributosUsuario(Usuario atributosUsuario);

    List<Parentesco> findByBeneficiariosC(BeneficiarioC beneficiariosC);

    List<Parentesco> findByUsuariosReg(UsuarioReg usuariosReg);
}
