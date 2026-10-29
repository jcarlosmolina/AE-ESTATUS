package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Prorrateo;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface ProrrateoJpaRepositoryCustom {

    List<Prorrateo> solveQuery(SQLSelect query);
    
    List<Prorrateo> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);
    
    Long nextProrrateoidProrrateo(Long dominioNumero);

    public List<Prorrateo> executeQuery(String query);

    public List<Prorrateo> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
