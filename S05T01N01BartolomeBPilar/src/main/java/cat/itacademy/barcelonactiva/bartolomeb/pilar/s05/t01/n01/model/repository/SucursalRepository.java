package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t01.n01.model.domain.Sucursal;

@Repository
public interface SucursalRepository extends JpaRepository<Sucursal, Integer> {

}
