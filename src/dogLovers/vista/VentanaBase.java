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
 * 25/10/2014
 */

package dogLovers.vista;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

import dogLovers.DogLovers;
import dogLovers.control.Principal;

/**
 * @author JoséDavid 25/10/2014 Ventana base que se hereda a las demás de la
 *         aplicación.
 */
public class VentanaBase extends JFrame {

	private static final long serialVersionUID = -4891611672839472488L;

	public VentanaBase() {
		// Declaracion básica de la venta
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Principal.getAncho(), Principal.getAlto());
		setTitle("ALEJANDRIAX");
		Image icon = Toolkit
				.getDefaultToolkit()
				.getImage(
						DogLovers.class
								.getResource("vista/imagenes/logo_principal_icono.png"));
		setIconImage(icon);

		// Se declara la barra de menú
		this.setJMenuBar(new BarraMenu());
	}
}
