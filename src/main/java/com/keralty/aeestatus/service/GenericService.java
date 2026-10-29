package com.keralty.aeestatus.service;

import com.keralty.aeestatus.repository.ConfiguracionANSJpaRepository;
import com.keralty.aeestatus.repository.FamiliaNovedadJpaRepository;
import com.keralty.aeestatus.repository.NovedadJpaRepository;
import com.keralty.aeestatus.repository.SolicitudNovedadJpaRepository;
import com.keralty.aeestatus.repository.UsuarioNovedadJpaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@Transactional
@ApplicationScoped
public class GenericService {

    private NovedadJpaRepository novedadJpaRepository;

    private SolicitudNovedadJpaRepository solicitudNovedadJpaRepository;

    private FamiliaNovedadJpaRepository familiaNovedadJpaRepository;

    private UsuarioNovedadJpaRepository usuarioNovedadJpaRepository;

    private ConfiguracionANSJpaRepository configuracionANSJpaRepository;
	
	@Inject
	public GenericService(
            NovedadJpaRepository novedadJpaRepository,
            SolicitudNovedadJpaRepository solicitudNovedadJpaRepository,
            FamiliaNovedadJpaRepository familiaNovedadJpaRepository,
            UsuarioNovedadJpaRepository usuarioNovedadJpaRepository,
            ConfiguracionANSJpaRepository configuracionANSJpaRepository
			) {
        this.novedadJpaRepository = novedadJpaRepository;
        this.solicitudNovedadJpaRepository = solicitudNovedadJpaRepository;
        this.familiaNovedadJpaRepository = familiaNovedadJpaRepository;
        this.usuarioNovedadJpaRepository = usuarioNovedadJpaRepository;
        this.configuracionANSJpaRepository = configuracionANSJpaRepository;
	}

	public NovedadJpaRepository getNovedadJpaRepository() {
		return this.novedadJpaRepository;
	}
	public SolicitudNovedadJpaRepository getSolicitudNovedadJpaRepository() {
		return this.solicitudNovedadJpaRepository;
	}
	public FamiliaNovedadJpaRepository getFamiliaNovedadJpaRepository() {
		return this.familiaNovedadJpaRepository;
	}
	public UsuarioNovedadJpaRepository getUsuarioNovedadJpaRepository() {
		return this.usuarioNovedadJpaRepository;
	}
	public ConfiguracionANSJpaRepository getConfiguracionANSJpaRepository() {
		return this.configuracionANSJpaRepository;
	}
}
