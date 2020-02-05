package Cafe_system;
import  Cafe_system.First_Cafe_Sys;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JTabbedPane;
import javax.swing.JSplitPane;
import javax.swing.JToolBar;
import javax.swing.JToggleButton;
import javax.swing.JTextArea;

public class Cafe_sys {

	private JFrame frame;
	private JTextField TxtItm1;
	private JTextField TxtItm2;
	private JTextField TxtItm3;
	private JTextField TxtItm4;
	private JTextField TxtItm5;
	private JTextField TxtItm6;
	private JTextField TxtItm7;
	private JTextField TxtD1;
	private JTextField TxtD2;
	private JTextField TxtD3;
	private JTextField TxtD4;
	private JTextField txt_qutDrink;
	private JTextField txtDisplay;

	
	
	// =================== Calcy initialization===================
	double firstnum;
	double secondnum;
    double result;
	String operations;
	String answer;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cafe_sys window = new Cafe_sys();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cafe_sys() {
		initialize1();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize1() {
		//================= INITIALIZE PRICE==============
		double itm1=40,itm2=199,itm3=80,itm4=60,itm5=50,itm6=90,itm7=40;
		double Ds1=40,Ds2=30,Ds3=40,Ds4=30;
		double tea=10,coffee=20,icetea=20,icecoffee=30,orangejuice=20,applejuice=30,coke=40,thumbsup=40;
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 250, 250));
		frame.setBounds(50, 30, 1245, 763);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBounds(34, 93, 374, 533);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnItm1 = new JButton("SANDWICH");
		btnItm1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnItm1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtItm1.setEditable(true);
				TxtItm1.setText("1");
			}
		});
		btnItm1.setBounds(21, 79, 105, 25);
		panel.add(btnItm1);
		
		TxtItm1 = new JTextField("0");
		TxtItm1.setEditable(false);
		TxtItm1.setBounds(212, 80, 96, 24);
		panel.add(TxtItm1);
		TxtItm1.setColumns(10);
		
		JLabel lblitmTot = new JLabel();
		lblitmTot.setHorizontalAlignment(SwingConstants.RIGHT);
		lblitmTot.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblitmTot.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblitmTot.setBounds(199, 476, 131, 25);
		panel.add(lblitmTot);
		
		JLabel lblMenu = new JLabel("MENU CARD");
		lblMenu.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblMenu.setBounds(112, 10, 163, 25);
		panel.add(lblMenu);
		
		JLabel lblItms = new JLabel("ITEMS ");
		lblItms.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblItms.setBounds(45, 37, 65, 25);
		panel.add(lblItms);
		
		JLabel lblEnterQuantity = new JLabel("ENTER QUANTITY");
		lblEnterQuantity.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblEnterQuantity.setBounds(187, 36, 177, 34);
		panel.add(lblEnterQuantity);
		
		JButton btnItm2 = new JButton("PIZZA");
		btnItm2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtItm2.setEditable(true);
				TxtItm2.setText("1");
			}
		});
		btnItm2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnItm2.setBounds(21, 126, 105, 25);
		panel.add(btnItm2);
		
		JButton btnItm3 = new JButton("BURGER");
		btnItm3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtItm3.setEditable(true);
				TxtItm3.setText("1");
			}
		});
		btnItm3.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnItm3.setBounds(21, 177, 105, 25);
		panel.add(btnItm3);
		
		JButton btnItm4 = new JButton("FRIES");
		btnItm4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtItm4.setEditable(true);
				TxtItm4.setText("1");
			}
		});
		btnItm4.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnItm4.setBounds(21, 232, 105, 25);
		panel.add(btnItm4);
		
		JButton btnItm5 = new JButton("FRANKIES");
		btnItm5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtItm5.setEditable(true);
				TxtItm5.setText("1");
			}
		});
		btnItm5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnItm5.setBounds(21, 283, 105, 25);
		panel.add(btnItm5);
		
		JButton btnItm6 = new JButton("PASTA");
		btnItm6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtItm6.setEditable(true);
				TxtItm6.setText("1");
			}
		});
		btnItm6.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnItm6.setBounds(21, 338, 105, 25);
		panel.add(btnItm6);
		
		JButton btnItm7 = new JButton("MOMOS");
		btnItm7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtItm7.setEditable(true);
				TxtItm7.setText("1");
			}
		});
		btnItm7.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnItm7.setBounds(21, 396, 105, 25);
		panel.add(btnItm7);
		
		TxtItm2 = new JTextField("0");
		TxtItm2.setEditable(false);
		TxtItm2.setColumns(10);
		TxtItm2.setBounds(212, 127, 96, 24);
		panel.add(TxtItm2);
		
		TxtItm3 = new JTextField("0");
		TxtItm3.setEditable(false);
		TxtItm3.setColumns(10);
		TxtItm3.setBounds(212, 180, 96, 24);
		panel.add(TxtItm3);
		
		TxtItm4 = new JTextField("0");
		TxtItm4.setEditable(false);
		TxtItm4.setColumns(10);
		TxtItm4.setBounds(212, 235, 96, 24);
		panel.add(TxtItm4);
		
		TxtItm5 = new JTextField("0");
		TxtItm5.setEditable(false);
		TxtItm5.setColumns(10);
		TxtItm5.setBounds(212, 286, 96, 24);
		panel.add(TxtItm5);
		
		TxtItm6 = new JTextField("0");
		TxtItm6.setEditable(false);
		TxtItm6.setColumns(10);
		TxtItm6.setBounds(212, 339, 96, 24);
		panel.add(TxtItm6);
		
		TxtItm7 = new JTextField("0");
		TxtItm7.setEditable(false);
		TxtItm7.setColumns(10);
		TxtItm7.setBounds(212, 399, 96, 24);
		panel.add(TxtItm7);
		
		JLabel lblTotal = new JLabel("TOTAL COST");
		lblTotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTotal.setBounds(32, 476, 141, 25);
		panel.add(lblTotal);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 224, 230));
		panel_1.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_1.setBounds(34, 10, 1163, 73);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCafeManagementSystem = new JLabel("CAFE MANAGEMENT SYSTEM");
		lblCafeManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 34));
		lblCafeManagementSystem.setBounds(311, 10, 671, 53);
		panel_1.add(lblCafeManagementSystem);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 139, 139));
		panel_2.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_2.setBounds(429, 93, 374, 533);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label = new JLabel("ITEMS ");
		label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label.setBounds(29, 44, 65, 25);
		panel_2.add(label);
		
		JLabel label_1 = new JLabel("ENTER QUANTITY");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		label_1.setBounds(172, 39, 168, 34);
		panel_2.add(label_1);
		
		JLabel lblDeseart = new JLabel("DESSERTS");
		lblDeseart.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblDeseart.setBounds(108, 10, 168, 25);
		panel_2.add(lblDeseart);
		
		JButton btnD1 = new JButton("PASTRY");
		btnD1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtD1.setEditable(true);
				TxtD1.setText("1");
			}
		});
		btnD1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnD1.setBounds(20, 80, 105, 25);
		panel_2.add(btnD1);
		
		JButton btnD2 = new JButton("ICE-CREAM");
		btnD2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtD2.setEditable(true);
				TxtD2.setText("1");
			}
		});
		btnD2.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnD2.setBounds(20, 125, 105, 25);
		panel_2.add(btnD2);
		
		JButton btnD3 = new JButton("DONUTS");
		btnD3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtD3.setEditable(true);
				TxtD3.setText("1");
			}
		});
		btnD3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnD3.setBounds(20, 175, 105, 25);
		panel_2.add(btnD3);
		
		JButton btnD4 = new JButton("CUPCAKES");
		btnD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TxtD4.setEditable(true);
				TxtD4.setText("1");
			}
		});
		btnD4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		btnD4.setBounds(20, 230, 105, 25);
		panel_2.add(btnD4);
		
		JLabel lblDrinks = new JLabel("DRINKS");
		lblDrinks.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblDrinks.setBounds(139, 281, 153, 16);
		panel_2.add(lblDrinks);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select a Drink ", "Tea", "Coffee", "Ice Tea", "Ice Coffee", "Thumbs Up", "Coke", "Apple Juice", "Orange Juice"}));
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 20));
		comboBox.setBounds(38, 320, 162, 34);
		panel_2.add(comboBox);
		if(comboBox.getSelectedItem().equals("Tea")) {
			txt_qutDrink.setEditable(true);
			txt_qutDrink.setText("1");
		}
		
		TxtD1 = new JTextField("0");
		TxtD1.setEditable(false);
		TxtD1.setColumns(10);
		TxtD1.setBounds(196, 79, 96, 24);
		panel_2.add(TxtD1);
		
		TxtD2 = new JTextField("0");
		TxtD2.setEditable(false);
		TxtD2.setColumns(10);
		TxtD2.setBounds(196, 128, 96, 24);
		panel_2.add(TxtD2);
		
		TxtD3 = new JTextField("0");
		TxtD3.setEditable(false);
		TxtD3.setColumns(10);
		TxtD3.setBounds(196, 178, 96, 24);
		panel_2.add(TxtD3);
		
		TxtD4 = new JTextField("0");
		TxtD4.setEditable(false);
		TxtD4.setColumns(10);
		TxtD4.setBounds(196, 233, 96, 24);
		panel_2.add(TxtD4);
		
		txt_qutDrink = new JTextField("0");
		txt_qutDrink.setEditable(false);
		txt_qutDrink.setColumns(10);
		txt_qutDrink.setBounds(92, 374, 162, 34);
		panel_2.add(txt_qutDrink);
		
		JLabel lblTotalCostOf = new JLabel("TOTAL COST OF DESEART");
		lblTotalCostOf.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotalCostOf.setBounds(10, 476, 226, 25);
		panel_2.add(lblTotalCostOf);
		
		JLabel lblDTot = new JLabel();
		lblDTot.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDTot.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblDTot.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblDTot.setBounds(247, 476, 117, 25);
		panel_2.add(lblDTot);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBox.getSelectedItem().equals("Tea")) {
					txt_qutDrink.setEditable(true);
					txt_qutDrink.setText("1");
				}
				if(comboBox.getSelectedItem().equals("Coffee")) {
					txt_qutDrink.setEditable(true);
					txt_qutDrink.setText("1");
				}
				if(comboBox.getSelectedItem().equals("Coke")) {
					txt_qutDrink.setEditable(true);
					txt_qutDrink.setText("1");
				}
				if(comboBox.getSelectedItem().equals("Thumbs Up")) {
					txt_qutDrink.setEditable(true);
					txt_qutDrink.setText("1");
				}
				if(comboBox.getSelectedItem().equals("Ice Tea")) {
					txt_qutDrink.setEditable(true);
					txt_qutDrink.setText("1");
				}
				if(comboBox.getSelectedItem().equals("Ice Coffee")) {
					txt_qutDrink.setEditable(true);
					txt_qutDrink.setText("1");
				}
				if(comboBox.getSelectedItem().equals("Apple Juice")) {
					txt_qutDrink.setEditable(true);
					txt_qutDrink.setText("1");
				}
				if(comboBox.getSelectedItem().equals("Orange Juice")) {
					txt_qutDrink.setEditable(true);
					txt_qutDrink.setText("1");
				}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(224, 320, 61, 34);
		panel_2.add(btnNewButton);
		
		JLabel lblDrk = new JLabel();
		lblDrk.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDrk.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		lblDrk.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblDrk.setBounds(247, 428, 117, 25);
		panel_2.add(lblDrk);
		
		JLabel lblTotalCostOf_1 = new JLabel("TOTAL COST OF DRINK");
		lblTotalCostOf_1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblTotalCostOf_1.setBounds(10, 428, 226, 25);
		panel_2.add(lblTotalCostOf_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 139, 139));
		panel_3.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_3.setBounds(824, 93, 374, 533);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		tabbedPane.setBounds(25, 55, 314, 434);
		panel_3.add(tabbedPane);
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("RECEIPT", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(10, 25, 289, 327);
		panel_6.add(textArea);
		
		JButton btnPrint = new JButton("PRINT");
		btnPrint.setBounds(102, 365, 105, 25);
		panel_6.add(btnPrint);
		btnPrint.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("CALCULATOR", null, panel_5, null);
		panel_5.setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setEditable(false);
		txtDisplay.setColumns(10);
		txtDisplay.setBounds(22, 23, 263, 76);
		panel_5.add(txtDisplay);
		
		JButton button = new JButton("\uF0E7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace=null;
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backspace = strB.toString();
					txtDisplay.setText(backspace);
				}
				
			}
		});
		button.setBounds(32, 109, 58, 52);
		panel_5.add(button);
		
		JButton button_1 = new JButton("C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText(null);
			}
		});
		button_1.setBounds(96, 109, 58, 52);
		panel_5.add(button_1);
		
		JButton button_2 = new JButton("%");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "%";
			}
		});
		button_2.setBounds(154, 109, 58, 52);
		panel_5.add(button_2);
		
		JButton button_3 = new JButton("+");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		button_3.setBounds(212, 109, 58, 52);
		panel_5.add(button_3);
		
		JButton button_4 = new JButton("-");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		button_4.setBounds(212, 161, 58, 52);
		panel_5.add(button_4);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn7.setBounds(154, 161, 58, 52);
		panel_5.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn8.setBounds(96, 161, 58, 52);
		panel_5.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn9.setBounds(32, 161, 58, 52);
		panel_5.add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn6.setBounds(32, 218, 58, 52);
		panel_5.add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn3.setBounds(32, 270, 58, 52);
		panel_5.add(btn3);
		
		JButton button_10 = new JButton(".");
		button_10.setBounds(32, 325, 58, 52);
		panel_5.add(button_10);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn0.setBounds(96, 325, 58, 52);
		panel_5.add(btn0);
		
		JButton button_12 = new JButton("\u00B1");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(txtDisplay.getText()));
				ops =ops*(-1);
				txtDisplay.setText(String.valueOf(ops));
			}
		});
		button_12.setBounds(154, 325, 58, 52);
		panel_5.add(button_12);
		
		JButton button_13 = new JButton("=");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;
				secondnum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+") {
					  result = firstnum+secondnum;
					   answer = String.format("%.2f", result);
					   txtDisplay.setText(answer);
					}
					else if(operations == "-") {
						  result = firstnum-secondnum;
						   answer = String.format("%.2f", result);
						   txtDisplay.setText(answer);
					 }
						else if(operations == "*") {
							 result = firstnum*secondnum;
							   answer = String.format("%.2f", result);
							   txtDisplay.setText(answer);
							}
							else if(operations == "/") {
								  result = firstnum/secondnum;
								   answer = String.format("%.2f", result);
								   txtDisplay.setText(answer);
								}
								else if(operations == "%") {
									 result = firstnum%secondnum;
									   answer = String.format("%.2f", result);
									   txtDisplay.setText(answer);
									}
			}
		});
		button_13.setBounds(212, 325, 58, 52);
		panel_5.add(button_13);
		
		JButton button_14 = new JButton("/");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		button_14.setBounds(212, 270, 58, 52);
		panel_5.add(button_14);
		
		JButton button_15 = new JButton("*");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		button_15.setBounds(212, 218, 58, 52);
		panel_5.add(button_15);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
			
		});
		btn4.setBounds(154, 218, 58, 52);
		panel_5.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn5.setBounds(96, 218, 58, 52);
		panel_5.add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn2.setBounds(96, 270, 58, 52);
		panel_5.add(btn2);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = txtDisplay.getText()+btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		btn1.setBounds(154, 270, 58, 52);
		panel_5.add(btn1);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(176, 224, 230));
		panel_4.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_4.setBounds(34, 636, 1169, 80);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//=========Reset for Buttons ====================
				TxtItm1.setEditable(false);
				TxtItm1.setText("0");
				TxtItm2.setEditable(false);
				TxtItm2.setText("0");
				TxtItm3.setEditable(false);
				TxtItm3.setText("0");
				TxtItm4.setEditable(false);
				TxtItm4.setText("0");
				TxtItm5.setEditable(false);
				TxtItm5.setText("0");
				TxtItm6.setEditable(false);
				TxtItm6.setText("0");
				TxtItm7.setEditable(false);
				TxtItm7.setText("0");
				//==================fOR BUTTON 2 ===================
				TxtD1.setEditable(false);
				TxtD1.setText("0");
				TxtD2.setEditable(false);
				TxtD2.setText("0");
				TxtD3.setEditable(false);
				TxtD3.setText("0");
				TxtD4.setEditable(false);
				TxtD4.setText("0");
				
				//===============Reset for lable ====================
				
				lblitmTot.setText(null);
				lblDTot.setText(null);
				//==============for text area=============
				textArea.setText(null);
				txt_qutDrink.setText(null);
				txt_qutDrink.setEditable(false);
				comboBox.setSelectedItem("Select a drink ");
				
				lblDrk.setText(null);
			}
		});
		btnReset.setBounds(100, 32, 85, 26);
		panel_4.add(btnReset);
		
		JButton btnTotal = new JButton("PLACE ORDER");
		btnTotal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnTotal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//================For Total Block 1===================	
				String t1 = TxtItm1.getText();
				double tot1 = Double.parseDouble(t1);
				String t2 = TxtItm2.getText();
				double tot2 = Double.parseDouble(t2);
				String t3 = TxtItm3.getText();
				double tot3 = Double.parseDouble(t3);
				String t4 = TxtItm4.getText();
				double tot4 = Double.parseDouble(t4);
				String t5 = TxtItm5.getText();
				double tot5 = Double.parseDouble(t5);
				String t6 = TxtItm6.getText();
				double tot6 = Double.parseDouble(t6);
				String t7 = TxtItm7.getText();
				double tot7 = Double.parseDouble(t7);
				
				
				double total = itm1*tot1+itm2*tot2+itm3*tot3+itm4*tot4+itm5*tot5+itm6*tot6+itm7*tot7;
				double Totalone = total;
				String LastTotal = String.format("%.2f", total);
				lblitmTot.setText( LastTotal+ "\u20B9 ");
			//====================For Total Block 2========================
				
				String D1 = TxtD1.getText();
				double totD1 = Double.parseDouble(D1);
				String D2 = TxtD2.getText();
				double totD2 = Double.parseDouble(D2);
                String D3 = TxtD3.getText();
				double totD3 = Double.parseDouble(D3);
                String D4 = TxtD4.getText();
				double totD4 = Double.parseDouble(D4);

				double totalD = Ds1*totD1+Ds2*totD2+Ds3*totD3+Ds4*totD4;
				double Totaltwo = totalD;
				String LastTotalD = String.format("%.2f", totalD);
				lblDTot.setText(LastTotalD+" \u20B9 ");
				
			// ========================for Select Drink ===============================
				
				String Drk1 = txt_qutDrink.getText();
				double totdrkD1 = Double.parseDouble(Drk1);
				double last_totDrk=0;
				
				if(comboBox.getSelectedItem().equals("Tea")) {
					last_totDrk = totdrkD1*tea;
				}
				if(comboBox.getSelectedItem().equals("Coffee")) {
					last_totDrk = totdrkD1*coffee;
				}
				if(comboBox.getSelectedItem().equals("Coke")) {
					last_totDrk = totdrkD1*coke;
				}
				if(comboBox.getSelectedItem().equals("Thumbs Up")) {
					last_totDrk = totdrkD1*thumbsup;
				}
				if(comboBox.getSelectedItem().equals("Ice Tea")) {
					last_totDrk = totdrkD1*icetea;
				}
				if(comboBox.getSelectedItem().equals("Ice Coffee")) {
					last_totDrk = totdrkD1*icecoffee;
				}
				if(comboBox.getSelectedItem().equals("Apple Juice")) {
					last_totDrk = totdrkD1*applejuice;
				}
				if(comboBox.getSelectedItem().equals("Orange Juice")) {
					last_totDrk = totdrkD1*orangejuice;
				}
				double Totalthree= last_totDrk;
				String last_totDrk1 = String.format("%.2f", last_totDrk);
				lblDrk.setText(last_totDrk1+"\u20B9 ");
			//=====================CODE FOR RECEIPT ======================
				
			           //------- for Starters -------------
				double Qut1 = Double.parseDouble(TxtItm1.getText());
				double Qut2 = Double.parseDouble(TxtItm2.getText());
				double Qut3 = Double.parseDouble(TxtItm3.getText());
				double Qut4 = Double.parseDouble(TxtItm4.getText());
				double Qut5 = Double.parseDouble(TxtItm5.getText());
				double Qut6 = Double.parseDouble(TxtItm6.getText());
				double Qut7 = Double.parseDouble(TxtItm7.getText());
				
		
				textArea.setText(" -------------- CAFE MANAGEMENT SYSTEM ------------------\n");
				if(Qut1>0) 
					textArea.append("\n            SANDWICH :            "+ Qut1+"      \u20B9 " +itm1);
				if(Qut2>0) 
					textArea.append("\n            PIZZA :                    "+ Qut2+"       \u20B9 " +itm2 );
				if(Qut3>0) 
					textArea.append("\n            BURGER :                "+ Qut3+"       \u20B9 " +itm3 );
				if(Qut4>0) 
					textArea.append("\n            FRIES :                    "+ Qut4+"      \u20B9 " +itm4 );
				if(Qut5>0) 
					textArea.append("\n            FRANKIES :              "+ Qut5+"      \u20B9 " +itm5 );
				if(Qut6>0) 
					textArea.append("\n            PASTA :                    "+ Qut6+"      \u20B9 " +itm6 );
				if(Qut7>0) 
					textArea.append("\n            MOMOS :                 "+ Qut7+"     \u20B9 " +itm7 );
				double QutD1 = Double.parseDouble(TxtD1.getText());
				double QutD2 = Double.parseDouble(TxtD2.getText());
				double QutD3 = Double.parseDouble(TxtD3.getText());
				double QutD4 = Double.parseDouble(TxtD4.getText());
			    double Qut=QutD1+QutD2+QutD3+QutD4;
			     if(Qut>0) {
					textArea.append("\n\n\t      DESSERTS\n");
					textArea.append("                   ________________________\n");
					if(QutD1>0) 
						textArea.append("\n            PASTRY :       "+ QutD1 +"   \u20B9 " +Ds1);
					if(QutD2>0) 
						textArea.append("\n            ICE-CREAM :        "+ QutD2 +"        \u20B9" +Ds2 );
					if(QutD3>0) 
						textArea.append("\n            DONUTS :          "+ QutD3 +"      \u20B9 " +Ds3);
					if(QutD4>0)  
						textArea.append("\n            CUPCAKE :       "+ QutD4+"      \u20B9 " +Ds4 );
					
			     }
			    double Qutdrk = Double.parseDouble(txt_qutDrink.getText());
			    if(Qutdrk>0) {
			    	textArea.append("\n\n\t      DRINKS\n");
					textArea.append("                   ________________________\n");
					
					textArea.append("\n           TOTAL PRICE OF DRINK :  "+ "  \u20B9 " +last_totDrk1);
			    	
			    }
			    double FinalTotal = Totalone +Totaltwo+Totalthree;
				textArea.append("\n\n      TOTAL AMOUNT TO PAY:  \u20B9 "+FinalTotal);
			}
		});
		btnTotal.setBounds(499, 32, 177, 26);
		panel_4.add(btnTotal);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnExit.setBounds(944, 32, 85, 26);
		panel_4.add(btnExit);
	}
}
