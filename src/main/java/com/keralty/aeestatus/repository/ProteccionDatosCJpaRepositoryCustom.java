package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.ProteccionDatosC;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface ProteccionDatosCJpaRepositoryCustom {

    List<ProteccionDatosC> solveQuery(SQLSelect query);
    
    List<ProteccionDatosC> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<ProteccionDatosC> executeQuery(String query);

    public List<ProteccionDatosC> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
