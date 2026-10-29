package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.global.UserFunctions;
import com.keralty.aeestatus.persistence.Tarifa;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import com.keralty.aeestatus.sqlutils.TypedQueryBuilder;
import com.keralty.aeestatus.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;

public class TarifaJpaRepositoryImpl extends AbstractRepository implements TarifaJpaRepositoryCustom {

    @Inject
    public TarifaJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<Tarifa> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<Tarifa> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<Tarifa> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<Tarifa> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, Tarifa.class);
    }

    @Override	
    public List<Tarifa> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<Tarifa> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
