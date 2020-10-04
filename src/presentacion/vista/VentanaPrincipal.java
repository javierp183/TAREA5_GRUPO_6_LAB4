package presentacion.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.DefaultListModel;
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
		
		setTitle("Ingreso Personas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		// JMenuBar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		// Jmenu
		JMenu mnPersonas = new JMenu("Personas");
		mnPersonas.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnPersonas);

		JMenuItem mntmAgregarPersona = new JMenuItem("Agregar");
		mnPersonas.add(mntmAgregarPersona);
		
		mntmAgregarPersona.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				contentPane.removeAll();
				//Abre el formulario Panel Ingreso Persona dentro de la ventana principal
				PanelAgregarPersona panel = new PanelAgregarPersona();
				System.out.println("nuevo objeto panel agregar");
				contentPane.add(panel);
				contentPane.repaint();
				contentPane.revalidate();
			}
			
		});
		

		JMenuItem mntmEliminarPersona = new JMenuItem("Eliminar");
		mnPersonas.add(mntmEliminarPersona);
		mntmEliminarPersona.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			contentPane.removeAll();
			//Abre el formulario Panel Eliminar Persona dentro de la ventana principal
			PanelEliminarPersona panel = new PanelEliminarPersona();
			System.out.println("nuevo objeto panel eliminar");
			contentPane.add(panel);
			contentPane.repaint();
			contentPane.revalidate();
		}
		
	});
		

		JMenuItem mntmModificarPersona = new JMenuItem("Modificar");
		mnPersonas.add(mntmModificarPersona);
		mntmModificarPersona.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			contentPane.removeAll();
			//Abre el formulario Panel Eliminar Persona dentro de la ventana principal
			PanelListarPersonas panel = new PanelListarPersonas();
			System.out.println("nuevo objeto panel Modificar");
			contentPane.add(panel);
			contentPane.repaint();
			contentPane.revalidate();
		}
		
	});

		JMenuItem mntmListarPersonas = new JMenuItem("Listar");
		mnPersonas.add(mntmListarPersonas);
		mntmListarPersonas.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			contentPane.removeAll();
			//Abre el formulario Panel Eliminar Persona dentro de la ventana principal
			PanelListarPersonas panel = new PanelListarPersonas();
			System.out.println("nuevo objeto panel Listar");
			contentPane.add(panel);
			contentPane.repaint();
			contentPane.revalidate();
		}
		
	});

//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(null);
//
//		JPanel panel = new JPanel();
//		panel.setBounds(424, 230, -411, -219);
//		contentPane.add(panel);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
	}

}
