package negocioImpl;

import java.util.List;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio{

	PersonaDaoImpl pdao = new PersonaDaoImpl();
	private int estado;
	
	@Override
	public int insert(Persona persona) {
		
		if(persona.getNombre().trim().length()>0 && persona.getDni().trim().length()>0 && persona.getApellido().trim().length()>0)
		{
			estado=pdao.agregarPersona(persona);
			return estado;
		}
		else
		{
			return -1;
		}
	}

	@Override
	public int delete(Persona persona_a_eliminar) {
		if(persona_a_eliminar.getDni() != null )//Tambi�n se puede preguntar si existe ese ID 
		{
			estado=pdao.borrarPersona(persona_a_eliminar);
		}
		return estado;
	}

	@Override
	public List<Persona> readAll() {
		return pdao.readAll();
	}

}