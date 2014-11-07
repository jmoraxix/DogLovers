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
 * 05/11/2014
 */
package dogLovers.vista.items;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;

import dogLovers.modelo.CasaCuna;
import dogLovers.vista.PanelCalificacion;
import dogLovers.vista.PanelConFondo;

/**
 * @author JoséDavid 05/11/2014
 */
public class itemCasaCuna extends PanelConFondo {

	/**** VARIABLES ****/
	private static final long serialVersionUID = 4953306017864720827L;

	/**** CONSTRUCTOR ****/
	public itemCasaCuna(CasaCuna casaCuna) {
		super("fondo_item.png");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { getWidth() / 3,
				getWidth() / 3, getWidth() / 3 };
		gridBagLayout.rowHeights = new int[] { 0 };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.7, 0.0 };
		gridBagLayout.rowWeights = new double[] { 1.0 };
		setLayout(gridBagLayout);

		JLabel lblPersona = new JLabel(casaCuna.getPersonaResponsable()
				.getNombre()
				+ " "
				+ casaCuna.getPersonaResponsable().getApellido1());
		GridBagConstraints gbc_lblPersona = new GridBagConstraints();
		gbc_lblPersona.insets = new Insets(0, 0, 0, 5);
		gbc_lblPersona.gridx = 0;
		gbc_lblPersona.gridy = 0;
		add(lblPersona, gbc_lblPersona);

		JLabel lblLugar = new JLabel(casaCuna.getPersonaResponsable()
				.getUbicacion());
		GridBagConstraints gbc_lblLugar = new GridBagConstraints();
		gbc_lblLugar.insets = new Insets(0, 0, 0, 5);
		gbc_lblLugar.gridx = 1;
		gbc_lblLugar.gridy = 0;
		add(lblLugar, gbc_lblLugar);

		PanelCalificacion panelCalificacion = new PanelCalificacion(
				casaCuna.getPersonaResponsable());
		GridBagConstraints gbc_panelCalificacion = new GridBagConstraints();
		gbc_panelCalificacion.fill = GridBagConstraints.BOTH;
		gbc_panelCalificacion.gridx = 2;
		gbc_panelCalificacion.gridy = 0;
		add(panelCalificacion, gbc_panelCalificacion);

	}

}
