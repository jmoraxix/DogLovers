/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 09/11/2014
 */

package dogLovers.modelo;

/**
 * @author JoséDavid 09/11/2014
 */
public class Donacion {

	/**** ATRIBUTOS ****/
	private Monto donacion;
	private Persona persona;

	/**** CONTRUCTOR ****/
	public Donacion(Monto donacion, Persona persona) {
		this.donacion = donacion;
		this.persona = persona;
	}

	/**** MÉTODOS ****/
	public Monto getDonacion() {
		return this.donacion;
	}

	public void setDonacion(Monto donacion) {
		this.donacion = donacion;
	}

	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

}
