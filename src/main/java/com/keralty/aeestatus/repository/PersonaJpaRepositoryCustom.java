package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.exception.SystemException;
import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.TipoDireccion;
import com.keralty.aeestatus.sqlutils.SQLExists;
import com.keralty.aeestatus.sqlutils.SQLParam;
import com.keralty.aeestatus.sqlutils.SQLPopulation;
import com.keralty.aeestatus.sqlutils.SQLSelect;
import java.util.Collection;
import java.util.List;

public interface PersonaJpaRepositoryCustom {

    List<Persona> solveQuery(SQLSelect query);
    
    List<Persona> solveQuery(SQLSelect query, int pageSize, int pageNumber);
    
    int solveCountQuery(SQLSelect query);

    Boolean assocOperator000(Persona instance) throws SystemException;

    Boolean assocOperator000Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator000Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator001(Persona instance) throws SystemException;

    Boolean assocOperator001Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator001Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator002(Persona instance) throws SystemException;

    Boolean assocOperator002Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator002Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator003(Persona instance) throws SystemException;

    Boolean assocOperator003Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator003Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator004(Persona instance) throws SystemException;

    Boolean assocOperator004Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator004Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator005(Persona instance) throws SystemException;

    Boolean assocOperator005Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator005Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator015(Persona instance) throws SystemException;

    Boolean assocOperator015Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator015Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator016(Persona instance) throws SystemException;

    Boolean assocOperator016Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator016Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator018(Persona instance) throws SystemException;

    Boolean assocOperator018Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator018Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator019(Persona instance) throws SystemException;

    Boolean assocOperator019Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator019Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator021(Persona instance) throws SystemException;

    Boolean assocOperator021Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator021Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator022(Persona instance) throws SystemException;

    Boolean assocOperator022Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator022Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator024(Persona instance) throws SystemException;

    Boolean assocOperator024Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator024Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator025(Persona instance) throws SystemException;

    Boolean assocOperator025Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator025Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator026(Persona instance) throws SystemException;

    Boolean assocOperator026Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator026Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator027(Persona instance) throws SystemException;

    Boolean assocOperator027Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator027Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator028(Persona instance) throws SystemException;

    Boolean assocOperator028Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator028Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator029(Persona instance) throws SystemException;

    Boolean assocOperator029Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator029Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator030(Persona instance) throws SystemException;

    Boolean assocOperator030Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator030Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator031(Persona instance) throws SystemException;

    Boolean assocOperator031Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator031Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator032(Persona instance) throws SystemException;

    Boolean assocOperator032Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator032Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator033(Persona instance) throws SystemException;

    Boolean assocOperator033Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator033Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator034(Persona instance) throws SystemException;

    Boolean assocOperator034Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator034Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator035(Persona instance) throws SystemException;

    Boolean assocOperator035Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator035Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator037(Persona instance) throws SystemException;

    Boolean assocOperator037Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator037Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator038(Persona instance) throws SystemException;

    Boolean assocOperator038Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator038Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator040(Persona instance) throws SystemException;

    Boolean assocOperator040Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator040Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator041(Persona instance) throws SystemException;

    Boolean assocOperator041Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator041Range1Query(Persona instance) throws SystemException;

    Collection<Direccion> assocOperator044(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;

    Collection<Direccion> assocOperator044Range1(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;
    
    SQLPopulation assocOperator044Range1Query(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;

    Boolean assocOperator046(Persona instance) throws SystemException;

    Boolean assocOperator046Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator046Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator047(Persona instance) throws SystemException;

    Boolean assocOperator047Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator047Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator048(Persona instance) throws SystemException;

    Boolean assocOperator048Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator048Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator049(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;

    Boolean assocOperator049Range1(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;
    
    SQLExists assocOperator049Range1Query(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;

    Boolean assocOperator050(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;

    Boolean assocOperator050Range1(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;
    
    SQLExists assocOperator050Range1Query(Persona instance, TipoDireccion personaTMODUSUARIOptpevcTipoDireccion) throws SystemException;

    Boolean assocOperator052(Persona instance) throws SystemException;

    Boolean assocOperator052Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator052Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator053(Persona instance) throws SystemException;

    Boolean assocOperator053Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator053Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator055(Persona instance) throws SystemException;

    Boolean assocOperator055Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator055Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator056(Persona instance) throws SystemException;

    Boolean assocOperator056Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator056Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator058(Persona instance) throws SystemException;

    Boolean assocOperator058Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator058Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator059(Persona instance) throws SystemException;

    Boolean assocOperator059Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator059Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator061(Persona instance) throws SystemException;

    Boolean assocOperator061Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator061Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator062(Persona instance) throws SystemException;

    Boolean assocOperator062Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator062Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator063(Persona instance) throws SystemException;

    Boolean assocOperator063Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator063Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator064(Persona instance) throws SystemException;

    Boolean assocOperator064Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator064Range1Query(Persona instance) throws SystemException;

    Collection<Direccion> assocOperator071(Persona instance) throws SystemException;

    Collection<Direccion> assocOperator071Range1(Persona instance) throws SystemException;
    
    SQLPopulation assocOperator071Range1Query(Persona instance) throws SystemException;

    Collection<Direccion> assocOperator073(Persona instance) throws SystemException;

    Collection<Direccion> assocOperator073Range1(Persona instance) throws SystemException;
    
    SQLPopulation assocOperator073Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator074(Persona instance) throws SystemException;

    Boolean assocOperator074Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator074Range1Query(Persona instance) throws SystemException;

    Boolean assocOperator075(Persona instance) throws SystemException;

    Boolean assocOperator075Range1(Persona instance) throws SystemException;
    
    SQLExists assocOperator075Range1Query(Persona instance) throws SystemException;

    public List<Persona> executeQuery(String query);

    public List<Persona> executeQuery(String query, List<SQLParam> params);

    void refreshEntity(Object object);
}
