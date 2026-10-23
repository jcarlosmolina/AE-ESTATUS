package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.FamiliaC;
import com.keralty.aeestatus.persistence.Municipio;
import com.keralty.aeestatus.persistence.oid.FamiliaCOid;
import com.keralty.aeestatus.persistence.PersonaC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamiliaCJpaRepository extends JpaRepository<FamiliaC, FamiliaCOid>, FamiliaCJpaRepositoryCustom {

    List<FamiliaC> findByPersonaCTitular(PersonaC personaCTitular);

    List<FamiliaC> findByBeneficiariosC(BeneficiarioC beneficiariosC);

    List<FamiliaC> findByContratoC(ContratoC contratoC);

    List<FamiliaC> findByMunicipioC(Municipio municipioC);
}
