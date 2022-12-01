package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models.Roles;

public interface RolesRepository extends MongoRepository<Roles, String> {

	public Optional<Roles> findByNombre(String nombre);

}
