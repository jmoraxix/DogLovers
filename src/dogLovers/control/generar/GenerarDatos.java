package dogLovers.control.generar;

import dogLovers.modelo.Usuario;

public final class GenerarDatos {

	public static void generarDatos() {
		generarUsuarios();

	}

	private static void generarUsuarios() {
		Usuario diego = new Usuario("admin", "123", true);
	}
}
