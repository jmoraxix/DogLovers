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
 */
package dogLovers.modelo;

import java.util.ArrayList;

/**
 * @author xDiegoxD 03/11/2014
 *
 * 
 */
public class CasaCuna {
	private Persona personaResponsable;
	private boolean requiereAlimento;
	private ArrayList<String> caracteristicasMascota = new ArrayList<String>();
	
	
	/****CONSTRUCTOR****/
	public CasaCuna(Persona personaResponsable, boolean requiereAlimento,
			ArrayList<String> caracteristicasMascota) {
		this.personaResponsable = personaResponsable;
		this.requiereAlimento = requiereAlimento;
		this.caracteristicasMascota = caracteristicasMascota;
		
		
		
	}
	/****GETTERS AND SETTERS****/

	public Persona getPersonaResponsable() {
		return personaResponsable;
	}


	public void setPersonaResponsable(Persona personaResponsable) {
		this.personaResponsable = personaResponsable;
	}


	public boolean isRequiereAlimento() {
		return requiereAlimento;
	}


	public void setRequiereAlimento(boolean requiereAlimento) {
		this.requiereAlimento = requiereAlimento;
	}


	public ArrayList<String> getCaracteristicasMascota() {
		return caracteristicasMascota;
	}


	public void setCaracteristicasMascota(ArrayList<String> caracteristicasMascota) {
		this.caracteristicasMascota = caracteristicasMascota;
	}
	
	
	
}
