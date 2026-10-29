package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.global.DominioConstants;
import com.keralty.aeestatus.global.ParentescoDomConstants;
import com.keralty.aeestatus.global.UserFunctions;
import com.keralty.aeestatus.persistence.ParentescoDom;
import com.keralty.aeestatus.sqlutils.SQLMax;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import com.keralty.aeestatus.sqlutils.SQLWhereComparison;
import com.keralty.aeestatus.sqlutils.SQLWhereConjunction;
import com.keralty.aeestatus.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aeestatus.sqlutils.SQLWhereOperandPathAttribute;
import com.keralty.aeestatus.sqlutils.TypedQueryBuilder;
import com.keralty.aeestatus.utils.Agent;
import jakarta.inject.Inject;
import java.util.Collection;
import java.util.List;
import org.slf4j.LoggerFactory;

public class ParentescoDomJpaRepositoryImpl extends AbstractRepository implements ParentescoDomJpaRepositoryCustom {

    @Inject
    public ParentescoDomJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<ParentescoDom> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<ParentescoDom> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<ParentescoDom> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<ParentescoDom> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, ParentescoDom.class);
    }

    @Override	
    public List<ParentescoDom> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<ParentescoDom> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    @Override
    public Long nextParentescoDomIdentificador(Long dominioNumero) {
        try {
            SQLMax sql = new SQLMax(null, ParentescoDomConstants.CLASS_NAME, ParentescoDomConstants.CLASS_NAME + "." + ParentescoDomConstants.ATTR_FIELD_PARENTESCODOMIDENTIFICADOR);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(ParentescoDomConstants.ROLE_NAME_DOMINIO + "." + DominioConstants.ATTR_FIELD_DOMINIONUMERO, "Autonumerico"));
            comparison1.setOperator("=");
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(dominioNumero, "Autonumerico"));
            conjunction.addComparison(comparison1);

            sql.getWherePart().addConjunction(conjunction);

            Long tempResult = new TypedQueryBuilder<>(em, Long.class).build(sql).getSingleResult();
            return (tempResult != null ? tempResult + 1L : 1L);
        } catch (Exception e) {
            LoggerFactory.getLogger(ParentescoDom.class).error(e.getMessage());
            return 1L;
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
