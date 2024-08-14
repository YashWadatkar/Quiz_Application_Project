package quiz.application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	
	
	JButton rules, back;
	 JTextField tfName;
	 

	
	Login() {
		getContentPane().setBackground(Color.WHITE);
//		getContentPane().setBackground(Color.WHITE);
        setLayout(null); // Use absolute positioning

		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
		JLabel image = new JLabel(i1);
		image.setBounds(0, 0, 600, 500);
		add(image);
		
		JLabel heading = new JLabel("Simple Minds");
		 heading.setBounds(750, 60, 300, 45);
		 heading.setFont(new Font(" Mongolian Baiti ", Font.BOLD,40));
		 heading.setForeground(new Color(30,144,254));
//		 heading.setForeground(Color.black);
		 add(heading);
		 
		 
		 JLabel name = new JLabel("Enter Your Name ");
		 name.setBounds(810, 150, 300, 20);
		 name.setFont(new Font(" Mongolian Baiti ", Font.BOLD,18));
		 heading.setForeground(new Color(30,144,254));
//		 name.setForeground(Color.black);
		 add(name);
		 
		  tfName = new JTextField();
		 tfName.setBounds(735,200,300,25);
		 tfName.setFont(new Font ("Mongolian Baiti" , Font.BOLD , 20));
		 add(tfName);
		 
		 
		  rules = new JButton ("Rules");
		 rules.setBounds(735, 270, 120, 25);
		 rules.setBackground(new Color (30,144,254));
		 rules.setForeground(Color.WHITE);
		 rules.addActionListener(this);
		 add(rules);
		 
		 back = new JButton ("Back");
		 back.setBounds(915, 270, 120, 25);
		 back.setBackground(new Color (30,144,254));
		 back.setForeground(Color.WHITE);
		 back.addActionListener(this);
		 add(back);
		 
		 
		 
		setSize(1200, 500);
		setLocation(200, 150);		
		setVisible(true);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	public void actionPerformed (ActionEvent ae) {
		if (ae.getSource() == rules) {
			String name = tfName.getText();
			setVisible(false);
			new Rules(name);
			
		} else if (ae.getSource() == back) {
			setVisible(false);

		}
		
		
	}
	
	
	
	  public static void main(String[] args) {
		
		  new Login();
	}


	}
	 

