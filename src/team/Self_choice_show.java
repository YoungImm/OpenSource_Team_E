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

public class Self_choice_show extends JFrame {

	private JPanel contentPane;
	private int cnt = 0;
	private boolean flag = true;
	
	private String path = "C:\\Users\\JY\\Desktop\\opensource";
	private ArrayList<String> select_arr = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Self_choice_show frame = new Self_choice_show();
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
	public Self_choice_show() {
		super ("Good Choice");
		this.select_arr = Self_choice.select_arr;
		this.cnt = select_arr.size();
		setBounds(100, 100, 608, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocation(650,220);
		
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
		
		JLabel label_2 = new JLabel("");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(0, 0, 139));
		label_2.setFont(new Font("배달의민족 주아", Font.PLAIN, 40));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(24, 106, 552, 152);
		contentPane.add(label_2);
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Self_choice self_frame = new Self_choice();
				self_frame.setVisible(true);
				dispose();
			}
		});
       
       btnNewButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread() {
					public void run() {
						while(flag) {							
							int random_num = (int)(Math.random() * cnt);
							//텍스트 랜덤
							label_2.setText(select_arr.get(random_num));
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
	}
}
