package com.keralty.aeestatus.repository;

import com.keralty.aeestatus.persistence.Aesolicitudes;
import com.keralty.aeestatus.persistence.AreaMedica;
import com.keralty.aeestatus.persistence.Contratante;
import com.keralty.aeestatus.persistence.ContratoC;
import com.keralty.aeestatus.persistence.Direccion;
import com.keralty.aeestatus.persistence.DocumentoG;
import com.keralty.aeestatus.persistence.ErrorWS;
import com.keralty.aeestatus.persistence.Firma;
import com.keralty.aeestatus.persistence.FormaPago;
import com.keralty.aeestatus.persistence.Funcionario;
import com.keralty.aeestatus.persistence.GrupoAsociado;
import com.keralty.aeestatus.persistence.LogAsignaciones;
import com.keralty.aeestatus.persistence.LogEstado;
import com.keralty.aeestatus.persistence.Periodicidad;
import com.keralty.aeestatus.persistence.Persona;
import com.keralty.aeestatus.persistence.ProteccionDatos;
import com.keralty.aeestatus.persistence.Solicitud;
import com.keralty.aeestatus.persistence.TipoFactura;
import com.keralty.aeestatus.persistence.Titular;
import com.keralty.aeestatus.persistence.Usuario;
import com.keralty.aeestatus.persistence.UsuarioReg;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SolicitudJpaRepository extends JpaRepository<Solicitud, Long>, SolicitudJpaRepositoryCustom {

    List<Solicitud> findByDireccion(Direccion direccion);

    List<Solicitud> findByProteccionDatos(ProteccionDatos proteccionDatos);

    List<Solicitud> findByUsuarios(Usuario usuarios);

    List<Solicitud> findByContratante(Contratante contratante);

    List<Solicitud> findByFirma(Firma firma);

    List<Solicitud> findBySegundaFirma(Firma segundaFirma);

    List<Solicitud> findByFirmaContratanteIncl(Firma firmaContratanteIncl);

    List<Solicitud> findByUsuariosRegistrados(UsuarioReg usuariosRegistrados);

    List<Solicitud> findByTitular(Titular titular);

    List<Solicitud> findByDocumentosGestor(DocumentoG documentosGestor);

    List<Solicitud> findByErroresWS(ErrorWS erroresWS);

    List<Solicitud> findByLogEstado(LogEstado logEstado);

    List<Solicitud> findByLogAsignaciones(LogAsignaciones logAsignaciones);

    List<Solicitud> findByAesolicitudes(Aesolicitudes aesolicitudes);

    List<Solicitud> findByContratantePersona(Persona contratantePersona);

    List<Solicitud> findByTitularPersona(Persona titularPersona);

    List<Solicitud> findByGrupoAsociado(GrupoAsociado grupoAsociado);

    List<Solicitud> findByAgente(Funcionario agente);

    List<Solicitud> findByFormaPago(FormaPago formaPago);

    List<Solicitud> findByPeriodicidad(Periodicidad periodicidad);

    List<Solicitud> findByContratoC(ContratoC contratoC);

    List<Solicitud> findByUsrAreaMedica(AreaMedica usrAreaMedica);

    List<Solicitud> findByTipoFactura(TipoFactura tipoFactura);

    List<Solicitud> findByUsrAfiliacion(Funcionario usrAfiliacion);
}
