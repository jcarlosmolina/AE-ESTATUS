package com.keralty.aeestatus.viewmodel.solicitud.piu;

import com.keralty.aeestatus.viewmodel.PopulationRequestViewModel;
import com.keralty.aeestatus.viewmodel.QueryRequest;
import com.keralty.aeestatus.viewmodel.solicitud.filter.FSolicitudStatusEstHomo;

public class PIUEstatusSolicitudesAsesorRequest extends PopulationRequestViewModel{

    private FSolicitudStatusEstHomo fSolicitudStatusEstHomo;
    
    public void setFSolicitudStatusEstHomo(FSolicitudStatusEstHomo fSolicitudStatusEstHomo) {
        this.fSolicitudStatusEstHomo = fSolicitudStatusEstHomo;
    }
    
    public FSolicitudStatusEstHomo getFSolicitudStatusEstHomo() {
        return fSolicitudStatusEstHomo;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fSolicitudStatusEstHomo != null)
            queryRequest.addFilterRequest(fSolicitudStatusEstHomo.buildFilterRequest());
        return queryRequest;
    }
}
