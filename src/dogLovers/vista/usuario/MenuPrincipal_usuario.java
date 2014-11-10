/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 01/11/2014
 */

package dogLovers.vista.usuario;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dogLovers.control.Principal;
import dogLovers.modelo.Fotografia;
import dogLovers.vista.PanelBase;
import dogLovers.vista.PanelConFondo;
import dogLovers.vista.PanelLista;
import dogLovers.vista.PanelSlider;

public class MenuPrincipal_usuario extends JFrame {

	private static final long serialVersionUID = -6726525602807508687L;
	private JPanel panelContenido;
	private JPanel panelNoticias;
	private JLabel lblMenPrincipal;
	private PanelSlider panelSlider;
	private PanelConFondo btn_ActualizarDatos;
	private PanelConFondo btn_MisMascotas;
	private PanelConFondo btn_IngMascota;
	private PanelConFondo btn_Consultas;
	private PanelConFondo btn_CasaCuna;
	private PanelConFondo btn_Adopciones;
	private JLabel lblIngresarMascota;
	private JLabel lblMisMascotas;
	private JLabel lblActualizarDatos;
	private JLabel lblConsultas;
	private JLabel lblCasasCuna;
	private JLabel lblAdopciones;

	/**** CONSTRUCTOR ****/
	public MenuPrincipal_usuario() {
		JPanel principal = new JPanel();
		setContentPane(principal);
		setSize(Principal.getAncho(), Principal.getAlto());
		GridBagLayout gbl_principal = new GridBagLayout();
		gbl_principal.columnWidths = new int[] { 0, 0 };
		gbl_principal.rowHeights = new int[] { 0 };
		gbl_principal.columnWeights = new double[] { 0.5, 0.9 };
		gbl_principal.rowWeights = new double[] { 1.0 };
		principal.setLayout(gbl_principal);

		this.panelNoticias = new PanelLista();
		GridBagConstraints gbc_panelNoticias = new GridBagConstraints();
		gbc_panelNoticias.fill = GridBagConstraints.BOTH;
		gbc_panelNoticias.insets = new Insets(0, 0, 0, 5);
		gbc_panelNoticias.gridx = 0;
		gbc_panelNoticias.gridy = 0;
		principal.add(this.panelNoticias, gbc_panelNoticias);

		this.panelContenido = new PanelBase();
		GridBagConstraints gbc_panelContenido = new GridBagConstraints();
		gbc_panelContenido.fill = GridBagConstraints.BOTH;
		gbc_panelContenido.gridx = 1;
		gbc_panelContenido.gridy = 0;
		principal.add(this.panelContenido, gbc_panelContenido);
		GridBagLayout gbl_panelContenido = new GridBagLayout();
		gbl_panelContenido.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panelContenido.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0,
				0 };
		gbl_panelContenido.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.3,
				0.0, 1.0, 1.0, 1.0 };
		gbl_panelContenido.rowWeights = new double[] { 0.1, 0.0, 0.3, 0.0, 0.3,
				0.0, 0.3, 0.0, 0.0, 0.0 };
		this.panelContenido.setLayout(gbl_panelContenido);

		this.lblMenPrincipal = new JLabel("Men\u00FA Principal");
		this.lblMenPrincipal.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblMenPrincipal = new GridBagConstraints();
		gbc_lblMenPrincipal.gridwidth = 3;
		gbc_lblMenPrincipal.gridheight = 2;
		gbc_lblMenPrincipal.insets = new Insets(0, 0, 5, 5);
		gbc_lblMenPrincipal.gridx = 1;
		gbc_lblMenPrincipal.gridy = 0;
		this.panelContenido.add(this.lblMenPrincipal, gbc_lblMenPrincipal);

		this.btn_IngMascota = new PanelConFondo("agregar_mascota.png", false);
		GridBagConstraints gbc_btn_IngMascota = new GridBagConstraints();
		gbc_btn_IngMascota.fill = GridBagConstraints.BOTH;
		gbc_btn_IngMascota.insets = new Insets(0, 0, 5, 5);
		gbc_btn_IngMascota.gridx = 1;
		gbc_btn_IngMascota.gridy = 2;
		this.panelContenido.add(this.btn_IngMascota, gbc_btn_IngMascota);

		this.btn_MisMascotas = new PanelConFondo("huella.png", false);
		GridBagConstraints gbc_btn_MisMascotas = new GridBagConstraints();
		gbc_btn_MisMascotas.insets = new Insets(0, 0, 5, 5);
		gbc_btn_MisMascotas.fill = GridBagConstraints.BOTH;
		gbc_btn_MisMascotas.gridx = 3;
		gbc_btn_MisMascotas.gridy = 2;
		this.panelContenido.add(this.btn_MisMascotas, gbc_btn_MisMascotas);

		this.panelSlider = new PanelSlider(new ArrayList<Fotografia>());
		GridBagConstraints gbc_panelSlider = new GridBagConstraints();
		gbc_panelSlider.insets = new Insets(0, 0, 5, 0);
		gbc_panelSlider.gridheight = 4;
		gbc_panelSlider.gridwidth = 3;
		gbc_panelSlider.fill = GridBagConstraints.BOTH;
		gbc_panelSlider.gridx = 5;
		gbc_panelSlider.gridy = 2;
		this.panelContenido.add(this.panelSlider, gbc_panelSlider);

		this.lblIngresarMascota = new JLabel("Ingresar mascota");
		this.lblIngresarMascota.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblIngresarMascota = new GridBagConstraints();
		gbc_lblIngresarMascota.insets = new Insets(0, 0, 5, 5);
		gbc_lblIngresarMascota.gridx = 1;
		gbc_lblIngresarMascota.gridy = 3;
		this.panelContenido
				.add(this.lblIngresarMascota, gbc_lblIngresarMascota);

		this.lblMisMascotas = new JLabel("Mis mascotas");
		this.lblMisMascotas.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblMisMascotas = new GridBagConstraints();
		gbc_lblMisMascotas.insets = new Insets(0, 0, 5, 5);
		gbc_lblMisMascotas.gridx = 3;
		gbc_lblMisMascotas.gridy = 3;
		this.panelContenido.add(this.lblMisMascotas, gbc_lblMisMascotas);

		this.btn_ActualizarDatos = new PanelConFondo("usuario.png", false);
		GridBagConstraints gbc_btn_ActualizarDatos = new GridBagConstraints();
		gbc_btn_ActualizarDatos.insets = new Insets(0, 0, 5, 5);
		gbc_btn_ActualizarDatos.fill = GridBagConstraints.BOTH;
		gbc_btn_ActualizarDatos.gridx = 1;
		gbc_btn_ActualizarDatos.gridy = 4;
		this.panelContenido.add(this.btn_ActualizarDatos,
				gbc_btn_ActualizarDatos);

		this.btn_Consultas = new PanelConFondo("ver.png", false);
		GridBagConstraints gbc_btn_Consultas = new GridBagConstraints();
		gbc_btn_Consultas.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Consultas.fill = GridBagConstraints.BOTH;
		gbc_btn_Consultas.gridx = 3;
		gbc_btn_Consultas.gridy = 4;
		this.panelContenido.add(this.btn_Consultas, gbc_btn_Consultas);

		this.lblActualizarDatos = new JLabel("Actualizar datos");
		this.lblActualizarDatos.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblActualizarDatos = new GridBagConstraints();
		gbc_lblActualizarDatos.insets = new Insets(0, 0, 5, 5);
		gbc_lblActualizarDatos.gridx = 1;
		gbc_lblActualizarDatos.gridy = 5;
		this.panelContenido
				.add(this.lblActualizarDatos, gbc_lblActualizarDatos);

		this.lblConsultas = new JLabel("Consultas");
		this.lblConsultas.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblConsultas = new GridBagConstraints();
		gbc_lblConsultas.insets = new Insets(0, 0, 5, 5);
		gbc_lblConsultas.gridx = 3;
		gbc_lblConsultas.gridy = 5;
		this.panelContenido.add(this.lblConsultas, gbc_lblConsultas);

		this.btn_CasaCuna = new PanelConFondo("casacuna.png", false);
		GridBagConstraints gbc_btn_CasaCuna = new GridBagConstraints();
		gbc_btn_CasaCuna.insets = new Insets(0, 0, 5, 5);
		gbc_btn_CasaCuna.fill = GridBagConstraints.BOTH;
		gbc_btn_CasaCuna.gridx = 1;
		gbc_btn_CasaCuna.gridy = 6;
		this.panelContenido.add(this.btn_CasaCuna, gbc_btn_CasaCuna);

		this.btn_Adopciones = new PanelConFondo("adoptar.png", false);
		GridBagConstraints gbc_btn_Adopciones = new GridBagConstraints();
		gbc_btn_Adopciones.insets = new Insets(0, 0, 5, 5);
		gbc_btn_Adopciones.fill = GridBagConstraints.BOTH;
		gbc_btn_Adopciones.gridx = 3;
		gbc_btn_Adopciones.gridy = 6;
		this.panelContenido.add(this.btn_Adopciones, gbc_btn_Adopciones);

		this.lblCasasCuna = new JLabel("Casas cuna");
		this.lblCasasCuna.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblCasasCuna = new GridBagConstraints();
		gbc_lblCasasCuna.insets = new Insets(0, 0, 5, 5);
		gbc_lblCasasCuna.gridx = 1;
		gbc_lblCasasCuna.gridy = 7;
		this.panelContenido.add(this.lblCasasCuna, gbc_lblCasasCuna);

		this.lblAdopciones = new JLabel("Adopciones");
		this.lblAdopciones.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblAdopciones = new GridBagConstraints();
		gbc_lblAdopciones.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdopciones.gridx = 3;
		gbc_lblAdopciones.gridy = 7;
		this.panelContenido.add(this.lblAdopciones, gbc_lblAdopciones);
	}
	/**** MÉTODOS ****/

}
