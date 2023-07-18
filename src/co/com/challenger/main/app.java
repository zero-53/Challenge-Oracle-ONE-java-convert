package co.com.challenger.main;

import java.awt.*;
import javax.swing.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.Box;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.KeyAdapter;

/**
 * La clase `app` representa la aplicación principal del conversor de unidades.
 * Proporciona una interfaz gráfica de usuario con opciones para convertir entre
 * diferentes unidades de medida, como moneda, temperatura, volumen, etc.
 */
public class app {

	private Frame frmOracleNext;
	private JMenuBar menuBar;
	private JTextField ingresoMoneda1;
	private JTextField ingresoMoneda2;
	Monedas[] monedas = Monedas.values();
	Temperaturas[] temp = Temperaturas.values();
	private JTextField valorTemp;

	/**
	 * Método principal que inicia la aplicación.
	 * 
	 * @param args los argumentos de la línea de comandos (no se utilizan en esta
	 *             aplicación)
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					app window = new app();
					window.frmOracleNext.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Crea la aplicación.
	 */
	public app() {
		initialize();
	}

	/**
	 * Inicializa el contenido del marco de la aplicación.
	 */
	private void initialize() {
		frmOracleNext = new Frame();
		/*
		 * //------ Menú ------------ // TODO: Futura implementación para nuevas
		 * caracteristicas del menu principal y contextual
		 * 
		 * JPopupMenu popupMenu = new JPopupMenu(); popupMenu.setToolTipText("menu tt");
		 * popupMenu.setLabel("menu"); popupMenu.setBackground(SystemColor.desktop);
		 * addPopup(frmOracleNext.getContentPane(), popupMenu);
		 * 
		 * JMenuItem mntmNewMenuItem = new JMenuItem("Menú 1");
		 * mntmNewMenuItem.setBackground(SystemColor.menu);
		 * mntmNewMenuItem.setSelectedIcon(null);
		 * mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		 * popupMenu.add(mntmNewMenuItem);
		 * 
		 * JMenuItem mntmNewMenuItem_1 = new JMenuItem("Menú 2");
		 * mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.CENTER);
		 * mntmNewMenuItem_1.setSelectedIcon(null);
		 * mntmNewMenuItem_1.setBackground(SystemColor.menu);
		 * popupMenu.add(mntmNewMenuItem_1);
		 * 
		 * JMenu mnNewMenu = new JMenu("Menu Grupo");
		 * mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		 * mnNewMenu.setForeground(SystemColor.inactiveCaption);
		 * popupMenu.add(mnNewMenu);
		 * 
		 * JMenuItem mntmNewMenuItem_2 = new JMenuItem("Menu Grupo 1");
		 * mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.CENTER);
		 * mnNewMenu.add(mntmNewMenuItem_2); menuBar = new JMenuBar();
		 * frmOracleNext.setJMenuBar(menuBar);
		 * 
		 * JMenu mnNewMenu_1 = new JMenu("Archivo");
		 * mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		 * menuBar.add(mnNewMenu_1);
		 * 
		 * JMenuItem mntmNewMenuItem_3 = new JMenuItem("Abrir");
		 * mnNewMenu_1.add(mntmNewMenuItem_3);
		 * 
		 * JMenu mnNewMenu_2 = new JMenu("Edición"); menuBar.add(mnNewMenu_2);
		 * 
		 * JMenuItem mntmNewMenuItem_4 = new JMenuItem("Copiar");
		 * mnNewMenu_2.add(mntmNewMenuItem_4); // --------------------------
		 */
		JPanel headerPanel = new JPanel();
		frmOracleNext.getContentPane().add(headerPanel, BorderLayout.NORTH);
		headerPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBorder(new EmptyBorder(10, 0, 10, 0));
		headerPanel.add(verticalBox_1);

		JLabel lblNewLabel_1 = new JLabel("Conversor de Unidades");
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel_1.setForeground(new Color(168, 140, 90));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 22));
		verticalBox_1.add(lblNewLabel_1);

		JPanel footer = new JPanel();
		footer.setForeground(SystemColor.inactiveCaptionBorder);
		footer.setBackground(new Color(60, 78, 78));
		frmOracleNext.getContentPane().add(footer, BorderLayout.SOUTH);

		JLabel lblNewLabel = new JLabel("Copy 2023");
		lblNewLabel.setFont(new Font("Raleway Thin", Font.PLAIN, 9));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(168, 140, 90));
		footer.add(lblNewLabel);

		JPanel menuPanel = new JPanel();
		frmOracleNext.getContentPane().add(menuPanel, BorderLayout.WEST);
		menuPanel.setLayout(new MigLayout("", "[99px]", "[279px]"));

		Box verticalBox = Box.createVerticalBox();
		menuPanel.add(verticalBox, "cell 0 0");

		Box verticalBox_2 = Box.createVerticalBox();
		verticalBox_2.setPreferredSize(new Dimension(150, 300));
		verticalBox_2.setBorder(new EmptyBorder(30, 5, 0, 5));
		verticalBox.add(verticalBox_2);
		JLabel TitleMenu = DefaultComponentFactory.getInstance().createLabel("Unidades");
		TitleMenu.setBounds(new Rectangle(0, 0, 100, 20));
		TitleMenu.setMaximumSize(new Dimension(120, 25));
		TitleMenu.setHorizontalAlignment(SwingConstants.CENTER);
		verticalBox_2.add(TitleMenu);

		JButton btnMoneda = new JButton("💵 Moneda");
		btnMoneda.setHorizontalAlignment(SwingConstants.LEFT);
		btnMoneda.setMaximumSize(new Dimension(130, 25));
		btnMoneda.setToolTipText("Conversor de Monedas");
		btnMoneda.setMnemonic(KeyEvent.VK_PREVIOUS_CANDIDATE);
		btnMoneda.setHorizontalTextPosition(SwingConstants.CENTER);
		verticalBox_2.add(btnMoneda);

		JButton btnTemp = new JButton("🌡️ Temperatura");
		btnTemp.setHorizontalAlignment(SwingConstants.LEFT);
		btnTemp.setMaximumSize(new Dimension(130, 25));
		verticalBox_2.add(btnTemp);
		/**
		 * TODO: Se agregan mas botones en el menu lateral para tener otras funciones
		 * 
		 * 
		 * JButton btnVol = new JButton("📦 Volumen");
		 * btnVol.setHorizontalAlignment(SwingConstants.LEFT); btnVol.setMaximumSize(new
		 * Dimension(130, 25)); verticalBox_2.add(btnVol);
		 * 
		 * JButton btnOtro = new JButton("🚗 New button");
		 * btnOtro.setHorizontalAlignment(SwingConstants.LEFT);
		 * btnOtro.setMaximumSize(new Dimension(130, 25)); verticalBox_2.add(btnOtro);
		 */
		JPanel mainPanel = new JPanel();
		frmOracleNext.getContentPane().add(mainPanel, BorderLayout.CENTER);
		GroupLayout gl_mainPanel = new GroupLayout(mainPanel);
		gl_mainPanel.setHorizontalGroup(
				gl_mainPanel.createParallelGroup(Alignment.LEADING).addGap(0, 500, Short.MAX_VALUE));
		gl_mainPanel
				.setVerticalGroup(gl_mainPanel.createParallelGroup(Alignment.LEADING).addGap(0, 230, Short.MAX_VALUE));

		mainPanel.setLayout(gl_mainPanel);

		// ------------ .: Moneda :.------------------

		JPanel monedaPanel = new JPanel();

		monedaPanel.setBounds(new Rectangle(0, 0, 500, 230));
		mainPanel.add(monedaPanel);

		Box monedaPanelInterior = Box.createHorizontalBox();
		monedaPanel.add(monedaPanelInterior);

		Box gMoneda1 = Box.createVerticalBox();
		gMoneda1.setBorder(new EmptyBorder(50, 10, 0, 10));
		monedaPanelInterior.add(gMoneda1);

		Box gMoneda1Title = Box.createHorizontalBox();
		gMoneda1Title.setBorder(new EmptyBorder(0, 0, 10, 0));
		gMoneda1.add(gMoneda1Title);
		Box gMoneda1Data = Box.createHorizontalBox();
		gMoneda1.add(gMoneda1Data);

		Box gMoneda2 = Box.createVerticalBox();
		gMoneda2.setBorder(new EmptyBorder(50, 10, 0, 10));
		monedaPanelInterior.add(gMoneda2);

		Box gMoneda2Title = Box.createHorizontalBox();
		gMoneda2Title.setBorder(new EmptyBorder(0, 0, 10, 0));
		gMoneda2.add(gMoneda2Title);

		Box gMoneda2Data = Box.createHorizontalBox();
		gMoneda2.add(gMoneda2Data);

		Moneda moneda1 = new Moneda(monedas[0].getTasaCambio(), monedas[0].getCodigo(), monedas[0].getNombre(), 0);
		Moneda moneda2 = new Moneda(monedas[0].getTasaCambio(), monedas[0].getCodigo(), monedas[0].getNombre(), 0);

		JLabel TitleMoneda1 = new JLabel(moneda1.getNombre());
		gMoneda1Title.add(TitleMoneda1);
		JLabel TitleMoneda2 = new JLabel(moneda2.getNombre());
		gMoneda2Title.add(TitleMoneda2);

		JComboBox selectMoneda1 = new JComboBox();
		selectMoneda1.setModel(new DefaultComboBoxModel(Monedas.values()));
		selectMoneda1.setSelectedIndex(0);
		gMoneda1Data.add(selectMoneda1);

		ingresoMoneda1 = new JTextField();
		ingresoMoneda1.setColumns(10);
		moneda1.setEntrada(ingresoMoneda1);
		gMoneda1Data.add(ingresoMoneda1);
		ingresoMoneda1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String valor = moneda1.getEntrada().getText();
				if (validNumeroPositivo(valor)) {
					convertMoneda(moneda1, moneda2);
				} else {
					valor = removeLastChar(valor);
					moneda1.getEntrada().setText(valor);
				}
			}
		});

		JComboBox selectMoneda2 = new JComboBox();
		selectMoneda2.setModel(new DefaultComboBoxModel(Monedas.values()));
		selectMoneda2.setSelectedIndex(0);
		gMoneda2Data.add(selectMoneda2);

		ingresoMoneda2 = new JTextField();
		ingresoMoneda2.setColumns(10);
		ingresoMoneda2.setEditable(false);
		moneda2.setEntrada(ingresoMoneda2);
		gMoneda2Data.add(ingresoMoneda2);

		selectMoneda1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				moneda1.setNombre(monedas[(int) selectMoneda1.getSelectedIndex()].getNombre());
				moneda1.setCodigo(monedas[(int) selectMoneda1.getSelectedIndex()].getCodigo());
				moneda1.setTasa(monedas[(int) selectMoneda1.getSelectedIndex()].getTasaCambio());
				moneda1.setIndex((int) selectMoneda1.getSelectedIndex());
				TitleMoneda1.setText(moneda1.getNombre());
				if (!ingresoMoneda1.getText().equals("")) {
					convertMoneda(moneda1, moneda2);
				}

			}
		});
		selectMoneda2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				moneda2.setNombre(monedas[(int) selectMoneda2.getSelectedIndex()].getNombre());
				moneda2.setCodigo(monedas[(int) selectMoneda2.getSelectedIndex()].getCodigo());
				moneda2.setTasa(monedas[(int) selectMoneda2.getSelectedIndex()].getTasaCambio());
				moneda2.setIndex((int) selectMoneda2.getSelectedIndex());
				TitleMoneda2.setText(moneda2.getNombre());
				if (!ingresoMoneda1.getText().equals("")) {
					convertMoneda(moneda1, moneda2);
				}

			}
		});

		monedaPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		// --------------.: Temperatura :.-----------------------------------------

		JPanel temperaturaPanel = new JPanel();
		temperaturaPanel.setBounds(new Rectangle(0, 0, 500, 230));

		Box gTemp = Box.createVerticalBox();
		temperaturaPanel.add(gTemp);

		Box gEntradaTemp = Box.createHorizontalBox();
		gEntradaTemp.setBorder(new EmptyBorder(30, 0, 0, 0));
		gTemp.add(gEntradaTemp);

		Box gOrigen = Box.createVerticalBox();
		gEntradaTemp.add(gOrigen);

		JLabel TextOrigenTemp = new JLabel("Unidad Origen");
		TextOrigenTemp.setAlignmentX(Component.RIGHT_ALIGNMENT);
		TextOrigenTemp.setHorizontalAlignment(SwingConstants.CENTER);
		gOrigen.add(TextOrigenTemp);

		Temperatura tempOrigen = new Temperatura(temp[0].getNombre(), temp[0].getCodigo(), 0, temp[0]);
		Temperatura tempDestino = new Temperatura(temp[0].getNombre(), temp[0].getCodigo(), 0, temp[0]);

		JComboBox unidadOrigen = new JComboBox();
		unidadOrigen.setModel(new DefaultComboBoxModel(Temperaturas.values()));
		gOrigen.add(unidadOrigen);

		Box gDestino = Box.createVerticalBox();
		gEntradaTemp.add(gDestino);

		JLabel TextDestinoTemp = new JLabel("Unidad Destino");
		TextDestinoTemp.setAlignmentX(Component.RIGHT_ALIGNMENT);
		TextDestinoTemp.setHorizontalAlignment(SwingConstants.CENTER);
		gDestino.add(TextDestinoTemp);

		JComboBox unidadDestino = new JComboBox();
		unidadDestino.setModel(new DefaultComboBoxModel(Temperaturas.values()));
		gDestino.add(unidadDestino);

		Box gValor = Box.createVerticalBox();
		gEntradaTemp.add(gValor);

		JLabel TextValorTemp = new JLabel("Valor");
		TextDestinoTemp.setHorizontalAlignment(SwingConstants.CENTER);
		gValor.add(TextValorTemp);

		valorTemp = new JTextField();
		gValor.add(valorTemp);
		valorTemp.setColumns(15);

		Box ResultTemp = Box.createHorizontalBox();
		ResultTemp.setBorder(new EmptyBorder(30, 0, 0, 0));
		gTemp.add(ResultTemp);

		JLabel ResutadoTemperatura = new JLabel();
		ResutadoTemperatura.setForeground(Color.GREEN);
		ResutadoTemperatura.setText("0 °C");
		ResutadoTemperatura.setFont(new Font("Tahoma", Font.BOLD, 50));
		ResutadoTemperatura.setHorizontalAlignment(SwingConstants.CENTER);
		ResultTemp.add(ResutadoTemperatura);

		unidadOrigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempOrigen.setNombre(temp[(int) unidadOrigen.getSelectedIndex()].getNombre());
				tempOrigen.setCodigo(temp[(int) unidadOrigen.getSelectedIndex()].getCodigo());
				tempOrigen.setIndex(unidadOrigen.getSelectedIndex());
				tempOrigen.setTemperatura(temp[(int) unidadOrigen.getSelectedIndex()]);
				String valor = valorTemp.getText();
				if (!valor.equals("")) {
					convertTemp(valor, tempOrigen, tempDestino, ResutadoTemperatura);
				}
			}
		});

		unidadDestino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tempDestino.setNombre(temp[(int) unidadDestino.getSelectedIndex()].getNombre());
				tempDestino.setCodigo(temp[(int) unidadDestino.getSelectedIndex()].getCodigo());
				tempDestino.setIndex(unidadDestino.getSelectedIndex());
				tempDestino.setTemperatura(temp[(int) unidadDestino.getSelectedIndex()]);
				String valor = valorTemp.getText();
				if (!valor.equals("")) {
					convertTemp(valor, tempOrigen, tempDestino, ResutadoTemperatura);
				}
			}
		});
		valorTemp.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String valor = valorTemp.getText();
				if (validNumero(valor)) {
					convertTemp(valor, tempOrigen, tempDestino, ResutadoTemperatura);
				} else {
					valor = removeLastChar(valor);
					valorTemp.setText(valor);
				}
			}
		});
		/*
		 * TODO: Paneles para mostrar las nuevas funciones
		 * 
		 * 
		 * // ------------.: Volumen :. ---------------------------------------------
		 * JPanel volumenPanel = new JPanel(); volumenPanel.setBounds(new Rectangle(0,
		 * 0, 500, 230)); volumenPanel.setBackground(Color.MAGENTA);
		 * 
		 * // ------------.: Otro :.----------------------------------------------
		 * JPanel otroPanel = new JPanel(); otroPanel.setBounds(new Rectangle(0, 0, 500,
		 * 230)); otroPanel.setBackground(Color.GREEN); //
		 * ---------------------------------------------------------------------------
		 */

		btnMoneda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.removeAll();
				mainPanel.add(monedaPanel);
				mainPanel.revalidate();
				mainPanel.repaint();
			}
		});

		btnTemp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.removeAll();
				mainPanel.add(temperaturaPanel);
				mainPanel.revalidate();
				mainPanel.repaint();

			}
		});
		/*
		 * TODO: Funciones que activan los paneles para que se muestren las nuevas
		 * funciones
		 * 
		 * 
		 * btnVol.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { mainPanel.removeAll();
		 * mainPanel.add(volumenPanel); mainPanel.revalidate(); mainPanel.repaint();
		 * 
		 * } });
		 * 
		 * btnOtro.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) { mainPanel.removeAll();
		 * mainPanel.add(otroPanel); mainPanel.revalidate(); mainPanel.repaint();
		 * 
		 * } });
		 */
	}

	/*
	 * TODO: Funciones que controlan los menú
	 * 
	 * private static void addPopup(Component component, final JPopupMenu popup) {
	 * component.addMouseListener(new MouseAdapter() { public void
	 * mousePressed(MouseEvent e) { if (e.isPopupTrigger()) { showMenu(e); } }
	 * 
	 * public void mouseReleased(MouseEvent e) { if (e.isPopupTrigger()) {
	 * showMenu(e); } }
	 * 
	 * private void showMenu(MouseEvent e) { popup.show(e.getComponent(), e.getX(),
	 * e.getY()); } }); }
	 * 
	 * public JMenuBar getMenuBar() { return menuBar; }
	 */
	private void convertMoneda(Moneda origen, Moneda destino) {
		String valor = origen.getEntrada().getText();
		double totalUSD = 0;
		double totalMon;
		if (validNumeroPositivo(valor)) {
			DecimalFormat format = new DecimalFormat("#.####");
			totalUSD = origen.ConvToUSD();
			if (origen.getCodigo() == destino.getCodigo()) {
				destino.getEntrada().setText(origen.getEntrada().getText());
			} else {
				if (destino.getCodigo() == "USD") {
					destino.getEntrada().setText(String.valueOf(format.format(totalUSD)));
				} else {
					totalMon = destino.getTasa() * totalUSD;
					destino.getEntrada().setText(String.valueOf(format.format(totalMon)));
				}
			}

		} else {
			JOptionPane.showMessageDialog(frmOracleNext, "El campo de ingreso debe ser solo número", "ADVERTENCIA.",
					JOptionPane.WARNING_MESSAGE);
		}
	}

	private void convertTemp(String valor, Temperatura origen, Temperatura destino, JLabel ResultadoTemp) {
		double tempVal = Double.valueOf(valor);
		double resultTemp = tempVal;
		DecimalFormat format = new DecimalFormat("#.##");
		if (origen.getNombre() != destino.getNombre()) {
			if (origen.getCodigo().equals("C")) {
				switch (destino.getCodigo()) {
				case "F":
					resultTemp = (tempVal * 9 / 5) + 32;
					break;
				case "K":
					resultTemp = tempVal + 273.15;
					break;
				}
			} else if (origen.getCodigo().equals("F")) {
				switch (destino.getCodigo()) {
				case "C":
					resultTemp = (tempVal - 32) * 5 / 9;
					break;
				case "K":
					resultTemp = (tempVal + 459.67) * 5 / 9;
					break;
				}
			} else if (origen.getCodigo().equals("K")) {
				switch (destino.getCodigo()) {
				case "C":
					resultTemp = tempVal - 273.15;
					break;
				case "F":
					resultTemp = (tempVal * 9 / 5) - 459.67;
					break;
				}
			}

		}
		ResultadoTemp.setText(format.format(resultTemp) + " " + destino.getCodigo());
	}

	private static String removeLastChar(String str) {
		if (str.length() > 0 && str != null) {
			str = str.substring(0, str.length() - 1);
		}
		return str;
	}

	private boolean validNumero(String num) {
		try {
			Double.parseDouble(num);
			return true;
		} catch (NumberFormatException nfe) {
			if (num.length() == 1 && num.charAt(0) == '.') {
				return true;
			}
			return false;
		}
	}

	private boolean validNumeroPositivo(String num) {
		if (validNumero(num)) {
			return Double.parseDouble(num) >= 0;
		} else {
			return false;
		}
	}
}
