package com.monocept.model;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class GodListener implements ActionListener {
	private final JLabel _mainLabel;

	public GodListener() {
		_mainLabel = new JLabel();
		_mainLabel.setBounds(50, 50, 50, 50);
	}

	public JLabel getMainLabel() {
		return _mainLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		_mainLabel.setText("God is Listening");

	}

}
