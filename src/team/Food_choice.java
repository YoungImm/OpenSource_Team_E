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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
 
public class Food_choice extends JFrame{
		
    static JFrame J;
    
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
        
        Button button_1 = new Button("\uBA48\uCDA4");
        button_1.setFont(new Font("Myriad Pro SemiExt", Font.BOLD, 16));
        button_1.setForeground(new Color(0, 0, 0));
        button_1.setBackground(new Color(240, 128, 128));
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        
       
         
        button_1.setBounds(385, 498, 133, 46);
        jp1.add(button_1);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\food.jpg"));
        lblNewLabel.setBounds(137, 66, 369, 321);
        jp1.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("\uC74C\uC2DD\uC774\uB984");
        lblNewLabel_2.setBounds(309, 431, 52, 15);
        jp1.add(lblNewLabel_2);
        
        
        JButton btnNewButton = new JButton("H");
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\samsung\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uC74C\uC2DD\\\uBC25\\\uD648.png"));
        btnNewButton.setBounds(594, 0, 52, 52);
        jp1.add(btnNewButton);
    
         
        btnNewButton.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Home_main Home_frame = new Home_main();
				Home_frame.setVisible(true);
				dispose();
			}
			
		});
        
        
         
        JPanel jp2 = new JPanel();
        jp2.setBackground(new Color(0, 102, 153));
        jtab.add("Drink", jp2);
        jp2.setLayout(null);

        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\drink.jpg"));
        lblNewLabel_1.setBounds(139, 69, 367, 322);
        jp2.add(lblNewLabel_1);
        
        Button button_3 = new Button("\uC2DC\uC791");
        button_3.setFont(new Font("Dialog", Font.BOLD, 16));
        button_3.setBackground(new Color(100, 149, 237));
        button_3.setBounds(138, 497, 132, 46);
        jp2.add(button_3);
        
        Button button_4 = new Button("\uBA48\uCDA4");
        button_4.setFont(new Font("Dialog", Font.BOLD, 16));
        button_4.setBackground(new Color(240, 128, 128));
        button_4.setBounds(387, 498, 132, 45);
        jp2.add(button_4);
        
        JLabel lblNewLabel_3 = new JLabel("\uC74C\uC2DD\uC774\uB984");
        lblNewLabel_3.setBounds(300, 431, 52, 15);
        jp2.add(lblNewLabel_3);
        
        JButton button_2 = new JButton("H");
        button_2.setIcon(new ImageIcon("C:\\Users\\samsung\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uC74C\uC2DD\\\uBC25\\\uD648.png"));
        button_2.setBounds(594, 0, 52, 52);
        jp2.add(button_2);
        
        
        button_2.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Home_main Home_frame = new Home_main();
				Home_frame.setVisible(true);
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
        
        JLabel label_1 = new JLabel("New label");
        label_1.setIcon(new ImageIcon("C:\\Users\\JY\\Desktop\\opensource\\img\\dessert.jpg"));
        label_1.setBounds(136, 68, 367, 322);
        jp3.add(label_1);
        
        Button button_6 = new Button("\uC2DC\uC791");
        button_6.setFont(new Font("Dialog", Font.BOLD, 16));
        button_6.setBackground(new Color(100, 149, 237));
        button_6.setBounds(135, 498, 132, 46);
        jp3.add(button_6);
        
        Button button_7 = new Button("\uBA48\uCDA4");
        button_7.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        button_7.setFont(new Font("Dialog", Font.BOLD, 16));
        button_7.setBackground(new Color(240, 128, 128));
        button_7.setBounds(383, 498, 132, 45);
        jp3.add(button_7);
        
             	

        JButton button_5 = new JButton("H");
        button_5.setIcon(new ImageIcon("C:\\Users\\samsung\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uC74C\uC2DD\\\uBC25\\\uD648.png"));
        button_5.setBounds(594, 0, 52, 52);
        jp3.add(button_5);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setVisible(true);
        
        button_5.addActionListener(new ActionListener(){
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				Home_main Home_frame = new Home_main();
				Home_frame.setVisible(true);
				dispose();
			}
			
		});
        
    

 		  

    }
}
