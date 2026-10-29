package com.keralty.aeestatus.viewmodel.tipodireccion.filter;


import com.keralty.aeestatus.global.TipoDireccionConstants;
import com.keralty.aeestatus.viewmodel.FilterRequest;

public class IFTipoDireccionCorrespondenci {

    public IFTipoDireccionCorrespondenci() {
        // Default constructor
    }

    public FilterRequest buildFilterRequest() {
        FilterRequest filterRequest = new FilterRequest();
        filterRequest.setName(TipoDireccionConstants.FILTER_NAME_IFTIPODIRECCIONCORRESPONDENCI);
        return filterRequest;
    }
}
