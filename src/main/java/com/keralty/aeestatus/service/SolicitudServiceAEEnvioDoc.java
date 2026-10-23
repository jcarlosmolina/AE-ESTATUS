package com.keralty.aeestatus.service;

import java.util.concurrent.CompletionStage;

import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;
import org.eclipse.microprofile.rest.client.annotation.ClientHeaderParam;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import com.keralty.aeestatus.viewmodel.ServiceResponse;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/api/SolicitudApi")
@RegisterRestClient(configKey="ae-enviodoc")
@ClientHeaderParam(name = "Authorization", value = "Bearer {com.keralty.aeestatus.utils.TokenUtilities.getToken4msenviodoc}")
public interface SolicitudServiceAEEnvioDoc {

    @POST
    @Path("/TENVIARDOCAUTOAUX")
    ServiceResponse tENVIARDOCAUTOAUX(@RequestBody com.keralty.aeestatus.viewmodel.solicitud.siu.TENVIARDOCAUTOAUXRequest request);
}
