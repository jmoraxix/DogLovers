/**
 * Proyecto Final POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 09/11/2014
 */
package dogLovers.vista.usuario;

import dogLovers.control.Principal;
import dogLovers.modelo.Mascota;
import dogLovers.modelo.Persona;
import dogLovers.vista.PanelBase;
import dogLovers.vista.PanelMostrarMascotas;
import dogLovers.vista.VentanaBase;
import dogLovers.vista.VentanaConsulta;

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Panel;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.ScrollPane;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;

/**
 * @author David
 *
 */
public class ConsultaMascotas extends VentanaConsulta {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private PanelMostrarMascotas panel;
	
	private Persona nuevaP = new Persona("12345", "David", "Diaz", "Aguilar");
	private Mascota nuevaM = new Mascota("Blacky", nuevaP, Mascota.EstadoMascota.Perdido);

	public static void main(String[] args) {
		JFrame nuevo = new JFrame();
		ConsultaMascotas nueva = new ConsultaMascotas(nuevo);
		nueva.setVisible(true);
	}
	
	public ConsultaMascotas(JFrame frame) {
		super(frame, "Consulta Mascotas");
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				llenarPanel(Principal.getMascotas());
			}
			
		});
		getLblConsulta().setText("Consulta Mascotas");

		getCmbOpciones().setModel(new DefaultComboBoxModel(new String[] {"-----Seleccione-----",
				"Nombre",
				"ChipID",
				"Raza",
				"Tipo",
				"Lugar",
				"Estado",
				"En Adopcion"}));
	}
	
	public void llenarPanel(ArrayList<Mascota> mascotas){
		panel = new PanelMostrarMascotas(this);
		getScrollPanelConsulta().setViewportView(panel);
		for(Mascota mascota : mascotas){
			panel.agregarMascota(mascota);
		}
	}
}
