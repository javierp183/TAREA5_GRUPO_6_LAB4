package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import entidad.Persona;

public class PersonaDao {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "0000";
	private String dbName = "bdpersonas";
	
	
	public PersonaDao() {
	
	}
	
	public int agregarPersona(Persona persona) {
		String query = "INSERT INTO personas(Dni,Nombre,Apellido) VALUES ('"+ persona.getDni() + "','" + persona.getNombre() + "','" + persona.getApellido() + "')";
		
		Connection cn = null;
		int filas=0;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		}
		catch(Exception e) { e.printStackTrace();  }
		
		
		
		return filas;
	}
	
	public int borrarPersona(Persona persona) {
		String query = "DELETE FROM personas WHERE Dni=" + persona.getDni();
		
		Connection cn = null;
		int filas=0;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		}
		catch(Exception e) { e.printStackTrace();  }
		
		
		
		return filas;
	}
	
	
	public int modificarPersona(Persona persona , String dni,String nombre, String apellido) {
		String query = "UPDATE personas SET Dni='" + dni + "'," + "Nombre='"  + nombre + "'," + "Apellido='" + apellido + "' WHERE Dni=" + persona.getDni(); 
		
		Connection cn = null;
		int filas=0;
		
		try {
			cn = DriverManager.getConnection(host+dbName,user,pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(query);
		}
		catch(Exception e) { e.printStackTrace();  }
		
		
		
		return filas;
	}
	
	
}
