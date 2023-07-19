package co.com.challenger.main;

/**
 * El enum Temperaturas representa las diferentes unidades de temperatura
 * disponibles. Cada unidad tiene un nombre y un código asociado. Proporciona
 * métodos para convertir entre las diferentes unidades de temperatura.
 */
public enum Temperaturas {
	CELSIUS("Celsius", "°C"), FAHRENHEIT("Fahrenheit", "°F"), KELVIN("Kelvin", "°K");

	private String nombre;
	private String codigo;

	/**
	 * Crea una instancia de Temperaturas con el nombre y el código proporcionados.
	 *
	 * @param nombre el nombre de la unidad de temperatura
	 * @param codigo el código de la unidad de temperatura
	 */
	private Temperaturas(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	/**
	 * Obtiene el nombre de la unidad de temperatura.
	 *
	 * @return el nombre de la unidad de temperatura
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Obtiene el código de la unidad de temperatura.
	 *
	 * @return el código de la unidad de temperatura
	 */
	public String getCodigo() {
		return this.codigo;
	}

	
}
