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

import java.awt.GridBagLayout;

import javax.swing.JButton;

import java.awt.GridBagConstraints;
import java.awt.Panel;
import java.awt.Insets;

import javax.swing.JComboBox;
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
public class ConsultaMascotas extends VentanaBase {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private PanelMostrarMascotas panel;
	
	private Persona nuevaP = new Persona("12345", "David", "Diaz", "Aguilar");
	private Mascota nuevaM = new Mascota("Blacky", nuevaP, Mascota.EstadoMascota.Perdido);

	public static void main(String[] args) {
		ConsultaMascotas nueva = new ConsultaMascotas();
		nueva.setVisible(true);
	}
	
	public ConsultaMascotas() {
		PanelBase panelPrincipal = new PanelBase();
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		panel = new PanelMostrarMascotas(this);
		panel.setBounds(10, 69, 878, 323);
		panelPrincipal.add(panel);
		
		JLabel lblConsultaDeMascotas = new JLabel("Consulta de Mascotas");
		lblConsultaDeMascotas.setBounds(10, 11, 117, 14);
		panelPrincipal.add(lblConsultaDeMascotas);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-----Seleccione-----", "Lugar", "Chip", "Estado", "Raza", "Tipo", "Nombre", "En Adopcion"}));
		comboBox.setBounds(10, 419, 283, 25);
		panelPrincipal.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(10, 455, 283, 25);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/**DATOS DE PRUEBA**/
				nuevaP.setUbicacion("San Jose");
				nuevaP.setNumTelefono("87474669");
				nuevaP.setCorreo("david.diaz95@outlook.com");
				
				nuevaM.setChipID("12340");
				nuevaM.setColor("Negro");
				nuevaM.setLugar("San JoseM");
				java.util.Date fecha = new Date();
				nuevaM.setFecha(fecha);
				
				Principal.addMascota(nuevaM);
				
				llenarPanel(Principal.getMascotas());
			}
		});
		btnBuscar.setBounds(10, 491, 283, 25);
		panelPrincipal.add(btnBuscar);
	}
	
	public void llenarPanel(ArrayList<Mascota> mascotas){
		panel = new PanelMostrarMascotas(this);

		for(Mascota mascota : mascotas){
			panel.agregarMascota(mascota);
		}
	}
}
