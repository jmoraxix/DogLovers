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
 * Nov 10, 2014
 */
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

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dogLovers.control.Principal;
import dogLovers.modelo.CaracteristicasMascota.RazaMascota;
import dogLovers.modelo.CaracteristicasMascota.TamanoMascota;
import dogLovers.modelo.CaracteristicasMascota.TipoMascota;

/**
 * @author Diego Nov 10, 2014
 */
public class CrearCasaCuna extends VentanaBase {

	private JLabel lblTamano;
	private JLabel lblRazaMascota;
	private JLabel lblTipoMascota;
	private PanelBase panel;
	private JLabel lblCrearCasaCuna;
	private JLabel lblUbicacin;
	private JLabel personaResponsable;
	private JTextField txtUbicacion;
	private PanelSlider panelSlider;
	private JComboBox<TipoMascota> cboxTipoMascota;
	private JComboBox<RazaMascota> cboxRaza;
	private JComboBox<TamanoMascota> cboxTamano;
	private JCheckBox cboxRequiereAlimento;

	public CrearCasaCuna() {
		panel = new PanelBase();
		setContentPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.1, 0.3,
				Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.1, 0.1, 0.1, 0.1, 0.1, 0.1,
				1.0, 1.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		lblCrearCasaCuna = new JLabel("Crear Casa Cuna");
		lblCrearCasaCuna.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblCrearCasaCuna = new GridBagConstraints();
		gbc_lblCrearCasaCuna.insets = new Insets(0, 0, 5, 5);
		gbc_lblCrearCasaCuna.gridx = 0;
		gbc_lblCrearCasaCuna.gridy = 0;
		panel.add(lblCrearCasaCuna, gbc_lblCrearCasaCuna);

		personaResponsable = new JLabel("Persona Responsable");
		personaResponsable.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_personaResponsable = new GridBagConstraints();
		gbc_personaResponsable.insets = new Insets(0, 0, 5, 5);
		gbc_personaResponsable.gridx = 1;
		gbc_personaResponsable.gridy = 1;
		panel.add(personaResponsable, gbc_personaResponsable);

		panelSlider = new PanelSlider((ArrayList) null);
		GridBagLayout gridBagLayout = (GridBagLayout) panelSlider.getLayout();
		gridBagLayout.rowWeights = new double[] { 0.7, 0.5, 0.7 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.3, 1.0, 0.3 };
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		GridBagConstraints gbc_panelSlider = new GridBagConstraints();
		gbc_panelSlider.insets = new Insets(0, 0, 5, 0);
		gbc_panelSlider.fill = GridBagConstraints.BOTH;
		gbc_panelSlider.gridheight = 4;
		gbc_panelSlider.gridwidth = 2;
		gbc_panelSlider.gridx = 3;
		gbc_panelSlider.gridy = 1;
		panel.add(panelSlider, gbc_panelSlider);

		lblTipoMascota = new JLabel("Tipo Mascota");
		lblTipoMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblTipoMascota = new GridBagConstraints();
		gbc_lblTipoMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoMascota.gridx = 1;
		gbc_lblTipoMascota.gridy = 2;
		panel.add(lblTipoMascota, gbc_lblTipoMascota);

		cboxTipoMascota = new JComboBox<TipoMascota>();
		cboxTipoMascota.setModel(new DefaultComboBoxModel<TipoMascota>(
				TipoMascota.values()));
		GridBagConstraints gbc_cboxTipoMascota = new GridBagConstraints();
		gbc_cboxTipoMascota.insets = new Insets(0, 0, 5, 5);
		gbc_cboxTipoMascota.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxTipoMascota.gridx = 2;
		gbc_cboxTipoMascota.gridy = 2;
		panel.add(cboxTipoMascota, gbc_cboxTipoMascota);

		lblRazaMascota = new JLabel("Raza");
		lblRazaMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblRazaMascota = new GridBagConstraints();
		gbc_lblRazaMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblRazaMascota.gridx = 1;
		gbc_lblRazaMascota.gridy = 3;
		panel.add(lblRazaMascota, gbc_lblRazaMascota);

		cboxRaza = new JComboBox<RazaMascota>();
		cboxRaza.setModel(new DefaultComboBoxModel<RazaMascota>(RazaMascota
				.values()));
		GridBagConstraints gbc_cboxRaza = new GridBagConstraints();
		gbc_cboxRaza.insets = new Insets(0, 0, 5, 5);
		gbc_cboxRaza.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxRaza.gridx = 2;
		gbc_cboxRaza.gridy = 3;
		panel.add(cboxRaza, gbc_cboxRaza);

		lblTamano = new JLabel("Tama\u00F1o");
		lblTamano.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblTamano = new GridBagConstraints();
		gbc_lblTamano.insets = new Insets(0, 0, 5, 5);
		gbc_lblTamano.gridx = 1;
		gbc_lblTamano.gridy = 4;
		panel.add(lblTamano, gbc_lblTamano);

		cboxTamano = new JComboBox<TamanoMascota>();
		cboxTamano.setModel(new DefaultComboBoxModel<TamanoMascota>(
				TamanoMascota.values()));
		GridBagConstraints gbc_cboxTamano = new GridBagConstraints();
		gbc_cboxTamano.insets = new Insets(0, 0, 5, 5);
		gbc_cboxTamano.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxTamano.gridx = 2;
		gbc_cboxTamano.gridy = 4;
		panel.add(cboxTamano, gbc_cboxTamano);

		lblUbicacin = new JLabel("Ubicaci\u00F3n");
		lblUbicacin.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblUbicacin = new GridBagConstraints();
		gbc_lblUbicacin.insets = new Insets(0, 0, 5, 5);
		gbc_lblUbicacin.gridx = 1;
		gbc_lblUbicacin.gridy = 5;
		panel.add(lblUbicacin, gbc_lblUbicacin);

		txtUbicacion = new JTextField();
		GridBagConstraints gbc_txtUbicacion = new GridBagConstraints();
		gbc_txtUbicacion.insets = new Insets(0, 0, 5, 5);
		gbc_txtUbicacion.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUbicacion.gridx = 2;
		gbc_txtUbicacion.gridy = 5;
		panel.add(txtUbicacion, gbc_txtUbicacion);
		txtUbicacion.setColumns(10);

		cboxRequiereAlimento = new JCheckBox("Requiere Alimento");
		GridBagConstraints gbc_cboxRequiereAlimento = new GridBagConstraints();
		gbc_cboxRequiereAlimento.anchor = GridBagConstraints.NORTHWEST;
		gbc_cboxRequiereAlimento.insets = new Insets(0, 0, 5, 5);
		gbc_cboxRequiereAlimento.gridx = 2;
		gbc_cboxRequiereAlimento.gridy = 6;
		panel.add(cboxRequiereAlimento, gbc_cboxRequiereAlimento);

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

		gbc_panelGuardar.insets = new Insets(0, 0, 5, 0);
		gbc_panelGuardar.fill = GridBagConstraints.BOTH;
		gbc_panelGuardar.gridx = 4;
		gbc_panelGuardar.gridy = 6;
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

		gbc_panelRegresar.insets = new Insets(0, 0, 0, 5);
		gbc_panelRegresar.fill = GridBagConstraints.BOTH;
		gbc_panelRegresar.gridx = 1;
		gbc_panelRegresar.gridy = 7;
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

	}

}
