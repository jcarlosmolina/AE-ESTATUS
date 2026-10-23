package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.DireccionC;
import com.keralty.aeestatus.persistence.TipoDireccion;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDireccionJpaRepository extends JpaRepository<TipoDireccion, Long>, TipoDireccionJpaRepositoryCustom {

    List<TipoDireccion> findByDireccionesC(DireccionC direccionesC);

    List<TipoDireccion> findByDirecciones(Direccion direcciones);
}
