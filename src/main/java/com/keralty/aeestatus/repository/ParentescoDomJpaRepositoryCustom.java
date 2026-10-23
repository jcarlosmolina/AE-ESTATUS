package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ParentescoDom;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface ParentescoDomJpaRepositoryCustom {

    List<ParentescoDom> solveQuery(SQLSelect query);
    
    List<ParentescoDom> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);
    
    Long nextParentescoDomIdentificador(Long dominioNumero);

    public List<ParentescoDom> executeQuery(String query);

    public List<ParentescoDom> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
