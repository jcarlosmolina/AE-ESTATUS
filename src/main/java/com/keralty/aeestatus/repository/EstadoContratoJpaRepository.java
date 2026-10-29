package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Aesolicitudes;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.EstadoContrato;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstadoContratoJpaRepository extends JpaRepository<EstadoContrato, Long>, EstadoContratoJpaRepositoryCustom {

    List<EstadoContrato> findByAESOLICITUDES(Aesolicitudes aESOLICITUDES);

    List<EstadoContrato> findByContratosC(ContratoC contratosC);
}
