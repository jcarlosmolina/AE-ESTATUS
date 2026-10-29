package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.exception.SystemException;
import com.keralty.aeestatus.global.ContratoCConstants;
import com.keralty.aeestatus.global.FamiliaCConstants;
import com.keralty.aeestatus.global.SolicitudConstants;
import com.keralty.aeestatus.global.UserFunctions;
import com.keralty.aeestatus.global.UsuarioConstants;
import com.keralty.aeestatus.persistence.FamiliaC;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.persistence.Usuario;
import com.keralty.aeestatus.sqlutils.SQLMax;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLPopulation;
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

public class FamiliaCJpaRepositoryImpl extends AbstractRepository implements FamiliaCJpaRepositoryCustom {

    @Inject
    public FamiliaCJpaRepositoryImpl(Agent agent, UserFunctions userFunctionsSrv) {
        super(agent, userFunctionsSrv);
    }

    @Override
    public List<FamiliaC> executeQuery(String jpqlQuery) {
        return getQueryBuilder().build(jpqlQuery).execute();
    }
    
    @Override
    public List<FamiliaC> executeQuery(String jpqlQuery, List<SQLParam> params) {
        return getQueryBuilder().build(jpqlQuery).setParameters(params).execute();
    }
    
    public Collection<FamiliaC> executeQuery(SQLSelect select) {
        return getQueryBuilder().build(select).execute();
    }

    private TypedQueryBuilder<FamiliaC> getQueryBuilder() {
        return new TypedQueryBuilder<>(em, FamiliaC.class);
    }

    @Override	
    public List<FamiliaC> solveQuery(SQLSelect select) {
        return solveQuery(select, 0, 0);
    }

    @Override
    public List<FamiliaC> solveQuery(SQLSelect select, int pageSize, int pageNumber) {
        return getQueryBuilder().build(select, pageSize, pageNumber).execute();
    }

    @Override
    public Long nextFamiliaCID(Long contratoCContratoCID) {
        try {
            SQLMax sql = new SQLMax(null, FamiliaCConstants.CLASS_NAME, FamiliaCConstants.CLASS_NAME + "." + FamiliaCConstants.ATTR_FIELD_FAMILIACID);
            SQLWhereConjunction conjunction = new SQLWhereConjunction();

            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(FamiliaCConstants.ROLE_NAME_CONTRATOC + "." + ContratoCConstants.ATTR_FIELD_CONTRATOCID, "Autonumerico"));
            comparison1.setOperator("=");
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(contratoCContratoCID, "Autonumerico"));
            conjunction.addComparison(comparison1);

            sql.getWherePart().addConjunction(conjunction);

            Long tempResult = new TypedQueryBuilder<>(em, Long.class).build(sql).getSingleResult();
            return (tempResult != null ? tempResult + 1L : 1L);
        } catch (Exception e) {
            LoggerFactory.getLogger(FamiliaC.class).error(e.getMessage());
            return 1L;
        }
    }

    // AssocOperator: AssocOperator003
	@Override
    public Collection<Usuario> assocOperator003(Solicitud familiaCTNEWDESDEAEptSolicitud) throws SystemException {
        try {
            // FOR ALL ptSolicitud.Usuarios DO BeneficiariosC.TNEWDESDEAE(ptContratoC, this, ptSolicitud.Usuarios, ptSolicitud)
        return assocOperator003Range1(familiaCTNEWDESDEAEptSolicitud);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaC, Assoc.Operator: AssocOperator003, Method: assocOperator003";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    // Range 1 for AssocOperator AssocOperator003
	@Override
    public Collection<Usuario> assocOperator003Range1 (Solicitud familiaCTNEWDESDEAEptSolicitud) throws SystemException {

        SQLSelect sql = assocOperator003Range1Query(familiaCTNEWDESDEAEptSolicitud);
        return new TypedQueryBuilder<Usuario>(em, Usuario.class).build(sql).execute();
    }

    // Range Query 1 for AssocOperator AssocOperator003
	@Override
    public SQLPopulation assocOperator003Range1Query (Solicitud familiaCTNEWDESDEAEptSolicitud) throws SystemException {
        try {
            return new SQLPopulation(FamiliaCConstants.CLASS_NAME, UsuarioConstants.CLASS_NAME, FamiliaCConstants.ARG_NAME_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTSOLICITUD + "." + SolicitudConstants.ROLE_NAME_USUARIOS, familiaCTNEWDESDEAEptSolicitud.getOid(), FamiliaCConstants.ARG_NAME_TNEWDESDEAE_FAMILIACTNEWDESDEAEPTSOLICITUD);
        } catch (Exception e) {
            String exceptionMessage = "Definition Class: FamiliaC, Assoc.Operator: AssocOperator003, Method: assocOperator003Range1Query";
            org.slf4j.LoggerFactory.getLogger(this.getClass()).error(exceptionMessage);
            throw new SystemException(e, exceptionMessage);
        }
    }

    @Override
    public void refreshEntity(Object object) {
        super.refreshEntity(object);
    }
}
