/**
 * 
 */
package ejerc2;

import java.util.Random;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Password {
	private int longitud;
	private String contrasena;

	public Password() {
		this.longitud = 8;
		this.contrasena = "1234";
	}

	/**
	 * @param longitud
	 */
	public Password(int longitud) {

		this.longitud = longitud;
		this.contrasena = generarContrasena(longitud);
	}

	/**
	 * @return the longitud
	 */
	public int getLongitud() {
		return longitud;
	}

	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}

	private String generarContrasena(int longitud) {

		String caracteres = "qwertyuiopasdfghjklzxcvbnm@!?&%";
		Random random = new Random();
		String contrasena = "";
		for (int i = 0; i < longitud; i++) {
			contrasena += caracteres.charAt(random.nextInt(caracteres.length()));
		}

		return contrasena;
	}

}
