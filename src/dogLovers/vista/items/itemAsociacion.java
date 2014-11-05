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
 * 01/11/2014
 */

package dogLovers.vista.items;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import dogLovers.modelo.Persona;
import dogLovers.vista.PanelCalificacion;
import dogLovers.vista.PanelConFondo;

public class itemAsociacion extends PanelConFondo {

	/**** VARIABLES ****/
	private static final long serialVersionUID = -6277232078401759766L;

	/**** CONSTRUCTOR ****/
	public itemAsociacion(Persona persona) {
		super("fondo_item.png");

		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { getWidth() / 3 * 2,
				getWidth() / 3 };
		gridBagLayout.rowHeights = new int[] { getHeight() };
		gridBagLayout.columnWeights = new double[] { 1.0, 0.0 };
		gridBagLayout.rowWeights = new double[] { 0.0 };
		setLayout(gridBagLayout);

		JLabel lblPersona = new JLabel(persona.getNombre() + " "
				+ persona.getApellido1());
		lblPersona.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_lblPersona = new GridBagConstraints();
		gbc_lblPersona.anchor = GridBagConstraints.WEST;
		gbc_lblPersona.insets = new Insets(0, 0, 5, 5);
		gbc_lblPersona.gridx = 0;
		gbc_lblPersona.gridy = 0;
		add(lblPersona, gbc_lblPersona);

		PanelCalificacion panelCalificacion = new PanelCalificacion(persona);
		GridBagConstraints gbc_panelCalificacion = new GridBagConstraints();
		gbc_panelCalificacion.insets = new Insets(0, 0, 5, 0);
		gbc_panelCalificacion.gridx = 1;
		gbc_panelCalificacion.gridy = 0;
		add(panelCalificacion, gbc_panelCalificacion);

	}
}
