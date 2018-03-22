package br.edu.up.disciplinaproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Classe controller - respons�vel pelos m�todos vinculados
 * com o mapeamento dos m�todos para web
 */
@Controller
public class DisciplinaController {

	@RequestMapping("/")
	public String oi() {
		return "index";
	}
	
}
