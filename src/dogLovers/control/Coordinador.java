/**
 * Primer Proyecto POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 25/10/2014
 */

package dogLovers.control;

import dogLovers.modelo.Usuario;
import dogLovers.vista.Login;
import dogLovers.vista.usuario.CrearUsuario;
import dogLovers.vista.usuario.MenuPrincipal_usuario;

/**
 * @author JoséDavid 25/10/2014
 */
public class Coordinador {

	/**** DECLARACIÓN DE LA INSTANCIA COORDINADOR ****/
	private static final Coordinador INSTANCE = new Coordinador();

	public static Coordinador getINSTANCE() {
		return INSTANCE;

	}

	/**** DECLARACIÓN DE PANTALLAS ****/
	private static Login login;
	private static CrearUsuario crearUsuario;
	private static MenuPrincipal_usuario menuPrincipal_usuario;

	/**** GETTERS AND SETTERS ***/

	public static Login getLogin() {
		return login;
	}

	public static void setLogin(Login login) {
		Coordinador.login = login;
	}

	public static CrearUsuario getUsuario() {
		return crearUsuario;
	}

	public static void setUsuario(CrearUsuario usuario) {
		Coordinador.crearUsuario = usuario;
	}

	public static MenuPrincipal_usuario getMenuPrincipal_Usuario() {
		return menuPrincipal_usuario;
	}

	public static void setMenuPrincipal_Usuario(
			MenuPrincipal_usuario menuPrincipal_Usuario) {
		Coordinador.menuPrincipal_usuario = menuPrincipal_Usuario;
	}

	/** MOSTRAR VENTANAS **/
	public static void mostrarLogin() {
		login.setVisible(true);
	}

	public static void mostrarCrearUsuario(Usuario usuario) {
		crearUsuario.setUsuario(usuario);
		crearUsuario.setVisible(true);
	}

	public static void mostrarMenuPrincipal_usuario() {
		menuPrincipal_usuario.setVisible(true);
	}

	/** OCULTAR VENTANAS **/
	public static void ocultarLogin() {
		login.setVisible(false);
	}

	public static void ocultarCrearUsuario() {
		crearUsuario.setVisible(false);
	}

	public static void ocultarMenuPrincipal_usuario() {
		menuPrincipal_usuario.setVisible(false);
	}
}
