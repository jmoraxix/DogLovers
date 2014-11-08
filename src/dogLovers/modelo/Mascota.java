package dogLovers.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Mascota {

	/**** VARIABLES ****/
	private String nombre;
	private String ChipID;
	private CaracteristicasMascota caracteristicas;
	private String color;
	private ArrayList<Fotografia> fotografias = new ArrayList<Fotografia>();
	private Persona contacto;
	private String estado;
	private String lugar;
	private Date fecha;
	private boolean tieneRecompensa = false;
	private Recompensa recompensa;
	private ArrayList<String> notas = new ArrayList<String>();

	/**** CONSTRUCTOR ****/
	public Mascota(String nombre, Persona contacto, String estado) {
		this.nombre = nombre;
		this.contacto = contacto;
		this.estado = estado;
	}

	/**** MÉTODOS ****/
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getChipID() {
		return ChipID;
	}

	public void setChipID(String chipID) {
		ChipID = chipID;
	}

	public CaracteristicasMascota getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(CaracteristicasMascota caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Persona getContacto() {
		return contacto;
	}

	public void setContacto(Persona contacto) {
		this.contacto = contacto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean tieneRecompensa() {
		return tieneRecompensa;
	}

	public Recompensa getRecompensa() {
		return recompensa;
	}

	public void setRecompensa(Recompensa recompensa) {
		this.tieneRecompensa = true;
		this.recompensa = recompensa;
	}

	public ArrayList<Fotografia> getFotografia() {
		return fotografias;
	}

	public void addFotografia(Fotografia foto) {
		this.fotografias.add(foto);
	}

	public void removeFotografia(Fotografia foto) {
		this.fotografias.remove(foto);
	}

	public ArrayList<String> getNotas() {
		return notas;
	}

	public void addNota(String nota) {
		this.notas.add(nota);
	}

	public void removeNota(String nota) {
		this.notas.remove(nota);
	}

}
