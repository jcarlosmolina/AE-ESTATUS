package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Funcionario;
import com.keralty.aeestatus.persistence.MesaDeApoyo;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface MesaDeApoyoJpaRepositoryCustom {

    List<MesaDeApoyo> solveQuery(SQLSelect query);
    
    List<MesaDeApoyo> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Funcionario findParent(Long oid);

    public List<MesaDeApoyo> executeQuery(String query);

    public List<MesaDeApoyo> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
