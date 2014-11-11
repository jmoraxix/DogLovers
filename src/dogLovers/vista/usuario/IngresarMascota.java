package dogLovers.vista.usuario;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dogLovers.control.Principal;
import dogLovers.modelo.CaracteristicasMascota.RazaMascota;
import dogLovers.modelo.CaracteristicasMascota.TamanoMascota;
import dogLovers.modelo.CaracteristicasMascota.TipoMascota;
import dogLovers.modelo.Fotografia;
import dogLovers.modelo.Mascota.EstadoMascota;
import dogLovers.vista.PanelBase;
import dogLovers.vista.PanelConFondo;
import dogLovers.vista.PanelSlider;
import dogLovers.vista.VentanaBase;

public class IngresarMascota extends VentanaBase {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2156610940128464955L;
	private JTextField txtNombre;
	private JTextField txtIdChip;
	private JTextField txtColor;
	private JLabel lblEstado;
	private JComboBox<TipoMascota> cboxTipoMascota;
	private JComboBox<RazaMascota> cboxRaza;
	private JComboBox<TamanoMascota> cboxTamano;
	private JComboBox<EstadoMascota> cboxEstado;

	public IngresarMascota() {
		PanelBase panel = new PanelBase();
		setContentPane(panel);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0 };
		gridBagLayout.columnWeights = new double[] { 0.0, 0.3, 0.0, 1.0, 0.1,
				0.1, 0.1, 0.4, 0.3, 0.0, Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { 0.1, 0.1, 0.1, 0.1, 0.1, 0.1,
				0.1, 0.4, 0.0, 0.3, 0.0, Double.MIN_VALUE };
		panel.setLayout(gridBagLayout);

		JLabel lblAgregarMascota = new JLabel("Agregar Mascota");
		lblAgregarMascota.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblAgregarMascota = new GridBagConstraints();
		gbc_lblAgregarMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgregarMascota.gridx = 2;
		gbc_lblAgregarMascota.gridy = 0;
		panel.add(lblAgregarMascota, gbc_lblAgregarMascota);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		panel.add(lblNombre, gbc_lblNombre);

		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 2;
		gbc_txtNombre.gridy = 1;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);

		JLabel lblFotografia = new JLabel("Fotograf\u00EDa");
		lblFotografia.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblFotografia = new GridBagConstraints();
		gbc_lblFotografia.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotografia.gridx = 4;
		gbc_lblFotografia.gridy = 1;
		panel.add(lblFotografia, gbc_lblFotografia);

		JButton btnExaminarFoto = new JButton("Examinar");
		btnExaminarFoto.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_btnExaminarFoto = new GridBagConstraints();
		gbc_btnExaminarFoto.anchor = GridBagConstraints.WEST;
		gbc_btnExaminarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnExaminarFoto.gridx = 5;
		gbc_btnExaminarFoto.gridy = 1;
		panel.add(btnExaminarFoto, gbc_btnExaminarFoto);

		JLabel lblIdChip = new JLabel("ID Chip");
		lblIdChip.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblIdChip = new GridBagConstraints();
		gbc_lblIdChip.anchor = GridBagConstraints.EAST;
		gbc_lblIdChip.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdChip.gridx = 1;
		gbc_lblIdChip.gridy = 2;
		panel.add(lblIdChip, gbc_lblIdChip);

		txtIdChip = new JTextField();
		GridBagConstraints gbc_txtIdChip = new GridBagConstraints();
		gbc_txtIdChip.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdChip.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdChip.gridx = 2;
		gbc_txtIdChip.gridy = 2;
		panel.add(txtIdChip, gbc_txtIdChip);
		txtIdChip.setColumns(10);

		PanelSlider panelSlider = new PanelSlider(new ArrayList<Fotografia>());
		GridBagConstraints gbc_panelSlider = new GridBagConstraints();
		gbc_panelSlider.gridheight = 5;
		gbc_panelSlider.gridwidth = 3;
		gbc_panelSlider.insets = new Insets(0, 0, 5, 5);
		gbc_panelSlider.fill = GridBagConstraints.BOTH;
		gbc_panelSlider.gridx = 4;
		gbc_panelSlider.gridy = 2;
		panel.add(panelSlider, gbc_panelSlider);

		JLabel lblTipoMascota = new JLabel("Tipo Mascota");
		lblTipoMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblTipoMascota = new GridBagConstraints();
		gbc_lblTipoMascota.anchor = GridBagConstraints.EAST;
		gbc_lblTipoMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoMascota.gridx = 1;
		gbc_lblTipoMascota.gridy = 3;
		panel.add(lblTipoMascota, gbc_lblTipoMascota);

		cboxTipoMascota = new JComboBox<TipoMascota>();
		cboxTipoMascota.setModel(new DefaultComboBoxModel<TipoMascota>(
				TipoMascota.values()));
		GridBagConstraints gbc_cboxTipoMascota = new GridBagConstraints();
		gbc_cboxTipoMascota.insets = new Insets(0, 0, 5, 5);
		gbc_cboxTipoMascota.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxTipoMascota.gridx = 2;
		gbc_cboxTipoMascota.gridy = 3;
		panel.add(cboxTipoMascota, gbc_cboxTipoMascota);

		JLabel lblRazaMascota = new JLabel("Raza Mascota");
		lblRazaMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblRazaMascota = new GridBagConstraints();
		gbc_lblRazaMascota.anchor = GridBagConstraints.EAST;
		gbc_lblRazaMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblRazaMascota.gridx = 1;
		gbc_lblRazaMascota.gridy = 4;
		panel.add(lblRazaMascota, gbc_lblRazaMascota);

		cboxRaza = new JComboBox<RazaMascota>();
		cboxRaza.setModel(new DefaultComboBoxModel<RazaMascota>(RazaMascota
				.values()));
		GridBagConstraints gbc_cboxRaza = new GridBagConstraints();
		gbc_cboxRaza.insets = new Insets(0, 0, 5, 5);
		gbc_cboxRaza.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxRaza.gridx = 2;
		gbc_cboxRaza.gridy = 4;
		panel.add(cboxRaza, gbc_cboxRaza);

		JLabel lblTamaoMascota = new JLabel("Tama\u00F1o Mascota");
		lblTamaoMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblTamaoMascota = new GridBagConstraints();
		gbc_lblTamaoMascota.anchor = GridBagConstraints.EAST;
		gbc_lblTamaoMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblTamaoMascota.gridx = 1;
		gbc_lblTamaoMascota.gridy = 5;
		panel.add(lblTamaoMascota, gbc_lblTamaoMascota);

		cboxTamano = new JComboBox<TamanoMascota>();
		cboxTamano.setModel(new DefaultComboBoxModel<TamanoMascota>(
				TamanoMascota.values()));
		GridBagConstraints gbc_cboxTamano = new GridBagConstraints();
		gbc_cboxTamano.insets = new Insets(0, 0, 5, 5);
		gbc_cboxTamano.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxTamano.gridx = 2;
		gbc_cboxTamano.gridy = 5;
		panel.add(cboxTamano, gbc_cboxTamano);

		lblEstado = new JLabel("Estado");
		lblEstado.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblEstado = new GridBagConstraints();
		gbc_lblEstado.anchor = GridBagConstraints.EAST;
		gbc_lblEstado.insets = new Insets(0, 0, 5, 5);
		gbc_lblEstado.gridx = 1;
		gbc_lblEstado.gridy = 6;
		panel.add(lblEstado, gbc_lblEstado);

		cboxEstado = new JComboBox<EstadoMascota>();
		cboxEstado.setModel(new DefaultComboBoxModel<EstadoMascota>(
				EstadoMascota.values()));
		GridBagConstraints gbc_cboxEstado = new GridBagConstraints();
		gbc_cboxEstado.insets = new Insets(0, 0, 5, 5);
		gbc_cboxEstado.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxEstado.gridx = 2;
		gbc_cboxEstado.gridy = 6;
		panel.add(cboxEstado, gbc_cboxEstado);

		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.anchor = GridBagConstraints.EAST;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 1;
		gbc_lblColor.gridy = 7;
		panel.add(lblColor, gbc_lblColor);

		txtColor = new JTextField();
		txtColor.setColumns(10);
		GridBagConstraints gbc_txtColor = new GridBagConstraints();
		gbc_txtColor.insets = new Insets(0, 0, 5, 5);
		gbc_txtColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtColor.gridx = 2;
		gbc_txtColor.gridy = 7;
		panel.add(txtColor, gbc_txtColor);

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
		gbc_panelGuardar.gridy = 7;
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

		gbc_panelRegresar.insets = new Insets(0, 0, 0, 5);
		gbc_panelRegresar.fill = GridBagConstraints.BOTH;
		gbc_panelRegresar.gridx = 1;
		gbc_panelRegresar.gridy = 9;
		panel.add(panelRegresar, gbc_panelRegresar);

	}

}
