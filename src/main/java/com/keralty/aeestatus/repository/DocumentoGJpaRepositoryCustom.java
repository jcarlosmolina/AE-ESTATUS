package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.DocumentoG;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface DocumentoGJpaRepositoryCustom {

    List<DocumentoG> solveQuery(SQLSelect query);
    
    List<DocumentoG> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<DocumentoG> executeQuery(String query);

    public List<DocumentoG> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
