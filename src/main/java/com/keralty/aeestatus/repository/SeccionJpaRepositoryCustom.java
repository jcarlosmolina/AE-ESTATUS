package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Seccion;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface SeccionJpaRepositoryCustom {

    List<Seccion> solveQuery(SQLSelect query);
    
    List<Seccion> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Seccion> executeQuery(String query);

    public List<Seccion> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
