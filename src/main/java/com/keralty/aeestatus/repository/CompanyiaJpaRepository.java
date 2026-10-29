package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.Companyia;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyiaJpaRepository extends JpaRepository<Companyia, Long>, CompanyiaJpaRepositoryCustom {

    List<Companyia> findByAtributosUsuario(Usuario atributosUsuario);

    List<Companyia> findByBeneficiariosC(BeneficiarioC beneficiariosC);
}
