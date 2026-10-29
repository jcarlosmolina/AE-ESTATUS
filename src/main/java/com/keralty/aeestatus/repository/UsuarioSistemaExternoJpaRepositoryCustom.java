package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.UsuarioSistemaExterno;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.List;

public interface UsuarioSistemaExternoJpaRepositoryCustom {

    List<UsuarioSistemaExterno> solveQuery(SQLSelect query);
    
    List<UsuarioSistemaExterno> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    public List<UsuarioSistemaExterno> executeQuery(String query);

    public List<UsuarioSistemaExterno> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
