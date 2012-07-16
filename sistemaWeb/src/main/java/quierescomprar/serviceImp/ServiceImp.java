package quierescomprar.serviceImp;

import java.util.List;

import cloud.quierescomprar.service.OfertaService;


import quierescomprar.bean.Oferta;
import quierescomprar.service.Service;

public class ServiceImp implements Service {
	
	private OfertaService ofertaService;

	public List<Oferta> listaOfertas() {
		
		return ofertaService.listaOfertas();
	}

	public OfertaService getOfertaService() {
		return ofertaService;
	}

	public void setOfertaService(OfertaService ofertaService) {
		this.ofertaService = ofertaService;
	}
	

}
