package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Funcionario;
import com.keralty.aeestatus.persistence.Rol;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolJpaRepository extends JpaRepository<Rol, Long>, RolJpaRepositoryCustom {

    List<Rol> findByAgentes(Funcionario agentes);
}
