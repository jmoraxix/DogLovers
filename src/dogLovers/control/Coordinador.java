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

/**
 * @author Jos�David 25/10/2014
 */
public class Coordinador {

	/**** DECLARACI�N DE LA INSTANCIA COORDINADOR ****/
	private static final Coordinador INSTANCE = new Coordinador();

	public static Coordinador getINSTANCE() {
		return INSTANCE;
	}

	/**** DECLARACI�N DE PANTALLAS ****/

	// Declaraci�n clase logica
	private static Logica logica;

	/**** GETTERS AND SETTERS ***/
	public static Logica getLogica() {
		return logica;
	}

	public static void setLogica(Logica logica) {
		Coordinador.logica = logica;
	}

	/**** FUNCIONES ENTRE CLASES ****/

	/** MOSTRAR VENTANAS **/

	/** OCULTAR VENTANAS **/

	/**** FUNCIONES DEL MODELO ****/
}
