package com.keralty.aeestatus.service;

import com.keralty.aeestatus.global.Constants;
import com.keralty.aeestatus.global.TipoEntidadCConstants;
import com.keralty.aeestatus.persistence.oid.TipoEntidadCOid;
import com.keralty.aeestatus.persistence.TipoEntidadC;
import com.keralty.aeestatus.repository.TipoEntidadCJpaRepository;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import com.keralty.aeestatus.sqlutils.SQLWhereComparison;
import com.keralty.aeestatus.sqlutils.SQLWhereOperandLiteral;
import com.keralty.aeestatus.sqlutils.SQLWhereOperandPathAttribute;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.slf4j.LoggerFactory;

@Transactional
@ApplicationScoped
public class TipoEntidadCService extends AbstractService {

    TipoEntidadCJpaRepository repository;

    TipoEntidadCService tipoEntidadCSrv;

    @Inject
    public TipoEntidadCService(
            TipoEntidadCService tipoEntidadCSrv,
            TipoEntidadCJpaRepository repository) {
        this.tipoEntidadCSrv = tipoEntidadCSrv;
        this.repository = repository;
    }


    /*
     * Returns an instance of TipoEntidadC by ID
     *
     * @param tipoEntidadCCodigo Identification field tipoEntidadCCodigo
     *
     * @return Instance of TipoEntidadC
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoEntidadC getById(Long tipoEntidadCCodigo) {
        return getByOID(new TipoEntidadCOid(tipoEntidadCCodigo));
    }
    
    /*
     * Returns an instance of TipoEntidadC by OID
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoEntidadC
     */
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoEntidadC getByOID(TipoEntidadCOid oid) {
        Optional<TipoEntidadC> instance = getInstanceByOid(oid);
        return instance.isPresent() ? instance.get() : null;
    }
    
    /*
     * Returns an instance of TipoEntidadC by OID applying horizontal visibility constraints
     *
     * @param oid Object IDentifier
     *
     * @return Instance of TipoEntidadC
     */
    @Transactional(Transactional.TxType.SUPPORTS)
    public TipoEntidadC getByOIDWithHV(TipoEntidadCOid oid) {
        Optional<TipoEntidadC> instance = getInstanceByOid(oid);
    	return instance.isPresent() && instance.get().checkHorizontalVisibility(getAgentInstance()) 
    		 ? instance.get() 
    		 : null;
    }
    
    private Optional<TipoEntidadC> getInstanceByOid(TipoEntidadCOid oid) {
        return oid != null && oid.getTipoEntidadCCodigo() != null
               ? repository.findById(oid.getTipoEntidadCCodigo())
               : Optional.empty();
    }

    /*
     * Returns an instance of TipoEntidadC by OID in JSON format
     *
     * @param jsonOid Object IDentifier in JSON format
     *
     * @return Instance of TipoEntidadC
     */
    @Override
    @Transactional(Transactional.TxType.REQUIRED)
    public TipoEntidadC getByJsonOid(String jsonOid) {
        TipoEntidadCOid oid = new TipoEntidadCOid();
        oid.fromJsonString(jsonOid);
        return getByOIDWithHV(oid);
    }


    @Override
    protected void applyFilterByOid(String jsonOid, SQLSelect sql) {
        try {
            TipoEntidadCOid oid = new TipoEntidadCOid().fromJsonString(jsonOid);
            SQLWhereComparison comparison1 = new SQLWhereComparison(sql);
            comparison1.setOperator("=");
            comparison1.setFirstOperand(new SQLWhereOperandPathAttribute(TipoEntidadCConstants.ATTR_FIELD_TIPOENTIDADCCODIGO, Constants.Type.INT.getTypeName()));
            comparison1.setSecondOperand(new SQLWhereOperandLiteral(oid.getTipoEntidadCCodigo(), Constants.Type.INT.getTypeName()));
            sql.addComparison(comparison1);
        } catch (Exception e) {
            LoggerFactory.getLogger(TipoEntidadCService.class).error(e.getMessage());
        }
    }

}
