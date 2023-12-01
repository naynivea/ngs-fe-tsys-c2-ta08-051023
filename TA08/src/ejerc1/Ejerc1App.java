/**
 * 
 */
package ejerc1;
/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc1App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persona persona1 = new Persona("55289587k");
		Persona persona2 = new Persona("Claudia", 28, "54285567l", 'M');
		Persona persona3 = new Persona("Juan", 37, "53289588k", 'M', 63.8, 1.75);

		System.out.println(persona1.toString());
		System.out.println(persona2.toString());
		System.out.println(persona3.toString());

	}

}
