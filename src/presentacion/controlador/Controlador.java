package presentacion.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import negocio.PersonaNegocio;
import negocioImpl.PersonaNegocioImpl;
import presentacion.vista.PanelAgregarPersona;
import presentacion.vista.PanelEliminarPersona;
import presentacion.vista.PanelListarPersonas;
import presentacion.vista.PanelModificarPersona;
import presentacion.vista.VentanaPrincipal;

public class Controlador implements ActionListener {

	private VentanaPrincipal vp;
	private PanelAgregarPersona pap;
	private PanelEliminarPersona pep;
	private PanelListarPersonas plp;
	private PanelModificarPersona pmp;
	private PersonaNegocio pNeg;

		public Controlador(VentanaPrincipal vp, PersonaNegocio pNeg) {
			this.vp = vp;
			this.pNeg = pNeg;
			
			//Instancia de los paneles:
			this.pap = new PanelAgregarPersona();
			this.pep = new PanelEliminarPersona();
			this.plp = new PanelListarPersonas();
			this.pmp = new PanelModificarPersona();
			
			//Eventos del menu del frame de VentanaPrincipal (del jmenu)
			this.vp.getMntmAgregar().addActionListener(a->EventoClickMenu_AbrirPanel_AgregarPersona(a));
			this.vp.getMntmEliminar().addActionListener(a->EventoClickMenu_AbrirPanel_EliminarPersona(a));
			this.vp.getMntmModificar().addActionListener(a->EventoClickMenu_AbrirPanel_ModificarPersona(a));
			this.vp.getMntmListar().addActionListener(a->EventoClickMenu_AbrirPanel_ListarPersonas(a));
			
			//Evento del panel agregar personas
			
		}
		
		private void EventoClickMenu_AbrirPanel_ListarPersonas(ActionEvent a) {
			// TODO Auto-generated method stub
			vp.getContentPane().removeAll();
			vp.getContentPane().add(plp);
			vp.getContentPane().repaint();
			vp.getContentPane().revalidate();
			
		}

		private void EventoClickMenu_AbrirPanel_ModificarPersona(ActionEvent a) {
			// TODO Auto-generated method stub
			vp.getContentPane().removeAll();
			vp.getContentPane().add(pmp);
			vp.getContentPane().repaint();
			vp.getContentPane().revalidate();
			
		}

		private void EventoClickMenu_AbrirPanel_EliminarPersona(ActionEvent a) {
			// TODO Auto-generated method stub
			vp.getContentPane().removeAll();
			vp.getContentPane().add(pep);
			vp.getContentPane().repaint();
			vp.getContentPane().revalidate();
			
		}

		private void EventoClickMenu_AbrirPanel_AgregarPersona(ActionEvent a) {
			// TODO Auto-generated method stub
			vp.getContentPane().removeAll();
			vp.getContentPane().add(pap);
			vp.getContentPane().repaint();
			vp.getContentPane().revalidate();
			
		}

		public void inicializar()
		{
			this.vp.setVisible(true);;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
