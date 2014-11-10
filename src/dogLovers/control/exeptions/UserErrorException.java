/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 08/11/2014
 */

package dogLovers.control.exeptions;

/**
 * @author JoséDavid 08/11/2014 Excepción emitida cuando el usuario con el que
 *         se quiere ingresar no existe.
 */
public final class UserErrorException extends Exception {

	private static final long serialVersionUID = 6525631737928154455L;

	public UserErrorException(String message) {
		super("Usuario erróneo:" + message);
	}

}
