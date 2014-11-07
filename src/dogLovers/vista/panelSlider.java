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
 * 07/11/2014
 */
package dogLovers.vista;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JPanel;

import dogLovers.modelo.Fotografia;

/**
 * @author JoséDavid 07/11/2014
 */
public class panelSlider extends PanelConFondo {

	private static final long serialVersionUID = -5310519328098832576L;
	PanelConFondo btn_regresar, btn_avanzar;

	public panelSlider(ArrayList<Fotografia> fotos) {
		super("fondo_slider.png");
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] { 0, 0, 0 };
		gridBagLayout.rowHeights = new int[] { 0, 0, 0 };
		gridBagLayout.columnWeights = new double[] { 0.5, 1.0, 0.5 };
		gridBagLayout.rowWeights = new double[] { 0.0, 1.0, 0.0 };
		setLayout(gridBagLayout);

		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 3;
		gbc_panel.insets = new Insets(0, 0, 0, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 0;
		add(panel, gbc_panel);

		btn_regresar = new PanelConFondo("btn_regresar_normal.png", false);
		btn_regresar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				btn_regresar.definirBorde("btn_regresar_presionado.png");
			}
		});
		GridBagConstraints gbc_btn_regresar = new GridBagConstraints();
		gbc_btn_regresar.insets = new Insets(0, 0, 5, 5);
		gbc_btn_regresar.fill = GridBagConstraints.BOTH;
		gbc_btn_regresar.gridx = 0;
		gbc_btn_regresar.gridy = 1;
		add(btn_regresar, gbc_btn_regresar);

		btn_avanzar = new PanelConFondo("btn_avanzar_normal.png", false);
		GridBagConstraints gbc_btn_avanzar = new GridBagConstraints();
		gbc_btn_avanzar.insets = new Insets(0, 0, 5, 0);
		gbc_btn_avanzar.fill = GridBagConstraints.BOTH;
		gbc_btn_avanzar.gridx = 2;
		gbc_btn_avanzar.gridy = 1;
		add(btn_avanzar, gbc_btn_avanzar);
	}

}
