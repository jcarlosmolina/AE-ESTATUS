package com.keralty.aeestatus.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aeestatus.exception.NotNullArgumentException;
import com.keralty.aeestatus.global.SolicitudConstants;
import com.keralty.aeestatus.persistence.oid.SolicitudOid;
import com.keralty.aeestatus.persistence.Solicitud;

public class TANULARAUTORequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudTANULARAUTOpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudTANULARAUTOpthisSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudTANULARAUTOpthisSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudTANULARAUTOpthisSolicitud() {
        return this.solicitudTANULARAUTOpthisSolicitud;
    }
    
    public void setSolicitudTANULARAUTOpthisSolicitud(SolicitudOid solicitudTANULARAUTOpthisSolicitud) {
        this.solicitudTANULARAUTOpthisSolicitud = solicitudTANULARAUTOpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudTANULARAUTOpthisSolicitudInstance() {
        return this.solicitudTANULARAUTOpthisSolicitudInstance;
    }
    
    public void setSolicitudTANULARAUTOpthisSolicitudInstance(Solicitud solicitudTANULARAUTOpthisSolicitud) {
        this.solicitudTANULARAUTOpthisSolicitudInstance = solicitudTANULARAUTOpthisSolicitud;
        this.solicitudTANULARAUTOpthisSolicitud = solicitudTANULARAUTOpthisSolicitud != null ? solicitudTANULARAUTOpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudTANULARAUTOpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudTANULARAUTOpthisSolicitudInstance() == null || this.getSolicitudTANULARAUTOpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_TANULARAUTO, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_TANULARAUTO_SOLICITUDTANULARAUTOPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_TANULARAUTO, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_TANULARAUTO_SOLICITUDTANULARAUTOPTHISSOLICITUD);
        }
    }
}
