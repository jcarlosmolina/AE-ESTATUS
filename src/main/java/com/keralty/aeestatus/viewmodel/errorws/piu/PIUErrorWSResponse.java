package com.keralty.aeestatus.viewmodel.errorws.piu;

import java.util.ArrayList;
import java.util.List;

import com.keralty.aeestatus.viewmodel.QueryResponse;
import com.keralty.aeestatus.viewmodel.errorws.ds.DSErrorWSPIU;

public class PIUErrorWSResponse extends QueryResponse {

    private List<DSErrorWSPIU> results;

    public PIUErrorWSResponse() {
        super();
        results = new ArrayList<>();
    }
    
    public PIUErrorWSResponse(List<DSErrorWSPIU> results) {
        super();
        this.results = results;
        this.setTotalItems(results.size());
    }
    
    public List<DSErrorWSPIU> getResults() {
        return this.results;
    }
    
    public void setResults(List<DSErrorWSPIU> results) {
        this.results = results;
    }
}
