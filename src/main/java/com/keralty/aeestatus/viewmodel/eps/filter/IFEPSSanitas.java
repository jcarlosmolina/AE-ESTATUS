package com.keralty.aeestatus.viewmodel.eps.filter;


import com.keralty.aeestatus.global.EpsConstants;
import com.keralty.aeestatus.viewmodel.FilterRequest;

public class IFEPSSanitas {

    public IFEPSSanitas() {
        // Default constructor
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(EpsConstants.FILTER_NAME_IFEPSSANITAS);
        return filterRequest;
    }
}
