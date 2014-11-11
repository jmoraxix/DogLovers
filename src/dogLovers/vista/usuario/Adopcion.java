package dogLovers.vista.usuario;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dogLovers.control.Consultas;
import dogLovers.control.Principal;
import dogLovers.modelo.Mascota;
import dogLovers.vista.PanelBase;
import dogLovers.vista.PanelLista;
import dogLovers.vista.VentanaBase;
import dogLovers.vista.items.itemEnAdopcion;
import dogLovers.vista.items.itemMascota;

public class Adopcion extends VentanaBase {
	private PanelLista panelEnAdopcion;
	private PanelLista panelMisMascotas;

	public Adopcion() {
		PanelBase panel = new PanelBase();
		panel.setOpaque(false);
		setContentPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, 1.0, 1.0 };
		gbl_panel.rowWeights = new double[] { 1.0, 1.0, 1.0, 1.0, 1.0, 1.0,
				1.0, 1.0 };
		panel.setLayout(gbl_panel);

		JLabel lblAdopcin = new JLabel("Adopci\u00F3n");
		lblAdopcin.setFont(Principal.getLetratexto1());
		GridBagConstraints gbc_lblAdopcin = new GridBagConstraints();
		gbc_lblAdopcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblAdopcin.gridx = 1;
		gbc_lblAdopcin.gridy = 1;
		panel.add(lblAdopcin, gbc_lblAdopcin);

		JLabel lblMascotasEnAdopcin = new JLabel("Mascotas en Adopci\u00F3n");
		lblMascotasEnAdopcin.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblMascotasEnAdopcin = new GridBagConstraints();
		gbc_lblMascotasEnAdopcin.anchor = GridBagConstraints.SOUTH;
		gbc_lblMascotasEnAdopcin.insets = new Insets(0, 0, 5, 5);
		gbc_lblMascotasEnAdopcin.gridx = 5;
		gbc_lblMascotasEnAdopcin.gridy = 1;
		panel.add(lblMascotasEnAdopcin, gbc_lblMascotasEnAdopcin);

		JButton btnDarAdopcion = new JButton("Dar en Adopci\u00F3n");
		btnDarAdopcion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// verificar si el usuario tiene amscotas
				// pasar a la ventana de dar en adopcion
				// si no tiene mostrar mensaje
			}
		});
		GridBagConstraints gbc_btnDarAdopcion = new GridBagConstraints();
		gbc_btnDarAdopcion.insets = new Insets(0, 0, 5, 5);
		gbc_btnDarAdopcion.gridx = 1;
		gbc_btnDarAdopcion.gridy = 2;
		panel.add(btnDarAdopcion, gbc_btnDarAdopcion);

		panelEnAdopcion = new PanelLista(consultarEnAdopcion());
		GridBagConstraints gbc_panelEnAdopcion = new GridBagConstraints();
		gbc_panelEnAdopcion.insets = new Insets(0, 0, 5, 5);
		gbc_panelEnAdopcion.fill = GridBagConstraints.BOTH;
		gbc_panelEnAdopcion.gridheight = 4;
		gbc_panelEnAdopcion.gridwidth = 3;
		gbc_panelEnAdopcion.gridx = 5;
		gbc_panelEnAdopcion.gridy = 2;
		panel.add(panelEnAdopcion, gbc_panelEnAdopcion);

		JLabel lblMisMascotas = new JLabel("Mis mascotas");
		lblMisMascotas.setFont(Principal.getLetratexto3());
		GridBagConstraints gbc_lblMisMascotas = new GridBagConstraints();
		gbc_lblMisMascotas.anchor = GridBagConstraints.SOUTH;
		gbc_lblMisMascotas.insets = new Insets(0, 0, 5, 5);
		gbc_lblMisMascotas.gridx = 1;
		gbc_lblMisMascotas.gridy = 3;
		panel.add(lblMisMascotas, gbc_lblMisMascotas);

		panelMisMascotas = new PanelLista(consultarMisMascotas());
		GridBagConstraints gbc_panelMisMascotas = new GridBagConstraints();
		gbc_panelMisMascotas.insets = new Insets(0, 0, 5, 5);
		gbc_panelMisMascotas.fill = GridBagConstraints.BOTH;
		gbc_panelMisMascotas.gridheight = 3;
		gbc_panelMisMascotas.gridwidth = 2;
		gbc_panelMisMascotas.gridx = 1;
		gbc_panelMisMascotas.gridy = 4;
		panel.add(panelMisMascotas, gbc_panelMisMascotas);

	}

	private ArrayList<JPanel> consultarMisMascotas() {

		ArrayList<Mascota> misMascotas = Consultas
				.consultarMascotasAdoptadasPorUsuario(Principal
						.getSESION_USUARIO());
		ArrayList<JPanel> paneles = new ArrayList<JPanel>();
		for (Mascota mascota : misMascotas)
			paneles.add(new itemMascota(mascota));

		return paneles;
	}

	private ArrayList<JPanel> consultarEnAdopcion() {

		ArrayList<Mascota> enAdopcion = Consultas.consultarEnAdopcion();
		ArrayList<JPanel> paneles = new ArrayList<JPanel>();
		for (Mascota mascota : enAdopcion)
			paneles.add(new itemEnAdopcion(mascota));
		return paneles;
	}
}
