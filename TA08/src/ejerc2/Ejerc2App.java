/**
 * 
 */
package ejerc2;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc2App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Password pass1 = new Password();
		Password pass2 = new Password(10);

		System.out.println("Password 1: " + pass1.getContrasena());
		System.out.println("Password 2: " + pass2.getContrasena());

	}

}
