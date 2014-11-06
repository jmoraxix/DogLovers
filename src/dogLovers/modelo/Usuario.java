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
 * @author xDiegoxD 01/11/2014
 *
 * 
 */
public class Usuario {

	private String usuario;
	private String contrasena;
	private boolean administrador;
	private Persona datos;
	
	/****CONSTRUCTOR****/
	public Usuario(String usuario, String contrasena, boolean administrador) {
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.administrador = administrador;
		}
	
	/****GETTERS AND SETTERS****/
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	public boolean validarUsuario(String usuario, String contrasena){
		return this.usuario == usuario && this.contrasena == contrasena;
	}

	public Persona getDatos() {
		return datos;
	}

	public void setDatos(Persona datos) {
		this.datos = datos;
	}
	
	}
