package com.monocept.model.test;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.monocept.model.DevilListener;
import com.monocept.model.GodListener;

public class JFrameTest {
	public static void main(String[] args) {
		GodListener god = new GodListener();
		DevilListener devil = new DevilListener();

		JFrame jf = new JFrame("My Frame");
		jf.setVisible(true);
		jf.setSize(400, 400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jf.getContentPane().setBackground(Color.BLUE);
		jf.add(devil.getMainLabel());
		jf.add(god.getMainLabel());

		JButton button = new JButton("Click Me!");
		button.setBounds(100, 100, 80, 30);
		jf.setLayout(new FlowLayout());
		button.addActionListener(god);
		button.addActionListener(devil);
		jf.add(button);
		
	}
}
