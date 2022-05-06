package cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.model.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.model.domain.Fruita;
import cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.model.repository.FruitaRepository;

@Service
public class FruitaService implements IFruitaService {
	@Autowired
	private FruitaRepository fruitaRepository;

	@Override
	public Fruita getFruitaById(int id) {
		Fruita obj = fruitaRepository.findById(id).get();
		return obj;
	}

	@Override
	public List<Fruita> getAllFruites() {
		List<Fruita> list = new ArrayList<>();
		fruitaRepository.findAll().forEach(e -> list.add(e));
		return list;
	}

	@Override
	public boolean addFruita(Fruita fruita) {
		fruitaRepository.save(fruita);
		return true;
	}

	@Override
	public void updateFruita(Fruita fruita) {
		fruitaRepository.save(fruita);
	}

	@Override
	public void deleteFruita(int id) {
		fruitaRepository.delete(getFruitaById(id));
	}

}
