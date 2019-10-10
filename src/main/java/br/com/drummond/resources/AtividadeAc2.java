package br.com.drummond.resources;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AtividadeAc2 {
	
	@RequestMapping(value = "/soma/{valor1}/{valor2}", method = RequestMethod.GET)
	public Integer somar(@PathVariable Integer valor1, @PathVariable Integer valor2)  {
		
		Integer resultado;
		
		resultado = valor1 + valor2;

		return resultado;

	}
	
	/**
	 * Metodo opcional
	 * @return
	 */
	@RequestMapping(value = {"/", "/health"}, method = RequestMethod.GET)
	public String health()  {
		
		return "Online - " + new Date();

	}

}
