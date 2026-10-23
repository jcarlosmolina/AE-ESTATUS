package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.TipoDireccion;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface TipoDireccionJpaRepositoryCustom {

    List<TipoDireccion> solveQuery(SQLSelect query);
    
    List<TipoDireccion> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<TipoDireccion> executeQuery(String query);

    public List<TipoDireccion> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
