package dogLovers.vista.usuario;

import javax.swing.JFrame;

import dogLovers.vista.PanelBase;
import dogLovers.vista.PanelLista;

public class MenuPrincipal_usuario extends JFrame {

	private static final long serialVersionUID = -6726525602807508687L;

	/****VARIABLES****/
	PanelBase panelBase;
	PanelLista panelNoticias;
	
	/****CONSTRUCTOR****/
	public MenuPrincipal_usuario() {
		panelBase = new PanelBase();
		panelNoticias = new PanelLista();
		add(panelBase);
		add(panelNoticias);
	}
	
	
	/****MÉTODOS****/

}
