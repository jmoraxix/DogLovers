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
 * Nov 10, 2014
 */
package dogLovers.control;

import java.util.ArrayList;

import dogLovers.modelo.Mascota;
import dogLovers.modelo.Mascota.EstadoMascota;
import dogLovers.modelo.Usuario;

/**
 * @author Diego Nov 10, 2014
 */
public class Consultas {

	public static ArrayList<Mascota> consultarMascotasAdoptadasPorUsuario(
			Usuario usuario) {
		ArrayList<Mascota> resultado = new ArrayList<Mascota>();
		for (Mascota mascota : Principal.getMascotas()) {
			if (mascota.getEstado().equals(EstadoMascota.Adoptado)
					&& mascota.getContacto().equals(usuario.getDatos()))
				resultado.add(mascota);
		}

		return resultado;
	}

	public static ArrayList<Mascota> consultarEnAdopcion() {
		ArrayList<Mascota> resultado = new ArrayList<Mascota>();
		for (Mascota mascota : Principal.getMascotas()) {
			if (mascota.getEstado().equals(EstadoMascota.En_Adopcion))
				resultado.add(mascota);
		}

		return resultado;
	}

}
