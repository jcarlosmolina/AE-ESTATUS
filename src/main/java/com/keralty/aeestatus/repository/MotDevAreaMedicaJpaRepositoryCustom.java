package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.MotDevAreaMedica;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface MotDevAreaMedicaJpaRepositoryCustom {

    List<MotDevAreaMedica> solveQuery(SQLSelect query);
    
    List<MotDevAreaMedica> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<MotDevAreaMedica> executeQuery(String query);

    public List<MotDevAreaMedica> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
