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
import javax.swing.JTextField;

import dogLovers.control.Coordinador;
import dogLovers.control.Principal;
import dogLovers.modelo.Persona;
import dogLovers.modelo.Usuario;
import dogLovers.vista.PanelBase;
import dogLovers.vista.VentanaBase;
/**
 * @author Róger 9/11/2014
 */
public class CrearUsuario extends VentanaBase {


	private static final long serialVersionUID = -4636032409756183301L;
	private JTextField txtApellido2_1;
	private JTextField txtApellido1_1;
	private JTextField txtNombre_1;
	private static JTextField txtCedula;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtUbicacion;
	private JLabel lblCedula;
	private JLabel lblNombre_1;
	private JLabel lblApellido1_1;
	private JLabel lblApellido2_1;
	private JLabel lblUbicacion;
	private JLabel lblCorreo;
	private Usuario usuario;

	public CrearUsuario( ) {
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

		JLabel lblSonRequeridos = new JLabel("son requeridos.");
		lblSonRequeridos.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblSonRequeridos = new GridBagConstraints();
		gbc_lblSonRequeridos.anchor = GridBagConstraints.WEST;
		gbc_lblSonRequeridos.insets = new Insets(0, 0, 5, 5);
		gbc_lblSonRequeridos.gridx = 3;
		gbc_lblSonRequeridos.gridy = 1;
		panelRegistro.add(lblSonRequeridos, gbc_lblSonRequeridos);

		lblCedula = new JLabel("C\u00E9dula: *");
		lblCedula.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblCedula = new GridBagConstraints();
		gbc_lblCedula.insets = new Insets(0, 0, 5, 5);
		gbc_lblCedula.anchor = GridBagConstraints.WEST;
		gbc_lblCedula.gridx = 1;
		gbc_lblCedula.gridy = 3;
		panelRegistro.add(lblCedula, gbc_lblCedula);

		txtCedula = new JTextField();
		soloNumeros(txtCedula);
		GridBagConstraints gbc_txtCedula = new GridBagConstraints();
		gbc_txtCedula.insets = new Insets(0, 0, 5, 5);
		gbc_txtCedula.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCedula.gridx = 2;
		gbc_txtCedula.gridy = 3;
		panelRegistro.add(txtCedula, gbc_txtCedula);
		txtCedula.setColumns(10);

		lblApellido1_1 = new JLabel("1\u00BA Apellido: *");
		lblApellido1_1.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblApellido1_1 = new GridBagConstraints();
		gbc_lblApellido1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido1_1.anchor = GridBagConstraints.WEST;
		gbc_lblApellido1_1.gridx = 4;
		gbc_lblApellido1_1.gridy = 3;
		panelRegistro.add(lblApellido1_1, gbc_lblApellido1_1);

		txtApellido1_1 = new JTextField();
		soloLetras(txtApellido1_1);
		GridBagConstraints gbc_txtApellido1_1 = new GridBagConstraints();
		gbc_txtApellido1_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido1_1.gridx = 5;
		gbc_txtApellido1_1.gridy = 3;
		panelRegistro.add(txtApellido1_1, gbc_txtApellido1_1);
		txtApellido1_1.setColumns(10);

		lblNombre_1 = new JLabel("Nombre: *");
		GridBagConstraints gbc_lblNombre_1 = new GridBagConstraints();
		lblNombre_1.setFont(Principal.getLetratexto3());
		gbc_lblNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre_1.anchor = GridBagConstraints.WEST;
		gbc_lblNombre_1.gridx = 1;
		gbc_lblNombre_1.gridy = 4;
		panelRegistro.add(lblNombre_1, gbc_lblNombre_1);

		txtNombre_1 = new JTextField();
		soloLetras(txtNombre_1);
		GridBagConstraints gbc_txtNombre_1 = new GridBagConstraints();
		gbc_txtNombre_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre_1.gridx = 2;
		gbc_txtNombre_1.gridy = 4;
		panelRegistro.add(txtNombre_1, gbc_txtNombre_1);
		txtNombre_1.setColumns(10);

		lblApellido2_1 = new JLabel("2\u00BA Apellido: *");
		lblApellido2_1.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblApellido2_1 = new GridBagConstraints();
		gbc_lblApellido2_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido2_1.anchor = GridBagConstraints.WEST;
		gbc_lblApellido2_1.gridx = 4;
		gbc_lblApellido2_1.gridy = 4;
		panelRegistro.add(lblApellido2_1, gbc_lblApellido2_1);

		txtApellido2_1 = new JTextField();
		soloLetras(txtApellido2_1);
		GridBagConstraints gbc_txtApellido2_1 = new GridBagConstraints();
		gbc_txtApellido2_1.insets = new Insets(0, 0, 5, 5);
		gbc_txtApellido2_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtApellido2_1.gridx = 5;
		gbc_txtApellido2_1.gridy = 4;
		panelRegistro.add(txtApellido2_1, gbc_txtApellido2_1);
		txtApellido2_1.setColumns(10);

		JLabel lblTelefono = new JLabel("Tel\u00E9fono: *");
		lblTelefono.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblTelefono = new GridBagConstraints();
		gbc_lblTelefono.anchor = GridBagConstraints.WEST;
		gbc_lblTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblTelefono.gridx = 1;
		gbc_lblTelefono.gridy = 5;
		panelRegistro.add(lblTelefono, gbc_lblTelefono);

		txtTelefono = new JTextField();
		soloNumeros(txtTelefono);
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 2;
		gbc_txtTelefono.gridy = 5;
		panelRegistro.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);

		lblCorreo = new JLabel("Correo: *");
		lblCorreo.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblCorreo = new GridBagConstraints();
		gbc_lblCorreo.anchor = GridBagConstraints.WEST;
		gbc_lblCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreo.gridx = 4;
		gbc_lblCorreo.gridy = 5;
		panelRegistro.add(lblCorreo, gbc_lblCorreo);

		txtCorreo = new JTextField();
		GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
		gbc_txtCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreo.gridx = 5;
		gbc_txtCorreo.gridy = 5;
		panelRegistro.add(txtCorreo, gbc_txtCorreo);
		txtCorreo.setColumns(10);

		lblUbicacion = new JLabel("Ubicaci\u00F3n:");
		lblUbicacion.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblUbicacion = new GridBagConstraints();
		gbc_lblUbicacion.anchor = GridBagConstraints.WEST;
		gbc_lblUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblUbicacion.gridx = 1;
		gbc_lblUbicacion.gridy = 6;
		panelRegistro.add(lblUbicacion, gbc_lblUbicacion);

		txtUbicacion = new JTextField();
		GridBagConstraints gbc_txtUbicacion = new GridBagConstraints();
		gbc_txtUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtUbicacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUbicacion.gridx = 2;
		gbc_txtUbicacion.gridy = 6;
		panelRegistro.add(txtUbicacion, gbc_txtUbicacion);
		txtUbicacion.setColumns(10);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					if ((txtCedula.getText().isEmpty()) || (txtNombre_1.getText().isEmpty()) 
							|| (txtApellido1_1.getText().isEmpty()) || (txtApellido2_1.getText().isEmpty())
							|| (txtTelefono.getText().isEmpty()) || (txtCorreo.getText().isEmpty())){
						JOptionPane.showMessageDialog(Coordinador.getLogin(), "Campos requeridos vacios", "Error", JOptionPane.ERROR_MESSAGE);
					} 
					else {
						if (verificarCedulaExistente(txtCedula.getText())){
							JOptionPane.showMessageDialog(Coordinador.getLogin(), "Esa cédula ya esta registrada", "Error", JOptionPane.ERROR_MESSAGE);
						}
						else {
							Persona persona = new Persona(txtCedula.getText(), txtNombre_1.getText(), txtApellido1_1.getText(), txtApellido2_1.getText());
							persona.setCorreo(txtCorreo.getText());
							persona.setNumTelefono(txtTelefono.toString());
							persona.setUbicacion(txtUbicacion.toString());
							usuario.setDatos(persona);
							Principal.addUsuario(usuario);
							Principal.addPersona(persona);
							Coordinador.mostrarLogin();
							Coordinador.ocultarCrearUsuario();
							limpiarDatos();
							}	
						}			
				}
		});
		btnGuardar.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_btnGuardar.gridx = 4;
		gbc_btnGuardar.gridy = 7;
		panelRegistro.add(btnGuardar, gbc_btnGuardar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				Coordinador.mostrarLogin();
				Coordinador.ocultarCrearUsuario();
				limpiarDatos();
			}
		});
		btnCancelar.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancelar.gridx = 5;
		gbc_btnCancelar.gridy = 7;
		panelRegistro.add(btnCancelar, gbc_btnCancelar);

	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**** MÉTODOS ****/
	
	public static boolean verificarCedulaExistente(String id){
		boolean existe = false;
		for(Persona cedula : Principal.getPersona()){
			if(cedula.getCedula().equals(txtCedula.getText()))
				existe = true;
		}
		return existe;

	}	
	
	
	public void limpiarDatos(){
		txtNombre_1.setText("");
		txtCedula.setText("");
		txtTelefono.setText("");
		txtApellido1_1.setText("");
		txtApellido2_1.setText("");
		txtCorreo.setText("");
		txtUbicacion.setText("");
		
	}
	
	public void soloLetras(JTextField txt){
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if (Character.isDigit(c)) {
					e.consume();		
				}
			}
		});
	}

	public void soloNumeros(JTextField txt){
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();		
				}
			}
		});
	}
}
