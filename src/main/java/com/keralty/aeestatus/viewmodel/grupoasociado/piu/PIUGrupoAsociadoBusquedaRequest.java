package com.keralty.aeestatus.viewmodel.grupoasociado.piu;

import com.keralty.aeestatus.viewmodel.PopulationRequestViewModel;
import com.keralty.aeestatus.viewmodel.QueryRequest;
import com.keralty.aeestatus.viewmodel.grupoasociado.filter.FGrupoAsociadoBusqueda;

public class PIUGrupoAsociadoBusquedaRequest extends PopulationRequestViewModel{

    private FGrupoAsociadoBusqueda fGrupoAsociadoBusqueda;
    
    public void setFGrupoAsociadoBusqueda(FGrupoAsociadoBusqueda fGrupoAsociadoBusqueda) {
        this.fGrupoAsociadoBusqueda = fGrupoAsociadoBusqueda;
    }
    
    public FGrupoAsociadoBusqueda getFGrupoAsociadoBusqueda() {
        return fGrupoAsociadoBusqueda;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fGrupoAsociadoBusqueda != null)
            queryRequest.addFilterRequest(fGrupoAsociadoBusqueda.buildFilterRequest());
        return queryRequest;
    }
}
