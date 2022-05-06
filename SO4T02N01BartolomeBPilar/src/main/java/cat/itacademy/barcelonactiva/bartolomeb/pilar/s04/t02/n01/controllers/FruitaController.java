package cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.util.UriComponentsBuilder;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.model.services.IFruitaService;

@Controller
public class FruitaController {

	@Autowired
	private IFruitaService fruitaService;

	@GetMapping("fruita/{id}")
	public ResponseEntity<Fruita> getFruitaById(@PathVariable("id") int id) {
		Fruita fruita = fruitaService.getFruitaById(id);
		return new ResponseEntity<Fruita>(fruita, HttpStatus.OK);
	}

	@GetMapping("fruites")
	public ResponseEntity<List<Fruita>> getAllFruites() {
		List<Fruita> list = fruitaService.getAllFruites();
		return new ResponseEntity<List<Fruita>>(list, HttpStatus.OK);
	}

	@PostMapping("fruita")
	public ResponseEntity<Void> addFruita(@RequestBody Fruita fruita, UriComponentsBuilder builder) {
		fruitaService.addFruita(fruita);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/fruita/{id}").buildAndExpand(fruita.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	@PutMapping("fruita")
	public ResponseEntity<Fruita> updatefruita(@RequestBody Fruita fruita) {
		fruitaService.updateFruita(fruita);
		return new ResponseEntity<Fruita>(fruita, HttpStatus.OK);
	}

	@DeleteMapping("fruita/{id}")
	public ResponseEntity<Void> deletefruita(@PathVariable("id") int id) {
		fruitaService.deleteFruita(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
} 

