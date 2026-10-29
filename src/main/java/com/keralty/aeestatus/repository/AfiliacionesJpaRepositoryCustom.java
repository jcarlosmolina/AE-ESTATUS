package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Afiliaciones;
import com.keralty.aeestatus.persistence.Funcionario;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface AfiliacionesJpaRepositoryCustom {

    List<Afiliaciones> solveQuery(SQLSelect query);
    
    List<Afiliaciones> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Funcionario findParent(Long oid);

    public List<Afiliaciones> executeQuery(String query);

    public List<Afiliaciones> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
