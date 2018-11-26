package team;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Button;


import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
 
public class Food_choice extends JFrame{
		
    static JFrame J;
    private JButton homebutton3;
   
    
    public static void main(String[] args) {
        
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Food_choice frame = new Food_choice();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});  
 		  
    }
    
    public Food_choice() {
    	J = new JFrame("Food");    
        JTabbedPane  jtab = new JTabbedPane();
        
        JPanel panel = new JPanel(); 
        J.setLocation(550,200);
        J.setSize(665,641);
        J.getContentPane().add("Center",jtab);
        JPanel jp1 = new JPanel();
        jp1.setBackground(new Color(0, 102, 153));
        
       
        jtab.add("Bap", jp1);
        jp1.setLayout(null);
        
        Button button = new Button("\uC2DC\uC791");
        button.setFont(new Font("Myriad Pro SemiExt", Font.BOLD, 16));
        button.setForeground(new Color(0, 0, 0));
        button.setBackground(new Color(100, 149, 237));
        button.setBounds(139, 498, 133, 45);
        jp1.add(button);
        
        Button button_1 = new Button("\uC815\uC9C0");
        button_1.setFont(new Font("Myriad Pro SemiExt", Font.BOLD, 16));
        button_1.setForeground(new Color(0, 0, 0));
        button_1.setBackground(new Color(240, 128, 128));
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        
       
         
        button_1.setBounds(385, 498, 133, 46);
        jp1.add(button_1);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\food.jpg"));
        lblNewLabel.setBounds(137, 66, 369, 321);
        jp1.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("\uC74C\uC2DD\uC774\uB984");
        lblNewLabel_2.setBounds(309, 431, 52, 15);
        jp1.add(lblNewLabel_2);
        
        
        JButton homebutton3 = new JButton("");
        homebutton3.setBackground(new Color(186, 85, 211));
        homebutton3.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
        homebutton3.setBounds(24, 23, 49, 47);
		//아이콘 없애기
        homebutton3.setFocusPainted( false );
        homebutton3.setBorder(null);
		jp1.add(homebutton3);
		
		homebutton3.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
        
        
         
        JPanel jp2 = new JPanel();
        jp2.setBackground(new Color(0, 102, 153));
        jtab.add("Drink", jp2);
        jp2.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\drink.jpg"));
        lblNewLabel_1.setBounds(139, 69, 367, 322);
        jp2.add(lblNewLabel_1);
        
        Button button_3 = new Button("\uC2DC\uC791");
        button_3.setFont(new Font("Dialog", Font.BOLD, 16));
        button_3.setBackground(new Color(100, 149, 237));
        button_3.setBounds(138, 497, 132, 46);
        jp2.add(button_3);
        
        Button button_4 = new Button("\uC815\uC9C0");
        button_4.setFont(new Font("Dialog", Font.BOLD, 16));
        button_4.setBackground(new Color(240, 128, 128));
        button_4.setBounds(387, 498, 132, 45);
        jp2.add(button_4);
        
        JLabel lblNewLabel_3 = new JLabel("\uC74C\uC2DD\uC774\uB984");
        lblNewLabel_3.setBounds(300, 431, 52, 15);
        jp2.add(lblNewLabel_3);
        
        JButton homebutton2 = new JButton("");
        homebutton2.setBackground(new Color(186, 85, 211));
        homebutton2.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
        homebutton2.setBounds(24, 23, 49, 47);
		//아이콘 없애기
        homebutton2.setFocusPainted( false );
        homebutton2.setBorder(null);
		jp2.add(homebutton2);
		
		homebutton2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
        
        
        
        JPanel jp3 = new JPanel();
        jp3.setBackground(new Color(0, 102, 153));
        jtab.add("Dessert", jp3);
        jp3.setLayout(null);
        
        JLabel label = new JLabel("\uC74C\uC2DD\uC774\uB984");
        label.setBounds(304, 424, 52, 15);
        jp3.add(label);
        
        JLabel label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\dessert.jpg"));
        label_1.setBounds(136, 68, 367, 322);
        jp3.add(label_1);
        
        Button button_6 = new Button("\uC2DC\uC791");
        button_6.setFont(new Font("Dialog", Font.BOLD, 16));
        button_6.setBackground(new Color(100, 149, 237));
        button_6.setBounds(135, 498, 132, 46);
        jp3.add(button_6);
        
        Button button_7 = new Button("\uC815\uC9C0");
        button_7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        button_7.setFont(new Font("Dialog", Font.BOLD, 16));
        button_7.setBackground(new Color(240, 128, 128));
        button_7.setBounds(383, 498, 132, 45);
        jp3.add(button_7);
        
             	

        JButton homebutton = new JButton("");
        homebutton.setBackground(new Color(186, 85, 211));
        homebutton.setIcon(new ImageIcon("C:\\Users\\ybail\\Documents\\OpenSource_Team_E\\img\\return-button.png"));
        homebutton.setBounds(24, 23, 49, 47);
		//아이콘 없애기
        homebutton.setFocusPainted( false );
        homebutton.setBorder(null);
		jp3.add(homebutton);
		
		homebutton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Home_main home_frame = new Home_main();
				home_frame.setVisible(true);
				dispose();
			}
		});
        
    

 		  

    }
}
