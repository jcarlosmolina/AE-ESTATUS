package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Admin;
import com.keralty.aeestatus.persistence.Funcionario;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface AdminJpaRepositoryCustom {

    List<Admin> solveQuery(SQLSelect query);
    
    List<Admin> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Funcionario findParent(Long oid);

    public List<Admin> executeQuery(String query);

    public List<Admin> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
