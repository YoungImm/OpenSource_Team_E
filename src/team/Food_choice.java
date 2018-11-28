package team;
import java.awt.BorderLayout;
import java.util.Random;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.Label;
import java.awt.Button;
import javax.swing.JSlider;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTabbedPane;
import java.awt.Component;

public class Food_choice extends JFrame {

	private JPanel contentPane;
	public Thread looper;
	public boolean flag = true;
	public ImageIcon img[] = {
			new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Baeksuk.jpg"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Cake.jpg"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Chicken.jpg"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Dak-bokkeum-tang.png"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Jokbal.jpg"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Bossam.png"),
            new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\sample\\Caramel Macchiato.png"),
            //new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\4.png"),
            //new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\return-button.png")

	};
	public String img_name[] = {
			"백숙",
			"케이크",
			"치킨",
			"닭볶음탕",
			"족발",
			"보쌈",
			"카라멜 마끼야또"
	};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food_choice frame = new Food_choice();
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
	public Food_choice() {
		
		super ("Choice_Helper");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setToolTipText("");
		tabbedPane.setBounds(0, 0, 592, 432);
		tabbedPane.setBackground(new Color(255, 182, 193));
		contentPane.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setBackground(new Color(255, 192, 203));
		tabbedPane.addTab("meal", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton1 = new JButton("\uC2DC\uC791");
		btnNewButton1.setBounds(80, 333, 179, 36);
		panel_1.add(btnNewButton1);
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton1.setBackground(new Color(230, 230, 250));
		btnNewButton1.setForeground(new Color(106, 90, 205));
		btnNewButton1.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		
       
	
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(12, 10, 49, 47);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\chosun\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
		//아이콘 없애기
		btnNewButton_2.setFocusPainted( false );
		btnNewButton_2.setBorder(null);
		
	
		JButton button1 = new JButton("\uC815\uC9C0");
		button1.setBounds(329, 333, 179, 36);
		panel_1.add(button1);
		button1.setBackground(new Color(255, 204, 255));
		button1.setForeground(new Color(186, 85, 211));
		button1.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		
		JLabel label1 = new JLabel("\uC2DD\uC0AC\uC885\uB958");
		label1.setBounds(255, 298, 119, 26);
		panel_1.add(label1);
		label1.setBackground(new Color(176, 224, 230));
		label1.setForeground(new Color(199, 21, 133));
		label1.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chosun\\Documents\\OpenSource_Team_E\\img\\meal.PNG"));
		lblNewLabel.setBounds(103, 61, 375, 239);
		panel_1.add(lblNewLabel);
		
		btnNewButton_2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(221, 160, 221));
		tabbedPane.addTab("drink", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(12, 10, 49, 47);
		panel_2.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(221, 160, 221));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\chosun\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
		//아이콘 없애기
		btnNewButton_3.setFocusPainted( false );
		btnNewButton_3.setBorder(null);
		
		btnNewButton_3.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
		JButton btnNewButton2 = new JButton("\uC2DC\uC791");
		btnNewButton2.setBounds(80, 333, 179, 36);
		panel_2.add(btnNewButton2);
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton2.setBackground(new Color(230, 230, 250));
		btnNewButton2.setForeground(new Color(106, 90, 205));
		btnNewButton2.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		
	
		JButton button2 = new JButton("\uC815\uC9C0");
		button2.setBounds(329, 333, 179, 36);
		panel_2.add(button2);
		button2.setBackground(new Color(255, 204, 255));
		button2.setForeground(new Color(186, 85, 211));
		button2.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		
		JLabel label2 = new JLabel("\uB9C8\uC2E4\uAC83");
		label2.setBounds(255, 297, 132, 26);
		panel_2.add(label2);
		label2.setBackground(new Color(176, 224, 230));
		label2.setForeground(new Color(139, 0, 139));
		label2.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\chosun\\Documents\\OpenSource_Team_E\\img\\drink.PNG"));
		lblNewLabel_1.setBounds(83, 56, 418, 241);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("dessert", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(12, 10, 49, 47);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(173, 216, 230));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\chosun\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
		//아이콘 없애기
		btnNewButton_1.setFocusPainted( false );
		btnNewButton_1.setBorder(null);
		
		JButton btnNewButton = new JButton("\uC2DC\uC791");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(80, 333, 179, 36);
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(106, 90, 205));
		btnNewButton.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		
	
		JButton button = new JButton("\uC815\uC9C0");
		button.setBounds(329, 333, 179, 36);
		panel.add(button);
		button.setBackground(new Color(255, 204, 255));
		button.setForeground(new Color(186, 85, 211));
		button.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		
		JLabel label = new JLabel("\uB514\uC800\uD2B8");
		label.setBounds(257, 302, 141, 26);
		panel.add(label);
		label.setBackground(new Color(176, 224, 230));
		label.setForeground(new Color(0, 0, 255));
		label.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
		btnNewButton.setBounds(80, 333, 179, 36);
		panel.add(btnNewButton);
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(106, 90, 205));
		btnNewButton.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\chosun\\Documents\\OpenSource_Team_E\\img\\dessert.PNG"));
		lblNewLabel_2.setBounds(94, 67, 426, 218);
		panel.add(lblNewLabel_2);
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
		
		setLocation(550,200);
		
		//setUndecorated(true);
		 btnNewButton1.addActionListener(new ActionListener(){
				
				@Override
				public void actionPerformed(ActionEvent e) {				
					
					new Thread() {
						public void run() {
							while(flag) {
								int random_num = (int)(Math.random() * 6);
								//사진 랜덤 고르기
								lblNewLabel.setIcon(img[random_num]);
								lblNewLabel.setLocation(160,50);
//								lblNewLabel.revalidate();
//								lblNewLabel.repaint();
//								lblNewLabel.update(lblNewLabel.getGraphics());
//								
								//텍스트 랜덤
								label1.setText(img_name[random_num]);
								
								try {
									Thread.sleep(100);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
							}
						}
					}.start();
					flag = true;				
				}
			});
			
			button1.addActionListener(new ActionListener(){
				
				@Override
				public void actionPerformed(ActionEvent e) {		
					flag = false;
				}
			});		
			
			 btnNewButton2.addActionListener(new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {				
						
						new Thread() {
							public void run() {
								while(flag) {
									int random_num = (int)(Math.random() * 6);
									//사진 랜덤 고르기
									lblNewLabel_1.setIcon(img[random_num]);
									lblNewLabel_1.setLocation(160,50);
//									lblNewLabel.revalidate();
//									lblNewLabel.repaint();
//									lblNewLabel.update(lblNewLabel.getGraphics());
//									
									//텍스트 랜덤
									label2.setText(img_name[random_num]);
									
									try {
										Thread.sleep(100);
									} catch (InterruptedException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}
								}
							}
						}.start();
						flag = true;				
					}
				});
				
				button2.addActionListener(new ActionListener(){
					
					@Override
					public void actionPerformed(ActionEvent e) {		
						flag = false;
					}
				});		
				
				
				 btnNewButton.addActionListener(new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent e) {				
							
							new Thread() {
								public void run() {
									while(flag) {
										int random_num = (int)(Math.random() * 6);
										//사진 랜덤 고르기
										lblNewLabel_2.setIcon(img[random_num]);
										lblNewLabel_2.setLocation(160,50);
//										lblNewLabel.revalidate();
//										lblNewLabel.repaint();
//										lblNewLabel.update(lblNewLabel.getGraphics());
//										
										//텍스트 랜덤
										label.setText(img_name[random_num]);
										
										try {
											Thread.sleep(100);
										} catch (InterruptedException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
										}
									}
								}
							}.start();
							flag = true;				
						}
					});
					
					button.addActionListener(new ActionListener(){
						
						@Override
						public void actionPerformed(ActionEvent e) {		
							flag = false;
						}
					});		
					
					
					//setUndecorated(true);
	}
}
