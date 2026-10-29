package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.ConceptoC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConceptoCJpaRepository extends JpaRepository<ConceptoC, Long>, ConceptoCJpaRepositoryCustom {

    List<ConceptoC> findByBeneficiarioC(BeneficiarioC beneficiarioC);
}
