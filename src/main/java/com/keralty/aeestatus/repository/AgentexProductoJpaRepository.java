package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.AgentexProducto;
import com.keralty.aeestatus.persistence.Asesor;
import com.keralty.aeestatus.persistence.oid.AgentexProductoOid;
import com.keralty.aeestatus.persistence.Productos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentexProductoJpaRepository extends JpaRepository<AgentexProducto, AgentexProductoOid>, AgentexProductoJpaRepositoryCustom {

    List<AgentexProducto> findByProductoT(Productos productoT);

    List<AgentexProducto> findByAsesor(Asesor asesor);
}
