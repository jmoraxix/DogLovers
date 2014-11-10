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
 * 9/11/2014
 */
package dogLovers.vista.usuario;

import java.awt.*;

import dogLovers.control.Principal;
import dogLovers.vista.*;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

/**
 * @author Róger 9/11/2014
 */
public class CrearUsuario extends VentanaBase {


	private static final long serialVersionUID = -4636032409756183301L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblRegistrar;
	private JLabel lblIdentificacion;
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblApellido_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public CrearUsuario() {
		PanelBase panel = new PanelBase();
		setContentPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panelRegistro = new JPanel();
		panelRegistro.setOpaque(false);
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 1;
		panel.add(panelRegistro, gbc_panel);
		GridBagLayout gbl_panelRegistro = new GridBagLayout();
		gbl_panelRegistro.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_panelRegistro.rowHeights = new int[]{ 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelRegistro.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.2, 1.0};
		gbl_panelRegistro.rowWeights = new double[]{ 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0};
		panelRegistro.setLayout(gbl_panelRegistro);
		
		JLabel lblRegistrar_1 = new JLabel("Registrar");
		lblRegistrar_1.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblRegistrar_1 = new GridBagConstraints();
		gbc_lblRegistrar_1.anchor = GridBagConstraints.SOUTH;
		gbc_lblRegistrar_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistrar_1.gridx = 3;
		gbc_lblRegistrar_1.gridy = 0;
		panelRegistro.add(lblRegistrar_1, gbc_lblRegistrar_1);
		
		JLabel lblLosCampos = new JLabel("Los campos");
		lblLosCampos.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblLosCampos = new GridBagConstraints();
		gbc_lblLosCampos.anchor = GridBagConstraints.EAST;
		gbc_lblLosCampos.insets = new Insets(0, 0, 5, 5);
		gbc_lblLosCampos.gridx = 1;
		gbc_lblLosCampos.gridy = 1;
		panelRegistro.add(lblLosCampos, gbc_lblLosCampos);
		
		JLabel lblConAsterisco = new JLabel("con asterisco (*)");
		lblConAsterisco.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblConAsterisco = new GridBagConstraints();
		gbc_lblConAsterisco.anchor = GridBagConstraints.WEST;
		gbc_lblConAsterisco.insets = new Insets(0, 0, 5, 5);
		gbc_lblConAsterisco.gridx = 2;
		gbc_lblConAsterisco.gridy = 1;
		panelRegistro.add(lblConAsterisco, gbc_lblConAsterisco);
		
		JLabel lblSonRequeridos = new JLabel(" son requeridos.");
		lblSonRequeridos.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblSonRequeridos = new GridBagConstraints();
		gbc_lblSonRequeridos.anchor = GridBagConstraints.WEST;
		gbc_lblSonRequeridos.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonRequeridos.gridx = 3;
		gbc_lblSonRequeridos.gridy = 1;
		panelRegistro.add(lblSonRequeridos, gbc_lblSonRequeridos);
		
		JLabel lblCedula = new JLabel("C\u00E9dula: *");
		lblCedula.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblCedula = new GridBagConstraints();
		gbc_lblCedula.insets = new Insets(0, 0, 5, 5);
		gbc_lblCedula.anchor = GridBagConstraints.WEST;
		gbc_lblCedula.gridx = 1;
		gbc_lblCedula.gridy = 3;
		panelRegistro.add(lblCedula, gbc_lblCedula);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 3;
		panelRegistro.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblApellido1 = new JLabel("1\u00BA Apellido: *");
		lblApellido1.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.anchor = GridBagConstraints.WEST;
		gbc_lblApellido.gridx = 4;
		gbc_lblApellido.gridy = 3;
		panelRegistro.add(lblApellido1, gbc_lblApellido);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 5;
		gbc_textField_1.gridy = 3;
		panelRegistro.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNombre_1 = new JLabel("Nombre: *");
		GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
		lblNombre_1.setFont(Principal.getLetratexto3());
		gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_1.anchor = GridBagConstraints.WEST;
		gbc_lblNombre_1.gridx = 1;
		gbc_lblNombre_1.gridy = 4;
		panelRegistro.add(lblNombre_1, gbc_lblNombre_1);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 4;
		panelRegistro.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblApellido2 = new JLabel("2\u00BA Apellido: *");
		lblApellido2.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblApellido2 = new GridBagConstraints();
		gbc_lblApellido2.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido2.anchor = GridBagConstraints.WEST;
		gbc_lblApellido2.gridx = 4;
		gbc_lblApellido2.gridy = 4;
		panelRegistro.add(lblApellido2, gbc_lblApellido2);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 5;
		gbc_textField.gridy = 4;
		panelRegistro.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono: *");
		lblTelefono.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 5;
		panelRegistro.add(lblTelefono, gbc_lblTelefono);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 2;
		gbc_textField_4.gridy = 5;
		panelRegistro.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCorreo = new JLabel("Correo: *");
		lblCorreo.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.anchor = GridBagConstraints.WEST;
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 4;
		gbc_lblCorreo.gridy = 5;
		panelRegistro.add(lblCorreo, gbc_lblCorreo);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 5;
		gbc_textField_5.gridy = 5;
		panelRegistro.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblUbicacion = new JLabel("Ubicaci\u00F3n:");
		lblUbicacion.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblUbicacion = new GridBagConstraints();
		gbc_lblUbicacion.anchor = GridBagConstraints.WEST;
		gbc_lblUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblUbicacion.gridx = 1;
		gbc_lblUbicacion.gridy = 6;
		panelRegistro.add(lblUbicacion, gbc_lblUbicacion);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 2;
		gbc_textField_6.gridy = 6;
		panelRegistro.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 4;
		gbc_btnGuardar.gridy = 7;
		panelRegistro.add(btnGuardar, gbc_btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 5;
		gbc_btnCancelar.gridy = 7;
		panelRegistro.add(btnCancelar, gbc_btnCancelar);
		
	}

}
