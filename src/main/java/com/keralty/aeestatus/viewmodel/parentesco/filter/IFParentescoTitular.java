package com.keralty.aeestatus.viewmodel.parentesco.filter;


import com.keralty.aeestatus.global.ParentescoConstants;
import com.keralty.aeestatus.viewmodel.FilterRequest;

public class IFParentescoTitular {

    public IFParentescoTitular() {
        // Default constructor
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(ParentescoConstants.FILTER_NAME_IFPARENTESCOTITULAR);
        return filterRequest;
    }
}
