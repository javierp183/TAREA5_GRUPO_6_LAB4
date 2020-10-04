package negocioImpl;

import java.util.List;

import dao.PersonaDao;
import daoImpl.PersonaDaoImpl;
import entidad.Persona;
import negocio.PersonaNegocio;

public class PersonaNegocioImpl implements PersonaNegocio{

	PersonaDaoImpl pdao = new PersonaDaoImpl();
	private boolean estado;
	
	@Override
	public boolean insert(Persona persona) {
		
		if(persona.getNombre().trim().length()>0 && persona.getDni().trim().length()>0 && persona.getApellido().trim().length()>0)
		{
			estado=pdao.insert(persona);
			return estado;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean delete(Persona persona_a_eliminar) {
		if(persona_a_eliminar.getDni() != null )//Tambi�n se puede preguntar si existe ese ID 
		{
			estado=pdao.delete(persona_a_eliminar);
			return estado;
		}
		else
		{
			return false;
		}
	}

	@Override
	public List<Persona> readAll() {
		return pdao.readAll();
	}

}