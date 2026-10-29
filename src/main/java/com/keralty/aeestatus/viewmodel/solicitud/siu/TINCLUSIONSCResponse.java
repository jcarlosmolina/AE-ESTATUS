package com.keralty.aeestatus.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aeestatus.persistence.oid.SolicitudOid;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TINCLUSIONSCResponse extends ServiceResponse {


    @JsonProperty("ps_solicitud")
    private SolicitudOid solicitudTINCLUSIONSCpsSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTINCLUSIONSCpsSolicitudInstance;

    public TINCLUSIONSCResponse() {
        super();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTINCLUSIONSCpsSolicitud() {
        return this.solicitudTINCLUSIONSCpsSolicitud;
    }
    
    public void setSolicitudTINCLUSIONSCpsSolicitud(SolicitudOid solicitudTINCLUSIONSCpsSolicitud) {
        this.solicitudTINCLUSIONSCpsSolicitud = solicitudTINCLUSIONSCpsSolicitud;
    }
    @JsonIgnore
    public Solicitud getSolicitudTINCLUSIONSCpsSolicitudInstance() {
        return this.solicitudTINCLUSIONSCpsSolicitudInstance;
    }
    
    public void setSolicitudTINCLUSIONSCpsSolicitudInstance(Solicitud solicitudTINCLUSIONSCpsSolicitud) {
        if (solicitudTINCLUSIONSCpsSolicitud != null && !solicitudTINCLUSIONSCpsSolicitud.isNull()) {
            this.solicitudTINCLUSIONSCpsSolicitud = solicitudTINCLUSIONSCpsSolicitud.getOid();
            this.solicitudTINCLUSIONSCpsSolicitudInstance = solicitudTINCLUSIONSCpsSolicitud;
        } else {
            this.solicitudTINCLUSIONSCpsSolicitud = null;
            this.solicitudTINCLUSIONSCpsSolicitudInstance = null;
        }
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("solicitudTINCLUSIONSCpsSolicitud", solicitudTINCLUSIONSCpsSolicitud);
        return outArgs;
    }
}
