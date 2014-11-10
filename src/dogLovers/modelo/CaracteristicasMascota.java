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

/**
 * @author xDiegoxD 03/11/2014
 * 
 */
public class CaracteristicasMascota {

	/**** VARIABLES ****/
	private TipoMascota tipoMascota;
	private RazaMascota razaMascota;
	private TamanoMascota tamanoMascota;

	// GLOBALES

	public enum TipoMascota {
		Seleccione, Perro, Gato, Otro
	}

	public enum RazaMascota {
		Seleccione, Husky_Siberiano, Golder_Retriever, Labrador_Retriever, Pastor_Alemán, Beagle, Alaskan_Malamute, San_Bernardo, Boxer, Rottweiler, Samoyedo, Dálmata, Pit_Bull, Chow_Chow, Yorkshire_Terrier, Akita_Inu, Collie, Doberman, Bulldog_Inglés, Gran_Danés, Cocker_Inglés, Shar_Pei, Schnauzer, Chihuahua, Basset_Hound, Terranova, Pekinés, Otro
	}

	public enum TamanoMascota {
		Seleccione, Grande, Mediano, Pequeño
	}

	/**** CONSTRUCTOR ****/
	public CaracteristicasMascota(TipoMascota tipoMascota,
			RazaMascota razaMascota, TamanoMascota tamanoMascota) {
		this.tipoMascota = tipoMascota;
		this.razaMascota = razaMascota;
		this.tamanoMascota = tamanoMascota;
	}

	/**** GETTERS AND SETTERS ****/

	public TipoMascota getTipoMascota() {
		return this.tipoMascota;
	}

	public void setTipoMascota(TipoMascota tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public RazaMascota getRazaMascota() {
		return this.razaMascota;
	}

	public void setRazaMascota(RazaMascota razaMascota) {
		this.razaMascota = razaMascota;
	}

	public TamanoMascota getTamanoMascota() {
		return this.tamanoMascota;
	}

	public void setTamanoMascota(TamanoMascota tamanoMascota) {
		this.tamanoMascota = tamanoMascota;
	}

}
