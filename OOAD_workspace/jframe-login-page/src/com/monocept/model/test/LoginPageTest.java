package com.monocept.model.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPageTest implements ActionListener {
	private static JLabel userLabel;
	private static JTextField userText;
	private static JLabel passwordLabel;
	private static JPasswordField passwordText;
	private static JButton button;
	private static JLabel success;
	
	public static void main(String[] args) {
		
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("User");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		userText = new JTextField(20);
		userText.setBounds(100,20,165,25);
		panel.add(userText);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		passwordText = new JPasswordField();
		passwordText.setBounds(100,50,165,25);
		panel.add(passwordText);
		
		button = new JButton("Login");
		button.setBounds(10,80,80,25);
		button.addActionListener(new LoginPageTest());
		panel.add(button);
		
		success = new JLabel();
		success.setBounds(10,110,300,25);
		panel.add(success);
		
		
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String user =userText.getText();
		String password = passwordText.getText();
		
		if(user == password) {
			success.setText("Login Successfull.");
		}
	}

}

/*package com.monocept.model.jframe;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class LoginFrame extends JFrame implements ActionListener  {
	
	JLabel userLabel;
	JTextField userName;
	JLabel passwordLabel;
	JPasswordField passwordText;
	JLabel success;

	public void createPage(JPanel panel) {

		panel.setLayout(null);
		userLabel = new JLabel("Name :");
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);

		userName = new JTextField(20);
		userName.setBounds(100, 20, 165, 25);
		panel.add(userName);

		passwordLabel = new JLabel("Password :");
		passwordLabel.setBounds(10, 50, 80, 25);
		panel.add(passwordLabel);

		passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 50, 165, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("login");
		loginButton.setBounds(10, 80, 80, 25);
		loginButton.addActionListener(new LoginFrame());
		panel.add(loginButton);
		
		
		success = new JLabel("");
		success.setBounds(10,110,300,25);
		panel.add(success);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name = userName.getText();
		String password = passwordLabel.getText();
		
		if(name.equals("Admin") && password.equals("Admin")) {
			JOptionPane.showMessageDialog(null, "Login successfull");
			//success.setText("Login successfull");
		}
		success.setText("login successfull");
	}

}

*/
