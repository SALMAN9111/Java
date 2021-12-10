package com.monocept.model.jframe;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class WelcomePage extends JFrame {
	JPanel newPanel;
	JLabel welcomeLabel;

	public WelcomePage(String userName) {
		System.out.println(userName);
		welcomeLabel = new JLabel();
		welcomeLabel.setText("Welcome "+userName);
		newPanel = new JPanel();
		newPanel.add(welcomeLabel);
		add(newPanel, BorderLayout.CENTER);
		setSize(300,200);
		setTitle("WelCome");
		
		
	}
}
