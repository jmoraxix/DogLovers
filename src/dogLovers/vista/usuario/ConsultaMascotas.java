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

import dogLovers.control.Ordernamiento;
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
	private Mascota nuevaM = new Mascota("Blacky", nuevaP, Mascota.EstadoMascota.En_Adopcion);

	public static void main(String[] args) {
		JFrame nuevo = new JFrame();
		ConsultaMascotas nueva = new ConsultaMascotas(nuevo);
		nueva.setVisible(true);
	}
	
	public ConsultaMascotas(JFrame frame) {
		super(frame, "Consulta Mascotas");
		
		getLblConsulta().setText("Consulta Mascotas");

		getCmbOpciones().setModel(new DefaultComboBoxModel(new String[] {"-----Seleccione-----",
				"Nombre", //1
				"ChipID", //2
				"Raza", //3
				"Tipo", //4
				"Lugar", //5
				"Estado", //6
				"En Adopcion"})); //7
		
		/**DATOS DE PRUEBA**/

		nuevaP.setUbicacion("San Jose");
		nuevaP.setNumTelefono("87474669");
		nuevaP.setCorreo("david.diaz95@outlook.com");

		nuevaM.setChipID("12340");
		nuevaM.setColor("Negro");
		nuevaM.setLugar("San Jose");
		java.util.Date fecha = new Date();
		nuevaM.setFecha(fecha);
		Principal.addMascota(nuevaM);
		
		llenarPanel(Principal.getMascotas());
		
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cmbOpciones.getSelectedIndex() != 0){
					ArrayList<Mascota> mascotas = Principal.getMascotas();
					ArrayList<Mascota> res = (ArrayList<Mascota>) mascotas.clone();
						switch (cmbOpciones.getSelectedIndex()) {
						case 1:
							if (!getTxtParametro().getText().equals(""))
								for (Mascota mascota : mascotas)
									if (!mascota.getNombre().toLowerCase().contains(txtParametro.getText().toLowerCase()))
										res.remove(mascota);
							Ordernamiento.ordenarFechas(res);
							llenarPanel(res);
							break;
						case 2:
							if (!getTxtParametro().getText().equals(""))
								for (Mascota mascota : mascotas)
									if (!mascota.getChipID().toLowerCase().contains(txtParametro.getText().toLowerCase()))
										res.remove(mascota);
							Ordernamiento.ordenarFechas(res);
							llenarPanel(res);
							break;
						case 3:
							if (!getTxtParametro().getText().equals(""))
								for (Mascota mascota : mascotas)
									if (!mascota.getCaracteristicas().getRazaMascota().name().toLowerCase().contains(txtParametro.getText().toLowerCase()))
										res.remove(mascota);
							Ordernamiento.ordenarFechas(res);
							llenarPanel(res);
							break;
						case 4:
							if (!getTxtParametro().getText().equals(""))
								for (Mascota mascota : mascotas)
									if (!mascota.getCaracteristicas().getTipoMascota().name().toLowerCase().contains(txtParametro.getText().toLowerCase()))
										res.remove(mascota);
							Ordernamiento.ordenarFechas(res);
							llenarPanel(res);
							break;
						case 5:
							if (!getTxtParametro().getText().equals(""))
								for (Mascota mascota : mascotas)
									if (!mascota.getLugar().toLowerCase().contains(txtParametro.getText().toLowerCase()))
										res.remove(mascota);
							Ordernamiento.ordenarFechas(res);
							llenarPanel(res);
							break;
						case 6:
							if (!getTxtParametro().getText().equals(""))
								for (Mascota mascota : mascotas)
									if (!mascota.getEstado().toString().toLowerCase().contains(txtParametro.getText().toLowerCase()))
										res.remove(mascota);
							Ordernamiento.ordenarFechas(res);
							llenarPanel(res);
							break;
						case 7:
							for (Mascota mascota : mascotas)
								if (!mascota.getEstado().name().equals("En_Adopcion"))
									res.remove(mascota);
							Ordernamiento.ordenarFechas(res);
							llenarPanel(res);
							break;
							
						default:
						}
				}
			}
			
		});
		
	}
	
	public void llenarPanel(ArrayList<Mascota> mascotas){
		panel = new PanelMostrarMascotas(this);
		getScrollPanelConsulta().setViewportView(panel);
		for(Mascota mascota : mascotas){
			panel.agregarMascota(mascota);
		}
	}
}
