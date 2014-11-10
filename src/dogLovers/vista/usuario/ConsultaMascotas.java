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

import javax.swing.DefaultComboBoxModel;

/**
 * @author David
 *
 */
public class ConsultaMascotas extends VentanaBase {
	
	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private PanelMostrarMascotas panel;

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
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"-----Seleccione-----", "C\u00E9dula", "Nombre", "Primer apellido", "Segundo apellido", "Tipo", "Pr\\u00E9stamos"}));
		comboBox.setBounds(10, 419, 283, 25);
		panelPrincipal.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(10, 455, 283, 25);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Persona nueva = new Persona("1234", "David", "Diaz", "Aguilar");
				Mascota nuevaM = new Mascota("Blacky", nueva, Mascota.EstadoMascota.Perdido);
				panel.agregarMascota(nuevaM);				
			}
		});
		btnBuscar.setBounds(10, 491, 283, 25);
		panelPrincipal.add(btnBuscar);
	}	
}
