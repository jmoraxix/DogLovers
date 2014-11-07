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
 * 07/11/2014
 */
package dogLovers.vista.items;

import java.awt.GridBagLayout;

import dogLovers.vista.PanelConFondo;

/**
 * @author JoséDavid 07/11/2014
 */
public class ItemAnuncio extends PanelConFondo {

	private static final long serialVersionUID = 8812804095479109564L;

	public ItemAnuncio(Object objeto) {
		super("fondo_item.png");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0 };
		gridBagLayout.rowHeights = new int[] { 0 };
		gridBagLayout.columnWeights = new double[] { Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { Double.MIN_VALUE };
		setLayout(gridBagLayout);

	}
}
