package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.Eps;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpsJpaRepository extends JpaRepository<Eps, Long>, EpsJpaRepositoryCustom {

    List<Eps> findByAtributosUsuario(Usuario atributosUsuario);

    List<Eps> findByBeneficiariosC(BeneficiarioC beneficiariosC);
}
