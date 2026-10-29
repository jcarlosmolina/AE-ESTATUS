package com.keralty.aeestatus.viewmodel.beneficiarioc.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aeestatus.exception.NotNullArgumentException;
import com.keralty.aeestatus.global.BeneficiarioCConstants;
import com.keralty.aeestatus.persistence.BeneficiarioC;
import com.keralty.aeestatus.persistence.EstadoBeneficiario;
import com.keralty.aeestatus.persistence.oid.BeneficiarioCOid;
import com.keralty.aeestatus.persistence.oid.EstadoBeneficiarioOid;

public class TASGESTADOSINOTIENERequest {

    @JsonProperty("p_thisbeneficiarioc_oid")
    private BeneficiarioCOid beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC;
    
    @JsonIgnore
    private BeneficiarioC beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioCInstance;

    @JsonProperty("ptestado_oid")
    private EstadoBeneficiarioOid beneficiarioCTASGESTADOSINOTIENEptEstado;
    
    @JsonIgnore
    private EstadoBeneficiario beneficiarioCTASGESTADOSINOTIENEptEstadoInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkBeneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC();
    }

    @JsonIgnore
    public BeneficiarioCOid getBeneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC() {
        return this.beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC;
    }
    
    public void setBeneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC(BeneficiarioCOid beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC) {
        this.beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC = beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC;
    }

    @JsonIgnore
    public BeneficiarioC getBeneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioCInstance() {
        return this.beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioCInstance;
    }
    
    public void setBeneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioCInstance(BeneficiarioC beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC) {
        this.beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioCInstance = beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC;
        this.beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC = beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC != null ? beneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC.getOid() : null;
    }

    private void checkBeneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioC() throws NotNullArgumentException {
        if(this.getBeneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioCInstance() == null || this.getBeneficiarioCTASGESTADOSINOTIENEpthisBeneficiarioCInstance().isNull()) {
            throw new NotNullArgumentException(BeneficiarioCConstants.SERV_ID_TASGESTADOSINOTIENE, BeneficiarioCConstants.CLASS_ID, BeneficiarioCConstants.ARG_ID_TASGESTADOSINOTIENE_BENEFICIARIOCTASGESTADOSINOTIENEPTHISBENEFICIARIOC, BeneficiarioCConstants.SERV_ALIAS_TASGESTADOSINOTIENE, BeneficiarioCConstants.CLASS_ALIAS, BeneficiarioCConstants.ARG_ALIAS_TASGESTADOSINOTIENE_BENEFICIARIOCTASGESTADOSINOTIENEPTHISBENEFICIARIOC);
        }
    }

    @JsonIgnore
    public EstadoBeneficiarioOid getBeneficiarioCTASGESTADOSINOTIENEptEstado() {
        return this.beneficiarioCTASGESTADOSINOTIENEptEstado;
    }
    
    public void setBeneficiarioCTASGESTADOSINOTIENEptEstado(EstadoBeneficiarioOid beneficiarioCTASGESTADOSINOTIENEptEstado) {
        this.beneficiarioCTASGESTADOSINOTIENEptEstado = beneficiarioCTASGESTADOSINOTIENEptEstado;
    }

    @JsonIgnore
    public EstadoBeneficiario getBeneficiarioCTASGESTADOSINOTIENEptEstadoInstance() {
        return this.beneficiarioCTASGESTADOSINOTIENEptEstadoInstance;
    }
    
    public void setBeneficiarioCTASGESTADOSINOTIENEptEstadoInstance(EstadoBeneficiario beneficiarioCTASGESTADOSINOTIENEptEstado) {
        this.beneficiarioCTASGESTADOSINOTIENEptEstadoInstance = beneficiarioCTASGESTADOSINOTIENEptEstado;
        this.beneficiarioCTASGESTADOSINOTIENEptEstado = beneficiarioCTASGESTADOSINOTIENEptEstado != null ? beneficiarioCTASGESTADOSINOTIENEptEstado.getOid() : null;
    }
}
