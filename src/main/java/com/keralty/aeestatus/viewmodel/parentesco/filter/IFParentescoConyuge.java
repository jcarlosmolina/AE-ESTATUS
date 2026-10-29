package com.keralty.aeestatus.viewmodel.parentesco.filter;


import com.keralty.aeestatus.global.ParentescoConstants;
import com.keralty.aeestatus.viewmodel.FilterRequest;

public class IFParentescoConyuge {

    public IFParentescoConyuge() {
        // Default constructor
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(ParentescoConstants.FILTER_NAME_IFPARENTESCOCONYUGE);
        return filterRequest;
    }
}
