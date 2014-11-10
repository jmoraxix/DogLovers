/**
 * Segundo Proyecto POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 08/11/2014
 */
package dogLovers.control;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import dogLovers.modelo.Mascota;;

/**
 * @author David
 *
 */
public class Ordernamiento {
	
	public static void ordenarFechas(ArrayList<? extends Mascota> pArray){
		Collections.sort(pArray, new Comparator<Mascota>(){
			@Override
			public int compare(Mascota o1, Mascota o2) {
				return o1.getFecha().compareTo(o2.getFecha());
			}
		});
	}
}