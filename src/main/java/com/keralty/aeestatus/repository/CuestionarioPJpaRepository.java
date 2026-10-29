package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.CuestionarioP;
import com.keralty.aeestatus.persistence.SeccionP;
import com.keralty.aeestatus.persistence.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuestionarioPJpaRepository extends JpaRepository<CuestionarioP, Long>, CuestionarioPJpaRepositoryCustom {

    List<CuestionarioP> findBySecciones(SeccionP secciones);

    List<CuestionarioP> findByUsuario(Usuario usuario);
}
