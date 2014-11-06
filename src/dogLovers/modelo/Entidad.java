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
 * 
 */
public abstract class Entidad  {
	protected String identificacion;
	protected String nombre;
	protected String numTelefono;
	protected String correo;
	protected Calificacion calificacion;
	protected boolean listaNegra = false;
	protected String ubicacion;
	
	
	
	
	/**
	 * @param identificacion
	 * @param nombre
	 */
	public Entidad(String identificacion, String nombre) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
	}
	/****GETTERS AND SETTERS****/
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumTelefono() {
		return numTelefono;
	}
	public void setNumTelefono(String numTelefono) {
		this.numTelefono = numTelefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public Calificacion getCalificacion() {
		return calificacion;
	}
	public void addCalificacion(int calificacion){
		this.calificacion.addCalificacion(calificacion);
		
		} 
	public void addCalificacion (int calificacion, String nota ){
		this.calificacion.addCalificacion(calificacion);
		this.calificacion.addNotas(nota);
		
	}
	public void agregarListaNegra(){
		this.listaNegra = true;
		
	}
	public void quitarListaNegra(){
		this.listaNegra = false;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	
	
	
}
