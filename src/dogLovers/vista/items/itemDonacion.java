package dogLovers.vista.items;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;

import dogLovers.modelo.Persona;
import dogLovers.vista.PanelConFondo;

public class itemDonacion extends PanelConFondo {

	private static final long serialVersionUID = -7467954473287772854L;

	public itemDonacion(double monto, Persona persona) {
		super("fondo_item.png");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { getWidth() / 3,
				getWidth() / 3 * 2 };
		gridBagLayout.rowHeights = new int[] { getHeight() };
		gridBagLayout.columnWeights = new double[] { 0.5, 1.0 };
		gridBagLayout.rowWeights = new double[] { 0.0 };
		setLayout(gridBagLayout);

		JLabel lblmonto = new JLabel(String.valueOf(monto));
		GridBagConstraints gbc_lblmonto = new GridBagConstraints();
		gbc_lblmonto.insets = new Insets(0, 0, 0, 5);
		gbc_lblmonto.gridx = 0;
		gbc_lblmonto.gridy = 0;
		add(lblmonto, gbc_lblmonto);

		JLabel lblPersona = new JLabel(persona.getNombre() + " "
				+ persona.getApellido1());
		GridBagConstraints gbc_lblPersona = new GridBagConstraints();
		gbc_lblPersona.gridx = 1;
		gbc_lblPersona.gridy = 0;
		add(lblPersona, gbc_lblPersona);
	}
}
