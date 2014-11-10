/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369
 */

package dogLovers.modelo;

import java.util.ArrayList;

/**
 * @author xDiegoxD 03/11/2014
 * 
 */
public class CasaCuna {

	private Persona personaResponsable;
	private boolean requiereAlimento;
	private ArrayList<CaracteristicasMascota> caracteristicasMascotas = new ArrayList<CaracteristicasMascota>();
	private ArrayList<Mascota> mascotas = new ArrayList<Mascota>();

	/**** CONSTRUCTOR ****/
	public CasaCuna(Persona personaResponsable, boolean requiereAlimento) {
		this.personaResponsable = personaResponsable;
		this.requiereAlimento = requiereAlimento;
	}

	/**** GETTERS AND SETTERS ****/

	public Persona getPersonaResponsable() {
		return this.personaResponsable;
	}

	public void setPersonaResponsable(Persona personaResponsable) {
		this.personaResponsable = personaResponsable;
	}

	public boolean requiereAlimento() {
		return this.requiereAlimento;
	}

	public void siRequiereAlimento() {
		this.requiereAlimento = true;
	}

	public void noRequiereAlimento() {
		this.requiereAlimento = false;
	}

	public ArrayList<CaracteristicasMascota> getCaracteristicasMascota() {
		return this.caracteristicasMascotas;
	}

	public void addCaracteristicaMascota(
			CaracteristicasMascota caracteristicaMascota) {
		this.caracteristicasMascotas.add(caracteristicaMascota);
	}

	public void removeCaracteristicaMascota(
			CaracteristicasMascota caracteristicaMascota) {
		this.caracteristicasMascotas.remove(caracteristicaMascota);
	}

	public ArrayList<Mascota> getMascotas() {
		return this.mascotas;
	}

	public void addMascota(Mascota mascota) {
		this.mascotas.add(mascota);
	}

	public void removeMascota(Mascota mascota) {
		this.mascotas.remove(mascota);
	}

}
