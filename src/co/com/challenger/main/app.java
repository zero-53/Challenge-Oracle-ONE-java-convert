package co.com.challenger.main;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Box;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class app {

	private JFrame frmOracleNext;
	private JMenuBar menuBar;

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
		lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 20));
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

		JPanel monedaPanel = new JPanel();
		monedaPanel.setBackground(Color.RED);
		
		JPanel temperaturaPanel = new JPanel();
		temperaturaPanel.setBackground(Color.CYAN);
		
		JPanel volumenPanel = new JPanel();
		volumenPanel.setBackground(Color.MAGENTA);
		
		JPanel otroPanel = new JPanel();
		otroPanel.setBackground(Color.GREEN);
		
		//JComboBox<Object> comboBox = new JComboBox<Object>();
		//monedaPanel.add(comboBox);
		//comboBox.setModel(new DefaultComboBoxModel<Object>(new String[] { "Rojo", "Negro", "Amarillo", "Azul" }));


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
}
