package com.monocept.model;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class ResultPage extends JFrame {
	JPanel newPanel;
	JLabel resultLabel;

	public ResultPage(String userName, String result) {
		System.out.println(userName);
		resultLabel = new JLabel();
		if (result.equals("Winner")) {
			resultLabel.setText("You won the game " + userName);
			newPanel = new JPanel();
			newPanel.add(resultLabel);
			add(newPanel, BorderLayout.CENTER);
			setSize(300, 200);
			setTitle("Result Page");
		}
		else {
			resultLabel.setText("Game Draw");
			newPanel = new JPanel();
			newPanel.add(resultLabel);
			add(newPanel, BorderLayout.CENTER);
			setSize(300, 200);
			setTitle("Result Page");
		}

	}

}
