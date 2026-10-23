package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ErrorWS;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface ErrorWSJpaRepositoryCustom {

    List<ErrorWS> solveQuery(SQLSelect query);
    
    List<ErrorWS> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<ErrorWS> executeQuery(String query);

    public List<ErrorWS> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
