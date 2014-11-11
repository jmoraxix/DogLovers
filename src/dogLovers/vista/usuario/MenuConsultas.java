package dogLovers.vista.usuario;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import dogLovers.vista.PanelBase;
import dogLovers.vista.PanelConFondo;
import dogLovers.vista.VentanaBase;

public class MenuConsultas extends VentanaBase {
	PanelConFondo panel;

	public MenuConsultas() {
		panel = new PanelBase();
		setContentPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.5, 0.5, 0.5, 0.8, 0.5, 0.5,
				0.8, 0.5, 0.5, 0.5, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.5, 0.5, 1.0, 1.0, 0.5, 0.5,
				1.0, 1.0, 0.8, 0.5, 0.5, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblConsultas = new JLabel("Consultas");
		lblConsultas.setFont(new Font("Georgia", Font.PLAIN, 26));
		GridBagConstraints gbc_lblConsultas = new GridBagConstraints();
		gbc_lblConsultas.gridwidth = 2;
		gbc_lblConsultas.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultas.gridx = 0;
		gbc_lblConsultas.gridy = 1;
		panel.add(lblConsultas, gbc_lblConsultas);

		PanelConFondo panelMascotas = new PanelConFondo("huella.png", false);
		GridBagConstraints gbc_panelMascotas = new GridBagConstraints();
		gbc_panelMascotas.insets = new Insets(0, 0, 5, 5);
		gbc_panelMascotas.fill = GridBagConstraints.BOTH;
		gbc_panelMascotas.gridx = 3;
		gbc_panelMascotas.gridy = 2;
		gbc_panelMascotas.gridheight = 2;
		panel.add(panelMascotas, gbc_panelMascotas);
		panelMascotas.setLayout(new BorderLayout(0, 0));

		JButton btnMascotas = new JButton("");
		btnMascotas.setOpaque(false);
		btnMascotas.setContentAreaFilled(false);
		btnMascotas.setBorderPainted(false);
		panelMascotas.add(btnMascotas, BorderLayout.CENTER);

		PanelConFondo panelConsultaMascota = new PanelConFondo("casacuna.png",
				false);
		GridBagConstraints gbc_panelConsultaMascota = new GridBagConstraints();
		getContentPane().add(panelConsultaMascota);
		panelConsultaMascota.setLayout(new BorderLayout(0, 0));
		getContentPane().add(panelConsultaMascota);

		JButton btnConsultaMascota = new JButton("");
		btnConsultaMascota.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnConsultaMascota.setOpaque(false);
		btnConsultaMascota.setContentAreaFilled(false);
		btnConsultaMascota.setBorderPainted(false);
		panelConsultaMascota.add(btnConsultaMascota);

		gbc_panelConsultaMascota.insets = new Insets(0, 0, 5, 5);
		gbc_panelConsultaMascota.fill = GridBagConstraints.BOTH;
		gbc_panelConsultaMascota.gridx = 6;
		gbc_panelConsultaMascota.gridy = 2;
		gbc_panelConsultaMascota.gridheight = 2;
		gbc_panelConsultaMascota.gridwidth = 1;
		panel.add(panelConsultaMascota, gbc_panelConsultaMascota);

		JLabel lblNombre = new JLabel("Consulta Mascota");
		lblNombre.setFont(new Font("Georgia", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 4;
		panel.add(lblNombre, gbc_lblNombre);

		JLabel lblCasaCuna = new JLabel("Consulta Casa Cuna");
		lblCasaCuna.setFont(new Font("Georgia", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCasaCuna = new GridBagConstraints();
		gbc_lblCasaCuna.insets = new Insets(0, 0, 5, 5);
		gbc_lblCasaCuna.gridx = 6;
		gbc_lblCasaCuna.gridy = 4;
		panel.add(lblCasaCuna, gbc_lblCasaCuna);

		PanelConFondo panelListaNegra = new PanelConFondo("usuario.png", false);
		GridBagConstraints gbc_panelListaNegra = new GridBagConstraints();
		gbc_panelListaNegra.insets = new Insets(0, 0, 5, 5);
		gbc_panelListaNegra.fill = GridBagConstraints.BOTH;
		gbc_panelListaNegra.gridx = 3;
		gbc_panelListaNegra.gridy = 6;
		gbc_panelListaNegra.gridheight = 2;
		panel.add(panelListaNegra, gbc_panelListaNegra);
		panelListaNegra.setLayout(new BorderLayout(0, 0));

		JButton btnListaNegra = new JButton("");
		btnListaNegra.setOpaque(false);
		btnListaNegra.setContentAreaFilled(false);
		btnListaNegra.setBorderPainted(false);
		panelListaNegra.add(btnListaNegra, BorderLayout.CENTER);

		PanelConFondo panelAsociaciones = new PanelConFondo("adoptar.png",
				false);
		GridBagConstraints gbc_panelAsociaciones = new GridBagConstraints();
		getContentPane().add(panelAsociaciones);
		panelAsociaciones.setLayout(new BorderLayout(0, 0));
		getContentPane().add(panelAsociaciones);

		JButton btnAsociaciones = new JButton("");
		btnAsociaciones.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			}
		});
		btnAsociaciones.setOpaque(false);
		btnAsociaciones.setContentAreaFilled(false);
		btnAsociaciones.setBorderPainted(false);
		panelAsociaciones.add(btnAsociaciones);

		gbc_panelAsociaciones.insets = new Insets(0, 0, 5, 5);
		gbc_panelAsociaciones.fill = GridBagConstraints.BOTH;
		gbc_panelAsociaciones.gridx = 6;
		gbc_panelAsociaciones.gridy = 6;
		gbc_panelAsociaciones.gridheight = 2;
		gbc_panelAsociaciones.gridwidth = 1;
		panel.add(panelAsociaciones, gbc_panelAsociaciones);

		PanelConFondo panelRegresar = new PanelConFondo("regresar.png", false);
		GridBagConstraints gbc_panelRegresar = new GridBagConstraints();
		gbc_panelRegresar.insets = new Insets(0, 0, 5, 5);
		gbc_panelRegresar.fill = GridBagConstraints.BOTH;
		gbc_panelRegresar.gridx = 1;
		gbc_panelRegresar.gridy = 8;
		panel.add(panelRegresar, gbc_panelRegresar);
		panelRegresar.setLayout(new BorderLayout(0, 0));

		JButton btnRegresar = new JButton("");
		btnRegresar.setOpaque(false);
		btnRegresar.setContentAreaFilled(false);
		btnRegresar.setBorderPainted(false);
		panelRegresar.add(btnRegresar, BorderLayout.CENTER);

		JLabel lblListaNegra = new JLabel("Consulta Lista Negra");
		lblListaNegra.setFont(new Font("Georgia", Font.PLAIN, 16));
		GridBagConstraints gbc_lblListaNegra = new GridBagConstraints();
		gbc_lblListaNegra.insets = new Insets(0, 0, 5, 5);
		gbc_lblListaNegra.gridx = 3;
		gbc_lblListaNegra.gridy = 8;
		panel.add(lblListaNegra, gbc_lblListaNegra);

		JLabel lblAsociaciones = new JLabel("Consulta Asociaciones");
		lblAsociaciones.setFont(new Font("Georgia", Font.PLAIN, 16));
		GridBagConstraints gbc_lblAsociaciones = new GridBagConstraints();
		gbc_lblAsociaciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsociaciones.gridx = 6;
		gbc_lblAsociaciones.gridy = 8;
		panel.add(lblAsociaciones, gbc_lblAsociaciones);

	}

}
