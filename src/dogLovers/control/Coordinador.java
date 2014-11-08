/**
 * Primer Proyecto POO
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

package dogLovers.control;

import dogLovers.modelo.Logica;
import dogLovers.vista.Login;

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
	

	// Declaración clase logica
	private static Logica logica;

	/**** GETTERS AND SETTERS ***/
	public static Logica getLogica() {
		return logica;
	}

	public static void setLogica(Logica logica) {
		Coordinador.logica = logica;
	}

	public static Login getLogin() {
		return login;
	}

	public static void setLogin(Login login) {
		Coordinador.login = login;
	}
	

	/**** FUNCIONES ENTRE CLASES ****/

	/** MOSTRAR VENTANAS **/
	public static void mostrarLogin(){
		login.setVisible(true);
	}

	/** OCULTAR VENTANAS **/

	/**** FUNCIONES DEL MODELO ****/
}
