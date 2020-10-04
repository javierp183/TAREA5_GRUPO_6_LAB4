package dao;

// No quise pisar este code, pero creo que podriamos usar lo mismo que la profe y fue.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import daoImpl.Conexion;
import entidad.Persona;

public class PersonaDao {

	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "0000";
	private String dbName = "bdpersonas";
	private String query;
	
	
	public PersonaDao() {
	
	}
	
	public int agregarPersona(Persona persona) {
		query = "INSERT INTO personas(Dni,Nombre,Apellido) VALUES ('"+ persona.getDni() + "','" + persona.getNombre() + "','" + persona.getApellido() + "')";
		
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
		query = "DELETE FROM personas WHERE Dni=" + persona.getDni();
		
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
		query = "UPDATE personas SET Dni='" + dni + "'," + "Nombre='"  + nombre + "'," + "Apellido='" + apellido + "' WHERE Dni=" + persona.getDni(); 
		
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
	
	public List<PersonaDao> listarPersonas(){
		PreparedStatement statement;
		ResultSet resultSet; //Guarda el resultado de la query
		ArrayList<Persona> personas = new ArrayList<Persona>();
		Conexion conexion = Conexion.getConexion();
		try 
		{
			statement = conexion.getSQLConexion().prepareStatement(readall);
			resultSet = statement.executeQuery();
			while(resultSet.next())
			{
				personas.add(getPersona(resultSet));
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return personas;
	}
	
	
}
