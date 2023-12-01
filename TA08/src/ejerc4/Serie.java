/**
 * 
 */
package ejerc4;

/**
 * @author Nayara Nivea Gomes Santos
 *
 */
public class Serie {
	private final static int NUM_TEMP_DEF = 3;
	private final static boolean ENTREGADO_DEF = false;

	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	public Serie() {
		this.titulo = "";
		this.numTemporadas = NUM_TEMP_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = "";
	}

	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numTemporadas = NUM_TEMP_DEF;
		this.entregado = ENTREGADO_DEF;
		this.genero = "";
		this.creador = creador;
	}

	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = ENTREGADO_DEF;
		this.genero = genero;
		this.creador = creador;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the numTemporadas
	 */
	public int getNumTemporadas() {
		return numTemporadas;
	}

	/**
	 * @param numTemporadas the numTemporadas to set
	 */
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	/**
	 * @return the entregado
	 */
	public boolean isEntregado() {
		return entregado;
	}

	/**
	 * @param entregado the entregado to set
	 */
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the creador
	 */
	public String getCreador() {
		return creador;
	}

	/**
	 * @param creador the creador to set
	 */
	public void setCreador(String creador) {
		this.creador = creador;
	}

	/**
	 * @return the numTempDef
	 */
	public static int getNumTempDef() {
		return NUM_TEMP_DEF;
	}

	/**
	 * @return the entregadoDef
	 */
	public static boolean isEntregadoDef() {
		return ENTREGADO_DEF;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}

}
