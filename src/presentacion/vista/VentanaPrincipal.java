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
	private JMenu mnPersonas;
	private JMenuItem mntmAgregar;
	private JMenuItem mntmEliminar;
	private JMenuItem mntmModificar;
	private JMenuItem mntmListar;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnPersonas = new JMenu("Personas");
		menuBar.add(mnPersonas);
		
		mntmAgregar = new JMenuItem("Agregar");
		mnPersonas.add(mntmAgregar);
		
		mntmEliminar = new JMenuItem("Eliminar");
		mnPersonas.add(mntmEliminar);
		
		mntmModificar = new JMenuItem("Modificar");
		mnPersonas.add(mntmModificar);
		
		mntmListar = new JMenuItem("Listar");
		mnPersonas.add(mntmListar);
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
		return mntmAgregar;
	}


	public void setMntmAgregar(JMenuItem mntmAgregar) {
		this.mntmAgregar = mntmAgregar;
	}


	public JMenuItem getMntmEliminar() {
		return mntmEliminar;
	}


	public void setMntmEliminar(JMenuItem mntmEliminar) {
		this.mntmEliminar = mntmEliminar;
	}


	public JMenuItem getMntmModificar() {
		return mntmModificar;
	}


	public void setMntmModificar(JMenuItem mntmModificar) {
		this.mntmModificar = mntmModificar;
	}


	public JMenuItem getMntmListar() {
		return mntmListar;
	}


	public void setMntmListar(JMenuItem mntmListar) {
		this.mntmListar = mntmListar;
	}


}
