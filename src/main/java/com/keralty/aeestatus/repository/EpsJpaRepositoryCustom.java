package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Eps;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface EpsJpaRepositoryCustom {

    List<Eps> solveQuery(SQLSelect query);
    
    List<Eps> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Eps> executeQuery(String query);

    public List<Eps> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
