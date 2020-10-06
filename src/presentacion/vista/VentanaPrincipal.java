package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JMenuItem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.EmptyBorder;

public class VentanaPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenu mnPersonas;
	private JMenuBar menuBar;
	private JMenuItem menuAgregar;
	private JMenuItem menuEliminar;
	private JMenuItem menuModificar;
	private JMenuItem menuListar;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		getContentPane().add(menuBar, BorderLayout.NORTH);
		
		mnPersonas = new JMenu("Personas");
		menuBar.add(mnPersonas);
		
		menuAgregar = new JMenuItem("Agregar");
		mnPersonas.add(menuAgregar);
		
		menuEliminar = new JMenuItem("Eliminar");
		mnPersonas.add(menuEliminar);
		
		menuModificar = new JMenuItem("Modificar");
		mnPersonas.add(menuModificar);
		
		menuListar = new JMenuItem("Listar");
		mnPersonas.add(menuListar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	public JPanel getContentPane() {
		return contentPane;
	}


	public void setContentPane(JPanel contentPane) {
		this.contentPane = contentPane;
	}


	public JMenu getMnPersonas() {
		return mnPersonas;
	}


	public void setMnPersonas(JMenu mnPersonas) {
		this.mnPersonas = mnPersonas;
	}


	public JMenuItem getMntmAgregar() {
		return menuAgregar;
	}


	public void setMntmAgregar(JMenuItem mntmAgregar) {
		this.menuAgregar = mntmAgregar;
	}


	public JMenuItem getMntmEliminar() {
		return menuEliminar;
	}


	public void setMntmEliminar(JMenuItem mntmEliminar) {
		this.menuEliminar = mntmEliminar;
	}


	public JMenuItem getMntmModificar() {
		return menuModificar;
	}


	public void setMntmModificar(JMenuItem mntmModificar) {
		this.menuModificar = mntmModificar;
	}


	public JMenuItem getMntmListar() {
		return menuListar;
	}


	public void setMntmListar(JMenuItem mntmListar) {
		this.menuListar = mntmListar;
	}


}
