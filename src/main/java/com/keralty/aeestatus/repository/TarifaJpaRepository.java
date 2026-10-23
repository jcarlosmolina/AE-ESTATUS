package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.InstitucionMatNeo;
import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.Tarifa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifaJpaRepository extends JpaRepository<Tarifa, Long>, TarifaJpaRepositoryCustom {

    List<Tarifa> findByContratosC(ContratoC contratosC);

    List<Tarifa> findByInstitucionMatNeo(InstitucionMatNeo institucionMatNeo);

    List<Tarifa> findByProductoT(Productos productoT);
}
