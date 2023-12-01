/**
 * 
 */
package ejerc1;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Persona {

	private final char SEXO_DEF = 'H';

	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	public Persona(String dni) {
		this.nombre = "";
		this.edad = 0;
		this.dni = dni;
		this.sexo = SEXO_DEF;
		this.peso = 0;
		this.altura = 0;
	}

	/**
	 * @param nombre nombre de la Persona
	 * @param edad   edad de la Persona
	 * @param sexo   sexo de Persona
	 * @param dni    DNI Persona
	 */
	public Persona(String nombre, int edad, String dni, char sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = 0;
		this.altura = 0;

	}

	/**
	 * @param nombre nombre de la Persona
	 * @param edad   edad de la Persona
	 * @param dni    DNI de la Persona
	 * @param sexo   sexo de Persona
	 * @param peso   peso de Persona
	 * @param altura altura de Persona
	 */
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the sexo
	 */
	public char getSexo() {
		return sexo;
	}

	/**
	 * @param sexo the sexo to set
	 */
	public void setSexo(char sexo) {
		this.sexo = sexo;
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

	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Persona [SEXO_DEF=" + SEXO_DEF + ", nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo="
				+ sexo + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
