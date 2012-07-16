package quierescomprar.controladora;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import quierescomprar.service.*;
import quierescomprar.bean.Oferta;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class ListadoOfertasControladora extends AbstractController {
	
	private Service service;
	
	private List<Oferta> listaOfertas()
	{
		
	
		List<Oferta> ofertas = new ArrayList<Oferta>();
		ofertas = service.listaOfertas();
		
		
		return ofertas;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		
		List<Oferta> ofertas = listaOfertas();

		setAttributeToModel(request, "ofertas", ofertas);
		
		return new ModelAndView("ListarOfertas",getModel(request));
	}
	
	private void setAttributeToModel(HttpServletRequest request, String name, Object value)
	{
		logger.debug("Guardando en sesion el objeto " + value + " con nombre '" + name + "'");
		getModel(request).put(name, value);
	}
	
	@SuppressWarnings("unchecked")
	private Map<String, Object> getModel(HttpServletRequest request)
	{
		Map<String, Object> model = (Map<String, Object>) request.getSession().getAttribute("model");
		
		if(model == null)
		{
			model = new HashMap<String, Object>();
			request.getSession().setAttribute("model", model);
			
			return model;
		}
		
		return model;
	}

}
