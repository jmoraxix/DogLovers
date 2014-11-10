
package dogLovers.control.generar;

import java.util.Calendar;

import dogLovers.control.Principal;
import dogLovers.modelo.Asociacion;
import dogLovers.modelo.CaracteristicasMascota;
import dogLovers.modelo.CaracteristicasMascota.RazaMascota;
import dogLovers.modelo.CaracteristicasMascota.TamanoMascota;
import dogLovers.modelo.CaracteristicasMascota.TipoMascota;
import dogLovers.modelo.CasaCuna;
import dogLovers.modelo.Donacion;
import dogLovers.modelo.Mascota;
import dogLovers.modelo.Mascota.EstadoMascota;
import dogLovers.modelo.Monto;
import dogLovers.modelo.Monto.Moneda;
import dogLovers.modelo.Persona;
import dogLovers.modelo.Usuario;

public final class GenerarDatos {

	private static Usuario admin, usr1, usr2, usr3, usr4;

	/*
	 * Generar: usuarios, personas, mascotas perdidas, mascotas encontradas,
	 * casas cuna, asociaciones
	 */
	public static void generarDatos() {
		generarUsuarios();
		generarListaNegra();
		generarMascotasEncontradas();
		generarMascotasPerdidas();
		generarMascotasPropias();
		generarCasaCuna();
		generarAsociaciones();
	}

	private static void generarUsuarios() {
		// Primer usuario administrador
		admin = new Usuario("admin", "123", true);
		Persona persAdmin = new Persona("123456789", "Admin", "Muy bueno",
				"Sin segundo apellido");
		persAdmin.setCorreo("jdevmora@gmail.com");
		persAdmin.setNumTelefono("84518318");
		persAdmin.setUbicacion("San José");
		admin.setDatos(persAdmin);
		// Primer usuario normal
		usr1 = new Usuario("usr", "123", false);
		Persona persUsr1 = new Persona("789456123", "Usuario", "Primero",
				"ConApellido");
		persUsr1.setCorreo("a.diego.dc@gmail.com");
		persUsr1.setNumTelefono("58411318");
		persUsr1.setUbicacion("Heredia");
		usr1.setDatos(persUsr1);
		// Segundo usuario normal
		usr2 = new Usuario("usr2", "123", false);
		Persona persUsr2 = new Persona("65489721", "Usuario", "Segundo",
				"ConApellidoRaro");
		persUsr2.setCorreo("a.diego.dc@gmail.com");
		persUsr2.setNumTelefono("65498754");
		persUsr2.setUbicacion("San Antonio");
		usr2.setDatos(persUsr2);
		// Tercer usuario normal
		usr3 = new Usuario("usr3", "123", false);
		Persona persUsr3 = new Persona("11111111", "Usuario", "Tercero",
				"Apellido3");
		persUsr3.setCorreo("a.diego.dc@gmail.com");
		persUsr3.setNumTelefono("58411318");
		persUsr3.setUbicacion("Heredia");
		usr3.setDatos(persUsr3);
		// Cuarto usuario normal
		usr4 = new Usuario("usr4", "123", false);
		Persona persUsr4 = new Persona("55555555", "Usuario", "Cuarta",
				"ConApellido");
		persUsr4.setCorreo("a.diego.dc@gmail.com");
		persUsr4.setNumTelefono("58411318");
		persUsr4.setUbicacion("Heredia");
		usr4.setDatos(persUsr4);

		Principal.addUsuario(admin);
		Principal.addUsuario(usr1);
		Principal.addUsuario(usr2);
		Principal.addUsuario(usr3);
		Principal.addUsuario(usr4);
		Principal.addPersona(persAdmin);
		Principal.addPersona(persUsr1);
		Principal.addPersona(persUsr2);
		Principal.addPersona(persUsr3);
		Principal.addPersona(persUsr4);
	}

	private static void generarListaNegra() {
		// Primer usuario normal
		Usuario usrn1 = new Usuario("usrn1", "123", false);
		Persona persUsr1 = new Persona("1531245", "Usuario", "Negro", "Primero");
		persUsr1.setCorreo("a.diego.dc@gmail.com");
		persUsr1.setNumTelefono("58411318");
		persUsr1.setUbicacion("Heredia");
		persUsr1.agregarListaNegra();
		usrn1.setDatos(persUsr1);
		// Segundo usuario normal
		Usuario usrn2 = new Usuario("usrn2", "123", false);
		Persona persUsr2 = new Persona("5415123", "Usuario", "Negro", "Segundo");
		persUsr2.setCorreo("a.diego.dc@gmail.com");
		persUsr2.setNumTelefono("65498754");
		persUsr2.setUbicacion("San Antonio");
		persUsr2.agregarListaNegra();
		usrn2.setDatos(persUsr2);
		// Tercer usuario normal
		Usuario usrn3 = new Usuario("usrn3", "123", false);
		Persona persUsr3 = new Persona("55156152", "Usuario", "Negro",
				"Tercero");
		persUsr3.setCorreo("a.diego.dc@gmail.com");
		persUsr3.setNumTelefono("58411318");
		persUsr3.setUbicacion("Heredia");
		persUsr3.agregarListaNegra();
		usrn3.setDatos(persUsr3);
		// Cuarto usuario normal
		Usuario usrn4 = new Usuario("usrn4", "123", false);
		Persona persUsr4 = new Persona("51651538", "Usuario", "Negro", "Cuarta");
		persUsr4.setCorreo("a.diego.dc@gmail.com");
		persUsr4.setNumTelefono("58411318");
		persUsr4.setUbicacion("Heredia");
		persUsr4.agregarListaNegra();
		usrn4.setDatos(persUsr4);

		Principal.addUsuario(usrn1);
		Principal.addUsuario(usrn2);
		Principal.addUsuario(usrn3);
		Principal.addUsuario(usrn4);
		Principal.addPersona(persUsr1);
		Principal.addPersona(persUsr2);
		Principal.addPersona(persUsr3);
		Principal.addPersona(persUsr4);
	}

	private static void generarMascotasEncontradas() {
		// Primer mascota encontrada
		Mascota perro1 = new Mascota("Bobby", usr2.getDatos(),
				EstadoMascota.Encontrado);
		perro1.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Dálmata, TamanoMascota.Mediano));
		perro1.setChipID("dsf4561");
		perro1.setColor("negro");
		perro1.setFecha(Calendar.getInstance().getTime());
		// Segunda mascota encontrada
		Mascota perro2 = new Mascota("Usy", usr3.getDatos(),
				EstadoMascota.Encontrado);
		perro2.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Basset_Hound, TamanoMascota.Mediano));
		perro2.setChipID("4f65sd4fs");
		perro2.setColor("cafe");
		perro2.setFecha(Calendar.getInstance().getTime());
		// Tercera mascota encontrada
		Mascota perro3 = new Mascota("Max", usr3.getDatos(),
				EstadoMascota.Encontrado);
		perro3.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Beagle, TamanoMascota.Mediano));
		perro3.setColor("cafe");
		perro3.setFecha(Calendar.getInstance().getTime());
		// Cuarta mascota encontrada
		Mascota perro4 = new Mascota("Sparky", usr2.getDatos(),
				EstadoMascota.Encontrado);
		perro4.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Chihuahua, TamanoMascota.Pequeño));
		perro4.setColor("negro");
		perro4.setFecha(Calendar.getInstance().getTime());
		// Quinta mascota encontrada
		Mascota perro5 = new Mascota("Bruno", usr2.getDatos(),
				EstadoMascota.Encontrado);
		perro5.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Pastor_Alemán, TamanoMascota.Grande));
		perro5.setChipID("48564fsd");
		perro5.setColor("dorado");
		perro5.setFecha(Calendar.getInstance().getTime());
		// Sexta mascota encontrada
		Mascota perro6 = new Mascota("Tyson", usr2.getDatos(),
				EstadoMascota.Encontrado);
		perro6.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Boxer, TamanoMascota.Grande));
		perro6.setChipID("84561AAA");
		perro6.setColor("gris");
		perro6.setFecha(Calendar.getInstance().getTime());

		Principal.addMascota(perro1);
		Principal.addMascota(perro2);
		Principal.addMascota(perro3);
		Principal.addMascota(perro4);
		Principal.addMascota(perro5);
		Principal.addMascota(perro6);
	}

	private static void generarMascotasPerdidas() {
		// Primer mascota perdida
		Mascota perro1 = new Mascota("Coby", usr4.getDatos(),
				EstadoMascota.Perdido);
		perro1.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Chow_Chow, TamanoMascota.Mediano));
		perro1.setChipID("84561AAA");
		perro1.setColor("cafe");
		perro1.setFecha(Calendar.getInstance().getTime());
		perro1.setRecompensa(new Monto(25000.00, Moneda.Colón));
		// Segunda mascota perdida
		Mascota perro2 = new Mascota("Sisy", usr3.getDatos(),
				EstadoMascota.Perdido);
		perro2.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Pit_Bull, TamanoMascota.Mediano));
		perro2.setChipID("84561AAA");
		perro2.setColor("cafe");
		perro2.setFecha(Calendar.getInstance().getTime());
		perro2.setRecompensa(new Monto(20.00, Moneda.Dolar));
		// Tercera mascota perdida
		Mascota perro3 = new Mascota("Res", usr3.getDatos(),
				EstadoMascota.Perdido);
		perro3.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.San_Bernardo, TamanoMascota.Mediano));
		perro3.setChipID("84561AAA");
		perro3.setColor("blanco");
		perro3.setFecha(Calendar.getInstance().getTime());
		perro3.setRecompensa(new Monto(3.00, Moneda.Euro));
		// Cuarta mascota perdida
		Mascota perro4 = new Mascota("Pinky", usr4.getDatos(),
				EstadoMascota.Perdido);
		perro4.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Chihuahua, TamanoMascota.Pequeño));
		perro4.setColor("rosado");
		perro4.setFecha(Calendar.getInstance().getTime());
		// Quinta mascota perdida
		Mascota perro5 = new Mascota("Bruno", usr3.getDatos(),
				EstadoMascota.Perdido);
		perro5.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Rottweiler, TamanoMascota.Grande));
		perro5.setColor("negro");
		perro5.setFecha(Calendar.getInstance().getTime());
		// Sexta mascota perdida
		Mascota perro6 = new Mascota("Tyson", usr2.getDatos(),
				EstadoMascota.Perdido);
		perro6.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Cocker_Inglés, TamanoMascota.Grande));
		perro6.setChipID("84561AAA");
		perro6.setColor("cafe");
		perro6.setFecha(Calendar.getInstance().getTime());

		Principal.addMascota(perro1);
		Principal.addMascota(perro2);
		Principal.addMascota(perro3);
		Principal.addMascota(perro4);
		Principal.addMascota(perro5);
		Principal.addMascota(perro6);
	}

	private static void generarMascotasPropias() {
		// Primer mascota propia
		Mascota perro1 = new Mascota("Coco", usr4.getDatos(),
				EstadoMascota.Propio);
		perro1.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Perro,
				RazaMascota.Labrador_Retriever, TamanoMascota.Mediano));
		perro1.setChipID("5555sssA");
		perro1.setColor("Dorado");
		perro1.setFecha(Calendar.getInstance().getTime());
		// Segunda mascota propia
		Mascota perro2 = new Mascota("Sisy", usr4.getDatos(),
				EstadoMascota.Propio);
		perro2.setCaracteristicas(new CaracteristicasMascota(TipoMascota.Gato,
				RazaMascota.Sin_Especificar, TamanoMascota.Pequeño));
		perro2.setColor("Blanco");
		perro2.setFecha(Calendar.getInstance().getTime());

		Principal.addMascota(perro1);
		Principal.addMascota(perro2);
	}

	private static void generarCasaCuna() {
		CasaCuna casaCuna = new CasaCuna(usr4.getDatos(), false);
		casaCuna.addCaracteristicaMascota(new CaracteristicasMascota(
				TipoMascota.Perro, RazaMascota.Sin_Especificar,
				TamanoMascota.Pequeño));
		casaCuna.addCaracteristicaMascota(new CaracteristicasMascota(
				TipoMascota.Gato, RazaMascota.Sin_Especificar,
				TamanoMascota.Pequeño));

		Principal.addCasaCuna(casaCuna);
	}

	private static void generarAsociaciones() {
		Asociacion asoc1 = new Asociacion("45415165as", "AsoProA");
		asoc1.addAsociado(usr2.getDatos());
		asoc1.addAsociado(usr3.getDatos());
		asoc1.addAsociado(usr4.getDatos());
		asoc1.addCalificacion(4, "Muy buenos");
		asoc1.addCalificacion(5);
		asoc1.addCalificacion(3, "No me gusta");
		asoc1.addDonacion(new Donacion(new Monto(50000, Moneda.Colón), usr3
				.getDatos()));
		asoc1.addDonacion(new Donacion(new Monto(1000, Moneda.Colón), usr3
				.getDatos()));
		asoc1.addDonacion(new Donacion(new Monto(10000, Moneda.Colón), usr2
				.getDatos()));
		asoc1.addDonacion(new Donacion(new Monto(50, Moneda.Dolar), usr4
				.getDatos()));
		asoc1.addDonacion(new Donacion(new Monto(325, Moneda.Dolar), usr4
				.getDatos()));
		asoc1.addDonacion(new Donacion(new Monto(500, Moneda.Colón), usr3
				.getDatos()));
		asoc1.addDonacion(new Donacion(new Monto(111, Moneda.Euro), usr4
				.getDatos()));

		Principal.addAsociacion(asoc1);
	}
}
