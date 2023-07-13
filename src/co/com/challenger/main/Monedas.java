package co.com.challenger.main;

public enum Monedas {
	USD("USD", "Dólar estadounidense", 1), 
	EUR("EUR", "Euro", 0.90),
	COP("COP", "Pesos Colombianos", 4134.2700),
	GBP("GBP", "Libra esterlina", 0.7696);
	// Agrega aquí más monedas según tus necesidades

	private String codigo;
	private String nombre;
	private double tasaCambio;

	private Monedas(String codigo, String nombre, double tasaCambio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.tasaCambio = tasaCambio;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public double getTasaCambio() {
		return tasaCambio;
	}

	@Override
	public String toString() {
		return codigo;
	}
}
