package com.keralty.aeestatus.viewmodel.persona.siu;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.keralty.aeestatus.persistence.oid.PersonaOid;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.viewmodel.ServiceResponse;
import java.util.HashMap;
import java.util.Map;

public class TCREARTITULARResponse extends ServiceResponse {


    @JsonProperty("pspersona")
    private PersonaOid personaTCREARTITULARpsPersona;
    
    @JsonIgnore
    private Persona personaTCREARTITULARpsPersonaInstance;

    public TCREARTITULARResponse() {
        super();
    }

    @JsonIgnore
    public PersonaOid getPersonaTCREARTITULARpsPersona() {
        return this.personaTCREARTITULARpsPersona;
    }
    
    public void setPersonaTCREARTITULARpsPersona(PersonaOid personaTCREARTITULARpsPersona) {
        this.personaTCREARTITULARpsPersona = personaTCREARTITULARpsPersona;
    }
    @JsonIgnore
    public Persona getPersonaTCREARTITULARpsPersonaInstance() {
        return this.personaTCREARTITULARpsPersonaInstance;
    }
    
    public void setPersonaTCREARTITULARpsPersonaInstance(Persona personaTCREARTITULARpsPersona) {
        if (personaTCREARTITULARpsPersona != null && !personaTCREARTITULARpsPersona.isNull()) {
            this.personaTCREARTITULARpsPersona = personaTCREARTITULARpsPersona.getOid();
            this.personaTCREARTITULARpsPersonaInstance = personaTCREARTITULARpsPersona;
        } else {
            this.personaTCREARTITULARpsPersona = null;
            this.personaTCREARTITULARpsPersonaInstance = null;
        }
    }

    @Override
    public Map<String, Object> buildOutArgs() {
        Map<String, Object> outArgs = new HashMap<>();
        outArgs.put("personaTCREARTITULARpsPersona", personaTCREARTITULARpsPersona);
        return outArgs;
    }
}
