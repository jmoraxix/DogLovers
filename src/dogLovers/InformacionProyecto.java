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
 * 25/10/2014
 */

package dogLovers;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import dogLovers.control.Coordinador;
import dogLovers.vista.VentanaEmergente;

/**
 * @author Jos�David 25/10/2014
 */
public class InformacionProyecto extends VentanaEmergente {

	private static final long serialVersionUID = 6445936386416162679L;
	private static Coordinador coordinador;

	public InformacionProyecto(JFrame padre) {
		super(padre, "Informaci\u00f3n proyecto", "fondo_emergente.png");
		setSize(880, 561);
		getContentPane().setLayout(null);

		JLabel NomProyecto = new JLabel("Biblioteca Alejandriax");
		NomProyecto.setBounds(325, 37, 221, 22);
		NomProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		NomProyecto.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(NomProyecto);

		JLabel Version = new JLabel("VERSION 1.0.0 (Actualizado 14/07/14)");
		Version.setBounds(248, 70, 360, 22);
		Version.setHorizontalAlignment(SwingConstants.CENTER);
		Version.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(Version);

		JLabel Tec = new JLabel("Instituto Tecnol\u00f3gico de Costa Rica");
		Tec.setBounds(248, 115, 350, 22);
		Tec.setHorizontalAlignment(SwingConstants.CENTER);
		Tec.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(Tec);

		JLabel Carrera = new JLabel("Ingenier\u00eda en Computaci\u00f3n");
		Carrera.setBounds(296, 172, 250, 22);
		Carrera.setHorizontalAlignment(SwingConstants.CENTER);
		Carrera.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(Carrera);

		JLabel Curso = new JLabel("Programaci\u00f3n Orientada a Objetos");
		Curso.setBounds(265, 205, 320, 22);
		Curso.setHorizontalAlignment(SwingConstants.CENTER);
		Curso.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(Curso);

		JLabel PrimProyecto = new JLabel("Primer Proyecto");
		PrimProyecto.setBounds(347, 238, 158, 22);
		PrimProyecto.setHorizontalAlignment(SwingConstants.CENTER);
		PrimProyecto.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(PrimProyecto);

		JLabel lblJosDavidMora = new JLabel("Jos\u00e9 David Mora Lor\u00eda");
		lblJosDavidMora.setBounds(315, 345, 210, 22);
		lblJosDavidMora.setHorizontalAlignment(SwingConstants.CENTER);
		lblJosDavidMora.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(lblJosDavidMora);

		JLabel lblDiegoDelgado = new JLabel("Diego Delgado Cerdas");
		lblDiegoDelgado.setBounds(325, 312, 200, 22);
		lblDiegoDelgado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiegoDelgado.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(lblDiegoDelgado);

		JLabel lblRogerVillalobos = new JLabel(
				"R\u00f3ger Villalobos Rodr\u00edguez");
		lblRogerVillalobos.setBounds(296, 405, 269, 22);
		lblRogerVillalobos.setHorizontalAlignment(SwingConstants.CENTER);
		lblRogerVillalobos.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(lblRogerVillalobos);

		JLabel lblDavidDiaz = new JLabel("David D\u00EDaz Aguilar");
		lblDavidDiaz.setBounds(325, 378, 200, 22);
		lblDavidDiaz.setHorizontalAlignment(SwingConstants.CENTER);
		lblDavidDiaz.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(lblDavidDiaz);

		JLabel Anno = new JLabel("2014");
		Anno.setBounds(407, 438, 40, 22);
		Anno.setHorizontalAlignment(SwingConstants.CENTER);
		Anno.setFont(new Font("Consolas", Font.BOLD, 18));
		getContentPane().add(Anno);
	}

	public static void setCoordinador(Coordinador coordinador) {
		InformacionProyecto.coordinador = coordinador;
	}

	public static Coordinador getCoordinador() {
		return coordinador;
	}
}