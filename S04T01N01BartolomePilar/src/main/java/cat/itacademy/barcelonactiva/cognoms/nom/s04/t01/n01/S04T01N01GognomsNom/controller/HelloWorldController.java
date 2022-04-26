package cat.itacademy.barcelonactiva.cognoms.nom.s04.t01.n01.S04T01N01GognomsNom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	@ResponseBody

	public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
		return "Hola, " +nom+ ". Estàs executant un projecte Maven";
	}
	@GetMapping(value = {"/HelloWorld2/{nom}", "/HelloWorld2"})
	@ResponseBody
	
	public String saluda2(@PathVariable (required = false) String nom) {
		
		return "Hola, " +nom+ ". Estàs executant un projecte Maven";
		
	}
}
