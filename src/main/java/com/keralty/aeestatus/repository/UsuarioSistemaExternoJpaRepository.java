package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.UsuarioSistemaExterno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioSistemaExternoJpaRepository extends JpaRepository<UsuarioSistemaExterno, String>, UsuarioSistemaExternoJpaRepositoryCustom {
}
