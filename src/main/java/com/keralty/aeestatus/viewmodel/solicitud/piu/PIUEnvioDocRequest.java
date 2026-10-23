package com.keralty.aeestatus.viewmodel.solicitud.piu;

import com.keralty.aeestatus.viewmodel.PopulationRequestViewModel;
import com.keralty.aeestatus.viewmodel.QueryRequest;
import com.keralty.aeestatus.viewmodel.solicitud.filter.FSolicitudContratanteTitular;
import com.keralty.aeestatus.viewmodel.solicitud.filter.FSolicitudSolicitud;

public class PIUEnvioDocRequest extends PopulationRequestViewModel{

    private FSolicitudContratanteTitular fSolicitudContratanteTitular;

    private FSolicitudSolicitud fSolicitudSolicitud;
    
    public void setFSolicitudContratanteTitular(FSolicitudContratanteTitular fSolicitudContratanteTitular) {
        this.fSolicitudContratanteTitular = fSolicitudContratanteTitular;
    }
    
    public FSolicitudContratanteTitular getFSolicitudContratanteTitular() {
        return fSolicitudContratanteTitular;
    }
    
    public void setFSolicitudSolicitud(FSolicitudSolicitud fSolicitudSolicitud) {
        this.fSolicitudSolicitud = fSolicitudSolicitud;
    }
    
    public FSolicitudSolicitud getFSolicitudSolicitud() {
        return fSolicitudSolicitud;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fSolicitudContratanteTitular != null)
            queryRequest.addFilterRequest(fSolicitudContratanteTitular.buildFilterRequest());

        if (fSolicitudSolicitud != null)
            queryRequest.addFilterRequest(fSolicitudSolicitud.buildFilterRequest());
        return queryRequest;
    }
}
