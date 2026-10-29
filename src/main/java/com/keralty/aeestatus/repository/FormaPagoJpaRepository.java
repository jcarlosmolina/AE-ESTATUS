package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.FormaPago;
import com.keralty.aeestatus.persistence.Solicitud;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormaPagoJpaRepository extends JpaRepository<FormaPago, Long>, FormaPagoJpaRepositoryCustom {

    List<FormaPago> findBySolicitudes(Solicitud solicitudes);

    List<FormaPago> findByContratosC(ContratoC contratosC);
}
