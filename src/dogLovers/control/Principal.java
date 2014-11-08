/**
 * Primer Proyecto POO
 * Jose David Mora Loria
 * 2014004856
 * Diego Delgado Cerdas
 * 2013099268
 * David Diaz
 * 2014004725
 * Roger Villalobos
 * 2014079369
 * 25/10/2014
 */

package dogLovers.control;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.UIManager;

import dogLovers.modelo.Asociacion;
import dogLovers.modelo.CasaCuna;
import dogLovers.modelo.Logica;
import dogLovers.modelo.Mascota;
import dogLovers.modelo.Persona;
import dogLovers.modelo.Usuario;

/**
 * @author JoséDavid 25/10/2014
 */
public class Principal {

	/**** VARIABLES GLOBALES DEL SISTEMA ****/
	private final static Font letraTitulo1 = new Font("Georgia", Font.BOLD, 34);
	private final static Font letraTexto1 = new Font("Georgia", Font.PLAIN, 26);
	private final static Font letraTexto2 = new Font("Georgia", Font.PLAIN, 20);
	private final static Font letraTexto3 = new Font("Georgia", Font.PLAIN, 16);

	private static String SESION_USUARIO;
	private static int ancho = 1200, alto = 600;

	private static ArrayList<Asociacion> asociaciones = new ArrayList<Asociacion>();
	private static ArrayList<CasaCuna> casasCuna = new ArrayList<CasaCuna>();
	private static ArrayList<Mascota> mascotas = new ArrayList<Mascota>();
	private static ArrayList<Persona> personas = new ArrayList<Persona>();
	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	/**** DECLARACIï¿½N DE CONTROLADORES ****/
	// Declaración clase coordinador
	private static Coordinador coordinador;

	// Declaración clase lógica
	private static Logica logica;

	/**** DECLARACIï¿½N DE PANTALLAS ****/

	public static void main(String[] args) {
		System.gc();

		// LookAndFeel de la aplicacion
		JFrame.setDefaultLookAndFeelDecorated(true);
		try {
			UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
		}

		inicializarVentanas();
		// GenerarDatos.generarDatos();
	}

	/**
	 * Método creado para declarar todas la ventanas y establecer relaciones con
	 * el coordinador
	 */
	@SuppressWarnings("static-access")
	private static void inicializarVentanas() {
		/**** INSTANCIACIï¿½N CLASES ***/

		// Coordinador
		coordinador = Coordinador.getINSTANCE();
		// Lógica
		logica = new Logica();

		/**** RELACIONES ENTRE CLASES ****/

		// Lógica
		logica.setCoordinador(coordinador);

		/**** RELACIONES CON EL COORDINADOR ****/

		// Lógica
		coordinador.setLogica(logica);

		// coordinador.mostrarVentanaPrincipal();
	}

	/**** GETTERS AND SETTERS ****/
	public static String getSESION_USUARIO() {
		return SESION_USUARIO;
	}

	public static void setSESION_USUARIO(String sESION_USUARIO) {
		SESION_USUARIO = sESION_USUARIO;
	}

	public static Coordinador getCoordinador() {
		return coordinador;
	}

	public static void setCoordinador(Coordinador coordinador) {
		Principal.coordinador = coordinador;
	}

	public static Logica getLogica() {
		return logica;
	}

	public static void setLogica(Logica logica) {
		Principal.logica = logica;
	}

	public static Font getLetratitulo1() {
		return letraTitulo1;
	}

	public static Font getLetratexto1() {
		return letraTexto1;
	}

	public static Font getLetratexto2() {
		return letraTexto2;
	}

	public static Font getLetratexto3() {
		return letraTexto3;
	}

	public static int getAncho() {
		return ancho;
	}

	public static int getAlto() {
		return alto;
	}

	public static ArrayList<Asociacion> getAsociaciones() {
		return asociaciones;
	}

	public static void addAsociacion(Asociacion asociacion) {
		asociaciones.add(asociacion);
	}

	public static void removeAsociacion(Asociacion asociacion) {
		asociaciones.remove(asociacion);
	}

	public static ArrayList<CasaCuna> getCasasCuna() {
		return casasCuna;
	}

	public static void addCasaCuna(CasaCuna casaCuna) {
		casasCuna.add(casaCuna);
	}

	public static void removeCasaCuna(CasaCuna casaCuna) {
		casasCuna.remove(casaCuna);
	}

	public static ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public static void addMascota(Mascota mascota) {
		mascotas.add(mascota);
	}

	public static void removeMascota(Mascota mascota) {
		mascotas.remove(mascota);
	}

	public static ArrayList<Persona> getPersona() {
		return personas;
	}

	public static void addPersona(Persona persona) {
		personas.add(persona);
	}

	public static void removePersona(Persona persona) {
		personas.remove(persona);
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void addUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}

	public static void removeUsuario(Usuario usuario) {
		usuarios.remove(usuario);
	}
}
