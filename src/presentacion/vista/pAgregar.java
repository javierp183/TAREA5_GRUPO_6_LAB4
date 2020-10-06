package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class pAgregar extends JPanel {
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtDni;


	public pAgregar() {
		super();
		Initialize();
	}
	
	public void Initialize() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 430, 278);
		add(panel);
		panel.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(198, 53, 86, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(198, 106, 86, 20);
		panel.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtDni = new JTextField();
		txtDni.setBounds(198, 161, 86, 20);
		panel.add(txtDni);
		txtDni.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(121, 56, 46, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(121, 109, 46, 14);
		panel.add(lblApellido);
		
		JLabel lblDni = new JLabel("Dni");
		lblDni.setBounds(121, 164, 46, 14);
		panel.add(lblDni);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(151, 218, 89, 23);
		panel.add(btnAceptar);
		
	}
}
