/**
 * Primer Proyecto POO Jose David Mora Loria 2014004856 Diego Delgado Cerdas
 * 2013099268 David Diaz 2014004725 Roger Villalobos 2014079369 25/10/2014
 */

package dogLovers.control;

import dogLovers.modelo.Usuario;
import dogLovers.vista.Login;
import dogLovers.vista.usuario.ConsultaAsociaciones;
import dogLovers.vista.usuario.ConsultaCasasCuna;
import dogLovers.vista.usuario.ConsultaListaNegra;
import dogLovers.vista.usuario.ConsultaMascotas;
import dogLovers.vista.usuario.CrearAsociacion;
import dogLovers.vista.usuario.CrearCasaCuna;
import dogLovers.vista.usuario.CrearUsuario;
import dogLovers.vista.usuario.MenuConsultas;
import dogLovers.vista.usuario.MenuPrincipal_usuario;
import dogLovers.vista.usuario.VentanaAsociacion;

/**
 * @author JoséDavid 25/10/2014
 */
public class Coordinador {

	/**** DECLARACIÓN DE LA INSTANCIA COORDINADOR ****/
	private static final Coordinador INSTANCE = new Coordinador();

	public static Coordinador getINSTANCE() {
		return INSTANCE;

	}

	/**** DECLARACIÓN DE PANTALLAS ****/
	private static Login login;
	private static CrearUsuario crearUsuario;
	private static MenuPrincipal_usuario menuPrincipal_usuario;
	private static MenuConsultas menuConsultas;
	private static ConsultaAsociaciones consultaAsociaciones;
	private static ConsultaCasasCuna consultaCasasCuna;
	private static ConsultaListaNegra consultaListaNegra;
	private static ConsultaMascotas consultaMascotas;
	private static CrearAsociacion crearAsociacion;
	private static CrearCasaCuna crearCasaCuna;
	private static VentanaAsociacion ventanaAsociacion;

	/**** GETTERS AND SETTERS ***/
	public static Login getLogin() {
		return login;
	}

	public static void setLogin(Login login) {
		Coordinador.login = login;
	}

	public static CrearUsuario getUsuario() {
		return crearUsuario;
	}

	public static void setUsuario(CrearUsuario usuario) {
		Coordinador.crearUsuario = usuario;
	}

	public static MenuPrincipal_usuario getMenuPrincipal_Usuario() {
		return menuPrincipal_usuario;
	}

	public static void setMenuPrincipal_Usuario(
			MenuPrincipal_usuario menuPrincipal_Usuario) {
		Coordinador.menuPrincipal_usuario = menuPrincipal_Usuario;
	}

	public static CrearUsuario getCrearUsuario() {
		return crearUsuario;
	}

	public static void setCrearUsuario(CrearUsuario crearUsuario) {
		Coordinador.crearUsuario = crearUsuario;
	}

	public static MenuPrincipal_usuario getMenuPrincipal_usuario() {
		return menuPrincipal_usuario;
	}

	public static void setMenuPrincipal_usuario(
			MenuPrincipal_usuario menuPrincipal_usuario) {
		Coordinador.menuPrincipal_usuario = menuPrincipal_usuario;
	}

	public static MenuConsultas getMenuConsultas() {
		return menuConsultas;
	}

	public static void setMenuConsultas(MenuConsultas menuConsultas) {
		Coordinador.menuConsultas = menuConsultas;
	}

	public static ConsultaAsociaciones getConsultaAsociaciones() {
		return consultaAsociaciones;
	}

	public static void setConsultaAsociaciones(
			ConsultaAsociaciones consultaAsociaciones) {
		Coordinador.consultaAsociaciones = consultaAsociaciones;
	}

	public static ConsultaCasasCuna getConsultaCasasCuna() {
		return consultaCasasCuna;
	}

	public static void setConsultaCasasCuna(ConsultaCasasCuna consultaCasasCuna) {
		Coordinador.consultaCasasCuna = consultaCasasCuna;
	}

	public static ConsultaListaNegra getConsultaListaNegra() {
		return consultaListaNegra;
	}

	public static void setConsultaListaNegra(
			ConsultaListaNegra consultaListaNegra) {
		Coordinador.consultaListaNegra = consultaListaNegra;
	}

	public static ConsultaMascotas getConsultaMascotas() {
		return consultaMascotas;
	}

	public static void setConsultaMascotas(ConsultaMascotas consultaMascotas) {
		Coordinador.consultaMascotas = consultaMascotas;
	}

	public static CrearAsociacion getCrearAsociacion() {
		return crearAsociacion;
	}

	public static void setCrearAsociacion(CrearAsociacion crearAsociacion) {
		Coordinador.crearAsociacion = crearAsociacion;
	}

	public static CrearCasaCuna getCrearCasaCuna() {
		return crearCasaCuna;
	}

	public static void setCrearCasaCuna(CrearCasaCuna crearCasaCuna) {
		Coordinador.crearCasaCuna = crearCasaCuna;
	}

	public static VentanaAsociacion getVentanaAsociacion() {
		return ventanaAsociacion;
	}

	public static void setVentanaAsociacion(VentanaAsociacion ventanaAsociacion) {
		Coordinador.ventanaAsociacion = ventanaAsociacion;
	}

	/** MOSTRAR VENTANAS **/
	public static void mostrarLogin() {
		login.setVisible(true);
	}

	public static void mostrarCrearUsuario(Usuario usuario) {
		crearUsuario.setUsuario(usuario);
		crearUsuario.setVisible(true);
	}

	public static void mostrarMenuPrincipal_usuario() {
		menuPrincipal_usuario.setVisible(true);
	}

	/** OCULTAR VENTANAS **/
	public static void ocultarLogin() {
		login.setVisible(false);
	}

	public static void ocultarCrearUsuario() {
		crearUsuario.setVisible(false);
	}

	public static void ocultarMenuPrincipal_usuario() {
		menuPrincipal_usuario.setVisible(false);
	}

	/** MÉTODOS **/
	public static void modoAdministrador() {
		menuPrincipal_usuario.inicializarBarraMenu(true);
	}
}
