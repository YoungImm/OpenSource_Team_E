import java.awt.BorderLayout;
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

public class ChangeWB extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangeWB frame = new ChangeWB();
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
	public ChangeWB() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 440);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(186, 85, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("\uC2DC\uC791");
		btnNewButton.setBackground(new Color(230, 230, 250));
		btnNewButton.setForeground(new Color(106, 90, 205));
		btnNewButton.setFont(new Font("배달의민족 도현", Font.PLAIN, 27));
		btnNewButton.setBounds(90, 368, 179, 36);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("\uC815\uC9C0");
		button.setBackground(new Color(255, 204, 255));
		button.setForeground(new Color(186, 85, 211));
		button.setFont(new Font("배달의민족 도현", Font.PLAIN, 27));
		button.setBounds(318, 368, 179, 36);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\chosun\\Downloads\\videogame (1).png"));
		lblNewLabel.setBounds(104, 192, 76, 61);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\uB180\uAC70\uB9AC");
		label.setBackground(new Color(255, 255, 255));
		label.setForeground(new Color(255, 240, 245));
		label.setFont(new Font("배달의민족 주아", Font.PLAIN, 18));
		label.setBounds(270, 335, 57, 15);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(186, 85, 211));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\chosun\\Downloads\\return-button.png"));
		btnNewButton_1.setBounds(24, 40, 49, 47);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		lblNewLabel_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel_1.setFont(new Font("배달의민족 한나는 열한살", Font.BOLD, 18));
		lblNewLabel_1.setForeground(new Color(240, 248, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(567, 10, 24, 15);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\chosun\\Downloads\\clapperboard (1).png"));
		lblNewLabel_2.setBounds(168, 114, 69, 61);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\chosun\\Downloads\\football.png"));
		lblNewLabel_3.setBounds(270, 92, 81, 71);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\chosun\\Downloads\\microphone.png"));
		lblNewLabel_4.setBounds(363, 114, 81, 71);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\chosun\\Downloads\\cards.png"));
		lblNewLabel_5.setBounds(413, 192, 81, 71);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\chosun\\Downloads\\question.png"));
		lblNewLabel_6.setBounds(233, 162, 145, 163);
		contentPane.add(lblNewLabel_6);
		
		setUndecorated(true);
	
	}
}
