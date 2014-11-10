/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 08/11/2014
 */

package dogLovers.vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import dogLovers.control.Coordinador;
import dogLovers.control.Principal;
import dogLovers.control.exeptions.UserErrorException;
import dogLovers.modelo.Usuario;

/**
 * @author JoséDavid 08/11/2014
 */
public class Login extends VentanaBase {

	private static final long serialVersionUID = 3788001080198467883L;
	private JPasswordField txtContrasena;
	private JPasswordField txtContrasea_1;
	private JTextField txtUsuario_1;
	private JPasswordField txtConfirmarContrasena;
	private static JTextField txtUsuario;

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
		gbl_panelCrear.columnWidths = new int[] { 0, 0, 0, 0 };
		gbl_panelCrear.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panelCrear.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0 };
		gbl_panelCrear.rowWeights = new double[] { 2.0, 0.0, 0.0, 0.0, 1.0 };
		panelCrear.setLayout(gbl_panelCrear);

		JLabel lblCrearUsuario = new JLabel("Crear usuario");
		lblCrearUsuario.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblCrearUsuario = new GridBagConstraints();
		gbc_lblCrearUsuario.anchor = GridBagConstraints.SOUTHWEST;
		gbc_lblCrearUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearUsuario.gridx = 1;
		gbc_lblCrearUsuario.gridy = 0;
		panelCrear.add(lblCrearUsuario, gbc_lblCrearUsuario);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
		gbc_lblUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario.gridx = 1;
		gbc_lblUsuario.gridy = 1;
		panelCrear.add(lblUsuario, gbc_lblUsuario);

		txtUsuario = new JTextField();
		GridBagConstraints gbc_txtUsuario = new GridBagConstraints();
		gbc_txtUsuario.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario.gridx = 2;
		gbc_txtUsuario.gridy = 1;
		panelCrear.add(txtUsuario, gbc_txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblContrasea = new GridBagConstraints();
		gbc_lblContrasea.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea.gridx = 1;
		gbc_lblContrasea.gridy = 2;
		panelCrear.add(lblContrasea, gbc_lblContrasea);

		this.txtContrasena = new JPasswordField();
		GridBagConstraints gbc_txtContrasena = new GridBagConstraints();
		gbc_txtContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_txtContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContrasena.gridx = 2;
		gbc_txtContrasena.gridy = 2;
		panelCrear.add(this.txtContrasena, gbc_txtContrasena);
		this.txtContrasena.setColumns(10);

		JLabel lblConfirmarContrasea = new JLabel("Confirmar contrase\u00F1a:");
		lblConfirmarContrasea.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblConfirmarContrasea = new GridBagConstraints();
		gbc_lblConfirmarContrasea.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblConfirmarContrasea.insets = new Insets(0, 0, 5, 5);
		gbc_lblConfirmarContrasea.gridx = 1;
		gbc_lblConfirmarContrasea.gridy = 3;
		panelCrear.add(lblConfirmarContrasea, gbc_lblConfirmarContrasea);

		this.txtConfirmarContrasena = new JPasswordField();
		GridBagConstraints gbc_txtConfirmarContrasena = new GridBagConstraints();
		gbc_txtConfirmarContrasena.insets = new Insets(0, 0, 5, 5);
		gbc_txtConfirmarContrasena.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtConfirmarContrasena.gridx = 2;
		gbc_txtConfirmarContrasena.gridy = 3;
		panelCrear.add(this.txtConfirmarContrasena, gbc_txtConfirmarContrasena);
		this.txtConfirmarContrasena.setColumns(10);

		JButton btnCrear = new JButton("Crear");
		btnCrear.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if ((txtUsuario.getText().isEmpty())
						|| (Login.this.txtContrasena.getPassword().length <= 0)
						|| (Login.this.txtConfirmarContrasena.getPassword().length <= 0)) {
					JOptionPane.showMessageDialog(Coordinador.getLogin(),
							"Campos requeridos vacios", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (verificarUsuarioExistente(txtUsuario.getText())) {
						JOptionPane.showMessageDialog(Coordinador.getLogin(),
								"El Usuario ya existe", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						if (validaContrasena(
								Login.this.txtConfirmarContrasena.getPassword(),
								Login.this.txtContrasena.getPassword())) {
							Usuario user = new Usuario(txtUsuario.getText(),
									Login.this.txtContrasena.getPassword()
											.toString(), false);
							Coordinador.mostrarCrearUsuario(user);
							Coordinador.ocultarLogin();
							limpiarDatos();

						} else {

							JOptionPane.showMessageDialog(
									Coordinador.getLogin(),
									"La confirmación de la contraseña no coincide con la contraseña",
									"Error", JOptionPane.ERROR_MESSAGE);

						}
					}
				}
			}
		});
		btnCrear.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent ke) {
				if ((txtUsuario.getText().isEmpty())
						|| (Login.this.txtContrasena.getPassword().length <= 0)
						|| (Login.this.txtConfirmarContrasena.getPassword().length <= 0)) {
					JOptionPane.showMessageDialog(Coordinador.getLogin(),
							"Campos requeridos vacios", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					if (verificarUsuarioExistente(txtUsuario.getText())) {
						JOptionPane.showMessageDialog(Coordinador.getLogin(),
								"El Usuario ya existe", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						if (validaContrasena(
								Login.this.txtConfirmarContrasena.getPassword(),
								Login.this.txtContrasena.getPassword())) {
							Usuario user = new Usuario(txtUsuario.getText(),
									Login.this.txtContrasena.getPassword()
											.toString(), false);
							Coordinador.mostrarCrearUsuario(user);
							Coordinador.ocultarLogin();
							limpiarDatos();
						} else {
							JOptionPane.showMessageDialog(
									Coordinador.getLogin(),
									"La confirmación de la contraseña no coincide con la contraseña",
									"Error", JOptionPane.ERROR_MESSAGE);

						}
					}
				}
			}
		});
		btnCrear.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_btnCrear = new GridBagConstraints();
		gbc_btnCrear.insets = new Insets(0, 0, 0, 5);
		gbc_btnCrear.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnCrear.gridx = 2;
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
		gbl_panelIngresar.columnWidths = new int[] { 0, 0, 0, 0, 0 };
		gbl_panelIngresar.rowHeights = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panelIngresar.columnWeights = new double[] { 1.0, 0.0, 1.0, 1.0,
				Double.MIN_VALUE };
		gbl_panelIngresar.rowWeights = new double[] { 2.0, 0.0, 0.0, 0.0, 1.0,
				Double.MIN_VALUE };
		panelIngresar.setLayout(gbl_panelIngresar);

		JLabel lblIngresar = new JLabel("Ingresar");
		lblIngresar.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblIngresar = new GridBagConstraints();
		gbc_lblIngresar.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngresar.gridx = 1;
		gbc_lblIngresar.gridy = 1;
		panelIngresar.add(lblIngresar, gbc_lblIngresar);

		JLabel lblUsuario_1 = new JLabel("Usuario:");
		lblUsuario_1.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblUsuario_1 = new GridBagConstraints();
		gbc_lblUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsuario_1.anchor = GridBagConstraints.WEST;
		gbc_lblUsuario_1.gridx = 1;
		gbc_lblUsuario_1.gridy = 2;
		panelIngresar.add(lblUsuario_1, gbc_lblUsuario_1);

		this.txtUsuario_1 = new JTextField();
		GridBagConstraints gbc_txtUsuario_1 = new GridBagConstraints();
		gbc_txtUsuario_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsuario_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsuario_1.gridx = 2;
		gbc_txtUsuario_1.gridy = 2;
		panelIngresar.add(this.txtUsuario_1, gbc_txtUsuario_1);
		this.txtUsuario_1.setColumns(10);

		JLabel lblContrasea_1 = new JLabel("Contrase\u00F1a:");
		lblContrasea_1.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblContrasea_1 = new GridBagConstraints();
		gbc_lblContrasea_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblContrasea_1.anchor = GridBagConstraints.WEST;
		gbc_lblContrasea_1.gridx = 1;
		gbc_lblContrasea_1.gridy = 3;
		panelIngresar.add(lblContrasea_1, gbc_lblContrasea_1);

		this.txtContrasea_1 = new JPasswordField();
		GridBagConstraints gbc_txtContrasea_1 = new GridBagConstraints();
		gbc_txtContrasea_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtContrasea_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtContrasea_1.gridx = 2;
		gbc_txtContrasea_1.gridy = 3;
		panelIngresar.add(this.txtContrasea_1, gbc_txtContrasea_1);
		this.txtContrasea_1.setColumns(10);

		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setFont(Principal.getLetratexto3());
		btnIngresar.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if ((Login.this.txtUsuario_1.getText().isEmpty())
						|| (Login.this.txtContrasea_1.getPassword().length <= 0)) {
					JOptionPane.showMessageDialog(Coordinador.getLogin(),
							"Campos requeridos vacios", "Error",
							JOptionPane.ERROR_MESSAGE);
				} else {
					verifSesion();
				}
			}
		});
		btnIngresar.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
					if ((Login.this.txtUsuario_1.getText().isEmpty())
							|| (Login.this.txtContrasea_1.getPassword().length <= 0)) {
						JOptionPane.showMessageDialog(Coordinador.getLogin(),
								"Campos requeridos vacios", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {
						verifSesion();

					}
				}
			}
		});
		GridBagConstraints gbc_btnIngresar = new GridBagConstraints();
		gbc_btnIngresar.anchor = GridBagConstraints.NORTHEAST;
		gbc_btnIngresar.insets = new Insets(0, 0, 0, 5);
		gbc_btnIngresar.gridx = 2;
		gbc_btnIngresar.gridy = 4;
		panelIngresar.add(btnIngresar, gbc_btnIngresar);

	}

	/**** METODOS ****/
	private void verifSesion() {
		try {

			Usuario sesion = Principal.verificarSesion(
					this.txtUsuario_1.getText(),
					String.valueOf(this.txtContrasea_1.getPassword()));
			Principal.setSESION_USUARIO(sesion);
			if (sesion.esAdministrador()) {
				System.out.println("Admin");
				limpiarDatos();
			} else {
				System.out.println("User");
				Coordinador.mostrarMenuPrincipal_usuario();
				Coordinador.ocultarLogin();
				limpiarDatos();
			}

		} catch (UserErrorException e) {
			JOptionPane.showMessageDialog(Coordinador.getLogin(),
					"Usuario o contraseña erróneos.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

	public static boolean verificarUsuarioExistente(String usr) {
		boolean existe = false;
		for (Usuario usuario : Principal.getUsuarios()) {
			if (usuario.getUsuario().equals(txtUsuario))
				existe = true;
		}
		return existe;

	}

	private boolean validaContrasena(char[] pass1, char[] pass2) {
		boolean valor = true;
		int puntero = 0;
		if (pass1.length != pass2.length) {
			valor = false;
		} else {
			while ((valor) && (puntero < pass1.length)) {
				if (pass1[puntero] != pass2[puntero]) {
					valor = false;
				}
				puntero++;
			}
		}
		return valor;
	}
	
	public void limpiarDatos(){
		txtUsuario.setText("");
		txtContrasena.setText("");
		txtConfirmarContrasena.setText("");
		txtUsuario_1.setText("");
		txtContrasea_1.setText("");
		
	}

}
