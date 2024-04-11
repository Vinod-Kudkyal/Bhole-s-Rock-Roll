package com.bholes.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.CardLayout;
import java.awt.GridLayout;

public class Menu1 extends JFrame {
	int frenchFriesQty = 0;

	int q = 1; int pr1 = 1; int pr2 = 1; int pr3 = 1; int pr4 = 1; int pr5 = 1; int pr6 = 1; int pr7 = 1; int pr8 = 1; int pr9 = 1; int pr10 = 1; int pr11 = 1; int pr12 = 1;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu1 frame = new Menu1();
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
	public Menu1() {
		
		//int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1070, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		Color c = new Color(116 , 49 , 249);
				
				
				
				
		JPanel panel = new JPanel();
		panel.setBackground(c);
		
		panel.setBounds(0, 0, 210, 613);
		//panel.setVisible(false);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\hamburger1.png"));
		tglbtnNewToggleButton.setBounds(10, 11, 40, 40);
		panel.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Bhole's Rolls");
		tglbtnNewToggleButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		tglbtnNewToggleButton_1.setBounds(0, 72, 210, 40);
		panel.add(tglbtnNewToggleButton_1);
		
		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("Soft Drinks");
		tglbtnNewToggleButton_1_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
		tglbtnNewToggleButton_1_1.setBounds(0, 182, 210, 40);
		panel.add(tglbtnNewToggleButton_1_1);
		//Color c = new Color(116 , 49 , 249);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(220, 0, 487, 602);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(Color.BLACK));
		panel_4.setBounds(10, 11, 467, 485);
		panel_1.add(panel_4);
		panel_4.setVisible(true);
		panel_4.setLayout(null);
		
//		JButton btnNewButton_1_1 = new JButton("");
//		btnNewButton_1_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				panel_4_1.setVisible(false);
//				panel_4.setVisible(true);
//			}
//		});
//		btnNewButton_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\prev1.png"));
//		btnNewButton_1_1.setBounds(10, 530, 50, 50);
//		panel_1.add(btnNewButton_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(23, 103, 104, 148);
		panel_4.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Non-Veg Rolls\\Anda_Cheese1.png"));
		lblNewLabel_1.setBounds(0, 0, 104, 108);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		
		JLabel lblNewLabel_4 = new JLabel("Anda Cheese Roll");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 112, 104, 14);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("70");
		lblNewLabel_3.setBounds(25, 130, 46, 14);
		panel_3.add(lblNewLabel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_1.setLayout(null);
		panel_3_1.setBounds(180, 103, 104, 148);
		panel_4.add(panel_3_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Non-Veg Rolls\\Anda_Chicken1.png"));
		lblNewLabel_1_2.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		lblNewLabel_1_2.setBounds(0, 0, 104, 108);
		panel_3_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4_1 = new JLabel("Anda Chiken Roll");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(0, 110, 104, 14);
		panel_3_1.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("70");
		lblNewLabel_3_1.setBounds(27, 130, 46, 14);
		panel_3_1.add(lblNewLabel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_2.setLayout(null);
		panel_3_2.setBounds(329, 103, 104, 148);
		panel_4.add(panel_3_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("");
		lblNewLabel_1_3.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Non-Veg Rolls\\Anda_Keema1.png"));
		lblNewLabel_1_3.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		lblNewLabel_1_3.setBounds(0, 0, 104, 108);
		panel_3_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_4_2 = new JLabel("Anda Keema Roll");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_2.setBounds(0, 111, 104, 14);
		panel_3_2.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_3_2 = new JLabel("70");
		lblNewLabel_3_2.setBounds(27, 130, 46, 14);
		panel_3_2.add(lblNewLabel_3_2);
		
		JPanel panel_3_3 = new JPanel();
		panel_3_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_3.setLayout(null);
		panel_3_3.setBounds(23, 300, 104, 148);
		panel_4.add(panel_3_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("");
		lblNewLabel_1_4.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Non-Veg Rolls\\Chicken_Cheese1.png"));
		lblNewLabel_1_4.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		lblNewLabel_1_4.setBounds(0, 0, 104, 108);
		panel_3_3.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_4_3 = new JLabel("Chicken Cheese Roll");
		lblNewLabel_4_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_3.setBounds(0, 109, 104, 14);
		panel_3_3.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("70");
		lblNewLabel_3_3.setBounds(29, 130, 46, 14);
		panel_3_3.add(lblNewLabel_3_3);
		
		JPanel panel_3_4 = new JPanel();
		panel_3_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_4.setLayout(null);
		panel_3_4.setBounds(180, 300, 104, 148);
		panel_4.add(panel_3_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("");
		lblNewLabel_1_5.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Non-Veg Rolls\\Chicken_Keema1.png"));
		lblNewLabel_1_5.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		lblNewLabel_1_5.setBounds(0, 0, 104, 108);
		panel_3_4.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_4_4 = new JLabel("Chiken Keema Roll");
		lblNewLabel_4_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_4.setBounds(0, 112, 104, 14);
		panel_3_4.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("70");
		lblNewLabel_3_3_1.setBounds(28, 130, 46, 14);
		panel_3_4.add(lblNewLabel_3_3_1);
		
		JPanel panel_3_5 = new JPanel();
		panel_3_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3_5.setLayout(null);
		panel_3_5.setBounds(329, 300, 104, 148);
		panel_4.add(panel_3_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("");
		lblNewLabel_1_6.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Non-Veg Rolls\\Chicken_Roll1.png"));
		lblNewLabel_1_6.setBorder(new LineBorder(new Color(192, 192, 192), 3));
		lblNewLabel_1_6.setBounds(0, 0, 104, 108);
		panel_3_5.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_4_5 = new JLabel("Chicken Roll");
		lblNewLabel_4_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_5.setBounds(0, 111, 104, 14);
		panel_3_5.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_3_3_2 = new JLabel("70");
		lblNewLabel_3_3_2.setBounds(30, 130, 46, 14);
		panel_3_5.add(lblNewLabel_3_3_2);
		
		JLabel lblNewLabel_2 = new JLabel("Non-Veg Rolls");
		lblNewLabel_2.setBounds(10, 32, 261, 35);
		panel_4.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		
		ArrayList order = new ArrayList();
		ArrayList price = new ArrayList();
		
		
		// non veg rolls
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
				if(con==JOptionPane.YES_OPTION) {
				order.add(lblNewLabel_4.getText());
				price.add(lblNewLabel_3.getText());
				}
			}
		});
		btnNewButton.setBounds(33, 266, 89, 23);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Order");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
				if(con==JOptionPane.YES_OPTION) {
				order.add(lblNewLabel_4_1.getText());
				price.add(lblNewLabel_3_1.getText());
				}
			}
		});
		btnNewButton_1.setBounds(190, 266, 89, 23);
		panel_4.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Order");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
				if(con==JOptionPane.YES_OPTION) {
				order.add(lblNewLabel_4_2.getText());
				price.add(lblNewLabel_3_2.getText());
				
				}
			}
		});
		btnNewButton_2.setBounds(339, 266, 89, 23);
		panel_4.add(btnNewButton_2);
		
		JButton btnOreder = new JButton("Order");
		btnOreder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
				if(con==JOptionPane.YES_OPTION) {
				order.add(lblNewLabel_4_3.getText());
				price.add(lblNewLabel_3_3.getText());
				
				
				}
			}
		});
		btnOreder.setBounds(33, 459, 89, 23);
		panel_4.add(btnOreder);
		
		JButton btnOreder_1 = new JButton("Order");
		btnOreder_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
				if(con==JOptionPane.YES_OPTION) {
				order.add(lblNewLabel_4_4.getText());
				price.add(lblNewLabel_3_3_1.getText());
				
				}
			}
		});
		btnOreder_1.setBounds(190, 459, 89, 23);
		panel_4.add(btnOreder_1);
		
		JButton btnOreder_2 = new JButton("Order");
		btnOreder_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
				if(con==JOptionPane.YES_OPTION) {
				order.add(lblNewLabel_4_5.getText());
				price.add(lblNewLabel_3_3_2.getText());
				
				}
			}
		});
		btnOreder_2.setBounds(339, 459, 89, 23);
		panel_4.add(btnOreder_2);

							
							
							
							
							
							//		JButton btnNewButton_1_1_1 = new JButton("");
							//		btnNewButton_1_1_1.addActionListener(new ActionListener() {
							//			public void actionPerformed(ActionEvent e) {
							//				panel_4_1.setVisible(true);
							//				panel_4.setVisible(false);
							//			}
							//		});
							//		btnNewButton_1_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\next3.png"));
							//		btnNewButton_1_1_1.setBounds(427, 530, 50, 50);
							//		panel_1.add(btnNewButton_1_1_1);
									
									
								//	int size = order.size();
									
							//		for(int i = 1; i<=order.size(); i++) {
							//			JLabel lb = new JLabel(""+order.get(i));
							//		}
							//				
											
												
												
												
												
												
												
												JPanel panel_4_1 = new JPanel();
												panel_4_1.setBounds(10, 42, 467, 477);
												panel_1.add(panel_4_1);
												panel_4_1.setLayout(null);
												panel_4_1.setVisible(false);
												//	btnNewButton_1_1_1.set
													panel_4_1.setBorder(new LineBorder(Color.BLACK));
													
														JPanel panel_3_6 = new JPanel();
														panel_3_6.setLayout(null);
														panel_3_6.setBorder(new LineBorder(new Color(0, 0, 0)));
														panel_3_6.setBounds(23, 67, 104, 148);
														panel_4_1.add(panel_3_6);
														
														JLabel lblNewLabel_1_7 = new JLabel("");
														lblNewLabel_1_7.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Veg Rolls\\Aloo_Roll1.png"));
														lblNewLabel_1_7.setBorder(new LineBorder(new Color(192, 192, 192), 3));
														lblNewLabel_1_7.setBounds(0, 0, 104, 108);
														panel_3_6.add(lblNewLabel_1_7);
														
														JLabel lblNewLabel_4_6 = new JLabel("Aloo Roll");
														lblNewLabel_4_6.setHorizontalAlignment(SwingConstants.CENTER);
														lblNewLabel_4_6.setBounds(0, 108, 104, 14);
														panel_3_6.add(lblNewLabel_4_6);
														
														JLabel lblNewLabel_3_4 = new JLabel("70");
														lblNewLabel_3_4.setBounds(28, 123, 46, 14);
														panel_3_6.add(lblNewLabel_3_4);
														
														JPanel panel_3_1_1 = new JPanel();
														panel_3_1_1.setLayout(null);
														panel_3_1_1.setBorder(new LineBorder(new Color(0, 0, 0)));
														panel_3_1_1.setBounds(180, 67, 104, 148);
														panel_4_1.add(panel_3_1_1);
														
														JLabel lblNewLabel_1_2_1 = new JLabel("");
														lblNewLabel_1_2_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Veg Rolls\\Manchurian_Roll1.png"));
														lblNewLabel_1_2_1.setBorder(new LineBorder(new Color(192, 192, 192), 3));
														lblNewLabel_1_2_1.setBounds(0, 0, 104, 108);
														panel_3_1_1.add(lblNewLabel_1_2_1);
														
														JLabel lblNewLabel_4_7 = new JLabel("Manchurian Roll");
														lblNewLabel_4_7.setHorizontalAlignment(SwingConstants.CENTER);
														lblNewLabel_4_7.setBounds(0, 108, 104, 14);
														panel_3_1_1.add(lblNewLabel_4_7);
														
														JLabel lblNewLabel_3_5 = new JLabel("70");
														lblNewLabel_3_5.setBounds(35, 123, 46, 14);
														panel_3_1_1.add(lblNewLabel_3_5);
														
														JPanel panel_3_2_1 = new JPanel();
														panel_3_2_1.setLayout(null);
														panel_3_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
														panel_3_2_1.setBounds(329, 67, 104, 148);
														panel_4_1.add(panel_3_2_1);
														
														JLabel lblNewLabel_1_3_1 = new JLabel("");
														lblNewLabel_1_3_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Veg Rolls\\Mix-Veg_Cheese1.png"));
														lblNewLabel_1_3_1.setBorder(new LineBorder(new Color(192, 192, 192), 3));
														lblNewLabel_1_3_1.setBounds(0, 0, 104, 108);
														panel_3_2_1.add(lblNewLabel_1_3_1);
														
														JLabel lblNewLabel_4_8 = new JLabel("Mix-Veg Roll");
														lblNewLabel_4_8.setHorizontalAlignment(SwingConstants.CENTER);
														lblNewLabel_4_8.setBounds(0, 107, 104, 14);
														panel_3_2_1.add(lblNewLabel_4_8);
														
														JLabel lblNewLabel_3_6 = new JLabel("70");
														lblNewLabel_3_6.setBounds(30, 123, 46, 14);
														panel_3_2_1.add(lblNewLabel_3_6);
														
														JPanel panel_3_3_1 = new JPanel();
														panel_3_3_1.setLayout(null);
														panel_3_3_1.setBorder(new LineBorder(new Color(0, 0, 0)));
														panel_3_3_1.setBounds(23, 281, 104, 148);
														panel_4_1.add(panel_3_3_1);
														
														JLabel lblNewLabel_1_4_1 = new JLabel("");
														lblNewLabel_1_4_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Veg Rolls\\Noodles_Roll1.png"));
														lblNewLabel_1_4_1.setBorder(new LineBorder(new Color(192, 192, 192), 3));
														lblNewLabel_1_4_1.setBounds(0, 0, 104, 108);
														panel_3_3_1.add(lblNewLabel_1_4_1);
														
														JLabel lblNewLabel_4_9 = new JLabel("Noodels Roll");
														lblNewLabel_4_9.setHorizontalAlignment(SwingConstants.CENTER);
														lblNewLabel_4_9.setBounds(0, 108, 104, 14);
														panel_3_3_1.add(lblNewLabel_4_9);
														
														JLabel lblNewLabel_3_7 = new JLabel("70");
														lblNewLabel_3_7.setBounds(31, 123, 46, 14);
														panel_3_3_1.add(lblNewLabel_3_7);
														
														JPanel panel_3_4_1 = new JPanel();
														panel_3_4_1.setLayout(null);
														panel_3_4_1.setBorder(new LineBorder(new Color(0, 0, 0)));
														panel_3_4_1.setBounds(180, 281, 104, 148);
														panel_4_1.add(panel_3_4_1);
														
														JLabel lblNewLabel_1_5_1 = new JLabel("");
														lblNewLabel_1_5_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Veg Rolls\\Paneer_Roll1.png"));
														lblNewLabel_1_5_1.setBorder(new LineBorder(new Color(192, 192, 192), 3));
														lblNewLabel_1_5_1.setBounds(0, 0, 104, 108);
														panel_3_4_1.add(lblNewLabel_1_5_1);
														
														JLabel lblNewLabel_4_10 = new JLabel("Paneer Roll");
														lblNewLabel_4_10.setHorizontalAlignment(SwingConstants.CENTER);
														lblNewLabel_4_10.setBounds(0, 109, 104, 14);
														panel_3_4_1.add(lblNewLabel_4_10);
														
														JLabel lblNewLabel_3_8 = new JLabel("70");
														lblNewLabel_3_8.setBounds(27, 123, 46, 14);
														panel_3_4_1.add(lblNewLabel_3_8);
														
														JPanel panel_3_5_1 = new JPanel();
														panel_3_5_1.setLayout(null);
														panel_3_5_1.setBorder(new LineBorder(new Color(0, 0, 0)));
														panel_3_5_1.setBounds(329, 281, 104, 148);
														panel_4_1.add(panel_3_5_1);
														
														JLabel lblNewLabel_1_6_1 = new JLabel("");
														lblNewLabel_1_6_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Veg Rolls\\Soyabean_Masala1.png"));
														lblNewLabel_1_6_1.setBorder(new LineBorder(new Color(192, 192, 192), 3));
														lblNewLabel_1_6_1.setBounds(0, 0, 104, 108);
														panel_3_5_1.add(lblNewLabel_1_6_1);
														
														JLabel lblNewLabel_4_11 = new JLabel("Soyabean Roll");
														lblNewLabel_4_11.setHorizontalAlignment(SwingConstants.CENTER);
														lblNewLabel_4_11.setBounds(0, 106, 104, 14);
														panel_3_5_1.add(lblNewLabel_4_11);
														
														JLabel lblNewLabel_3_9 = new JLabel("70");
														lblNewLabel_3_9.setBounds(32, 123, 46, 14);
														panel_3_5_1.add(lblNewLabel_3_9);
														
														JLabel lblNewLabel_2_2 = new JLabel("Veg Rolls");
														lblNewLabel_2_2.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
														lblNewLabel_2_2.setBounds(10, 11, 261, 35);
														panel_4_1.add(lblNewLabel_2_2);
														
														//veg rolls
														
														JButton btnNewButton_4 = new JButton("Order");
														btnNewButton_4.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
																if(con==JOptionPane.YES_OPTION) {
																order.add(lblNewLabel_4_6.getText());
																price.add(lblNewLabel_3_4.getText());
																
																}
																
															}
														});
														btnNewButton_4.setBounds(33, 226, 89, 23);
														panel_4_1.add(btnNewButton_4);
														
														JButton btnNewButton_5 = new JButton("Order");
														btnNewButton_5.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
																if(con==JOptionPane.YES_OPTION) {
																order.add(lblNewLabel_4_7.getText());
																price.add(lblNewLabel_3_5.getText());
																
																}
																
															}
														});
														btnNewButton_5.setBounds(190, 226, 89, 23);
														panel_4_1.add(btnNewButton_5);
														
														JButton btnNewButton_6 = new JButton("Order");
														btnNewButton_6.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
																if(con==JOptionPane.YES_OPTION) {
																order.add(lblNewLabel_4_8.getText());
																price.add(lblNewLabel_3_6.getText());
																
																}
																
															}
														});
														btnNewButton_6.setBounds(339, 226, 89, 23);
														panel_4_1.add(btnNewButton_6);
														
														JButton btnNewButton_7 = new JButton("Order");
														btnNewButton_7.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
																if(con==JOptionPane.YES_OPTION) {
																order.add(lblNewLabel_4_9.getText());
																price.add(lblNewLabel_3_7.getText());
																
																}
																
															}
														});
														btnNewButton_7.setBounds(33, 440, 89, 23);
														panel_4_1.add(btnNewButton_7);
														
														JButton btnNewButton_8 = new JButton("Order");
														btnNewButton_8.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
																if(con==JOptionPane.YES_OPTION) {
																order.add(lblNewLabel_4_10.getText());
																price.add(lblNewLabel_3_8.getText());
																
																}
																
															}
														});
														btnNewButton_8.setBounds(190, 440, 89, 23);
														panel_4_1.add(btnNewButton_8);
														
														JButton btnNewButton_9 = new JButton("Order");
														btnNewButton_9.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																int con = JOptionPane.showConfirmDialog(contentPane, "Confirm Order");
																if(con==JOptionPane.YES_OPTION) {
																order.add(lblNewLabel_4_11.getText());
																price.add(lblNewLabel_3_9.getText());
																
																}
																
															}
														});
														btnNewButton_9.setBounds(339, 440, 89, 23);
														panel_4_1.add(btnNewButton_9);
														
														
														JButton btnNewButton_1_1_1 = new JButton("");
														btnNewButton_1_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																panel_4_1.setVisible(true);
																panel_4.setVisible(false);
															}
														});
														btnNewButton_1_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\next3.png"));
														btnNewButton_1_1_1.setBounds(427, 530, 50, 50);
														panel_1.add(btnNewButton_1_1_1);
														
														JButton btnNewButton_1_1 = new JButton("");
														btnNewButton_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																panel_4_1.setVisible(false);
																panel_4.setVisible(true);
															}
														});
														btnNewButton_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\prev1.png"));
														btnNewButton_1_1.setBounds(10, 530, 50, 50);
														panel_1.add(btnNewButton_1_1);
														
														JPanel panel_2 = new JPanel();
														panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
														panel_2.setBounds(717, 0, 337, 438);
														contentPane.add(panel_2);
														panel_2.setLayout(null);
														
														JLabel i1 = new JLabel("");
														i1.setBounds(10, 50, 170, 20);
														panel_2.add(i1);
														
														JLabel i2 = new JLabel("");
														i2.setBounds(10, 80, 170, 20);
														panel_2.add(i2);
														
														JLabel i3 = new JLabel("");
														i3.setBounds(10, 110, 170, 20);
														panel_2.add(i3);
														
														JLabel i4 = new JLabel("");
														i4.setBounds(10, 140, 170, 20);
														panel_2.add(i4);
														
														JLabel i5 = new JLabel("");
														i5.setBounds(10, 170, 170, 20);
														panel_2.add(i5);
														
														JLabel lblNewLabel = new JLabel("Your Order");
														lblNewLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
														lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
														lblNewLabel.setBounds(10, 11, 295, 28);
														panel_2.add(lblNewLabel);
														
														JLabel i6 = new JLabel("");
														i6.setBounds(10, 200, 170, 20);
														panel_2.add(i6);
														
														JLabel i7 = new JLabel("");
														i7.setBounds(10, 230, 170, 20);
														panel_2.add(i7);
														
														JLabel i8 = new JLabel("");
														i8.setBounds(10, 260, 170, 20);
														panel_2.add(i8);
														
														JLabel i9 = new JLabel("");
														i9.setBounds(10, 290, 170, 20);
														panel_2.add(i9);
														
														JLabel i10 = new JLabel("");
														i10.setBounds(10, 320, 170, 20);
														panel_2.add(i10);

														JLabel i11 = new JLabel("");
														i11.setBounds(10, 350, 170, 20);
														panel_2.add(i11);
														
														JLabel i12 = new JLabel("");
														i12.setBounds(10, 380, 170, 20);
														panel_2.add(i12);
														
														JLabel p1 = new JLabel("");
														p1.setBounds(190, 50, 40, 20);
														panel_2.add(p1);
														
														JLabel p2 = new JLabel("");
														p2.setBounds(190, 80, 40, 20);
														panel_2.add(p2);
														
														JLabel p3 = new JLabel("");
														p3.setBounds(190, 110, 40, 20);
														panel_2.add(p3);
														
														JLabel p4 = new JLabel("");
														p4.setBounds(190, 140, 40, 20);
														panel_2.add(p4);
														
														JLabel p5 = new JLabel("");
														p5.setBounds(190, 170, 40, 20);
														panel_2.add(p5);
														
														JLabel p6 = new JLabel("");
														p6.setBounds(190, 200, 40, 20);
														panel_2.add(p6);
														
														JLabel p7 = new JLabel("");
														p7.setBounds(190, 230, 40, 20);
														panel_2.add(p7);
														
														JLabel p8 = new JLabel("");
														p8.setBounds(190, 260, 40, 20);
														panel_2.add(p8);
														
														JLabel p9 = new JLabel("");
														p9.setBounds(190, 290, 40, 20);
														panel_2.add(p9);
														
														JLabel p10 = new JLabel("");
														p10.setBounds(190, 320, 40, 20);
														panel_2.add(p10);

														JLabel p11 = new JLabel("");
														p11.setBounds(190, 351, 40, 20);
														panel_2.add(p11);
														
														JLabel p12 = new JLabel("");
														p12.setBounds(190, 380, 40, 20);
														panel_2.add(p12);
														
														JLabel q1 = new JLabel("");
														q1.setBounds(270, 50, 26, 20);
														panel_2.add(q1);
														
														JLabel q2 = new JLabel("");
														q2.setBounds(270, 80, 26, 20);
														panel_2.add(q2);
														
														JLabel q3 = new JLabel("");
														q3.setBounds(270, 110, 26, 20);
														panel_2.add(q3);

														JLabel q4 = new JLabel("");
														q4.setBounds(270, 140, 26, 20);
														panel_2.add(q4);

														JLabel q5 = new JLabel("");
														q5.setBounds(270, 170, 26, 20);
														panel_2.add(q5);

														JLabel q6 = new JLabel("");
														q6.setBounds(270, 201, 26, 20);
														panel_2.add(q6);
														
														JLabel q7 = new JLabel("");
														q7.setBounds(270, 230, 26, 20);
														panel_2.add(q7);
														
														JLabel q8 = new JLabel("");
														q8.setBounds(270, 260, 26, 20);
														panel_2.add(q8);
														
														JLabel q9 = new JLabel("");
														q9.setBounds(270, 290, 26, 20);
														panel_2.add(q9);
														
														JLabel q10 = new JLabel("");
														q10.setBounds(270, 320, 26, 20);
														panel_2.add(q10);

														JLabel q11 = new JLabel("");
														q11.setBounds(270, 351, 26, 20);
														panel_2.add(q11);
														
														JLabel q12 = new JLabel("");
														q12.setBounds(270, 380, 26, 20);
														panel_2.add(q12);
														
														
														JButton btnNewButton_10 = new JButton("");
														btnNewButton_10.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--;
																	pr1--;
																	q1.setText(""+pr1);
																	p1.setText(""+70*pr1);
																}
																else {
																	btnNewButton_10.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10.setBounds(238, 50, 26, 20);
														panel_2.add(btnNewButton_10);
														
														JButton btnNewButton_10_1 = new JButton("");
														btnNewButton_10_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++;
																pr1++;
																q1.setText(""+pr1);
																p1.setText(""+70*pr1);
																btnNewButton_10.setBorder(null);
															}
														});
														btnNewButton_10_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1.setBounds(301, 50, 26, 20);
														panel_2.add(btnNewButton_10_1);
														
														JButton btnNewButton_10_2 = new JButton("");
														btnNewButton_10_2.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--;
																	pr2--;
																	q2.setText(""+pr2);
																	p2.setText(""+70*pr2);
																}
																else {
																	btnNewButton_10_2.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2.setBounds(240, 80, 26, 20);
														panel_2.add(btnNewButton_10_2);
														
														JButton btnNewButton_10_1_1 = new JButton("");
														btnNewButton_10_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr2++;
																q2.setText(""+pr2);
																p2.setText(""+70*pr2);
																btnNewButton_10_2.setBorder(null);
															}
														});
														btnNewButton_10_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1.setBounds(301, 80, 26, 20);
														panel_2.add(btnNewButton_10_1_1);
														
														JButton btnNewButton_10_2_1 = new JButton("");
														btnNewButton_10_2_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr3--;
																	q3.setText(""+pr3);
																	p3.setText(""+70*pr3);
																}
																else {
																	btnNewButton_10_2_1.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1.setBounds(240, 110, 26, 20);
														panel_2.add(btnNewButton_10_2_1);
														
														
														JButton btnNewButton_10_1_1_1 = new JButton("");
														btnNewButton_10_1_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr3++;
																q3.setText(""+pr3);
																p3.setText(""+70*pr3);
																btnNewButton_10_2_1.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1.setBounds(301, 111, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1);
														
														JButton btnNewButton_10_2_1_1 = new JButton("");
														btnNewButton_10_2_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr4--;
																	q4.setText(""+pr4);
																	p4.setText(""+70*pr4);
																}
																else {
																	btnNewButton_10_2_1_1.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1.setBounds(240, 140, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1);
														
														
														JButton btnNewButton_10_1_1_1_1 = new JButton("");
														btnNewButton_10_1_1_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr4++;
																q4.setText(""+pr4);
																p4.setText(""+70*pr4);
																btnNewButton_10_2_1_1.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1.setBounds(301, 140, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1);
														
														JButton btnNewButton_10_2_1_1_1 = new JButton("");
														btnNewButton_10_2_1_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr5--;
																	q5.setText(""+pr5);
																	p5.setText(""+70*pr5);
																}
																else {
																	btnNewButton_10_2_1_1_1.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1_1.setBounds(240, 170, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1_1);
														
														
														JButton btnNewButton_10_1_1_1_1_1 = new JButton("");
														btnNewButton_10_1_1_1_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr5++;
																q5.setText(""+pr5);
																p5.setText(""+70*pr5);
																btnNewButton_10_2_1_1_1.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1_1.setBounds(301, 170, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1_1);
														
														JButton btnNewButton_10_2_1_1_1_1 = new JButton("");
														btnNewButton_10_2_1_1_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr6--;
																	q6.setText(""+pr6);
																	p6.setText(""+70*pr6);
																}
																else {
																	btnNewButton_10_2_1_1_1_1.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1_1_1.setBounds(240, 201, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1_1_1);
														
														
														JButton btnNewButton_10_1_1_1_1_1_1 = new JButton("");
														btnNewButton_10_1_1_1_1_1_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr6++;
																q6.setText(""+pr6);
																p6.setText(""+70*pr6++);
																btnNewButton_10_2_1_1_1_1.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1_1_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1_1_1.setBounds(301, 201, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1_1_1);
														
														JButton btnNewButton_10_2_1_1_1_2 = new JButton("");
														btnNewButton_10_2_1_1_1_2.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr7--;
																	q7.setText(""+pr7);
																	p7.setText(""+70*pr7);
																}
																else {
																	btnNewButton_10_2_1_1_1_2.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1_1_2.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1_1_2.setBounds(240, 230, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1_1_2);
														
													
														JButton btnNewButton_10_1_1_1_1_1_2 = new JButton("");
														btnNewButton_10_1_1_1_1_1_2.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr7++;
																q7.setText(""+pr7);
																p7.setText(""+70*pr7);
																btnNewButton_10_2_1_1_1_2.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1_1_2.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1_1_2.setBounds(301, 230, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1_1_2);
														
														JButton btnNewButton_10_2_1_1_1_3 = new JButton("");
														btnNewButton_10_2_1_1_1_3.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr8--;
																	q8.setText(""+pr8);
																	p8.setText(""+70*pr8);
																}
																else {
																	btnNewButton_10_2_1_1_1_3.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1_1_3.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1_1_3.setBounds(240, 260, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1_1_3);
														
														
														JButton btnNewButton_10_1_1_1_1_1_3 = new JButton("");
														btnNewButton_10_1_1_1_1_1_3.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr8++;
																q8.setText(""+pr8);
																p8.setText(""+70*pr8);
																btnNewButton_10_2_1_1_1_3.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1_1_3.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1_1_3.setBounds(301, 260, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1_1_3);
														
														JButton btnNewButton_10_2_1_1_1_4 = new JButton("");
														btnNewButton_10_2_1_1_1_4.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr9--;
																	q9.setText(""+pr9);
																	p9.setText(""+70*pr9);
																}
																else {
																	btnNewButton_10_2_1_1_1_4.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1_1_4.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1_1_4.setBounds(240, 290, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1_1_4);
														
														
														JButton btnNewButton_10_1_1_1_1_1_4 = new JButton("");
														btnNewButton_10_1_1_1_1_1_4.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr9++;
																q9.setText(""+pr9);
																p9.setText(""+70*pr9);
																btnNewButton_10_2_1_1_1_4.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1_1_4.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1_1_4.setBounds(301, 290, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1_1_4);
														
														JButton btnNewButton_10_2_1_1_1_5 = new JButton("");
														btnNewButton_10_2_1_1_1_5.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr10--;
																	q10.setText(""+pr10);
																	p10.setText(""+70*pr10);
																}
																else {
																	btnNewButton_10_2_1_1_1_5.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1_1_5.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1_1_5.setBounds(240, 320, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1_1_5);
														
														
														
														JButton btnNewButton_10_1_1_1_1_1_5 = new JButton("");
														btnNewButton_10_1_1_1_1_1_5.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr10++;
																q10.setText(""+pr10);
																p10.setText(""+70*pr10);
																btnNewButton_10_2_1_1_1_5.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1_1_5.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1_1_5.setBounds(301, 320, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1_1_5);
														
														
														
														JButton btnNewButton_10_2_1_1_1_5_1 = new JButton("");
														btnNewButton_10_2_1_1_1_5_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr11--;
																	q11.setText(""+pr11);
																	p11.setText(""+70*pr11);
																}
																else {
																	btnNewButton_10_2_1_1_1_5_1.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1_1_5_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1_1_5_1.setBounds(240, 350, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1_1_5_1);
														
														JButton btnNewButton_10_1_1_1_1_1_5_1 = new JButton("");
														btnNewButton_10_1_1_1_1_1_5_1.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr11++;
																q11.setText(""+pr11);
																p11.setText(""+70*pr11);
																btnNewButton_10_2_1_1_1_5_1.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1_1_5_1.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1_1_5_1.setBounds(301, 351, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1_1_5_1);
														
														JButton btnNewButton_10_2_1_1_1_5_2 = new JButton("");
														btnNewButton_10_2_1_1_1_5_2.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																if(q>1) {
																	q--; pr11--;
																	q12.setText(""+pr11);
																	p12.setText(""+70*pr11);
																}
																else {
																	btnNewButton_10_2_1_1_1_5_2.setBorder(new LineBorder(Color.RED, 2));
																	q=1;
																}
															}
														});
														btnNewButton_10_2_1_1_1_5_2.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\minus1.png"));
														btnNewButton_10_2_1_1_1_5_2.setBounds(240, 380, 26, 20);
														panel_2.add(btnNewButton_10_2_1_1_1_5_2);
														
														JButton btnNewButton_10_1_1_1_1_1_5_2 = new JButton("");
														btnNewButton_10_1_1_1_1_1_5_2.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																q++; pr12++;
																q12.setText(""+pr12);
																p12.setText(""+70*pr12);
																btnNewButton_10_2_1_1_1_5_2.setBorder(null);
															}
														});
														btnNewButton_10_1_1_1_1_1_5_2.setIcon(new ImageIcon("G:\\eclipse-workspace\\Rock And Rolls\\Images\\Icons\\add1.png"));
														btnNewButton_10_1_1_1_1_1_5_2.setBounds(301, 380, 26, 20);
														panel_2.add(btnNewButton_10_1_1_1_1_1_5_2);
														
														
														class rough1{
															public  void tp(String s , String p) {
																if(i1.getText().equals("") && p1.getText().equals("")) {
																	i1.setText(s);
																	p1.setText(p);
																	q1.setText(""+q);
																}else if(i2.getText().equals("") && p2.getText().equals("")){
																	i2.setText(s);
																	p2.setText(p);
																	q2.setText(""+q);
																}else if(i3.getText().equals("") && p3.getText().equals("")){
																	i3.setText(s);
																	p3.setText(p);
																	q3.setText(""+q);
																}else if(i4.getText().equals("") && p4.getText().equals("")){
																	i4.setText(s);
																	p4.setText(p);
																	q4.setText(""+q);
																}else if(i5.getText().equals("") && p5.getText().equals("")){
																	i5.setText(s);
																	p5.setText(p);
																	q5.setText(""+q);
																}else if(i6.getText().equals("") && p6.getText().equals("")){
																	i6.setText(s);
																	p6.setText(p);
																	q6.setText(""+q);
																}else if(i7.getText().equals("") && p7.getText().equals("")){
																	i7.setText(s);
																	p7.setText(p);
																	q7.setText(""+q);
																}else if(i8.getText().equals("") && p8.getText().equals("")){
																	i8.setText(s);
																	p8.setText(p);
																	q8.setText(""+q);
																}else if(i9.getText().equals("") && p9.getText().equals("")){
																	i9.setText(s);
																	p9.setText(p);
																	q9.setText(""+q);
																}else if(i10.getText().equals("") && p10.getText().equals("")){
																	i10.setText(s);
																	p10.setText(p);
																	q10.setText(""+q);
																}else if(i11.getText().equals("") && p11.getText().equals("")){
																	i11.setText(s);
																	p11.setText(p);
																	q11.setText(""+q);
																}else if(i12.getText().equals("") && p12.getText().equals("")){
																	i12.setText(s);
																	p12.setText(p);
																	q12.setText(""+q);
																}else {
																	 JOptionPane.showMessageDialog(contentPane,"Limit Reached");  
																}
																
															}
															
															}
														
														
														JButton btnNewButton_3 = new JButton("Confirm");
														btnNewButton_3.addActionListener(new ActionListener() {
															public void actionPerformed(ActionEvent e) {
																
																rough1 r = new rough1();
																for(int v =0;v<order.size();v++) {
																	r.tp(String.valueOf(order.get(v)) , String.valueOf(price.get(v)));
																	
																}
																order.clear();
																price.clear();
															}
														});
														btnNewButton_3.setBounds(197, 557, 89, 23);
														panel_1.add(btnNewButton_3);
//					JScrollPane sp = new JScrollPane(panel_2 , JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//					contentPane.add(sp);
//		if(panel_4_1.isVisible()==true) {
//			btnNewButton_1_1_1.setEnabled(false);
//			btnNewButton_1_1.setEnabled(true);
//		}
//		
//		if(panel_4.isVisible()==true) {
//			btnNewButton_1_1.setEnabled(false);
//			btnNewButton_1_1_1.setEnabled(true);
//		}
//		
		
	}
}
