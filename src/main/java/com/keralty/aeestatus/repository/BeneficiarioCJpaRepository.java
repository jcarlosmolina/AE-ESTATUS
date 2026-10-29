package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AnexoC;
import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.Companyia;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.Eps;
import com.keralty.aeestatus.persistence.EstadoBeneficiario;
import com.keralty.aeestatus.persistence.FamiliaC;
import com.keralty.aeestatus.persistence.oid.BeneficiarioCOid;
import com.keralty.aeestatus.persistence.Parentesco;
import com.keralty.aeestatus.persistence.PersonaC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BeneficiarioCJpaRepository extends JpaRepository<BeneficiarioC, BeneficiarioCOid>, BeneficiarioCJpaRepositoryCustom {

    List<BeneficiarioC> findByPersonaC(PersonaC personaC);

    List<BeneficiarioC> findByAnexosC(AnexoC anexosC);

    List<BeneficiarioC> findByContratoC(ContratoC contratoC);

    List<BeneficiarioC> findByFamiliasC(FamiliaC familiasC);

    List<BeneficiarioC> findByEPSC(Eps ePSC);

    List<BeneficiarioC> findByCompanyiaMPC(Companyia companyiaMPC);

    List<BeneficiarioC> findByParentescoC(Parentesco parentescoC);

    List<BeneficiarioC> findByEstadoBeneficiarioC(EstadoBeneficiario estadoBeneficiarioC);
}
