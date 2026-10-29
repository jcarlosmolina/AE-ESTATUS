package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.DirSucursalC;
import com.keralty.aeestatus.persistence.Regional;
import com.keralty.aeestatus.persistence.RespRegional;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionalJpaRepository extends JpaRepository<Regional, Long>, RegionalJpaRepositoryCustom {

    List<Regional> findByRespRegional(RespRegional respRegional);

    List<Regional> findByDirSucursalC(DirSucursalC dirSucursalC);
}
