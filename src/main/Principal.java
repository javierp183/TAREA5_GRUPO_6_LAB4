package main;

import dao.PersonaDao;
import entidad.Persona;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PersonaDao personaDao = new PersonaDao();
		
		Persona persona1 = new Persona();
		persona1.setDni("3884573");
		persona1.setNombre("Gyro");
		persona1.setApellido("Zeppeli");
		
		/* int filas = personaDao.agregarPersona(persona1);
		
		if(filas==1) System.out.println("Personas Agregada");
		else
			System.out.println("Personas No Agregada");
		/*
          int filas = personaDao.borrarPersona(persona1);
		
		if(filas==1) System.out.println("Personas Eliminada");
		else
			System.out.println("Personas No Eliminada");
		*/
		
		/* int filas = personaDao.modificarPersona(persona1, "337" , "Joseph" , "Joestar");
		
		if(filas==1) System.out.println("Personas Modificada");
		else
			System.out.println("Personas No Modificada");
			
			*/
	}

}