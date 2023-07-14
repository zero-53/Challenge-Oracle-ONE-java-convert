package co.com.challenger.main;

public enum Temperaturas {
	CELSIUS("Celsius", "°C"), FAHRENHEIT("Fahrenheit", "°F"), KELVIN("Kelvin", "°K");

	private String nombre;
	private String codigo;

	private Temperaturas(String nombre, String codigo) {
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getCodigo() {
		return this.codigo;
	}

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
