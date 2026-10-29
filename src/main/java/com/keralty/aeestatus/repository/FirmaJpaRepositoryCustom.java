package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.exception.SystemException;
import com.keralty.aeestatus.persistence.Firma;
import com.keralty.aeestatus.sqlutils.SQLExists;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface FirmaJpaRepositoryCustom {

    List<Firma> solveQuery(SQLSelect query);
    
    List<Firma> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000() throws SystemException;

    Boolean assocOperator000Range1() throws SystemException;
    
    SQLExists assocOperator000Range1Query(SQLSelect superQuery) throws SystemException;

    public List<Firma> executeQuery(String query);

    public List<Firma> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
