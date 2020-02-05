package Cafe_system;
import Cafe_system.Cafe_sys;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class First_Cafe_Sys {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_Cafe_Sys window = new First_Cafe_Sys();
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
	public First_Cafe_Sys() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 224, 230));
		frame.setBounds(50, 30, 1245, 763);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 139, 139));
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBounds(23, 22, 1185, 79);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("CAFE MANAGEMENT SYSTEM");
		label.setForeground(new Color(0, 0, 0));
		label.setBackground(new Color(211, 211, 211));
		label.setFont(new Font("Times New Roman", Font.BOLD, 34));
		label.setBounds(304, 16, 671, 53);
		panel.add(label);
		
		JLabel lblMenuCard = new JLabel("MENU CARD");
		lblMenuCard.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblMenuCard.setBounds(534, 126, 149, 38);
		frame.getContentPane().add(lblMenuCard);
		
		JLabel lblNewLabel = new JLabel("PRICE ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblNewLabel.setBounds(215, 208, 101, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SANDWICH");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(53, 275, 116, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel(" 40 \u20B9 ");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(215, 286, 57, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label_1 = new JLabel("PRICE ");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		label_1.setBounds(550, 208, 101, 31);
		frame.getContentPane().add(label_1);
		
		JLabel lblDeseart = new JLabel("DESSERTS");
		lblDeseart.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblDeseart.setBounds(664, 208, 116, 31);
		frame.getContentPane().add(lblDeseart);
		
		JLabel lblTea = new JLabel("TEA");
		lblTea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTea.setBounds(353, 275, 116, 31);
		frame.getContentPane().add(lblTea);
		
		JLabel label_3 = new JLabel(" 20 \u20B9 ");
		label_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_3.setBounds(563, 338, 57, 20);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel(" 199 \u20B9 ");
		label_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_4.setBounds(215, 344, 57, 20);
		frame.getContentPane().add(label_4);
		
		JLabel lblPizza = new JLabel("PIZZA");
		lblPizza.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPizza.setBounds(53, 333, 116, 31);
		frame.getContentPane().add(lblPizza);
		
		JLabel lblBurger = new JLabel("BURGER");
		lblBurger.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblBurger.setBounds(53, 391, 116, 31);
		frame.getContentPane().add(lblBurger);
		
		JLabel label_7 = new JLabel(" 80 \u20B9 ");
		label_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_7.setBounds(215, 402, 57, 20);
		frame.getContentPane().add(label_7);
		
		JLabel lblFries = new JLabel("FRIES");
		lblFries.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblFries.setBounds(53, 457, 116, 31);
		frame.getContentPane().add(lblFries);
		
		JLabel lblPasta = new JLabel("PASTA");
		lblPasta.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPasta.setBounds(53, 509, 116, 31);
		frame.getContentPane().add(lblPasta);
		
		JLabel lblFrankies = new JLabel("FRANKIES");
		lblFrankies.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblFrankies.setBounds(53, 566, 116, 31);
		frame.getContentPane().add(lblFrankies);
		
		JLabel lblMomos = new JLabel("MOMOS");
		lblMomos.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMomos.setBounds(53, 623, 116, 31);
		frame.getContentPane().add(lblMomos);
		
		JLabel label_12 = new JLabel(" 60 \u20B9 ");
		label_12.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_12.setBounds(215, 468, 57, 20);
		frame.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel(" 50 \u20B9 ");
		label_13.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_13.setBounds(215, 520, 57, 20);
		frame.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel(" 90 \u20B9 ");
		label_14.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_14.setBounds(215, 577, 57, 20);
		frame.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel(" 40 \u20B9 ");
		label_15.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_15.setBounds(215, 634, 57, 20);
		frame.getContentPane().add(label_15);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(353, 174, 541, 10);
		frame.getContentPane().add(separator);
		
		JButton btnOrder = new JButton("ORDER");
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 Cafe_sys cafe = new Cafe_sys();
			 Cafe_sys.main(null);
			}
		});
		btnOrder.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnOrder.setBounds(548, 673, 155, 31);
		frame.getContentPane().add(btnOrder);
		
		JLabel label_5 = new JLabel("PRICE ");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 21));
		label_5.setBounds(818, 208, 101, 31);
		frame.getContentPane().add(label_5);
		
		JLabel lblDrinks = new JLabel("DRINKS");
		lblDrinks.setFont(new Font("Times New Roman", Font.BOLD, 21));
		lblDrinks.setBounds(353, 208, 101, 31);
		frame.getContentPane().add(lblDrinks);
		
		JLabel lblCoffee = new JLabel("COFFEE");
		lblCoffee.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblCoffee.setBounds(353, 316, 116, 31);
		frame.getContentPane().add(lblCoffee);
		
		JLabel lblIceTea = new JLabel("ICE TEA");
		lblIceTea.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblIceTea.setBounds(353, 382, 116, 31);
		frame.getContentPane().add(lblIceTea);
		
		JLabel lblIceCoffee = new JLabel("ICE COFFEE");
		lblIceCoffee.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblIceCoffee.setBounds(353, 430, 116, 31);
		frame.getContentPane().add(lblIceCoffee);
		
		JLabel lblOrangeJuice = new JLabel("ORANGE JUICE");
		lblOrangeJuice.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblOrangeJuice.setBounds(353, 471, 133, 31);
		frame.getContentPane().add(lblOrangeJuice);
		
		JLabel lblThumpsUp = new JLabel("THUMBS UP");
		lblThumpsUp.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblThumpsUp.setBounds(353, 536, 133, 31);
		frame.getContentPane().add(lblThumpsUp);
		
		JLabel lblCoke = new JLabel("COKE");
		lblCoke.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblCoke.setBounds(353, 587, 133, 31);
		frame.getContentPane().add(lblCoke);
		
		JLabel lblAppleJuice = new JLabel("APPLE JUICE");
		lblAppleJuice.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblAppleJuice.setBounds(353, 623, 133, 31);
		frame.getContentPane().add(lblAppleJuice);
		
		JLabel label_2 = new JLabel(" 10 \u20B9 ");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_2.setBounds(563, 280, 57, 20);
		frame.getContentPane().add(label_2);
		
		JLabel label_6 = new JLabel(" 20 \u20B9 ");
		label_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_6.setBounds(563, 379, 57, 20);
		frame.getContentPane().add(label_6);
		
		JLabel label_8 = new JLabel(" 30 \u20B9 ");
		label_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_8.setBounds(563, 428, 57, 20);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel(" 20 \u20B9 ");
		label_9.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_9.setBounds(563, 476, 57, 20);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel(" 40 \u20B9 ");
		label_10.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_10.setBounds(563, 535, 57, 20);
		frame.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel(" 40 \u20B9 ");
		label_11.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_11.setBounds(563, 582, 57, 20);
		frame.getContentPane().add(label_11);
		
		JLabel label_16 = new JLabel(" 30 \u20B9 ");
		label_16.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_16.setBounds(563, 633, 57, 20);
		frame.getContentPane().add(label_16);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 255, 250));
		panel_2.setBounds(934, 245, 287, 389);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 42, 287, 307);
		panel_2.add(panel_1);
		panel_1.setBackground(new Color(135, 206, 235));
		panel_1.setLayout(null);
		
		JLabel lblContactDetails = new JLabel("CONTACT DETAILS:");
		lblContactDetails.setBounds(21, 10, 232, 31);
		panel_1.add(lblContactDetails);
		lblContactDetails.setFont(new Font("Times New Roman", Font.BOLD, 21));
		
		JLabel lblManjireeKolte = new JLabel("MANJIREE KOLTE");
		lblManjireeKolte.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblManjireeKolte.setBounds(21, 68, 198, 31);
		panel_1.add(lblManjireeKolte);
		
		JLabel lblMobNo = new JLabel("IT Engineer");
		lblMobNo.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblMobNo.setBounds(21, 97, 184, 31);
		panel_1.add(lblMobNo);
		
		JLabel lblGauriPanpaliya = new JLabel("SSGMCE, Shegaon");
		lblGauriPanpaliya.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblGauriPanpaliya.setBounds(21, 200, 198, 31);
		panel_1.add(lblGauriPanpaliya);
		
		JLabel label_18 = new JLabel("");
		label_18.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_18.setBounds(21, 159, 184, 31);
		panel_1.add(label_18);
		
		JLabel label_19 = new JLabel("");
		label_19.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_19.setBounds(21, 231, 184, 31);
		panel_1.add(label_19);
		
		JLabel label_20 = new JLabel("__________________________________");
		label_20.setFont(new Font("Times New Roman", Font.BOLD, 20));
		label_20.setBounds(21, 27, 256, 31);
		panel_1.add(label_20);
		
		JLabel label_25 = new JLabel("");
		label_25.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		label_25.setBounds(21, 131, 184, 31);
		panel_1.add(label_25);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(36, 249, 872, 10);
		frame.getContentPane().add(separator_1);
		
		JLabel label_17 = new JLabel("");
		label_17.setBounds(153, 327, 46, 13);
		frame.getContentPane().add(label_17);
		
		JLabel lblTea_1 = new JLabel("ICE-CREAM");
		lblTea_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblTea_1.setBounds(664, 355, 116, 31);
		frame.getContentPane().add(lblTea_1);
		
		JLabel lblPestry = new JLabel("PESTRY");
		lblPestry.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblPestry.setBounds(664, 275, 116, 31);
		frame.getContentPane().add(lblPestry);
		
		JLabel lblDonat = new JLabel("DONAT");
		lblDonat.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblDonat.setBounds(664, 441, 116, 31);
		frame.getContentPane().add(lblDonat);
		
		JLabel lblCupcacks = new JLabel("CUPCAKES");
		lblCupcacks.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblCupcacks.setBounds(664, 520, 116, 31);
		frame.getContentPane().add(lblCupcacks);
		
		JLabel label_21 = new JLabel(" 40 \u20B9 ");
		label_21.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_21.setBounds(824, 275, 57, 20);
		frame.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel(" 30 \u20B9 ");
		label_22.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_22.setBounds(824, 360, 57, 20);
		frame.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel(" 40 \u20B9 ");
		label_23.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_23.setBounds(824, 441, 57, 20);
		frame.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel(" 30 \u20B9 ");
		label_24.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		label_24.setBounds(824, 526, 57, 20);
		frame.getContentPane().add(label_24);
	}
}
