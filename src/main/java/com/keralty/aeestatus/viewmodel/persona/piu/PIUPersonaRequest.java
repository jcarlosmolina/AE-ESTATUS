package com.keralty.aeestatus.viewmodel.persona.piu;

import com.keralty.aeestatus.viewmodel.PopulationRequestViewModel;
import com.keralty.aeestatus.viewmodel.QueryRequest;
import com.keralty.aeestatus.viewmodel.persona.filter.FPersonaVarios;

public class PIUPersonaRequest extends PopulationRequestViewModel{

    private FPersonaVarios fPersonaVarios;
    
    public void setFPersonaVarios(FPersonaVarios fPersonaVarios) {
        this.fPersonaVarios = fPersonaVarios;
    }
    
    public FPersonaVarios getFPersonaVarios() {
        return fPersonaVarios;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fPersonaVarios != null)
            queryRequest.addFilterRequest(fPersonaVarios.buildFilterRequest());
        return queryRequest;
    }
}
