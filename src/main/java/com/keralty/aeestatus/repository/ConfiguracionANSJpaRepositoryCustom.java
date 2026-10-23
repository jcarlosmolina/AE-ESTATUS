package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.exception.SystemException;
import com.keralty.aeestatus.persistence.ConfiguracionANS;
import com.keralty.aeestatus.sqlutils.SQLExists;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface ConfiguracionANSJpaRepositoryCustom {

    List<ConfiguracionANS> solveQuery(SQLSelect query);
    
    List<ConfiguracionANS> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(ConfiguracionANS instance) throws SystemException;

    Boolean assocOperator000Range1(ConfiguracionANS instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(ConfiguracionANS instance) throws SystemException;

    public List<ConfiguracionANS> executeQuery(String query);

    public List<ConfiguracionANS> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
