package dogLovers.vista;

import java.awt.GridBagLayout;

public class CrearAsociacion extends VentanaBase {
	
	
	public CrearAsociacion(){
	PanelBase panel  = new PanelBase();
	setContentPane(panel);
	GridBagLayout gridBagLayout = new GridBagLayout();
	gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.1, 0.1, 0.1, 1.0, 0.0, 0.0, Double.MIN_VALUE};
	gridBagLayout.rowWeights = new double[]{0.1, 0.1, 0.0, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 1.0, 0.0, Double.MIN_VALUE};
	panel.setLayout(gridBagLayout);
	
	}
}
