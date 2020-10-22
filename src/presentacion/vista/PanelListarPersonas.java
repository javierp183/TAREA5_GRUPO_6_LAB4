package presentacion.vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import entidad.Persona;

import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class PanelListarPersonas extends JPanel {
	private DefaultTableModel modelo;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PanelListarPersonas() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 450, 300);
		add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(60, 41, 335, 217);
		panel.add(scrollPane);
		
		modelo = new DefaultTableModel();
		table = new JTable(modelo);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre", "Apellido", "Dni"
			}
		));
		scrollPane.setViewportView(table);

	}
	
	public void setDefaultListModel(List<Persona> listModelRecibido)
	{
		int numCols = table.getModel().getColumnCount();
		
		for (Persona item : listModelRecibido) {
			
		Object [] fila = new Object[numCols]; 
        
		 fila[0] = item.getNombre();
		 fila[1] = item.getApellido();
		 fila[2] = item.getDni();
		 
		 ((DefaultTableModel) table.getModel()).addRow(fila);
		}



	}
	
	public void mostrarMensaje(String mensaje)
	{
		JOptionPane.showMessageDialog(null, mensaje);
	}
}
