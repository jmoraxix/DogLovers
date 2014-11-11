/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 05/11/2014
 */

package dogLovers.vista.items;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import dogLovers.modelo.Mascota;
import dogLovers.vista.PanelConFondo;

/**
 * @author JoséDavid 05/11/2014
 */
public class itemMascota extends PanelConFondo {

	/**** MÉTODOS ****/
	private static final long serialVersionUID = -9067690228564285863L;
	JButton btnVer;

	/**** CONSTRUCTOR ****/
	public itemMascota(Mascota mascota) {
		super("fondo_item.png");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { getWidth() / 3,
				getWidth() / 3, getWidth() / 3 };
		gridBagLayout.rowHeights = new int[] { 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.7, 0.5, 0.7 };
		gridBagLayout.rowWeights = new double[] { 5.0, 5.0 };
		setLayout(gridBagLayout);

		JLabel lblpersona = new JLabel(mascota.getNombre());
		GridBagConstraints gbc_lblpersona = new GridBagConstraints();
		gbc_lblpersona.gridheight = 2;
		gbc_lblpersona.insets = new Insets(0, 0, 5, 5);
		gbc_lblpersona.gridx = 0;
		gbc_lblpersona.gridy = 0;
		add(lblpersona, gbc_lblpersona);

		JLabel lblTipo = new JLabel(mascota.getCaracteristicas()
				.getTipoMascota().toString());
		GridBagConstraints gbc_lblTipo = new GridBagConstraints();
		gbc_lblTipo.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipo.gridx = 1;
		gbc_lblTipo.gridy = 0;
		add(lblTipo, gbc_lblTipo);

		JLabel lblRaza = new JLabel(mascota.getCaracteristicas()
				.getRazaMascota().toString());
		GridBagConstraints gbc_lblRaza = new GridBagConstraints();
		gbc_lblRaza.insets = new Insets(0, 0, 5, 5);
		gbc_lblRaza.gridx = 1;
		gbc_lblRaza.gridy = 1;
		add(lblRaza, gbc_lblRaza);

		this.btnVer = new JButton("Ver mascota");
		this.btnVer.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// Coordinador.cerrarVentanaActual();
				// Coordinador.mostrarDatosMascota(mascota);
			}
		});
		GridBagConstraints gbc_btnVer = new GridBagConstraints();
		gbc_btnVer.fill = GridBagConstraints.BOTH;
		gbc_btnVer.gridheight = 2;
		gbc_btnVer.insets = new Insets(0, 0, 5, 0);
		gbc_btnVer.gridx = 2;
		gbc_btnVer.gridy = 0;
		add(this.btnVer, gbc_btnVer);
	}
}
