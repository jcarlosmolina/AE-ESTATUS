package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.TipoIVA;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoIVAJpaRepository extends JpaRepository<TipoIVA, Long>, TipoIVAJpaRepositoryCustom {

    List<TipoIVA> findByProductoT(Productos productoT);
}
