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
		panel.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Seleccione el usuario que desea modificar");
		lblUsuario.setBounds(99, 0, 216, 14);
		panel.add(lblUsuario);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(69, 19, 258, 130);
		panel.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(81, 160, 51, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(180, 160, 64, 14);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(292, 160, 23, 14);
		panel.add(lblDni);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(54, 180, 94, 20);
		txtNombre.setColumns(10);
		panel.add(txtNombre);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(153, 180, 91, 20);
		txtApellido.setColumns(10);
		panel.add(txtApellido);
		
		txtDni = new JTextField();
		txtDni.setBounds(249, 180, 102, 20);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(155, 217, 102, 23);
		panel.add(btnAceptar);

	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
