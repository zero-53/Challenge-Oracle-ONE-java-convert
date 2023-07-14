package co.com.challenger.main;

public class Temperatura {
	private String nombre;
	private String codigo;
	private int index;
	private Temperaturas temperatura;

	public Temperatura(String nombre, String codigo, int index, Temperaturas temperatura) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.index = index;
		this.temperatura = temperatura;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public Temperaturas getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Temperaturas temperatura) {
		this.temperatura = temperatura;
	}

	@Override
	public String toString() {
		return "Temperatura [nombre=" + nombre + ", codigo=" + codigo + ", index=" + index + "]";
	}

}
