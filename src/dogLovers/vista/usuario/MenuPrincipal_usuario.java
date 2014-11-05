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

package dogLovers.vista.usuario;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import dogLovers.vista.PanelBase;
import dogLovers.vista.PanelLista;

public class MenuPrincipal_usuario extends JFrame {

	private static final long serialVersionUID = -6726525602807508687L;
	private JPanel panelContenido;
	private JPanel panelNoticias;

	/**** CONSTRUCTOR ****/
	public MenuPrincipal_usuario() {
		JPanel principal = new JPanel();
		setContentPane(principal);
		principal.setLayout(new BorderLayout(0, 0));

		panelNoticias = new PanelLista();
		principal.add(panelNoticias, BorderLayout.WEST);

		panelContenido = new PanelBase();
		principal.add(panelContenido, BorderLayout.CENTER);
	}

	/**** MÉTODOS ****/

}
