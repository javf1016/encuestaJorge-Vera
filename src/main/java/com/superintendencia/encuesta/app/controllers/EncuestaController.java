package com.superintendencia.encuesta.app.controllers;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.superintendencia.encuesta.app.models.entity.Encuesta;
import com.superintendencia.encuesta.app.models.entity.Marca;
import com.superintendencia.encuesta.app.models.service.IEncuestaService;
import com.superintendencia.encuesta.app.models.service.IMarcaService;

/**
 * 
 * @author Jorge Andres Vera Forero
 *
 */
@Controller
public class EncuestaController {
	
	@Autowired
	private IEncuestaService  encuestaService;
	
	@Autowired
	private IMarcaService marcaService;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar (Model model) {
		model.addAttribute("titulo", "Listado de encuestas");
		model.addAttribute("encuestas", encuestaService.findAll());
		return "listar";
	}

	@RequestMapping(value = "/crear", method = RequestMethod.GET)
	public String crear (Map<String, Object> model) {
		Encuesta encuesta = new Encuesta();
		encuesta.setFechaRespuesta(new Date());
		List<Marca> marcas = marcaService.findAll();
		model.put("marcas", marcas);
		model.put("titulo", "Encuesta");
		model.put("encuesta", encuesta);
		return "crear";
	}
	
	@RequestMapping(value="/consultar/{id}")
	public String editar(@PathVariable(value="id") Long id, Map<String, Object> model, RedirectAttributes flash) {
		
		Encuesta encuesta = null;
		
		if(id > 0) {
			encuesta = encuestaService.findOne(id);
			if(encuesta == null) {
				flash.addFlashAttribute("error", "El ID de la encuesta no existe en la BD");
				return "redirect:/listar";
			}
		} else {
			flash.addFlashAttribute("error", "El ID de la encuesta no puede ser cero");
			return "redirect:/listar";
		}
		model.put("encuesta", encuesta);
		model.put("titulo", "Consultar Encuesta");
		return "consultar";
	}
	
	@RequestMapping(value = "/crear", method = RequestMethod.POST)
	public String guardar (@Valid Encuesta encuesta, BindingResult result, Model model, SessionStatus status) {
		if (result.hasErrors()) {
			model.addAttribute("titulo", "Nueva Encuesta");
			List<Marca> marcas = marcaService.findAll();
			model.addAttribute("marcas", marcas);
			return "crear";
		}
		encuestaService.save(encuesta);
		status.setComplete();
		return "redirect:listar";
	}
	
	@RequestMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		
		if(id > 0) {
			encuestaService.delete(id);
		}
		return "redirect:/listar";
	}
	
}
