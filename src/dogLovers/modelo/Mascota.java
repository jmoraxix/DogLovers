/**
 * Proyecto Final POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369
 */

package dogLovers.modelo;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author xDiegoxD 03/11/2014
 * 
 */
public class Mascota {

	/**** VARIABLES ****/
	private String nombre;
	private String ChipID;
	private CaracteristicasMascota caracteristicas;
	private String color;
	private ArrayList<Fotografia> fotografias = new ArrayList<Fotografia>();
	private Persona contacto;
	private EstadoMascota estado;
	private String lugar;
	private Date fecha;
	private boolean tieneRecompensa = false;
	private Recompensa recompensa;
	private ArrayList<String> notas = new ArrayList<String>();

	// VARIABLES GLOBALES
	public static enum EstadoMascota {
		Seleccione, Perdido, Encontrado, En_Adopcion, Propio
	}

	/**** CONSTRUCTOR ****/
	public Mascota(String nombre, Persona contacto, EstadoMascota estado) {
		this.nombre = nombre;
		this.contacto = contacto;
		this.estado = estado;
	}

	/**** MÉTODOS ****/
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getChipID() {
		return this.ChipID;
	}

	public void setChipID(String chipID) {
		this.ChipID = chipID;
	}

	public CaracteristicasMascota getCaracteristicas() {
		return this.caracteristicas;
	}

	public void setCaracteristicas(CaracteristicasMascota caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Persona getContacto() {
		return this.contacto;
	}

	public void setContacto(Persona contacto) {
		this.contacto = contacto;
	}

	public EstadoMascota getEstado() {
		return this.estado;
	}

	public void setEstado(EstadoMascota estado) {
		this.estado = estado;
	}

	public String getLugar() {
		return this.lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean tieneRecompensa() {
		return this.tieneRecompensa;
	}

	public Recompensa getRecompensa() {
		return this.recompensa;
	}

	public void setRecompensa(Recompensa recompensa) {
		this.tieneRecompensa = true;
		this.recompensa = recompensa;
	}

	public ArrayList<Fotografia> getFotografia() {
		return this.fotografias;
	}

	public void addFotografia(Fotografia foto) {
		this.fotografias.add(foto);
	}

	public void removeFotografia(Fotografia foto) {
		this.fotografias.remove(foto);
	}

	public ArrayList<String> getNotas() {
		return this.notas;
	}

	public void addNota(String nota) {
		this.notas.add(nota);
	}

	public void removeNota(String nota) {
		this.notas.remove(nota);
	}
}
