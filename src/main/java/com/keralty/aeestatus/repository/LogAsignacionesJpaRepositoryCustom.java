package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.LogAsignaciones;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface LogAsignacionesJpaRepositoryCustom {

    List<LogAsignaciones> solveQuery(SQLSelect query);
    
    List<LogAsignaciones> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<LogAsignaciones> executeQuery(String query);

    public List<LogAsignaciones> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
