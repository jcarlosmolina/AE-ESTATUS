package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.TipoIdentificacion;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface TipoIdentificacionJpaRepositoryCustom {

    List<TipoIdentificacion> solveQuery(SQLSelect query);
    
    List<TipoIdentificacion> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<TipoIdentificacion> executeQuery(String query);

    public List<TipoIdentificacion> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
