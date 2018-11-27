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
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class Self_choice extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 526, 526);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("\uC2DC\uC791");
		button.setFont(new Font("Goudy Stout", Font.BOLD, 17));
		button.setBackground(SystemColor.activeCaption);
		button.setBounds(95, 384, 135, 40);
		contentPane.add(button);
		
		Button button_1 = new Button("\uBA48\uCDA4");
		button_1.setFont(new Font("Goudy Stout", Font.BOLD, 17));
		button_1.setBackground(SystemColor.activeCaption);
		button_1.setBounds(293, 384, 135, 40);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(SystemColor.inactiveCaption);
		button_2.setBounds(460, 0, 52, 50);
		contentPane.add(button_2);
		
		
		button_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub					
				
					Home_main home_frame = new Home_main();
					home_frame.setVisible(true);
					dispose();
				}
			});
		
		
		JLabel label = new JLabel("\uACB0\uACFC\uAC12");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(177, 322, 163, 33);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(94, 91, 135, 33);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(281, 91, 135, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(94, 161, 135, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(281, 161, 135, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(281, 233, 135, 33);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(94, 233, 135, 33);
		contentPane.add(textField_5);
		
		
	}

}
