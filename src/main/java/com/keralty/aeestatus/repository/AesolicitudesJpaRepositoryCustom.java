package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Aesolicitudes;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface AesolicitudesJpaRepositoryCustom {

    List<Aesolicitudes> solveQuery(SQLSelect query);
    
    List<Aesolicitudes> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<Aesolicitudes> executeQuery(String query);

    public List<Aesolicitudes> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
