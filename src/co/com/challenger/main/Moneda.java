package co.com.challenger.main;

import javax.swing.JTextField;

public class Moneda {
	private double tasa;
	private String codigo;
	private String nombre;
	private int index;
	private JTextField entrada;

	public Moneda(double tasa, String codigo, String nombre, int index) {
		super();
		this.tasa = tasa;
		this.codigo = codigo;
		this.nombre = nombre;
		this.index = index;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	public double ConvToUSD(double valor) {
		return valor * this.tasa;
	}

	public JTextField getEntrada() {
		return entrada;
	}

	public void setEntrada(JTextField entrada) {
		this.entrada = entrada;
	}

}
