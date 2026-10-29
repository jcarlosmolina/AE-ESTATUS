package com.keralty.aeestatus.viewmodel.logasignaciones.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aeestatus.exception.NotNullArgumentException;
import com.keralty.aeestatus.global.LogAsignacionesConstants;
import com.keralty.aeestatus.persistence.LogAsignaciones;
import com.keralty.aeestatus.persistence.oid.LogAsignacionesOid;

public class EliminarRequest {

    @JsonProperty("p_thislogasignaciones_oid")
    private LogAsignacionesOid logAsignacioneseliminarpthisLogAsignaciones;
    
    @JsonIgnore
    private LogAsignaciones logAsignacioneseliminarpthisLogAsignacionesInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkLogAsignacioneseliminarpthisLogAsignaciones();
    }

    @JsonIgnore
    public LogAsignacionesOid getLogAsignacioneseliminarpthisLogAsignaciones() {
        return this.logAsignacioneseliminarpthisLogAsignaciones;
    }
    
    public void setLogAsignacioneseliminarpthisLogAsignaciones(LogAsignacionesOid logAsignacioneseliminarpthisLogAsignaciones) {
        this.logAsignacioneseliminarpthisLogAsignaciones = logAsignacioneseliminarpthisLogAsignaciones;
    }

    @JsonIgnore
    public LogAsignaciones getLogAsignacioneseliminarpthisLogAsignacionesInstance() {
        return this.logAsignacioneseliminarpthisLogAsignacionesInstance;
    }
    
    public void setLogAsignacioneseliminarpthisLogAsignacionesInstance(LogAsignaciones logAsignacioneseliminarpthisLogAsignaciones) {
        this.logAsignacioneseliminarpthisLogAsignacionesInstance = logAsignacioneseliminarpthisLogAsignaciones;
        this.logAsignacioneseliminarpthisLogAsignaciones = logAsignacioneseliminarpthisLogAsignaciones != null ? logAsignacioneseliminarpthisLogAsignaciones.getOid() : null;
    }

    private void checkLogAsignacioneseliminarpthisLogAsignaciones() throws NotNullArgumentException {
        if(this.getLogAsignacioneseliminarpthisLogAsignacionesInstance() == null || this.getLogAsignacioneseliminarpthisLogAsignacionesInstance().isNull()) {
            throw new NotNullArgumentException(LogAsignacionesConstants.SERV_ID_ELIMINAR, LogAsignacionesConstants.CLASS_ID, LogAsignacionesConstants.ARG_ID_ELIMINAR_LOGASIGNACIONESELIMINARPTHISLOGASIGNACIONES, LogAsignacionesConstants.SERV_ALIAS_ELIMINAR, LogAsignacionesConstants.CLASS_ALIAS, LogAsignacionesConstants.ARG_ALIAS_ELIMINAR_LOGASIGNACIONESELIMINARPTHISLOGASIGNACIONES);
        }
    }
}
