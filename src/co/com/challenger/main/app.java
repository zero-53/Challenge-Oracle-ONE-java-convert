package co.com.challenger.main;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
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

public class app {

	private JFrame frmOracleNext;
	private JMenuBar menuBar;
	private JTextField ingresoMoneda1;
	private JTextField ingresoMoneda2;
	Monedas[] monedas = Monedas.values();

	/**
	 * Launch the application.
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
	 * Create the application.
	 */
	public app() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOracleNext = new JFrame();
		frmOracleNext.setResizable(false);
		frmOracleNext.setFont(new Font("Raleway Thin", Font.BOLD, 29));
		frmOracleNext.setIconImage(Toolkit.getDefaultToolkit().getImage("assets\\icono.png"));
		frmOracleNext.setTitle("Challenge ONE Back End - Java Conversor de Moneda");
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension sizePantalla = pantalla.getScreenSize();
		int h = sizePantalla.height;
		int w = sizePantalla.width;
		frmOracleNext.setBounds(w / 4, h / 4, w / 2, h / 2);
		frmOracleNext.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmOracleNext.setBackground(SystemColor.window);

		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setToolTipText("menu tt");
		popupMenu.setLabel("menu");
		popupMenu.setBackground(SystemColor.desktop);
		addPopup(frmOracleNext.getContentPane(), popupMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Menú 1");
		mntmNewMenuItem.setBackground(SystemColor.menu);
		mntmNewMenuItem.setSelectedIcon(null);
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		popupMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Menú 2");
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem_1.setSelectedIcon(null);
		mntmNewMenuItem_1.setBackground(SystemColor.menu);
		popupMenu.add(mntmNewMenuItem_1);

		JMenu mnNewMenu = new JMenu("Menu Grupo");
		mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.setForeground(SystemColor.inactiveCaption);
		popupMenu.add(mnNewMenu);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Menu Grupo 1");
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.CENTER);
		mnNewMenu.add(mntmNewMenuItem_2);

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

		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Unidades");
		lblNewJgoodiesLabel.setBounds(new Rectangle(0, 0, 100, 20));
		lblNewJgoodiesLabel.setMaximumSize(new Dimension(120, 25));
		verticalBox_2.add(lblNewJgoodiesLabel);
		lblNewJgoodiesLabel.setHorizontalAlignment(SwingConstants.CENTER);

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

		JButton btnVol = new JButton("📦 Volumen");
		btnVol.setHorizontalAlignment(SwingConstants.LEFT);
		btnVol.setMaximumSize(new Dimension(130, 25));
		verticalBox_2.add(btnVol);

		JButton btnOtro = new JButton("🚗 New button");
		btnOtro.setHorizontalAlignment(SwingConstants.LEFT);
		btnOtro.setMaximumSize(new Dimension(130, 25));
		verticalBox_2.add(btnOtro);

		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(Color.blue);
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

		JPanel InteriorPanelMoneda_2 = new JPanel();
		InteriorPanelMoneda_2.setBorder(new EmptyBorder(50, 0, 0, 0));

		JComboBox selectMoneda2 = new JComboBox();
		selectMoneda2.setModel(new DefaultComboBoxModel(Monedas.values()));
		selectMoneda2.setSelectedIndex(0);
		gMoneda2Data.add(selectMoneda2);

		ingresoMoneda2 = new JTextField();
		ingresoMoneda2.setColumns(10);
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
				if (ingresoMoneda1.getText() != "") {
					// convert(TasaMoneda1, ingresoMoneda1, ingresoMoneda2);
				}

			}
		});
		selectMoneda2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				moneda2.setNombre(monedas[(int) selectMoneda1.getSelectedIndex()].getNombre());
				moneda2.setCodigo(monedas[(int) selectMoneda1.getSelectedIndex()].getCodigo());
				moneda2.setTasa(monedas[(int) selectMoneda1.getSelectedIndex()].getTasaCambio());
				moneda2.setIndex((int) selectMoneda1.getSelectedIndex());
				TitleMoneda1.setText(moneda2.getNombre());
				if (ingresoMoneda1.getText() != "") {
					// convert(TasaMoneda1, ingresoMoneda1, ingresoMoneda2);
				}

			}
		});

		monedaPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		// -------------------------------------------------------

		JPanel temperaturaPanel = new JPanel();
		temperaturaPanel.setBounds(new Rectangle(0, 0, 500, 230));
		temperaturaPanel.setBackground(Color.CYAN);

		JPanel volumenPanel = new JPanel();
		volumenPanel.setBounds(new Rectangle(0, 0, 500, 230));
		volumenPanel.setBackground(Color.MAGENTA);

		JPanel otroPanel = new JPanel();
		otroPanel.setBounds(new Rectangle(0, 0, 500, 230));
		otroPanel.setBackground(Color.GREEN);

		menuBar = new JMenuBar();
		frmOracleNext.setJMenuBar(menuBar);

		JMenu mnNewMenu_1 = new JMenu("Archivo");
		mnNewMenu_1.setHorizontalAlignment(SwingConstants.CENTER);
		menuBar.add(mnNewMenu_1);

		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Abrir");
		mnNewMenu_1.add(mntmNewMenuItem_3);

		JMenu mnNewMenu_2 = new JMenu("Edición");
		menuBar.add(mnNewMenu_2);

		JMenuItem mntmNewMenuItem_4 = new JMenuItem("Copiar");
		mnNewMenu_2.add(mntmNewMenuItem_4);
		// --------------------------
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
		btnVol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.removeAll();
				mainPanel.add(volumenPanel);
				mainPanel.revalidate();
				mainPanel.repaint();

			}
		});
		btnOtro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPanel.removeAll();
				mainPanel.add(otroPanel);
				mainPanel.revalidate();
				mainPanel.repaint();

			}
		});
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

	public JMenuBar getMenuBar() {
		return menuBar;
	}

	private void convert(Moneda origen, Moneda destino) {
		/*
		String valor = origen.getText();
		double total = 0;
		if (valor.matches("[0-9]*")) {
			total = Double.parseDouble(valor) * tasa;
			destino.setText(String.valueOf(total));
		} else {
			origen.setText("");
			JOptionPane.showMessageDialog(frmOracleNext, "El campo de ingreso debe ser solo número", "ADVERTENCIA.",
					JOptionPane.WARNING_MESSAGE);
		}
		*/
	}
}
