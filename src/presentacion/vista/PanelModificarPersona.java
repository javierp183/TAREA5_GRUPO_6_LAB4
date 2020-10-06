package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class PanelModificarPersona extends JPanel {
	private JTextField txtDni;
	private JTextField txtApellido;
	private JTextField txtNombre;

	/**
	 * Create the panel.
	 */
	public PanelModificarPersona() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 300);
		add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{69, 20, 96, 96, 89, 0};
		gbl_panel.rowHeights = new int[]{14, 130, 14, 23, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblUsuario = new JLabel("Seleccione el usuario que desea modificar");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridwidth = 2;
		gbc_lblUsuario.gridx = 2;
		gbc_lblUsuario.gridy = 0;
		panel.add(lblUsuario, gbc_lblUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.anchor = GridBagConstraints.NORTHWEST;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 0);
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		panel.add(scrollPane, gbc_scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 2;
		panel.add(lblNombre, gbc_lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.NORTH;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 2;
		gbc_lblApellido.gridy = 2;
		panel.add(lblApellido, gbc_lblApellido);
		
		JLabel lblDni = new JLabel("Dni");
		GridBagConstraints gbc_lblDni = new GridBagConstraints();
		gbc_lblDni.anchor = GridBagConstraints.NORTH;
		gbc_lblDni.insets = new Insets(0, 0, 5, 5);
		gbc_lblDni.gridx = 3;
		gbc_lblDni.gridy = 2;
		panel.add(lblDni, gbc_lblDni);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.insets = new Insets(0, 0, 0, 5);
		gbc_txtNombre.gridwidth = 2;
		gbc_txtNombre.gridx = 0;
		gbc_txtNombre.gridy = 3;
		panel.add(txtNombre, gbc_txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		GridBagConstraints gbc_txtApellido = new GridBagConstraints();
		gbc_txtApellido.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido.insets = new Insets(0, 0, 0, 5);
		gbc_txtApellido.gridx = 2;
		gbc_txtApellido.gridy = 3;
		panel.add(txtApellido, gbc_txtApellido);
		
		txtDni = new JTextField();
		GridBagConstraints gbc_txtDni = new GridBagConstraints();
		gbc_txtDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDni.insets = new Insets(0, 0, 0, 5);
		gbc_txtDni.gridx = 3;
		gbc_txtDni.gridy = 3;
		panel.add(txtDni, gbc_txtDni);
		txtDni.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.anchor = GridBagConstraints.NORTH;
		gbc_btnAceptar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAceptar.gridx = 4;
		gbc_btnAceptar.gridy = 3;
		panel.add(btnAceptar, gbc_btnAceptar);

	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
