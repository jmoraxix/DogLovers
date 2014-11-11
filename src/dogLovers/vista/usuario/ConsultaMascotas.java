/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 09/11/2014
 */

package dogLovers.vista.usuario;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;

import dogLovers.control.Ordernamiento;
import dogLovers.control.Principal;
import dogLovers.modelo.Mascota;
import dogLovers.vista.PanelMostrarMascotas;
import dogLovers.vista.VentanaConsulta;

/**
 * @author David
 */
public class ConsultaMascotas extends VentanaConsulta {

	private static final long serialVersionUID = -5549808647673745191L;
	private JTextField textField;
	private PanelMostrarMascotas panel;

	public ConsultaMascotas() {
		getLblConsulta().setText("Consulta Mascotas");

		getCmbOpciones().setModel(
				new DefaultComboBoxModel(new String[] { "-----Seleccione-----",
						"Nombre", // 1
						"ChipID", // 2
						"Raza", // 3
						"Tipo", // 4
						"Lugar", // 5
						"Estado", // 6
						"En Adopcion" })); // 7

		llenarPanel(Principal.getMascotas());

		this.btnBuscar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (ConsultaMascotas.this.cmbOpciones.getSelectedIndex() != 0) {
					ArrayList<Mascota> mascotas = Principal.getMascotas();
					ArrayList<Mascota> res = (ArrayList<Mascota>) mascotas
							.clone();
					switch (ConsultaMascotas.this.cmbOpciones
							.getSelectedIndex()) {
					case 1:
						if (!getTxtParametro().getText().equals(""))
							for (Mascota mascota : mascotas)
								if (!mascota
										.getNombre()
										.toLowerCase()
										.contains(
												ConsultaMascotas.this.txtParametro
														.getText()
														.toLowerCase()))
									res.remove(mascota);
						Ordernamiento.ordenarFechas(res);
						llenarPanel(res);
						break;
					case 2:
						if (!getTxtParametro().getText().equals(""))
							for (Mascota mascota : mascotas)
								if (!mascota
										.getChipID()
										.toLowerCase()
										.contains(
												ConsultaMascotas.this.txtParametro
														.getText()
														.toLowerCase()))
									res.remove(mascota);
						Ordernamiento.ordenarFechas(res);
						llenarPanel(res);
						break;
					case 3:
						if (!getTxtParametro().getText().equals(""))
							for (Mascota mascota : mascotas)
								if (!mascota
										.getCaracteristicas()
										.getRazaMascota()
										.name()
										.toLowerCase()
										.contains(
												ConsultaMascotas.this.txtParametro
														.getText()
														.toLowerCase()))
									res.remove(mascota);
						Ordernamiento.ordenarFechas(res);
						llenarPanel(res);
						break;
					case 4:
						if (!getTxtParametro().getText().equals(""))
							for (Mascota mascota : mascotas)
								if (!mascota
										.getCaracteristicas()
										.getTipoMascota()
										.name()
										.toLowerCase()
										.contains(
												ConsultaMascotas.this.txtParametro
														.getText()
														.toLowerCase()))
									res.remove(mascota);
						Ordernamiento.ordenarFechas(res);
						llenarPanel(res);
						break;
					case 5:
						if (!getTxtParametro().getText().equals(""))
							for (Mascota mascota : mascotas)
								if (!mascota
										.getLugar()
										.toLowerCase()
										.contains(
												ConsultaMascotas.this.txtParametro
														.getText()
														.toLowerCase()))
									res.remove(mascota);
						Ordernamiento.ordenarFechas(res);
						llenarPanel(res);
						break;
					case 6:
						if (!getTxtParametro().getText().equals(""))
							for (Mascota mascota : mascotas)
								if (!mascota
										.getEstado()
										.toString()
										.toLowerCase()
										.contains(
												ConsultaMascotas.this.txtParametro
														.getText()
														.toLowerCase()))
									res.remove(mascota);
						Ordernamiento.ordenarFechas(res);
						llenarPanel(res);
						break;
					case 7:
						for (Mascota mascota : mascotas)
							if (!mascota.getEstado().name()
									.equals("En_Adopcion"))
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

	public void llenarPanel(ArrayList<Mascota> mascotas) {
		this.panel = new PanelMostrarMascotas(this);
		getScrollPanelConsulta().setViewportView(this.panel);
		for (Mascota mascota : mascotas) {
			this.panel.agregarMascota(mascota);
		}
	}
}
