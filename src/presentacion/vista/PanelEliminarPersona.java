package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import entidad.Persona;
import negocio.PersonaNegocio;

import javax.swing.JList;
import javax.swing.JOptionPane;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

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
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{87, 258, 0};
		gbl_panel.rowHeights = new int[]{61, 14, 130, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblEliminarUsuarios = new JLabel("Eliminar usuarios");
		GridBagConstraints gbc_lblEliminarUsuarios = new GridBagConstraints();
		gbc_lblEliminarUsuarios.anchor = GridBagConstraints.NORTH;
		gbc_lblEliminarUsuarios.insets = new Insets(0, 0, 5, 0);
		gbc_lblEliminarUsuarios.gridx = 1;
		gbc_lblEliminarUsuarios.gridy = 1;
		panel.add(lblEliminarUsuarios, gbc_lblEliminarUsuarios);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.anchor = GridBagConstraints.NORTHWEST;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 2;
		panel.add(scrollPane, gbc_scrollPane);
		
		list = new JList<Persona>();
		//		modelPersonas = new DefaultListModel();
		//		List<Persona> lp = null;
		//		lp = pNeg.readAll();
		//		for (Persona item : lp) {
		//			modelPersonas.addElement(item);
		//		}
		//		list.setModel(modelPersonas);
				
				
				
				scrollPane.setViewportView(list);
		
		btnEliminar = new JButton("Eliminar");
		GridBagConstraints gbc_btnEliminar = new GridBagConstraints();
		gbc_btnEliminar.anchor = GridBagConstraints.NORTH;
		gbc_btnEliminar.gridx = 1;
		gbc_btnEliminar.gridy = 3;
		panel.add(btnEliminar, gbc_btnEliminar);

	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
