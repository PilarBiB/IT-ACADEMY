package cat.itacademy.barcelonactiva.bartolomeb.pilar.s05.t02.n01.models;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "roles")
public class Roles {

	@MongoId(FieldType.OBJECT_ID)
	private String id;

	@Field
	@Indexed(unique = true)
	private String nombre;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
