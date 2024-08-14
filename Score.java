package quiz.application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.JLabel.*;

public class Score extends JFrame implements ActionListener {
	
	
	Score ( String name , int score ) {
		
		setBounds(400,150,750,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
		Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(0, 200, 340, 250);
		add(image);
		
		
		JLabel heading = new JLabel(" ThankYou " + " For Playing ");
		heading.setBounds(45, 30, 700, 30);
		heading.setFont(new Font ("Tahoma",Font.PLAIN,26));
		add(heading);
		
		JLabel Iblscore = new JLabel(" Your Score Is : " + score);
		Iblscore.setBounds(350, 200, 300, 30);
		Iblscore.setFont(new Font ("Tahoma",Font.PLAIN,26));
		add(Iblscore);
		
		  JButton submit = new JButton("Play Again");
	        submit.setBounds(380,270,120,40);
//	        submit.setFont(new Font("Tahoma", Font.PLAIN,22));
	        submit.setBackground(new Color(30,144,254));
	        submit.setForeground(Color.white);
	        submit.addActionListener(this);
//	        submit.setEnabled(false);
	        add(submit);
		
	setVisible(true);	
	}
	
	public void actionPerformed (ActionEvent ae) {
		setVisible(false);
		new Login();
		
	}
	
	public static void main(String[] args) {
		new Score( "user" ,0);
		
	}

}
