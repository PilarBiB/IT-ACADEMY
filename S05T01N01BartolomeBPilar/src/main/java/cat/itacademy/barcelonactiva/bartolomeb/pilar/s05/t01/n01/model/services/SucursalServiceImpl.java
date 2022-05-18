package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.domain.Sucursal;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.dtos.SucursalDTO;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.repository.SucursalRepository;

@Service
public class SucursalServiceImpl implements SucursalService{
	@Autowired
	SucursalRepository sucursalRepository;

	@Override
	public Integer guardarSucursal(SucursalDTO sucursalDTO) {
		Sucursal sucursal = this.mapDTOToEntity(sucursalDTO);
		sucursal = sucursalRepository.save(sucursal);
		return sucursal.getPk_SucursalID();
	}
	@Override
	public List<SucursalDTO> getSucursals() {

		List<SucursalDTO> resultat = new ArrayList<SucursalDTO>();

		List<Sucursal> sucursals = sucursalRepository.findAll();
		if (sucursals != null && sucursals.size() > 0) {
			for (Sucursal sucursal : sucursals) {
				resultat.add(this.mapEntityToDTO(sucursal));
			}
		}
		return resultat;
	}
	@Override
	public SucursalDTO getSucursalById(Integer id) {
		SucursalDTO resultat = new SucursalDTO();

		Optional<Sucursal> sucursal = sucursalRepository.findById(id);
		if (sucursal.isPresent()) {
			resultat = this.mapEntityToDTO(sucursal.get());
		}
		return resultat;
	}
	@Override
	public void borrarById(Integer id) {
		sucursalRepository.deleteById(id);
	}
	private Sucursal mapDTOToEntity(SucursalDTO sucursalDTO) {
		Sucursal resultat = null;

		if (sucursalDTO != null) {
			resultat = new Sucursal();
			resultat.setPk_SucursalID(sucursalDTO.getPk_SucursalID());
			resultat.setNomSucursal(sucursalDTO.getNomSucursal());
			resultat.setPaisSucursal(sucursalDTO.getPaisSucursal());	
		}
		return resultat;
	}
	private SucursalDTO mapEntityToDTO(Sucursal sucursal) {
		SucursalDTO resultat = null;

		if (sucursal != null) {
			resultat = new SucursalDTO();
			resultat.setPk_SucursalID(sucursal.getPk_SucursalID());
			resultat.setNomSucursal(sucursal.getNomSucursal());
			resultat.setPaisSucursal(sucursal.getPaisSucursal());
		}
		return resultat;
	}
}


