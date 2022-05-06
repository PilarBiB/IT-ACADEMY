package cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s04.t02.n01.model.domain.Fruita;

public interface IFruitaService {
     List<Fruita> getAllFruites();
     Fruita getFruitaById(int id);
     boolean addFruita(Fruita fruita);
     void updateFruita(Fruita fruita);
     void deleteFruita(int id);
}