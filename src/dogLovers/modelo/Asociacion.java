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
 * @author xDiegoxD 04/11/2014
 *
 * 
 */
public class Asociacion {
	private ArrayList<Persona> asociados =  new ArrayList<Persona>();
	private ArrayList<Double> donaciones = new ArrayList<Double>();
	
	

	
	public ArrayList<Persona> getAsociados() {
		return asociados;
	}
	
	public void addAsociado(Persona asociado){
		this.asociados.add(asociado);	
	}
	
	public void removeAsociado(Persona asociado){
		this.asociados.remove(asociado);
	}
	
	public double getTotalDonaciones(){
		double total = 0;
		for (double donacion : donaciones) {
			total += donacion;
		}
		return total;
	}
	
	public ArrayList<Double> getDonaciones() {
		return donaciones;
	}
	
	public void addDonacion(double donacion){
		this.donaciones.add(donacion);
	}


	
	
}