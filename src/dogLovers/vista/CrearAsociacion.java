package dogLovers.vista;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dogLovers.control.Principal;

public class CrearAsociacion extends VentanaBase {
	private JLabel lblCorreoElectrnico;
	private JLabel lblNmeroDeTelefono;
	private JLabel lblIdentificacin;
	private PanelBase panel;
	private JLabel lblCrearAsociacion;
	private JLabel lblUbicacin;
	private JLabel lblNombre;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtUbicacion;
	private PanelSlider panelSlider;

	public CrearAsociacion() {
		panel = new PanelBase();
		setContentPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.1, 1.0,
				0.1, 0.3, 0.0, 0.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.1, 0.1, 0.1, 0.1, 0.1, 0.1,
				0.1, 0.1, 1.0, 1.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblCrearAsociacion = new JLabel("Crear Asociaci\u00F3n");
		lblCrearAsociacion.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblCrearAsociacion = new GridBagConstraints();
		gbc_lblCrearAsociacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearAsociacion.gridx = 2;
		gbc_lblCrearAsociacion.gridy = 1;
		panel.add(lblCrearAsociacion, gbc_lblCrearAsociacion);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 3;
		panel.add(lblNombre, gbc_lblNombre);

		JTextField txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 5;
		gbc_txtNombre.gridy = 3;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		panelSlider = new PanelSlider((ArrayList) null);
		GridBagLayout gridBagLayout = (GridBagLayout) panelSlider.getLayout();
		gridBagLayout.rowWeights = new double[] { 0.7, 0.5, 0.7 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.3, 1.0, 0.3 };
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		GridBagConstraints gbc_panelSlider = new GridBagConstraints();
		gbc_panelSlider.insets = new Insets(0, 0, 5, 5);
		gbc_panelSlider.fill = GridBagConstraints.BOTH;
		gbc_panelSlider.gridheight = 4;
		gbc_panelSlider.gridwidth = 2;
		gbc_panelSlider.gridx = 6;
		gbc_panelSlider.gridy = 3;
		panel.add(panelSlider, gbc_panelSlider);

		lblIdentificacin = new JLabel("Identificaci\u00F3n");
		lblIdentificacin.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblIdentificacin = new GridBagConstraints();
		gbc_lblIdentificacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdentificacin.gridx = 3;
		gbc_lblIdentificacin.gridy = 4;
		panel.add(lblIdentificacin, gbc_lblIdentificacin);

		JTextField txtId = new JTextField();
		soloNumeros(txtId);
		GridBagConstraints gbc_txtId = new GridBagConstraints();
		gbc_txtId.insets = new Insets(0, 0, 5, 5);
		gbc_txtId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtId.gridx = 5;
		gbc_txtId.gridy = 4;
		panel.add(txtId, gbc_txtId);
		txtId.setColumns(10);

		lblNmeroDeTelefono = new JLabel("N\u00FAmero de Tel\u00E9fono");
		lblNmeroDeTelefono.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblNmeroDeTelefono = new GridBagConstraints();
		gbc_lblNmeroDeTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_lblNmeroDeTelefono.gridx = 3;
		gbc_lblNmeroDeTelefono.gridy = 5;
		panel.add(lblNmeroDeTelefono, gbc_lblNmeroDeTelefono);

		txtTelefono = new JTextField();
		soloNumeros(txtTelefono);
		GridBagConstraints gbc_txtTelefono = new GridBagConstraints();
		gbc_txtTelefono.insets = new Insets(0, 0, 5, 5);
		gbc_txtTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefono.gridx = 5;
		gbc_txtTelefono.gridy = 5;
		panel.add(txtTelefono, gbc_txtTelefono);
		txtTelefono.setColumns(10);

		lblCorreoElectrnico = new JLabel("Correo Electr\u00F3nico");
		lblCorreoElectrnico.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblCorreoElectrnico = new GridBagConstraints();
		gbc_lblCorreoElectrnico.insets = new Insets(0, 0, 5, 5);
		gbc_lblCorreoElectrnico.gridx = 3;
		gbc_lblCorreoElectrnico.gridy = 6;
		panel.add(lblCorreoElectrnico, gbc_lblCorreoElectrnico);

		txtCorreo = new JTextField();
		GridBagConstraints gbc_txtCorreo = new GridBagConstraints();
		gbc_txtCorreo.insets = new Insets(0, 0, 5, 5);
		gbc_txtCorreo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCorreo.gridx = 5;
		gbc_txtCorreo.gridy = 6;
		panel.add(txtCorreo, gbc_txtCorreo);
		txtCorreo.setColumns(10);

		lblUbicacin = new JLabel("Ubicaci\u00F3n");
		lblUbicacin.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblUbicacin = new GridBagConstraints();
		gbc_lblUbicacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblUbicacin.gridx = 3;
		gbc_lblUbicacin.gridy = 7;
		panel.add(lblUbicacin, gbc_lblUbicacin);

		txtUbicacion = new JTextField();
		GridBagConstraints gbc_txtUbicacion = new GridBagConstraints();
		gbc_txtUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtUbicacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUbicacion.gridx = 5;
		gbc_txtUbicacion.gridy = 7;
		panel.add(txtUbicacion, gbc_txtUbicacion);
		txtUbicacion.setColumns(10);

		PanelConFondo panelGuardar = new PanelConFondo("check.png", false);
		GridBagConstraints gbc_panelGuardar = new GridBagConstraints();
		getContentPane().add(panelGuardar);
		panelGuardar.setLayout(new BorderLayout(0, 0));
		getContentPane().add(panelGuardar);

		JButton btnGuardar = new JButton("");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnGuardar.setOpaque(false);
		btnGuardar.setContentAreaFilled(false);
		btnGuardar.setBorderPainted(false);
		panelGuardar.add(btnGuardar);

		gbc_panelGuardar.insets = new Insets(0, 0, 5, 5);
		gbc_panelGuardar.fill = GridBagConstraints.BOTH;
		gbc_panelGuardar.gridx = 7;
		gbc_panelGuardar.gridy = 8;
		gbc_panelGuardar.gridheight = 1;
		gbc_panelGuardar.gridwidth = 1;
		panel.add(panelGuardar, gbc_panelGuardar);

		PanelConFondo panelRegresar = new PanelConFondo("regresar.png", false);
		GridBagConstraints gbc_panelRegresar = new GridBagConstraints();
		getContentPane().add(panelRegresar);
		panelRegresar.setLayout(new BorderLayout(0, 0));
		getContentPane().add(panelRegresar);

		JButton btnRegres = new JButton("");
		btnRegres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnRegres.setOpaque(false);
		btnRegres.setContentAreaFilled(false);
		btnRegres.setBorderPainted(false);
		panelRegresar.add(btnRegres);

		gbc_panelRegresar.insets = new Insets(0, 0, 5, 5);
		gbc_panelRegresar.fill = GridBagConstraints.BOTH;
		gbc_panelRegresar.gridx = 3;
		gbc_panelRegresar.gridy = 9;
		panel.add(panelRegresar, gbc_panelRegresar);

	}

	public void soloLetras(JTextField txt) {
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (Character.isDigit(c)) {
					e.consume();
				}
			}
		});
	}

	public void soloNumeros(JTextField txt) {
		txt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();
				}
			}
		});
	}

}
