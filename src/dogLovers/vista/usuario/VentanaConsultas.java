package dogLovers.vista.usuario;

import java.awt.GridBagLayout;

import dogLovers.vista.PanelBase;
import dogLovers.vista.VentanaBase;
import java.awt.GridLayout;

public class VentanaConsultas extends VentanaBase{
	public VentanaConsultas() {
		PanelBase panel = new PanelBase();
		setContentPane(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0};
		gbl_panel.rowHeights = new int[]{0};
		gbl_panel.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
	}
}