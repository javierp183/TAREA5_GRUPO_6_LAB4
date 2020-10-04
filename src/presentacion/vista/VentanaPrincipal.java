package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnPersonas = new JMenu("Personas");
		menuBar.add(mnPersonas);
		
		JMenuItem mntmAgregarPersona = new JMenuItem("Agregar");
		mnPersonas.add(mntmAgregarPersona);
		
		JMenuItem mntmEliminarPersona = new JMenuItem("Eliminar");
		mnPersonas.add(mntmEliminarPersona);
		
		JMenuItem mntmModificarPersona = new JMenuItem("Modificar");
		mnPersonas.add(mntmModificarPersona);
		
		JMenuItem mntmListarPersonas = new JMenuItem("Listar");
		mnPersonas.add(mntmListarPersonas);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(424, 230, -411, -219);
		contentPane.add(panel);
	}
}
