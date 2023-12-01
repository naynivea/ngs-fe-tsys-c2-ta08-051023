/**
 * 
 */
package ejerc3;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Eletrodomestico {
	protected final double PRECIO_BASE_DEF = 100;
	protected final String COLOR_DEF = "blanco";
	protected final char CONSUMO_DEF = 'F';
	protected final double PESO_DEF = 5;

	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;

	public Eletrodomestico() {
		this.precioBase = PRECIO_BASE_DEF;
		this.color = COLOR_DEF;
		this.consumo = CONSUMO_DEF;
		this.peso = PESO_DEF;
	}

	public Eletrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.color = COLOR_DEF;
		this.consumo = CONSUMO_DEF;
		this.peso = peso;
	}

	public Eletrodomestico(double precioBase, String color, char consumo, double peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	/**
	 * @return the precioBase
	 */
	public double getPrecioBase() {
		return precioBase;
	}

	/**
	 * @param precioBase the precioBase to set
	 */
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the consumo
	 */
	public char getConsumo() {
		return consumo;
	}

	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(char consumo) {
		this.consumo = consumo;
	}

	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Eletrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + "]";
	}
}
