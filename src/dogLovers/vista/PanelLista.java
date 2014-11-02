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

package dogLovers.vista;

import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

/**
 * @author JoséDavid 01/11/2014
 */
public class PanelLista extends PanelConFondo {

	private static final long serialVersionUID = 5718919475108456796L;

	ArrayList<JPanel> itemes = new ArrayList<JPanel>();

	public PanelLista(ArrayList<JPanel> itemes) {
		super("fondo_lista.png");
		this.itemes = itemes;

		JScrollPane scrollPane = new JScrollPane();
		scrollPane
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 0, this.getWidth(), this.getHeight());
		add(scrollPane);
	}
}
