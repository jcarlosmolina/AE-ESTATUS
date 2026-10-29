package com.keralty.aeestatus.viewmodel.asesor.piu;

import com.keralty.aeestatus.viewmodel.PopulationRequestViewModel;
import com.keralty.aeestatus.viewmodel.QueryRequest;
import com.keralty.aeestatus.viewmodel.asesor.filter.FAsesores;

public class PIUAsesorRequest extends PopulationRequestViewModel{

    private FAsesores fAsesores;
    
    public void setFAsesores(FAsesores fAsesores) {
        this.fAsesores = fAsesores;
    }
    
    public FAsesores getFAsesores() {
        return fAsesores;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fAsesores != null)
            queryRequest.addFilterRequest(fAsesores.buildFilterRequest());
        return queryRequest;
    }
}
