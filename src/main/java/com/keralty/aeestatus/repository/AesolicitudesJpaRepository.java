package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Aesolicitudes;
import com.keralty.aeestatus.persistence.Productos;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AesolicitudesJpaRepository extends JpaRepository<Aesolicitudes, Long>, AesolicitudesJpaRepositoryCustom {

    List<Aesolicitudes> findBySolicitud(Solicitud solicitud);

    List<Aesolicitudes> findByProductoT(Productos productoT);
}
