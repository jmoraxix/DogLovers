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
 * @author xDiegoxD 01/11/2014
 *
 * 
 */
public class Calificacion {
	private int calificacion;
	private ArrayList<String> notas = new ArrayList<String>();
	
	/****CONSTRUCTOR****/
	public Calificacion(int calificacion) {
		this.calificacion = calificacion;
	
	}
	public Calificacion(int calificacion, String nota){
	this.calificacion = calificacion;
	this.notas = notas;
	
	}
	
	/****GETTERS AND SETTERS****/
	public int getCalificacion() {
		return calificacion;
	}
	public void addCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	public ArrayList<String> getNotas() {
		return notas;
	}

	public void addNotas(String nota) {
		this.notas.add(nota);
	}
	
	public void removeNota (String nota){
		this.notas.remove(nota);
	}
	
	
}
