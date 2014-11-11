
package dogLovers.vista.usuario;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

import dogLovers.control.Coordinador;
import dogLovers.vista.PanelBase;
import dogLovers.vista.PanelConFondo;
import dogLovers.vista.VentanaBase;

public class MenuConsultas extends VentanaBase {

	private static final long serialVersionUID = -6157346244757357913L;
	PanelConFondo panel;

	public MenuConsultas() {
		this.panel = new PanelBase();
		setContentPane(this.panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.5, 0.5, 0.5, 0.6, 0.5, 0.5,
				0.6, 0.5, 0.5, 0.5, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.5, 0.5, 1.0, 1.0, 0.5, 0.5,
				1.0, 1.0, 0.8, 0.5, 0.5, Double.MIN_VALUE };
		this.panel.setLayout(gbl_panel);

		JLabel lblConsultas = new JLabel("Consultas");
		lblConsultas.setFont(new Font("Georgia", Font.PLAIN, 26));
		GridBagConstraints gbc_lblConsultas = new GridBagConstraints();
		gbc_lblConsultas.gridwidth = 2;
		gbc_lblConsultas.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultas.gridx = 1;
		gbc_lblConsultas.gridy = 1;
		this.panel.add(lblConsultas, gbc_lblConsultas);

		PanelConFondo panelMascotas = new PanelConFondo("huella.png", false, "");
		panelMascotas.getBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Coordinador.mostrarConsultaMascotas();
				Coordinador.ocultarMenuConsultas();
			}
		});
		GridBagConstraints gbc_panelMascotas = new GridBagConstraints();
		gbc_panelMascotas.insets = new Insets(0, 0, 5, 5);
		gbc_panelMascotas.fill = GridBagConstraints.BOTH;
		gbc_panelMascotas.gridx = 3;
		gbc_panelMascotas.gridy = 2;
		gbc_panelMascotas.gridheight = 2;
		this.panel.add(panelMascotas, gbc_panelMascotas);

		PanelConFondo panelCasaCuna = new PanelConFondo("casacuna.png", false,
				"");
		panelCasaCuna.getBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Coordinador.mostrarConsultaMascotas();
				Coordinador.ocultarMenuConsultas();
			}
		});
		GridBagConstraints gbc_panelCasaCuna = new GridBagConstraints();
		gbc_panelCasaCuna.insets = new Insets(0, 0, 5, 5);
		gbc_panelCasaCuna.fill = GridBagConstraints.BOTH;
		gbc_panelCasaCuna.gridx = 6;
		gbc_panelCasaCuna.gridy = 2;
		gbc_panelCasaCuna.gridheight = 2;
		gbc_panelCasaCuna.gridwidth = 1;
		this.panel.add(panelCasaCuna, gbc_panelCasaCuna);

		JLabel lblNombre = new JLabel("Consulta Mascota");
		lblNombre.setFont(new Font("Georgia", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.NORTH;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 4;
		this.panel.add(lblNombre, gbc_lblNombre);

		JLabel lblCasaCuna = new JLabel("Consulta Casa Cuna");
		lblCasaCuna.setFont(new Font("Georgia", Font.PLAIN, 16));
		GridBagConstraints gbc_lblCasaCuna = new GridBagConstraints();
		gbc_lblCasaCuna.anchor = GridBagConstraints.NORTH;
		gbc_lblCasaCuna.insets = new Insets(0, 0, 5, 5);
		gbc_lblCasaCuna.gridx = 6;
		gbc_lblCasaCuna.gridy = 4;
		this.panel.add(lblCasaCuna, gbc_lblCasaCuna);

		PanelConFondo panelListaNegra = new PanelConFondo("usuario.png", false,
				"");
		panelListaNegra.getBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Coordinador.mostrarConsultaMascotas();
				Coordinador.ocultarMenuConsultas();
			}
		});
		GridBagConstraints gbc_panelListaNegra = new GridBagConstraints();
		gbc_panelListaNegra.insets = new Insets(0, 0, 5, 5);
		gbc_panelListaNegra.fill = GridBagConstraints.BOTH;
		gbc_panelListaNegra.gridx = 3;
		gbc_panelListaNegra.gridy = 6;
		gbc_panelListaNegra.gridheight = 2;
		this.panel.add(panelListaNegra, gbc_panelListaNegra);

		PanelConFondo panelAsociaciones = new PanelConFondo("adoptar.png",
				false, "");
		panelAsociaciones.getBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Coordinador.mostrarConsultaAsociaciones();
				Coordinador.ocultarMenuConsultas();
			}
		});
		GridBagConstraints gbc_panelAsociaciones = new GridBagConstraints();
		gbc_panelAsociaciones.insets = new Insets(0, 0, 5, 5);
		gbc_panelAsociaciones.fill = GridBagConstraints.BOTH;
		gbc_panelAsociaciones.gridx = 6;
		gbc_panelAsociaciones.gridy = 6;
		gbc_panelAsociaciones.gridheight = 2;
		gbc_panelAsociaciones.gridwidth = 1;
		this.panel.add(panelAsociaciones, gbc_panelAsociaciones);

		PanelConFondo panelRegresar = new PanelConFondo("regresar.png", false,
				"");
		panelRegresar.getBtn().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Coordinador.mostrarMenuPrincipal_usuario();
				Coordinador.ocultarMenuConsultas();
			}
		});
		GridBagConstraints gbc_panelRegresar = new GridBagConstraints();
		gbc_panelRegresar.insets = new Insets(0, 0, 5, 5);
		gbc_panelRegresar.fill = GridBagConstraints.BOTH;
		gbc_panelRegresar.gridx = 1;
		gbc_panelRegresar.gridy = 8;
		this.panel.add(panelRegresar, gbc_panelRegresar);
		panelRegresar.setLayout(new BorderLayout(0, 0));

		JLabel lblListaNegra = new JLabel("Consulta Lista Negra");
		lblListaNegra.setFont(new Font("Georgia", Font.PLAIN, 16));
		GridBagConstraints gbc_lblListaNegra = new GridBagConstraints();
		gbc_lblListaNegra.anchor = GridBagConstraints.NORTH;
		gbc_lblListaNegra.insets = new Insets(0, 0, 5, 5);
		gbc_lblListaNegra.gridx = 3;
		gbc_lblListaNegra.gridy = 8;
		this.panel.add(lblListaNegra, gbc_lblListaNegra);

		JLabel lblAsociaciones = new JLabel("Consulta Asociaciones");
		lblAsociaciones.setFont(new Font("Georgia", Font.PLAIN, 16));
		GridBagConstraints gbc_lblAsociaciones = new GridBagConstraints();
		gbc_lblAsociaciones.anchor = GridBagConstraints.NORTH;
		gbc_lblAsociaciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsociaciones.gridx = 6;
		gbc_lblAsociaciones.gridy = 8;
		this.panel.add(lblAsociaciones, gbc_lblAsociaciones);

	}

}
