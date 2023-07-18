package co.com.challenger.main;

import javax.swing.JTextField;

/**
 * La clase Moneda representa una moneda con una tasa de cambio específica.
 */
public class Moneda {
	private double tasa;
	private String codigo;
	private String nombre;
	private int index;
	private JTextField entrada;

	/**
	 * 
	 * @param tasa   la tasa de cambio de la moneda
	 * @param codigo el código de la moneda
	 * @param nombre el nombre de la moneda
	 * @param index  el índice de la moneda
	 */
	public Moneda(double tasa, String codigo, String nombre, int index) {
		super();
		this.tasa = tasa;
		this.codigo = codigo;
		this.nombre = nombre;
		this.index = index;
	}

	/**
	 * Obtiene la tasa de cambio de la moneda.
	 *
	 * @return la tasa de cambio de la moneda
	 */

	public double getTasa() {
		return tasa;
	}

	/**
	 * Establece la tasa de cambio de la moneda.
	 *
	 * @param tasa la nueva tasa de cambio de la moneda
	 */
	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	/**
	 * Obtiene el código de la moneda.
	 *
	 * @return el código de la moneda
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * Establece el código de la moneda.
	 *
	 * @param codigo el nuevo código de la moneda
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * Obtiene el nombre de la moneda.
	 *
	 * @return el nombre de la moneda
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la moneda.
	 *
	 * @param nombre el nuevo nombre de la moneda
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene el índice de la moneda.
	 *
	 * @return el índice de la moneda
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Establece el índice de la moneda.
	 *
	 * @param index el nuevo índice de la moneda
	 */
	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * Convierte un valor ingresado a la moneda a su equivalente en USD (Dólares
	 * estadounidenses).
	 *
	 * @return el valor convertido a USD
	 */
	public double ConvToUSD() {
		double valor = 0;
		if (!this.entrada.getText().equals("")) {
			valor = Double.parseDouble(this.entrada.getText());
		}
		return valor / this.tasa;
	}

	/**
	 * Obtiene el campo de entrada de texto asociado a la moneda.
	 *
	 * @return el campo de entrada de texto
	 */
	public JTextField getEntrada() {
		return entrada;
	}

	/**
	 * Establece el campo de entrada de texto asociado a la moneda.
	 *
	 * @param entrada el nuevo campo de entrada de texto
	 */
	public void setEntrada(JTextField entrada) {
		this.entrada = entrada;
	}

	/**
	 * Devuelve una representación en forma de cadena de la moneda.
	 *
	 * @return una cadena que representa la moneda
	 */
	@Override
	public String toString() {
		return "Moneda [tasa=" + tasa + ", codigo=" + codigo + ", nombre=" + nombre + ", index=" + index + ", entrada="
				+ entrada + "]";
	}

}
