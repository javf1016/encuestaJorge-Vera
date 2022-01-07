package com.superintendencia.encuesta.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.superintendencia.encuesta.app.models.dao.IEncuestaDao;

@Controller
public class EncuestaController {
	
	@Autowired
	@Qualifier("encuestaDaoJPA")
	private IEncuestaDao encuestaDao;
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar (Model model) {
		model.addAttribute("titulo", "Listado de encuestas");
		model.addAttribute("encuestas", encuestaDao.findAll());
		return "listar";
	}

}
