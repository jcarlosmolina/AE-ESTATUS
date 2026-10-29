package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.DireccionC;
import com.keralty.aeestatus.persistence.DirSucursalC;
import com.keralty.aeestatus.persistence.TelefonoC;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefonoCJpaRepository extends JpaRepository<TelefonoC, Long>, TelefonoCJpaRepositoryCustom {

    List<TelefonoC> findByDirSucursalC(DirSucursalC dirSucursalC);

    List<TelefonoC> findByDireccionC(DireccionC direccionC);
}
