package co.com.challenger.main;

/**
 * La clase Temperatura representa una temperatura con un nombre, un código y un
 * índice asociados. También tiene una referencia a un objeto de la enumeración
 * Temperaturas.
 */
public class Temperatura {
	private String nombre;
	private String codigo;
	private int index;
	private Temperaturas temperatura;

	/**
	 * Crea una instancia de Temperatura con los valores proporcionados.
	 *
	 * @param nombre      el nombre de la temperatura
	 * @param codigo      el código de la temperatura
	 * @param index       el índice de la temperatura
	 * @param temperatura la temperatura asociada
	 */
	public Temperatura(String nombre, String codigo, int index, Temperaturas temperatura) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.index = index;
		this.temperatura = temperatura;
	}

	/**
	 * Obtiene el nombre de la temperatura.
	 *
	 * @return el nombre de la temperatura
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la temperatura.
	 *
	 * @param nombre el nuevo nombre de la temperatura
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el código de la temperatura.
	 *
	 * @return el código de la temperatura
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Establece el código de la temperatura.
	 *
	 * @param codigo el nuevo código de la temperatura
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Obtiene el índice de la temperatura.
	 *
	 * @return el índice de la temperatura
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Establece el índice de la temperatura.
	 *
	 * @param index el nuevo índice de la temperatura
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Obtiene la temperatura asociada.
	 *
	 * @return la temperatura asociada
	 */
	public Temperaturas getTemperatura() {
		return temperatura;
	}

	/**
	 * Establece la temperatura asociada.
	 *
	 * @param temperatura la nueva temperatura asociada
	 */
	public void setTemperatura(Temperaturas temperatura) {
		this.temperatura = temperatura;
	}

	/**
	 * Devuelve una representación en forma de cadena de la temperatura.
	 *
	 * @return una cadena que representa la temperatura
	 */
	@Override
	public String toString() {
		return "Temperatura [nombre=" + nombre + ", codigo=" + codigo + ", index=" + index + "]";
	}

}
