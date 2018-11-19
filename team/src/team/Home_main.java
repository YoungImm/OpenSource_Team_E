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
		lblNewLabel_1.setBounds(121, 483, 265, 38);
		lblNewLabel_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		lblNewLabel_1.setForeground(Color.WHITE);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(-32, 0, 499, 460);
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JY\\git\\OpenSource_Team_E\\team\\img\\choice.PNG"));
		
		JLabel lblHome = new JLabel("HOME");
		lblHome.setForeground(Color.WHITE);
		lblHome.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 40));
		lblHome.setBounds(621, 67, 143, 38);
		panel.add(lblHome);
		
		JButton button = new JButton("\uB180\uAC70\uB9AC \uC120\uD0DD");
		button.setBackground(SystemColor.inactiveCaption);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		button.setBounds(569, 262, 211, 38);
		panel.add(button);
		
		JButton button_1 = new JButton("\uC9C1\uC811 \uC120\uD0DD");
		button_1.setBackground(SystemColor.inactiveCaption);
		button_1.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		button_1.setBounds(569, 366, 211, 38);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\uC74C\uC2DD \uC120\uD0DD");
		button_2.setFont(new Font("배달의민족 한나체 Pro", Font.PLAIN, 25));
		button_2.setBackground(SystemColor.inactiveCaption);
		button_2.setBounds(569, 151, 211, 38);
		panel.add(button_2);
		
		
	}
}