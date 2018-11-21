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
 
public class food {
 
    static JFrame J;
    
    public static void main(String[] args) {
        
        
        J = new JFrame("음식");    
        JTabbedPane  jtab = new JTabbedPane();
        
        JPanel panel = new JPanel(); 
        
        
        J.setLocation(700, 400);
        J.setSize(665,641);
        J.getContentPane().add("Center",jtab);
        JPanel jp1 = new JPanel();
        jp1.setBackground(new Color(0, 102, 153));
        
       
        jtab.add("밥", jp1);
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
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\samsung\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uC74C\uC2DD\\\uBC25\\cfaf.jpg"));
        lblNewLabel.setBounds(137, 66, 369, 321);
        jp1.add(lblNewLabel);
        
        JLabel lblNewLabel_2 = new JLabel("\uC74C\uC2DD\uC774\uB984");
        lblNewLabel_2.setBounds(309, 431, 52, 15);
        jp1.add(lblNewLabel_2);
        
        Button button_2 = new Button("\uD648");
        button_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        button_2.setFont(new Font("Dialog", Font.BOLD, 19));
        button_2.setBackground(new Color(0, 102, 153));
        button_2.setBounds(596, 2, 47, 43);
        jp1.add(button_2);
        JPanel jp2 = new JPanel();
        jp2.setBackground(new Color(0, 102, 153));
        jtab.add("음료", jp2);
        jp2.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\samsung\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uC74C\uC2DD\\\uBC25\\\uC74C\uB8CC\uC218.jpg"));
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
        
        Button button_5 = new Button("\uD648");
        button_5.setFont(new Font("Dialog", Font.BOLD, 19));
        button_5.setBackground(new Color(0, 102, 153));
        button_5.setBounds(596, 2, 47, 43);
        jp2.add(button_5);
        JPanel jp3 = new JPanel();
        jp3.setBackground(new Color(0, 102, 153));
        jtab.add("디저트", jp3);
        jp3.setLayout(null);
        
        JLabel label = new JLabel("\uC74C\uC2DD\uC774\uB984");
        label.setBounds(304, 424, 52, 15);
        jp3.add(label);
        
        JLabel label_1 = new JLabel("New label");
        label_1.setIcon(new ImageIcon("C:\\Users\\samsung\\Documents\\\uCE74\uCE74\uC624\uD1A1 \uBC1B\uC740 \uD30C\uC77C\\\uC74C\uC2DD\\\uBC25\\\uB514\uC800\uD2B8.jpg"));
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
        
        Button button_8 = new Button("\uD648");
        button_8.setFont(new Font("Dialog", Font.BOLD, 19));
        button_8.setBackground(new Color(0, 102, 153));
        button_8.setBounds(597, 0, 47, 43);
        jp3.add(button_8);
        J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        J.setVisible(true);
        
        
    

 		  
    }
        
}
