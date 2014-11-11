/**
 * Primer Proyecto POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 31/07/2014
 */

package dogLovers.vista;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * @author jmora 20/9/14
 * 
 */
public class VentanaConsulta extends VentanaBase {

	private static final long serialVersionUID = 1391254293490122596L;
	protected JScrollPane scrollPanelConsulta;
	protected JTextField txtParametro;
	protected JComboBox<String> cmbOpciones;
	protected JButton btnBuscar;
	protected JLabel lblConsulta;

	public VentanaConsulta() {
		PanelBase panelPrincipal = new PanelBase();
		setContentPane(panelPrincipal);
		panelPrincipal.setLayout(null);

		this.lblConsulta = new JLabel("Consulta");
		this.lblConsulta.setFont(new Font("Georgia", Font.PLAIN, 28));
		this.lblConsulta.setBounds(79, 25, 297, 44);
		getContentPane().add(this.lblConsulta);
		this.scrollPanelConsulta = new JScrollPane();
		this.scrollPanelConsulta
				.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		this.scrollPanelConsulta.setBounds(66, 80, 1010, 350);
		getContentPane().add(this.scrollPanelConsulta);

		this.cmbOpciones = new JComboBox<String>();
		this.cmbOpciones.setBounds(66, 441, 218, 30);
		getContentPane().add(this.cmbOpciones);

		this.txtParametro = new JTextField();
		this.txtParametro.setBounds(66, 482, 218, 30);
		getContentPane().add(this.txtParametro);
		this.txtParametro.setColumns(10);

		this.btnBuscar = new JButton("Buscar");
		this.btnBuscar.setBounds(294, 482, 158, 30);
		getContentPane().add(this.btnBuscar);
	}

	protected JTextField getTxtParametro() {
		return this.txtParametro;
	}

	protected void setTxtParametro(JTextField txtParametro) {
		this.txtParametro = txtParametro;
	}

	protected JComboBox<String> getCmbOpciones() {
		return this.cmbOpciones;
	}

	protected void setCmbOpciones(JComboBox<String> cmbOpciones) {
		this.cmbOpciones = cmbOpciones;
	}

	protected JButton getBtnBuscar() {
		return this.btnBuscar;
	}

	protected void setBtnBuscar(JButton btnBuscar) {
		this.btnBuscar = btnBuscar;
	}

	protected JLabel getLblConsulta() {
		return this.lblConsulta;
	}

	protected void setLblConsulta(JLabel lblConsulta) {
		this.lblConsulta = lblConsulta;
	}

	protected JScrollPane getScrollPanelConsulta() {
		return this.scrollPanelConsulta;
	}

	protected void setScrollPanelConsulta(JScrollPane scrollPanelConsulta) {
		this.scrollPanelConsulta = scrollPanelConsulta;
	}
}
