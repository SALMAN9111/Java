package com.monocept.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;



public class DevilListener implements ActionListener{
	private final JLabel _mainLabel;
	
	public DevilListener() {
		_mainLabel = new JLabel();
		_mainLabel.setBounds(50, 50, 50, 50);
	}

	public JLabel getMainLabel() {
		return _mainLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		_mainLabel.setText("Devil is Listening");
		
	}
	
}
