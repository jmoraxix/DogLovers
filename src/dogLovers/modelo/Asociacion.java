/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369
 */

package dogLovers.modelo;

import java.util.ArrayList;

/**
 * @author xDiegoxD 04/11/2014
 * 
 */
public class Asociacion extends Entidad {

	/**** VARIABLES ****/
	private ArrayList<Persona> asociados = new ArrayList<Persona>();
	private ArrayList<Donacion> donaciones = new ArrayList<Donacion>();

	/*** CONSTUCTOR ****/
	public Asociacion(String identificacion, String nombre) {
		super(identificacion, nombre);
	}

	/**** MÉTODOS ****/
	public ArrayList<Persona> getAsociados() {
		return this.asociados;
	}

	public void addAsociado(Persona asociado) {
		this.asociados.add(asociado);
	}

	public void removeAsociado(Persona asociado) {
		this.asociados.remove(asociado);
	}

	public double getTotalDonaciones() {
		double total = 0;
		for (Donacion donacion : this.donaciones) {
			total += donacion.getDonacion().getMonto();
		}
		return total;
	}

	public ArrayList<Donacion> getDonaciones() {
		return this.donaciones;
	}

	public void addDonacion(Donacion donacion) {
		this.donaciones.add(donacion);
	}

}
