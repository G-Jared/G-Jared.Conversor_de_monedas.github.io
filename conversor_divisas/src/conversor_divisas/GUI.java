package conversor_divisas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Choice;

public class GUI extends JFrame implements Acronimos {
	
	int xMouse, yMouse;
	float amount = 0.0F;
	double resultado = 0.0F;
	Object from,to;
	String abreviacionFrom, abreviacionTo;

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField monInic;
	private JTextField monFin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings("unchecked")
	public GUI() {
		setUndecorated(true);
		setResizable(false);
		setTitle("Conversor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 585);
		contentPane = new JPanel();
		contentPane.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(0, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//-----------Ajustes esteticos para ocultar bordes no modificables
		
		JLabel lblNewLabel_5_3 = new JLabel("");
		lblNewLabel_5_3.setForeground(Color.BLUE);
		lblNewLabel_5_3.setBounds(111, 209, 421, 30);
		contentPane.add(lblNewLabel_5_3);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("");
		lblNewLabel_5_1_1.setForeground(Color.BLUE);
		lblNewLabel_5_1_1.setBounds(111, 276, 421, 10);
		contentPane.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("");
		lblNewLabel_5_2_2.setForeground(Color.BLUE);
		lblNewLabel_5_2_2.setBounds(530, 236, 16, 52);
		contentPane.add(lblNewLabel_5_2_2);
		
		JLabel lblNewLabel_5_2_1_1 = new JLabel("");
		lblNewLabel_5_2_1_1.setForeground(Color.BLUE);
		lblNewLabel_5_2_1_1.setBounds(107, 226, 16, 52);
		contentPane.add(lblNewLabel_5_2_1_1);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("");
		lblNewLabel_5_2_1.setForeground(Color.BLUE);
		lblNewLabel_5_2_1.setBounds(107, 355, 16, 52);
		contentPane.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("");
		lblNewLabel_5_2.setBounds(530, 355, 16, 52);
		contentPane.add(lblNewLabel_5_2);
		lblNewLabel_5_2.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_5_1 = new JLabel("");
		lblNewLabel_5_1.setForeground(Color.BLUE);
		lblNewLabel_5_1.setBounds(111, 398, 423, 10);
		contentPane.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setForeground(new Color(0, 0, 255));
		lblNewLabel_5.setBounds(111, 333, 421, 30);
		contentPane.add(lblNewLabel_5);
		
		//-----------Ajustes esteticos para ocultar bordes no modificables
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(255, 255, 255));
		separator.setBounds(155, 459, 350, 26);
		contentPane.add(separator);
		panel.setBounds(672, 0, 254, 585);
		panel.setForeground(new Color(57, 198, 114));
		panel.setBackground(new Color(0, 128, 255));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel Close_Btn = new JLabel("X");
		Close_Btn.setForeground(new Color(255, 255, 255));
		Close_Btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				Close_Btn.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Close_Btn.setForeground(Color.white);
			}
		});
		Close_Btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		Close_Btn.setBounds(229, 3, 25, 18);
		panel.add(Close_Btn);
		Close_Btn.setAlignmentX(Component.CENTER_ALIGNMENT);
		Close_Btn.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Close_Btn.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel = new JLabel("");

		lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/imagenes/cambio-de-divisas.png")));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setInheritsPopupMenu(false);
		lblNewLabel.setBounds(0, 0, 254, 200);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Roboto Black", Font.BOLD, 43));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIconTextGap(3);
		
		JLabel lblNewLabel_1 = new JLabel("Conversor de divisas");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Roboto Medium", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(0, 143, 254, 62);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("____________________");
		lblNewLabel_2.setFont(new Font("Roboto Medium", Font.PLAIN, 18));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 172, 254, 38);
		panel.add(lblNewLabel_2);
		
		JLabel Minimice = new JLabel("-");
		Minimice.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				Minimice.setForeground(Color.black);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				Minimice.setForeground(Color.white);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				setExtendedState(ICONIFIED);
			}
		});
		Minimice.setHorizontalAlignment(SwingConstants.CENTER);
		Minimice.setForeground(Color.WHITE);
		Minimice.setFont(new Font("Tahoma", Font.PLAIN, 23));
		Minimice.setAlignmentX(0.5f);
		Minimice.setBounds(210, 3, 25, 18);
		panel.add(Minimice);
		
		JLabel lblNewLabel_3 = new JLabel("JGol_Dev");
		lblNewLabel_3.setBounds(25, 39, 210, 94);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Roboto Light", Font.PLAIN, 27));
		lblNewLabel_3.setIcon(new ImageIcon(GUI.class.getResource("/imagenes/luna-nueva.png")));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Elige el tipo de cambio");
		lblNewLabel_4.setForeground(new Color(0, 128, 255));
		lblNewLabel_4.setBounds(10, 144, 638, 58);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Roboto Medium", Font.PLAIN, 47));
		contentPane.add(lblNewLabel_4);
		
		JPanel BarraSup = new JPanel();
		BarraSup.setBounds(0, 0, 926, 32);
		
		BarraSup.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		
		BarraSup.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);
				
			}
		});
		
		BarraSup.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		BarraSup.setBackground(new Color(255, 255, 255));
		contentPane.add(BarraSup);
		BarraSup.setLayout(null);
		
		monInic = new JTextField();
		monInic.setBorder(null);
		monInic.setForeground(new Color(128, 128, 128));
		monInic.setHorizontalAlignment(SwingConstants.CENTER);
		monInic.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		monInic.setBounds(122, 280, 410, 42);
		contentPane.add(monInic);
		monInic.setColumns(10);
		
		monFin = new JTextField();
		monFin.setBackground(new Color(255, 255, 255));
		monFin.setEditable(false);
		monFin.setBorder(new EmptyBorder(0, 0, 2, 0));
		monFin.setHorizontalAlignment(SwingConstants.CENTER);
		monFin.setDisabledTextColor(new Color(255, 255, 255));
		monFin.setFont(new Font("Roboto Medium", Font.PLAIN, 20));
		monFin.setColumns(10);
		monFin.setBounds(122, 415, 410, 42);
		contentPane.add(monFin);
		
		//Boton para ejecutar el cambio de la divisa
		
		JButton btnC = new JButton("Convertir");
		
		btnC.setFocusPainted(false);
		btnC.setBorderPainted(false);
		btnC.setToolTipText("");
		btnC.setForeground(new Color(255, 255, 255));
		btnC.setFont(new Font("Roboto Light", Font.PLAIN, 30));
		btnC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnC.setBackground(new Color(0, 128, 255));
		btnC.setBorder(new LineBorder(new Color(0, 128, 255), 1, true));
		btnC.setBounds(208, 496, 235, 58);
		contentPane.add(btnC);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.WHITE);
		separator_1.setBounds(155, 323, 350, 26);
		contentPane.add(separator_1);
		
		Choice monedaF = new Choice();
		monedaF.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
		monedaF.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
				monedaF.setFocusable(false);
				monedaF.setFocusTraversalKeysEnabled(false);
				monedaF.setForeground(new Color(0, 0, 0));
				monedaF.setBounds(122, 360, 410, 40);
				contentPane.add(monedaF);
				
				Choice monedaI = new Choice();
				monedaI.setForeground(Color.BLACK);
				monedaI.setFont(new Font("Roboto Medium", Font.PLAIN, 30));
				monedaI.setFocusable(false);
				monedaI.setFocusTraversalKeysEnabled(false);
				monedaI.setBounds(122, 237, 410, 40);
				contentPane.add(monedaI);
		for (String item : monedas) {
		    monedaF.add(item);
		    monedaI.add(item);
		}
		
		//proceso de extraccion de tipo de monedas
		
		btnC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				from = monedaI.getSelectedItem();
				to = monedaF.getSelectedItem();
				amount = Float.parseFloat(monInic.getText());
				
//				System.out.println(from);
//				System.out.println(amount);
//				System.out.println(to);
				abreviacionFrom = from.toString().substring(from.toString().length()-3);
				abreviacionTo = to.toString().substring(to.toString().length()-3);
//				System.out.println(abreviacionFrom);
//				System.out.println(abreviacionTo);
//				System.out.println(Peticion.peticion(abreviacionFrom,abreviacionTo,Float.toString(amount)));
				resultado = Peticion.peticion(abreviacionFrom,abreviacionTo,Float.toString(amount));
				monFin.setText(Double.toString(resultado));
			}
		});
		
	}
}
