/**
 * 
 */
package ejerc3;

import javax.swing.JOptionPane;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Ejerc3App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		boolean seguir = true;

		Eletrodomestico eletrodomestico1 = new Eletrodomestico();
		Eletrodomestico eletrodomestico2 = new Eletrodomestico(300, 20);

		while (seguir) {
			char consumo = JOptionPane.showInputDialog("Diga el consumo del eletrodomstico").charAt(0);
			if (validarConsumo(consumo)) {
				while (seguir) {
					String color = JOptionPane.showInputDialog("Diga el color del eletrodomstico").toLowerCase();
					if (validarColor(color)) {
						Eletrodomestico eletrodomestico3 = new Eletrodomestico(200, color, consumo, 10);
						seguir = false;

						System.out.println(eletrodomestico1.toString());
						System.out.println(eletrodomestico2.toString());
						System.out.println(eletrodomestico3.toString());

					} else {
						JOptionPane.showMessageDialog(null, "Valor invlido");
					}
				}
			} else {
				JOptionPane.showMessageDialog(null, "Valor invlido");
			}
		}
	}

	private static boolean validarConsumo(char consumo) {
		String letras = "abcdefABCDEF";
		boolean esta = false;
		int i = 0;

		while (!esta && i < letras.length()) {
			if (consumo == letras.charAt(i)) {
				esta = true;
			}
			i++;
		}
		return esta;
	}

	private static boolean validarColor(String color) {
		String[] colores = { "blanco", "negro", "rojo", "azul", "gris" };
		boolean esta = false;
		int i = 0;

		while (!esta && i < colores.length) {
			if (color.equals(colores[i])) {
				esta = true;
			}
			i++;
		}

		return esta;
	}

}
