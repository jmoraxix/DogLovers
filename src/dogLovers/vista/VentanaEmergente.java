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
 * 25/10/2014
 */

package dogLovers.vista;

import java.awt.Dialog;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * @author JoséDavid 25/10/2014
 */
public class VentanaEmergente extends JDialog {

	private static final long serialVersionUID = 3188537839801069432L;
	private JPanel panel;

	public VentanaEmergente(JFrame frame, String title, String fondo) {
		super(frame, title, true);
		setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(frame);
		setSize(650, 480);

		panel = new PanelConFondo(fondo);
		setContentPane(panel);
	}
}
