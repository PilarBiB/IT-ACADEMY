package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Roles;

public interface RolesRepository extends JpaRepository<Roles, Long> {

	public Optional<Roles> findByNombre(String nombre);

}
