/**
 * 
 */
package ejerc4;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc4App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Serie serie1 = new Serie();
		Serie serie2 = new Serie("El cuento de la criada", "Bruce Miller");
		Serie serie3 = new Serie("The Walking Dead", 10, "Horror", "Frank Darabont");

		System.out.println(serie1.toString());
		System.out.println(serie2.toString());
		System.out.println(serie3.toString());

	}

}
