package com.keralty.aeestatus.viewmodel.usuario.piu;

import com.keralty.aeestatus.viewmodel.PopulationRequestViewModel;
import com.keralty.aeestatus.viewmodel.QueryRequest;
import com.keralty.aeestatus.viewmodel.usuario.filter.FUsuariosPolizaInter;

public class PIUUsuariosPolInternacionalRequest extends PopulationRequestViewModel{

    private FUsuariosPolizaInter fUsuariosPolizaInter;
    
    public void setFUsuariosPolizaInter(FUsuariosPolizaInter fUsuariosPolizaInter) {
        this.fUsuariosPolizaInter = fUsuariosPolizaInter;
    }
    
    public FUsuariosPolizaInter getFUsuariosPolizaInter() {
        return fUsuariosPolizaInter;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fUsuariosPolizaInter != null)
            queryRequest.addFilterRequest(fUsuariosPolizaInter.buildFilterRequest());
        return queryRequest;
    }
}
