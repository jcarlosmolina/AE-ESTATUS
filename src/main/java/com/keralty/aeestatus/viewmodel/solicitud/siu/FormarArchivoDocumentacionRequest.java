package com.keralty.aeestatus.viewmodel.solicitud.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aeestatus.exception.NotNullArgumentException;
import com.keralty.aeestatus.global.SolicitudConstants;
import com.keralty.aeestatus.persistence.oid.SolicitudOid;
import com.keralty.aeestatus.persistence.Solicitud;

public class FormarArchivoDocumentacionRequest {

    @JsonProperty("p_thissolicitud_oid")
    private SolicitudOid solicitudformarArchivoDocumentacionpthisSolicitud;
    
    @JsonIgnore
    private Solicitud solicitudformarArchivoDocumentacionpthisSolicitudInstance;

    public void checkArguments() throws NotNullArgumentException {
        checkSolicitudformarArchivoDocumentacionpthisSolicitud();
    }

    @JsonIgnore
    public SolicitudOid getSolicitudformarArchivoDocumentacionpthisSolicitud() {
        return this.solicitudformarArchivoDocumentacionpthisSolicitud;
    }
    
    public void setSolicitudformarArchivoDocumentacionpthisSolicitud(SolicitudOid solicitudformarArchivoDocumentacionpthisSolicitud) {
        this.solicitudformarArchivoDocumentacionpthisSolicitud = solicitudformarArchivoDocumentacionpthisSolicitud;
    }

    @JsonIgnore
    public Solicitud getSolicitudformarArchivoDocumentacionpthisSolicitudInstance() {
        return this.solicitudformarArchivoDocumentacionpthisSolicitudInstance;
    }
    
    public void setSolicitudformarArchivoDocumentacionpthisSolicitudInstance(Solicitud solicitudformarArchivoDocumentacionpthisSolicitud) {
        this.solicitudformarArchivoDocumentacionpthisSolicitudInstance = solicitudformarArchivoDocumentacionpthisSolicitud;
        this.solicitudformarArchivoDocumentacionpthisSolicitud = solicitudformarArchivoDocumentacionpthisSolicitud != null ? solicitudformarArchivoDocumentacionpthisSolicitud.getOid() : null;
    }

    private void checkSolicitudformarArchivoDocumentacionpthisSolicitud() throws NotNullArgumentException {
        if(this.getSolicitudformarArchivoDocumentacionpthisSolicitudInstance() == null || this.getSolicitudformarArchivoDocumentacionpthisSolicitudInstance().isNull()) {
            throw new NotNullArgumentException(SolicitudConstants.SERV_ID_FORMARARCHIVODOCUMENTACION, SolicitudConstants.CLASS_ID, SolicitudConstants.ARG_ID_FORMARARCHIVODOCUMENTACION_SOLICITUDFORMARARCHIVODOCUMENTACIONPTHISSOLICITUD, SolicitudConstants.SERV_ALIAS_FORMARARCHIVODOCUMENTACION, SolicitudConstants.CLASS_ALIAS, SolicitudConstants.ARG_ALIAS_FORMARARCHIVODOCUMENTACION_SOLICITUDFORMARARCHIVODOCUMENTACIONPTHISSOLICITUD);
        }
    }
}
