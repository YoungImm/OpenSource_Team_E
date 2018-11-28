package team;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Label;

public class Self_choice extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;	
	public static ArrayList<String> select_arr  = new ArrayList<String>();
	public static int cnt = 1;
	
	private String path = "C:\\Users\\JY\\Desktop\\opensource";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Self_choice frame = new Self_choice();
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
	public Self_choice() {
		super ("Choice_Helper");
		setBounds(100, 100, 608, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocation(650,220);
		
		textField = new JTextField();
		textField.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		textField.setColumns(10);
		textField.setBounds(133, 96, 135, 33);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setVisible(false);
		textField_1.setBounds(320, 96, 135, 33);
		
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(133, 166, 135, 33);
		textField_2.setVisible(false);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(320, 166, 135, 33);
		
		contentPane.add(textField_3);
		textField_3.setVisible(false);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(133, 237, 135, 33);
		textField_4.setVisible(false);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("배달의민족 주아", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(320, 237, 135, 33);
		textField_5.setVisible(false);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("\uC2DC\uC791");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(106, 90, 205));
		btnNewButton.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		btnNewButton.setBounds(103, 361, 179, 36);
		contentPane.add(btnNewButton);
		
	
		JButton button = new JButton("\uC815\uC9C0");
		button.setBackground(new Color(255, 204, 255));
		button.setForeground(new Color(186, 85, 211));
		button.setFont(new Font("배달의민족 도현", Font.PLAIN, 26));
		button.setBounds(330, 361, 179, 36);
		contentPane.add(button);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(255, 204, 51));
		btnNewButton_1.setIcon(new ImageIcon(path+"\\img\\return-button.png"));
		btnNewButton_1.setBounds(24, 23, 49, 47);
		//아이콘 없애기
		btnNewButton_1.setFocusPainted( false );
		btnNewButton_1.setBorder(null);
		contentPane.add(btnNewButton_1);
		
		JLabel label_1 = new JLabel("\uC9C1\uC811 \uC785\uB825\uD558\uC138\uC694 (\uCD5C\uB300 6\uAC1C)");
		label_1.setForeground(new Color(0, 0, 139));
		label_1.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(170, 44, 256, 26);
		contentPane.add(label_1);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(path + "\\img\\plus.png"));
		button_1.setFocusPainted(false);
		button_1.setBorder(null);
		button_1.setBackground(new Color(255, 204, 51));
		button_1.setBounds(520, 23, 49, 47);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\minus.png"));
		button_2.setFocusPainted(false);
		button_2.setBorder(null);
		button_2.setBackground(new Color(255, 204, 51));
		button_2.setBounds(520, 99, 49, 47);
		contentPane.add(button_2);
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
	//	Self_choice.this.revalidate();
	//	Self_choice.this.repaint();
		
		JTextField text_arr[] = {textField,textField_1,textField_2,textField_3,textField_4,textField_5};
		
       button_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(1<=cnt &&  cnt < 6) {
					text_arr[cnt++].setVisible(true);
				}
			}
		});
       
       button_2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cnt > 1 && cnt <=6) {
					text_arr[--cnt].setVisible(false);
				}
			}
		});
       
       btnNewButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i = 0;i<cnt;i++) {
					select_arr.add(text_arr[i].getText());					
				}
				Self_choice_show self_choice_show = new Self_choice_show();
				self_choice_show.setVisible(true);
				dispose();
			}
		});
       
	}
}
