package com.monocept.model.jframe;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LoginFrame extends JFrame implements ActionListener {
	JButton button;
	JPanel newPanel;
	JLabel userLabel, passLabel, success;
	final JTextField nameOfUser, passwordText;

	public LoginFrame() {

		userLabel = new JLabel();
		userLabel.setText("Username");

		nameOfUser = new JTextField(15);

		passLabel = new JLabel();
		passLabel.setText("Password");

		passwordText = new JPasswordField(15);
		
		success = new JLabel("");

		button = new JButton("Login");
		newPanel = new JPanel();
		newPanel.add(userLabel);
		newPanel.add(nameOfUser);
		newPanel.add(passLabel);
		newPanel.add(passwordText);
		newPanel.add(button);
		newPanel.add(success);

		add(newPanel, BorderLayout.CENTER);

		button.addActionListener(this);
		setTitle("LOGIN FORM");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String userName = nameOfUser.getText();
		String password = passwordText.getText();

		if (userName.equals("Admin") && password.equals("Admin")) {
			WelcomePage welcomePage = new WelcomePage(userName);
			welcomePage.setVisible(true);
			//@SuppressWarnings("unused")
			//JLabel welcomeLabel = new JLabel("Welcome "+userName);
			//welcomePage.getContentPane().add(welcomePage);
			
			
		} else {
			success.setText("enter valid username and password");
		}
	}

}

