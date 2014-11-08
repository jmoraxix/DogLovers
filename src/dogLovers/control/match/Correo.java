package dogLovers.control.match;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.SendFailedException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import dogLovers.modelo.Mascota;
import dogLovers.modelo.Persona;




public  class Correo {

	private static String host = "smtp.gmail.com";
	private static String Password = "dogcat11	";
	private static String from = "dogloversapptec@gmail.com";
	public static final int ENCONTRADO = 0;
	public static final int PERDIDO = 1;



	public static void enviarCorreo(Persona persona, Mascota mascota, int estado) {

		String toAddress = persona.getCorreo();
		String file = mascota.getFotografia().get(0).getUrl();
		String filename = "Imagen mascota";
		// Get system properties
		Properties props = System.getProperties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtps.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		Session session = Session.getInstance(props, null);

		//		enviarCorreo(persona, mascota, Correo.ENCONTRADO);

		String msj = "Se ha reportado una mascota ";
		switch (estado) {
		case Correo.ENCONTRADO:
			msj += "perdida ";
			break;
		case Correo.PERDIDO:
			msj += "encontrada ";
			break;
		}

		msj += "que tiene conincidencias con una de sus mascotas reportadas." + "\n"
				+ "Favor contactar con la persona "+ mascota.getContacto().getNombre() + " "+ mascota.getContacto().getApellido1()
				+ mascota.getContacto().getApellido2() + " " + "al número "+ mascota.getContacto().getNumTelefono() + "o al correo "
				+ mascota.getContacto().getCorreo() + ".\n " + "Muchas gracias.";

		try {

			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, toAddress);
			switch (estado) {
			case Correo.ENCONTRADO:
				message.setSubject("Info DogLovers - Mascota Perdida");

				break;
			case Correo.PERDIDO:
				message.setSubject("Info DogLovers - Mascota Encontrada");

				break;
			}

			BodyPart messageBodyPart = new MimeBodyPart();
			messageBodyPart.setText("Fotografía");
			messageBodyPart.setText(msj);

			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart);

			messageBodyPart = new MimeBodyPart();

			DataSource source = new FileDataSource(file);

			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);

			multipart.addBodyPart(messageBodyPart);

			message.setContent(multipart);

			Transport tr = session.getTransport("smtps");
			tr.connect(host, from, Password);
			tr.sendMessage(message, message.getAllRecipients());
			System.out.println("Correo enviado satisfactoriamente");
			tr.close();

		} catch (SendFailedException sfe) {
			System.out.println("Error al enviar el correo: " + sfe);
		} catch (MessagingException e) {
			System.out.println("Error al crear el correo: " + e);
		}

	}

}
