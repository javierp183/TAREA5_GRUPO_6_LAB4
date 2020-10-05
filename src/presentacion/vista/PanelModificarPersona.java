package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

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
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Seleccione el usuario que desea modificar");
		lblUsuario.setBounds(126, 5, 198, 14);
		panel.add(lblUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(96, 24, 258, 130);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(340, 184, 89, 23);
		panel.add(btnAceptar);
		
		txtDni = new JTextField();
		txtDni.setBounds(232, 185, 96, 20);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(126, 185, 96, 20);
		panel.add(txtApellido);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		txtNombre.setBounds(20, 185, 96, 20);
		panel.add(txtNombre);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(43, 167, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(150, 167, 46, 14);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(256, 167, 46, 14);
		panel.add(lblDni);

	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
