package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.DireccionC;
import com.keralty.aeestatus.persistence.DirSucursalC;
import com.keralty.aeestatus.persistence.Pais;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaisJpaRepository extends JpaRepository<Pais, String>, PaisJpaRepositoryCustom {

    List<Pais> findByDireccionesC(DireccionC direccionesC);

    List<Pais> findByDirecciones(Direccion direcciones);

    List<Pais> findByDirSucursalC(DirSucursalC dirSucursalC);
}
