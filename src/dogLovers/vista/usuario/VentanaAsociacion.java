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
package dogLovers.vista.usuario;

import java.awt.GridBagLayout;

import javax.swing.JFrame;

import dogLovers.control.Principal;
import dogLovers.vista.PanelBase;

/**
 * @author JoséDavid 07/11/2014
 */
public class VentanaAsociacion extends JFrame {

	private static final long serialVersionUID = 2146084712033774078L;
	PanelBase panelPrincipal;

	public VentanaAsociacion() {
		setSize(Principal.getAncho(), Principal.getAlto());

		panelPrincipal = new PanelBase();
		setContentPane(panelPrincipal);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0 };
		gridBagLayout.rowHeights = new int[] { 0 };
		gridBagLayout.columnWeights = new double[] { Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { Double.MIN_VALUE };
		panelPrincipal.setLayout(gridBagLayout);
		inicializarPanel();
	}

	private void inicializarPanel() {

	}
}
