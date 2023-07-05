package co.com.challenger.main;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JSlider;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class app {

	private JFrame frmOracleNext;

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
		frmOracleNext.setFont(new Font("Raleway Thin", Font.BOLD, 29));
		frmOracleNext.setIconImage(Toolkit.getDefaultToolkit().getImage("assets\\icono.png"));
		frmOracleNext.setTitle("Challenge ONE Back End - Java Conversor de Moneda");
		Toolkit pantalla = Toolkit.getDefaultToolkit();
		Dimension sizePantalla = pantalla.getScreenSize();
		int h = sizePantalla.height;
		int w = sizePantalla.width;
		frmOracleNext.setBounds(w/4, h/4, w/2, h/2);
		frmOracleNext.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
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
		mntmNewMenuItem_1.setSelectedIcon(null);
		mntmNewMenuItem_1.setBackground(SystemColor.menu);
		popupMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu = new JMenu("Menu Grupo");
		mnNewMenu.setForeground(SystemColor.inactiveCaption);
		popupMenu.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Menu Grupo 1");
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JPanel panel = new JPanel();
		frmOracleNext.getContentPane().add(panel, BorderLayout.WEST);
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Rojo", "negro", "amarillo", "azul"}));
		
		JPanel footer = new JPanel();
		footer.setForeground(SystemColor.inactiveCaptionBorder);
		footer.setBackground(SystemColor.activeCaptionText);
		frmOracleNext.getContentPane().add(footer, BorderLayout.SOUTH);
		
		JLabel lblNewLabel = new JLabel("Copy 2023");
		lblNewLabel.setFont(new Font("Raleway Thin", Font.PLAIN, 9));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(SystemColor.textHighlightText);
		footer.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
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
}
