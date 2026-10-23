package com.keralty.aeestatus.viewmodel.solicitud.piu;

import com.keralty.aeestatus.viewmodel.PopulationRequestViewModel;
import com.keralty.aeestatus.viewmodel.QueryRequest;
import com.keralty.aeestatus.viewmodel.solicitud.filter.FSolicitudStatusAdmin;

public class PIUEstatusSolicitudesAdminRequest extends PopulationRequestViewModel{

    private FSolicitudStatusAdmin fSolicitudStatusAdmin;
    
    public void setFSolicitudStatusAdmin(FSolicitudStatusAdmin fSolicitudStatusAdmin) {
        this.fSolicitudStatusAdmin = fSolicitudStatusAdmin;
    }
    
    public FSolicitudStatusAdmin getFSolicitudStatusAdmin() {
        return fSolicitudStatusAdmin;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fSolicitudStatusAdmin != null)
            queryRequest.addFilterRequest(fSolicitudStatusAdmin.buildFilterRequest());
        return queryRequest;
    }
}
