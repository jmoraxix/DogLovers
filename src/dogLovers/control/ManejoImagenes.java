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
 * 10/11/2014
 */
package dogLovers.control;

/**
 * @author Roger 10/11/2014
 */


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
public class ManejoImagenes {

	FileNameExtensionFilter filtroimagen = new FileNameExtensionFilter(".jpg","jpg");	

	public void copiarImagen() {

		try{
			
			JFileChooser rutaArchivo = new JFileChooser();
			rutaArchivo.setFileFilter(filtroimagen);
			rutaArchivo.showDialog(rutaArchivo, "copiar");
			String path = rutaArchivo.getSelectedFile().getAbsolutePath();
			File nomArchivo = new File(path);

			String nombreProyecto = "DogsLovers";
			File direccion = new File(System.getProperty("user.home") + "\\" + nombreProyecto);

			try {
				File inFile = new File(path);
				File outFile = new File(direccion + "\\" + nomArchivo.getName());

				FileInputStream in = new FileInputStream(inFile);
				FileOutputStream out = new FileOutputStream(outFile);

				int c;
				while( (c = in.read() ) != -1)
					out.write(c);

				in.close();
				out.close();
			} catch(IOException e) {
				System.err.println("Hubo un error de entrada/salida!!!");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
