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

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * @author Josï¿½David 01/11/2014
 */
public class PanelLista extends JPanel {

	private static final long serialVersionUID = 5718919475108456796L;

	/**** VARIABLES ****/
	ArrayList<JPanel> itemes = new ArrayList<JPanel>();
	PanelConFondo panel;
	GridBagConstraints valoresGrid;

	/**** CONSTRUCTOR ****/
	public PanelLista() {
		inicializarPanel();
	}

	public PanelLista(ArrayList<JPanel> itemes) {
		inicializarPanel();

		if (!itemes.isEmpty())
			for (JPanel item : itemes)
				addRow(item);
	}

	/**** MÉTODOS ****/
	private void inicializarPanel() {
		setLayout(new BorderLayout(0, 0));

		panel = new PanelConFondo("fondo_lista.png");
		panel.setLayout(new GridBagLayout());
		GridBagConstraints valoresGrid = new GridBagConstraints();
		valoresGrid.fill = GridBagConstraints.BOTH;
		valoresGrid.weightx = 0.5;
		valoresGrid.weighty = 1;

		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setOpaque(false);
		add(scrollPane, BorderLayout.CENTER);
	}

	public void addRow(JPanel row) {
		this.itemes.add(row);
		panel.add(row, valoresGrid);
	}
}
