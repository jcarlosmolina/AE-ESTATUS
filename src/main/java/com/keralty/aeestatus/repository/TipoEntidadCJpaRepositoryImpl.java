package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.global.UserFunctions;
import com.keralty.aeestatus.persistence.TipoEntidadC;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import com.keralty.aeestatus.sqlutils.TypedQueryBuilder;
import com.keralty.aeestatus.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class TipoEntidadCJpaRepositoryImpl extends AbstractRepository implements TipoEntidadCJpaRepositoryCustom {

    @Inject
    public TipoEntidadCJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<TipoEntidadC> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<TipoEntidadC> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<TipoEntidadC> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<TipoEntidadC> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, TipoEntidadC.class);
    }

    @Override	
    public List<TipoEntidadC> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<TipoEntidadC> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
