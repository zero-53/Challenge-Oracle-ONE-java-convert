package co.com.challenger.main;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * La clase Frame representa el marco principal de la aplicación. Extiende la
 * clase JFrame para crear una ventana con características específicas.
 * 
 * @author Amado León
 * @version 1.0.0
 */
public class Frame extends JFrame {
	private static final long serialVersionUID = 8845655613306682261L;
	private Toolkit pantalla = Toolkit.getDefaultToolkit();
	private Dimension sizePantalla = pantalla.getScreenSize();
	private int h = sizePantalla.height;
	private int w = sizePantalla.width;

	/**
	 * Crea una instancia de Frame con la configuración predeterminada.
	 */
	public Frame() {
		setResizable(false);
		setFont(new Font("Raleway Thin", Font.BOLD, 29));
		setIconImage(Toolkit.getDefaultToolkit().getImage("assets\\icono.png"));
		setTitle("Challenge ONE Back End - Java Conversor de Moneda");
		setBounds(w / 4, h / 4, w / 2, h / 2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(SystemColor.window);
	}
}
