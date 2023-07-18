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

	/**
	 * Convierte un valor de temperatura de la unidad actual a la unidad de
	 * temperatura especificada.
	 *
	 * @param valor         el valor de temperatura a convertir
	 * @param unidadDestino la unidad de temperatura a la que se desea convertir
	 * @return el valor de temperatura convertido a la unidad de destino
	 */
	public double convertir(double valor, Temperaturas unidadDestino) {
		if (this == unidadDestino) {
			return valor; // No se requiere conversión si las unidades son las mismas
		}

		// Convertir a Celsius como paso intermedio
		double celsius = convertirACelsius(valor, this);

		// Convertir desde Celsius a la unidad de destino
		return convertirDesdeCelsius(celsius, unidadDestino);
	}

	private double convertirACelsius(double valor, Temperaturas unidadOrigen) {
		if (unidadOrigen == CELSIUS) {
			return valor; // No se requiere conversión si la unidad de origen es Celsius
		} else if (unidadOrigen == FAHRENHEIT) {
			return (valor - 32) * 5 / 9;
		} else if (unidadOrigen == KELVIN) {
			return valor - 273.15;
		}
		return 0; // Manejar caso por defecto
	}

	private double convertirDesdeCelsius(double valorCelsius, Temperaturas unidadDestino) {
		if (unidadDestino == CELSIUS) {
			return valorCelsius; // No se requiere conversión si la unidad de destino es Celsius
		} else if (unidadDestino == FAHRENHEIT) {
			return (valorCelsius * 9 / 5) + 32;
		} else if (unidadDestino == KELVIN) {
			return valorCelsius + 273.15;
		}
		return 0; // Manejar caso por defecto
	}
}
