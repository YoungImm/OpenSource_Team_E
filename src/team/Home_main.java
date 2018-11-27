package team;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home_main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home_main frame = new Home_main();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
	//테스트테스트
	public Home_main() {
		setTitle("\uACB0\uC815\uC7A5\uC560 \uD574\uACB0 \uD504\uB85C\uADF8\uB7A8");
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 882, 583);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//setUndecorated(true);
		setLocation(550,200);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 882, 571);
		panel.setBackground(SystemColor.textHighlight);
		contentPane.add(panel);
		panel.setLayout(null);
		 
		JLabel lblNewLabel_1 = new JLabel("\uACB0\uC815\uC7A5\uC560 \uD574\uACB0 \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel_1.setBounds(121, 483, 297, 38);
		lblNewLabel_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(121, 151, 287, 268);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ybail\\Downloads\\help.png"));
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
		lblHome.setBounds(621, 67, 143, 38);
		panel.add(lblHome);
		

		

		
		JButton btn_food = new JButton("\uC74C\uC2DD \uC120\uD0DD");
		btn_food.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		btn_food.setBackground(SystemColor.inactiveCaption);
		btn_food.setBounds(569, 151, 211, 38);
		//아이콘 없애기
		btn_food.setFocusPainted( false );
		btn_food.setBorder(null);
		panel.add(btn_food);
		
		btn_food.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//JButton btn_food = (JButton) e.getSource();
//				JButton btn_play = (JButton) e.getSource();
//				JButton btn_choose = (JButton) e.getSource();
//				
				Food_choice food_Frame = new Food_choice();
				food_Frame.setVisible(true);
				dispose();
			}
			
		});
		
		JButton btn_play = new JButton("\uB180\uAC70\uB9AC \uC120\uD0DD");
		btn_play.setBackground(SystemColor.inactiveCaption);
		btn_play.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		btn_play.setBounds(569, 262, 211, 38);
		//아이콘 없애기
		btn_play.setFocusPainted( false );
		btn_play.setBorder(null);
		
		btn_play.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub					
				
				Play_choice play_Frame = new Play_choice();
				play_Frame.setVisible(true);
				dispose();
			}
		});
		
		panel.add(btn_play);
		
		JButton btn_self = new JButton("\uC9C1\uC811 \uC120\uD0DD");
		btn_self.setBackground(SystemColor.inactiveCaption);
		btn_self.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		btn_self.setBounds(569, 366, 211, 38);
		
		//아이콘 없애기
		btn_self.setFocusPainted( false );
		btn_self.setBorder(null);
		
		
		btn_self.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Self_choice selfFrame = new Self_choice();
				selfFrame.setVisible(true);
				//JButton btn_food = (JButton) e.getSource();
//				JButton btn_play = (JButton) e.getSource();
//				JButton btn_choose = (JButton) e.getSource();
//				
				dispose();
			}			
		});
		panel.add(btn_self);
		
	}
}