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

public class Play_choice extends JFrame {

	private JPanel contentPane;
	public Thread looper;
	public boolean flag = true;
	private String path = "C:\\Users\\JY\\Desktop\\opensource";
	public String play_name[] = {
			"",
			"놀이공원",
			"PC방",
			"노래방",
			"찜질방",
			"만화카페",
			"VR",
			"영화",
			"당구",
			"보드게임"
	};
	ImageIcon play_img[] = new ImageIcon[10];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Play_choice frame = new Play_choice();
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
	public Play_choice() {
		super ("결정 도우미 프로그램");
		//이미지 배열 생성
		//dessert
		
		for(int i = 1;i<=9;i++) {
			play_img[i] = new ImageIcon(path +"\\img\\sample\\play\\"+i+".png");
		}
		

		setBounds(100, 100, 608, 471);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 85, 211));
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
		
		JLabel label = new JLabel("\uB180\uAC70\uB9AC");
		label.setBackground(new Color(255, 255, 255));
		label.setForeground(new Color(255, 240, 245));
		label.setFont(new Font("배달의민족 주아", Font.PLAIN, 25));
		label.setBounds(265, 307, 252, 26);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(186, 85, 211));
		btnNewButton_1.setIcon(new ImageIcon(path + "\\img\\return-button.png"));
		btnNewButton_1.setBounds(24, 23, 49, 47);
		//아이콘 없애기
		btnNewButton_1.setFocusPainted( false );
		btnNewButton_1.setBorder(null);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(path + "\\img\\play.PNG"));
		lblNewLabel.setBounds(85, 58, 407, 241);
		contentPane.add(lblNewLabel);
		
		btnNewButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {				
				
				new Thread() {
					public void run() {
						while(flag) {
							int random_num = (int)(Math.random() * 9)+1;
							//사진 랜덤 고르기
							lblNewLabel.setIcon(play_img[random_num]);					
					
							//텍스트 랜덤
							label.setText(play_name[random_num]);
							
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
