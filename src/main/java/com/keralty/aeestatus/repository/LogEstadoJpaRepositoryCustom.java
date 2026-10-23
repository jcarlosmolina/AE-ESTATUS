package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.LogEstado;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface LogEstadoJpaRepositoryCustom {

    List<LogEstado> solveQuery(SQLSelect query);
    
    List<LogEstado> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<LogEstado> executeQuery(String query);

    public List<LogEstado> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
