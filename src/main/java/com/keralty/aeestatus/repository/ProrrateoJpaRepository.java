package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.oid.ProrrateoOid;
import com.keralty.aeestatus.persistence.Prorrateo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProrrateoJpaRepository extends JpaRepository<Prorrateo, ProrrateoOid>, ProrrateoJpaRepositoryCustom {
}
