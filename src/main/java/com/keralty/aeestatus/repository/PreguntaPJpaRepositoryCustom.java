package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.PreguntaP;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface PreguntaPJpaRepositoryCustom {

    List<PreguntaP> solveQuery(SQLSelect query);
    
    List<PreguntaP> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<PreguntaP> executeQuery(String query);

    public List<PreguntaP> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
