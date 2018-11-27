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
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 592, 432);
		tabbedPane.setBackground(new Color(255, 182, 193));
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(173, 216, 230));
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBounds(12, 10, 49, 47);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(new Color(173, 216, 230));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
		//아이콘 없애기
		btnNewButton_1.setFocusPainted( false );
		btnNewButton_1.setBorder(null);
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 192, 203));
		tabbedPane.addTab("New tab", null, panel_1, null);
		panel_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(12, 10, 49, 47);
		panel_1.add(btnNewButton_2);
		btnNewButton_2.setBackground(new Color(255, 192, 203));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
		//아이콘 없애기
		btnNewButton_2.setFocusPainted( false );
		btnNewButton_2.setBorder(null);
		
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
		tabbedPane.addTab("New tab", null, panel_2, null);
		panel_2.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBounds(12, 10, 49, 47);
		panel_2.add(btnNewButton_3);
		btnNewButton_3.setBackground(new Color(221, 160, 221));
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
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
		setLocation(550,200);
		
		//setUndecorated(true);
	}
}
