package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import clases.Peliculas;
import entidad.Persona;
import negocio.PersonaNegocio;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class PanelEliminarPersona extends JPanel {

	private DefaultListModel modelPersonas;
	private String[] nombreColumnas = {"Nombre y apellido","Dni"};
	private JList list;
	private JButton btnEliminar;
	private PersonaNegocio pNeg;

	/**
	 * Create the panel.
	 */
	public PanelEliminarPersona() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 300);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblEliminarUsuarios = new JLabel("Eliminar usuarios");
		lblEliminarUsuarios.setBounds(171, 61, 79, 14);
		panel.add(lblEliminarUsuarios);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(87, 90, 258, 130);
		panel.add(scrollPane);
		
		list = new JList<Persona>();
		modelPersonas = new DefaultListModel();
		List<Persona> lp = null;
		lp = pNeg.readAll();
		for (Persona item : lp) {
			modelPersonas.addElement(item);
		}
		list.setModel(modelPersonas);
		
		
		
		scrollPane.setViewportView(list);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(171, 242, 89, 23);
		panel.add(btnEliminar);

	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
