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
	private String tipoMascota;
	private String razaMascota;
	private String tamanoMascota;

	/**** CONSTRUCTOR ****/
	public CaracteristicasMascota(String tipoMascota, String razaMascota,
			String tamanoMascota) {
		this.tipoMascota = tipoMascota;
		this.razaMascota = razaMascota;
		this.tamanoMascota = tamanoMascota;
	}

	/**** GETTERS AND SETTERS ****/

	public String getTipoMascota() {
		return this.tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}

	public String getRazaMascota() {
		return this.razaMascota;
	}

	public void setRazaMascota(String razaMascota) {
		this.razaMascota = razaMascota;
	}

	public String getTamanoMascota() {
		return this.tamanoMascota;
	}

	public void setTamanoMascota(String tamanoMascota) {
		this.tamanoMascota = tamanoMascota;
	}

}
