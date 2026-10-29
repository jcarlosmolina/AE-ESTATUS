package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Firma;
import com.keralty.aeestatus.persistence.RespRegional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RespRegionalJpaRepository extends JpaRepository<RespRegional, Long>, RespRegionalJpaRepositoryCustom {

    List<RespRegional> findByFirma(Firma firma);
}
