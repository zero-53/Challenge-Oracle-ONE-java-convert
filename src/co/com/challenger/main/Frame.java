package co.com.challenger.main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame {
	/**
	 * @author Amado León
	 * @version 1.0.0
	 * 
	 */
	private static final long serialVersionUID = 8845655613306682261L;
	Toolkit pantalla = Toolkit.getDefaultToolkit();
	Dimension sizePantalla = pantalla.getScreenSize();
	int h = sizePantalla.height;
	int w = sizePantalla.width;
	/**
	 * Clase que permite la creación del Frame principal
	 */
	Frame() {
		setResizable(false);
		setFont(new Font("Raleway Thin", Font.BOLD, 29));
		setIconImage(Toolkit.getDefaultToolkit().getImage("assets\\icono.png"));
		setTitle("Challenge ONE Back End - Java Conversor de Moneda");
		setBounds(w / 4, h / 4, w / 2, h / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(SystemColor.window);
	}
}
