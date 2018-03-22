package br.edu.up.disciplinaproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * Classe controller - responsável pelos métodos vinculados
 * com o mapeamento dos métodos para web
 */
@Controller
public class DisciplinaController {

	@RequestMapping("/")
	public String oi() {
		return "index";
	}
	
}
