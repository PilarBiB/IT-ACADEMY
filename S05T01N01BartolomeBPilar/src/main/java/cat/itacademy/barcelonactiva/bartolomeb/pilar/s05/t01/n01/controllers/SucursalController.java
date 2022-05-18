package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.dtos.SucursalDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.services.SucursalService;


@Controller
public class SucursalController {

	@Autowired
	private SucursalService sucursalService;

	private final String DATA_SUCURSALSDTO_LLISTA = "DATA_SucursalsDtoLlista";
	private final String DATA_SUCURSALSDTO_FORMULARI = "DATA_SucursalsDtoFormulari";

	private final String VISTA_LLISTA_SUCURSALS = "Sucursals";
	private final String VISTA_CONSULTA_SUCURSAL = "ConsultaSucursal";
	private final String VISTA_EDITA_SUCURSAL = "EditaSucursal";

	@GetMapping("/LlistaSucursals")
	public ModelAndView llistaSucursals() {
		ModelAndView modelAndView = new ModelAndView();
		List<SucursalDTO> sucursalsDTO = sucursalService.getSucursals();
		modelAndView.addObject(DATA_SUCURSALSDTO_LLISTA, sucursalsDTO);
		modelAndView.setViewName(VISTA_LLISTA_SUCURSALS);
		return modelAndView;
	}

	@GetMapping("/NovaSucursal")
	public ModelAndView formulariNouSucursal() {
		SucursalDTO sucursalDTO = new SucursalDTO();
		sucursalDTO.setNomSucursal("  ");
		return formulariSucursalDTO(sucursalDTO, VISTA_EDITA_SUCURSAL);

	}

	@GetMapping("/ModificaSucursal/{id}")
	public ModelAndView formulariModificaSucursal(@PathVariable("id") Integer id) {
		SucursalDTO sucursalDTO = sucursalService.getSucursalById(id);
		return formulariSucursalDTO(sucursalDTO, VISTA_EDITA_SUCURSAL);
	}

	@GetMapping("/ConsultaSucursal/{id}")
	public ModelAndView formulariConsultaSucursal(@PathVariable("id") Integer id) {
		SucursalDTO sucursalDTO = sucursalService.getSucursalById(id);
		return formulariSucursalDTO(sucursalDTO, VISTA_CONSULTA_SUCURSAL);

	}

	@GetMapping("EliminaSucursal/{id}")
	public ModelAndView eliminaSucursal(@PathVariable("id") Integer id) {
		sucursalService.borrarById(id);
		return new ModelAndView("redirect:/LlistaSucursals");
	}

	@PostMapping("/GuardarSucursal")
	public ModelAndView guardarSucursal(@ModelAttribute(DATA_SUCURSALSDTO_FORMULARI) SucursalDTO sucursalDTO) {
		sucursalService.guardarSucursal(sucursalDTO);
		return new ModelAndView("redirect:/LlistaSucursals");
	}

	private ModelAndView formulariSucursalDTO(SucursalDTO sucursalDTO, String nomVista) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject(DATA_SUCURSALSDTO_FORMULARI, sucursalDTO);
		modelAndView.setViewName(nomVista);
		return modelAndView;
	}

}

