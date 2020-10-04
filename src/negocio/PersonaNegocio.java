package negocio;

import java.util.List;

import entidad.Persona;

public interface PersonaNegocio {

	public int insert(Persona persona);
	public int delete(Persona persona_a_eliminar);
	public List<Persona> readAll();
}