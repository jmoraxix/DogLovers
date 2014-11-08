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
 * 08/11/2014
 */
package dogLovers.vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author JoséDavid 08/11/2014
 */
public class Login extends VentanaBase {

	private static final long serialVersionUID = 3788001080198467883L;

	public Login() {
		PanelBase panel = new PanelBase();
		setContentPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 1.0, 0.0, 0.0 };
		gbl_panel.rowWeights = new double[] { 0.0, 1.0, 0.1, 0.1 };
		panel.setLayout(gbl_panel);

		JPanel panelCrear = new JPanel();
		panelCrear.setOpaque(false);
		GridBagConstraints gbc_panelCrear = new GridBagConstraints();
		gbc_panelCrear.fill = GridBagConstraints.BOTH;
		gbc_panelCrear.insets = new Insets(0, 0, 0, 5);
		gbc_panelCrear.gridx = 1;
		gbc_panelCrear.gridy = 1;
		panel.add(panelCrear, gbc_panelCrear);
		GridBagLayout gbl_panelCrear = new GridBagLayout();
		gbl_panelCrear.columnWidths = new int[] { 0, 0, 0 };
		gbl_panelCrear.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panelCrear.columnWeights = new double[] { 0.7, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_panelCrear.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panelCrear.setLayout(gbl_panelCrear);

		JLabel lblCrearUsuario = new JLabel("Crear usuario");
		GridBagConstraints gbc_lblCrearUsuario = new GridBagConstraints();
		gbc_lblCrearUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblCrearUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearUsuario.gridx = 0;
		gbc_lblCrearUsuario.gridy = 0;
		panelCrear.add(lblCrearUsuario, gbc_lblCrearUsuario);

		JLabel lblUsuario = new JLabel("Usuario:");
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 0;
		gbc_lblUsuario.gridy = 1;
		panelCrear.add(lblUsuario, gbc_lblUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.anchor = GridBagConstraints.WEST;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 0;
		gbc_lblContrasea.gridy = 2;
		panelCrear.add(lblContrasea, gbc_lblContrasea);

		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a:");
		GridBagConstraints gbc_lblConfirmarContrasea = new GridBagConstraints();
		gbc_lblConfirmarContrasea.anchor = GridBagConstraints.WEST;
		gbc_lblConfirmarContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarContrasea.gridx = 0;
		gbc_lblConfirmarContrasea.gridy = 3;
		panelCrear.add(lblConfirmarContrasea, gbc_lblConfirmarContrasea);

		JButton btnCrear = new JButton("Crear");
		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.gridx = 1;
		gbc_btnCrear.gridy = 4;
		panelCrear.add(btnCrear, gbc_btnCrear);

		JPanel panelIngresar = new JPanel();
		panelIngresar.setOpaque(false);
		GridBagConstraints gbc_panelIngresar = new GridBagConstraints();
		gbc_panelIngresar.fill = GridBagConstraints.BOTH;
		gbc_panelIngresar.gridx = 3;
		gbc_panelIngresar.gridy = 1;
		panel.add(panelIngresar, gbc_panelIngresar);
		GridBagLayout gbl_panelIngresar = new GridBagLayout();
		gbl_panelIngresar.columnWidths = new int[] { 0 };
		gbl_panelIngresar.rowHeights = new int[] { 0 };
		gbl_panelIngresar.columnWeights = new double[] { Double.MIN_VALUE };
		gbl_panelIngresar.rowWeights = new double[] { Double.MIN_VALUE };
		panelIngresar.setLayout(gbl_panelIngresar);

	}
}
