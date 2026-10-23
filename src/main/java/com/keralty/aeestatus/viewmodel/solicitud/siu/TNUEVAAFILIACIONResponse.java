package com.keralty.aeestatus.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aeestatus.persistence.oid.SolicitudOid;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TNUEVAAFILIACIONResponse extends ServiceResponse {


    @JsonProperty("ps_solicitud")
    private SolicitudOid solicitudTNUEVAAFILIACIONpsSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTNUEVAAFILIACIONpsSolicitudInstance;

    public TNUEVAAFILIACIONResponse() {
        super();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTNUEVAAFILIACIONpsSolicitud() {
        return this.solicitudTNUEVAAFILIACIONpsSolicitud;
    }
    
    public void setSolicitudTNUEVAAFILIACIONpsSolicitud(SolicitudOid solicitudTNUEVAAFILIACIONpsSolicitud) {
        this.solicitudTNUEVAAFILIACIONpsSolicitud = solicitudTNUEVAAFILIACIONpsSolicitud;
    }
    @JsonIgnore
    public Solicitud getSolicitudTNUEVAAFILIACIONpsSolicitudInstance() {
        return this.solicitudTNUEVAAFILIACIONpsSolicitudInstance;
    }
    
    public void setSolicitudTNUEVAAFILIACIONpsSolicitudInstance(Solicitud solicitudTNUEVAAFILIACIONpsSolicitud) {
        if (solicitudTNUEVAAFILIACIONpsSolicitud != null && !solicitudTNUEVAAFILIACIONpsSolicitud.isNull()) {
            this.solicitudTNUEVAAFILIACIONpsSolicitud = solicitudTNUEVAAFILIACIONpsSolicitud.getOid();
            this.solicitudTNUEVAAFILIACIONpsSolicitudInstance = solicitudTNUEVAAFILIACIONpsSolicitud;
        } else {
            this.solicitudTNUEVAAFILIACIONpsSolicitud = null;
            this.solicitudTNUEVAAFILIACIONpsSolicitudInstance = null;
        }
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("solicitudTNUEVAAFILIACIONpsSolicitud", solicitudTNUEVAAFILIACIONpsSolicitud);
        return outArgs;
    }
}
