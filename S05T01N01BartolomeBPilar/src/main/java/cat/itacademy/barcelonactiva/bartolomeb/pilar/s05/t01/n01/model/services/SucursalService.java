package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.dtos.SucursalDTO;

public interface SucursalService {
	
	Integer guardarSucursal(SucursalDTO sucursalDTO);

	List<SucursalDTO> getSucursals();

	SucursalDTO getSucursalById(Integer id);

	void borrarById(Integer id);
}
