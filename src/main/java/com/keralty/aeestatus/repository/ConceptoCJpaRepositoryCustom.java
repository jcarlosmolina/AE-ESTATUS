package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ConceptoC;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface ConceptoCJpaRepositoryCustom {

    List<ConceptoC> solveQuery(SQLSelect query);
    
    List<ConceptoC> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<ConceptoC> executeQuery(String query);

    public List<ConceptoC> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
