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
public class Persona extends Entidad {
	private String apellido1;
	private String apellido2;

	/**
	 * @param identificacion
	 * @param nombre
	 */
	public Persona(String identificacion, String nombre, String ap1, String ap2) {
		super(identificacion, nombre);
		this.apellido1 = ap1;
		this.apellido2 = ap2;
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	public String getCedula(){
		return this.identificacion;
	}

	public void setCedula(String cedula){
		this.identificacion = cedula;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	
	

}
