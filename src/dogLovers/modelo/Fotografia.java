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

import java.util.Date;

/**
 * @author xDiegoxD 01/11/2014
 *
 * 
 */
public class Fotografia {

	private String url;
	private Date fecha;
	private String Titulo;
	
	/****CONSTRUCTOR****/
	public Fotografia(String url, Date fecha, String titulo) {
		this.url = url;
		this.fecha = fecha;
		Titulo = titulo;
	}

	public Fotografia(String url, Date fecha) {
		this.url = url;
		this.fecha = fecha;
	}

	/****GETTERS AND SETTERS****/

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	
	
	
	
}
