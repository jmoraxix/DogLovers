package dogLovers.modelo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class Mascota {

	private String nombre;
	private String ChipID;
	private CaracteristicasMascota caracteristicas;
	private String color;
	private ArrayList<Fotografia> fotografia = new ArrayList<Fotografia>();
	private Persona contacto;
	private String estado;
	private String lugar;
	private Date fecha;
	private boolean tieneRecompensa;
	private Recompensa recompensa;
	private ArrayList<String> notas =  new ArrayList<String>();
	
	
	
	
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
	public Recompensa getRecompensa() {
		return recompensa;
	}
	public void setRecompensa(Recompensa recompensa) {
		this.recompensa = recompensa;
	}
	public ArrayList<Fotografia> getFotografia() {
		return fotografia;
	}
	public ArrayList<String> getNotas() {
		return notas;
	}
	
	
}
