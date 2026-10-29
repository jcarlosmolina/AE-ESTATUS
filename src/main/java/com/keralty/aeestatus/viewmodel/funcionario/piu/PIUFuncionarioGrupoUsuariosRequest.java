package com.keralty.aeestatus.viewmodel.funcionario.piu;

import com.keralty.aeestatus.viewmodel.PopulationRequestViewModel;
import com.keralty.aeestatus.viewmodel.QueryRequest;
import com.keralty.aeestatus.viewmodel.funcionario.filter.FFuncionarioPorNombre;

public class PIUFuncionarioGrupoUsuariosRequest extends PopulationRequestViewModel{

    private FFuncionarioPorNombre fFuncionarioPorNombre;
    
    public void setFFuncionarioPorNombre(FFuncionarioPorNombre fFuncionarioPorNombre) {
        this.fFuncionarioPorNombre = fFuncionarioPorNombre;
    }
    
    public FFuncionarioPorNombre getFFuncionarioPorNombre() {
        return fFuncionarioPorNombre;
    }

    @Override
    public QueryRequest buildQueryRequest() {
        QueryRequest queryRequest = super.buildQueryRequest();

        if (fFuncionarioPorNombre != null)
            queryRequest.addFilterRequest(fFuncionarioPorNombre.buildFilterRequest());
        return queryRequest;
    }
}
