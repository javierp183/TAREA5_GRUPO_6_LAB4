package main;

import dao.PersonaDao;
import entidad.Persona;
import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.controlador.Controlador;
import presentacion.vista.VentanaPrincipal;

public class Principal {

	public static void main(String[] args) {
			
		try {
			VentanaPrincipal vista = new VentanaPrincipal();
			PersonaNegocio negocio = new PersonaNegocioImpl();
			Controlador controlador = new Controlador(vista, negocio);
			controlador.inicializar();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
