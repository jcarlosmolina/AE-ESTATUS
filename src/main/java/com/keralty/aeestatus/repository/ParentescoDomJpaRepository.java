package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.oid.ParentescoDomOid;
import com.keralty.aeestatus.persistence.Parentesco;
import com.keralty.aeestatus.persistence.ParentescoDom;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentescoDomJpaRepository extends JpaRepository<ParentescoDom, ParentescoDomOid>, ParentescoDomJpaRepositoryCustom {

    List<ParentescoDom> findByParentesco(Parentesco parentesco);
}
