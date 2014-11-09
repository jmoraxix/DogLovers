package dogLovers.vista;
import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.GridBagConstraints;

import javax.swing.JButton;

import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import dogLovers.control.Principal;
import dogLovers.modelo.Fotografia;
import javax.swing.JTextPane;

public class AgregarMascota extends VentanaBase {
	private JTextField txtNombre;
	private JTextField txtIdChip;
	private JTextField txtColor;
	public AgregarMascota() {
		PanelBase panel  = new PanelBase();
		setContentPane(panel);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.1, 0.1, 0.1, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.1, 0.1, 0.0, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gridBagLayout);
		
		JLabel lblAgregarMascota = new JLabel("Agregar Mascota");
		lblAgregarMascota.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblAgregarMascota = new GridBagConstraints();
		gbc_lblAgregarMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblAgregarMascota.gridx = 2;
		gbc_lblAgregarMascota.gridy = 1;
		panel.add(lblAgregarMascota, gbc_lblAgregarMascota);
		
		JLabel lblFotografia = new JLabel("Fotograf\u00EDa");
		lblFotografia.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblFotografia = new GridBagConstraints();
		gbc_lblFotografia.insets = new Insets(0, 0, 5, 5);
		gbc_lblFotografia.gridx = 6;
		gbc_lblFotografia.gridy = 2;
		panel.add(lblFotografia, gbc_lblFotografia);
		
		JButton btnExaminarFoto = new JButton("Examinar");
		btnExaminarFoto.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_btnExaminarFoto = new GridBagConstraints();
		gbc_btnExaminarFoto.anchor = GridBagConstraints.WEST;
		gbc_btnExaminarFoto.insets = new Insets(0, 0, 5, 5);
		gbc_btnExaminarFoto.gridx = 7;
		gbc_btnExaminarFoto.gridy = 2;
		panel.add(btnExaminarFoto, gbc_btnExaminarFoto);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 2;
		gbc_lblNombre.gridy = 3;
		panel.add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 3;
		gbc_txtNombre.gridy = 3;
		panel.add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		PanelSlider panelSlider = new PanelSlider(new ArrayList<Fotografia>());
		GridBagConstraints gbc_panelSlider = new GridBagConstraints();
		gbc_panelSlider.gridheight = 6;
		gbc_panelSlider.gridwidth = 2;
		gbc_panelSlider.insets = new Insets(0, 0, 5, 5);
		gbc_panelSlider.fill = GridBagConstraints.BOTH;
		gbc_panelSlider.gridx = 6;
		gbc_panelSlider.gridy = 3;
		panel.add(panelSlider, gbc_panelSlider);
		
		JLabel lblIdChip = new JLabel("ID Chip");
		lblIdChip.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblIdChip = new GridBagConstraints();
		gbc_lblIdChip.anchor = GridBagConstraints.EAST;
		gbc_lblIdChip.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdChip.gridx = 2;
		gbc_lblIdChip.gridy = 4;
		panel.add(lblIdChip, gbc_lblIdChip);
		
		txtIdChip = new JTextField();
		GridBagConstraints gbc_txtIdChip = new GridBagConstraints();
		gbc_txtIdChip.insets = new Insets(0, 0, 5, 5);
		gbc_txtIdChip.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtIdChip.gridx = 3;
		gbc_txtIdChip.gridy = 4;
		panel.add(txtIdChip, gbc_txtIdChip);
		txtIdChip.setColumns(10);
		
		JLabel lblTipoMascota = new JLabel("Tipo Mascota");
		lblTipoMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblTipoMascota = new GridBagConstraints();
		gbc_lblTipoMascota.anchor = GridBagConstraints.EAST;
		gbc_lblTipoMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblTipoMascota.gridx = 2;
		gbc_lblTipoMascota.gridy = 5;
		panel.add(lblTipoMascota, gbc_lblTipoMascota);
		
		JComboBox cboxTipoMascota = new JComboBox();
		GridBagConstraints gbc_cboxTipoMascota = new GridBagConstraints();
		gbc_cboxTipoMascota.insets = new Insets(0, 0, 5, 5);
		gbc_cboxTipoMascota.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxTipoMascota.gridx = 3;
		gbc_cboxTipoMascota.gridy = 5;
		panel.add(cboxTipoMascota, gbc_cboxTipoMascota);
		
		JLabel lblRazaMascota = new JLabel("Raza Mascota");
		lblRazaMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblRazaMascota = new GridBagConstraints();
		gbc_lblRazaMascota.anchor = GridBagConstraints.EAST;
		gbc_lblRazaMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblRazaMascota.gridx = 2;
		gbc_lblRazaMascota.gridy = 6;
		panel.add(lblRazaMascota, gbc_lblRazaMascota);
		
		JComboBox cboxRaza = new JComboBox();
		GridBagConstraints gbc_cboxRaza = new GridBagConstraints();
		gbc_cboxRaza.insets = new Insets(0, 0, 5, 5);
		gbc_cboxRaza.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxRaza.gridx = 3;
		gbc_cboxRaza.gridy = 6;
		panel.add(cboxRaza, gbc_cboxRaza);
		
		JLabel lblTamaoMascota = new JLabel("Tama\u00F1o Mascota");
		lblTamaoMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblTamaoMascota = new GridBagConstraints();
		gbc_lblTamaoMascota.anchor = GridBagConstraints.EAST;
		gbc_lblTamaoMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblTamaoMascota.gridx = 2;
		gbc_lblTamaoMascota.gridy = 7;
		panel.add(lblTamaoMascota, gbc_lblTamaoMascota);
		
		JComboBox cboxTamano = new JComboBox();
		GridBagConstraints gbc_cboxTamano = new GridBagConstraints();
		gbc_cboxTamano.insets = new Insets(0, 0, 5, 5);
		gbc_cboxTamano.fill = GridBagConstraints.HORIZONTAL;
		gbc_cboxTamano.gridx = 3;
		gbc_cboxTamano.gridy = 7;
		panel.add(cboxTamano, gbc_cboxTamano);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblColor = new GridBagConstraints();
		gbc_lblColor.anchor = GridBagConstraints.EAST;
		gbc_lblColor.insets = new Insets(0, 0, 5, 5);
		gbc_lblColor.gridx = 2;
		gbc_lblColor.gridy = 8;
		panel.add(lblColor, gbc_lblColor);
		
		txtColor = new JTextField();
		txtColor.setColumns(10);
		GridBagConstraints gbc_txtColor = new GridBagConstraints();
		gbc_txtColor.insets = new Insets(0, 0, 5, 5);
		gbc_txtColor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtColor.gridx = 3;
		gbc_txtColor.gridy = 8;
		panel.add(txtColor, gbc_txtColor);
	}


}
