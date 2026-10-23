package com.keralty.aeestatus.viewmodel.anexomat.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aeestatus.viewmodel.QueryResponse;
import com.keralty.aeestatus.viewmodel.anexomat.ds.AutoDS;

public class PIUAnexoMatNullResponse extends QueryResponse {

    private List<AutoDS> results;

    public PIUAnexoMatNullResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUAnexoMatNullResponse(List<AutoDS> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<AutoDS> getResults() {
        return this.results;
    }
    
    public void setResults(List<AutoDS> results) {
        this.results = results;
    }
}
