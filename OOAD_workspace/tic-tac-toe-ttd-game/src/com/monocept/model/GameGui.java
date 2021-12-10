package com.monocept.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameGui extends JFrame implements ActionListener {
	JFrame frame = new JFrame();
	JPanel textPanel = new JPanel();
	JPanel btnPanel = new JPanel();
	JLabel textField = new JLabel();
	JButton[] btns = new JButton[9];
	Board board;
	ResultAnalyser status;
	Player[] players;
	Game game;
	boolean player1 = true;

	public GameGui() {
		board = new Board();
		status = new ResultAnalyser();
		players = new Player[2];
		players[0] = new Player(Mark.X, "player1");
		players[1] = new Player(Mark.O, "player2");
		game = new Game(board, status, players);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.getContentPane().setBackground(new Color(50, 50, 50));
		frame.setTitle("Tic Tac Toe");
		frame.setLayout(new BorderLayout());
		frame.setVisible(true);

		textField.setBackground(new Color(120, 20, 124));
		textField.setForeground(new Color(25, 255, 0));
		textField.setFont(new Font("Arial", Font.BOLD, 75));
		textField.setHorizontalAlignment(JLabel.CENTER);

		textField.setOpaque(true);

		textPanel.setLayout(new BorderLayout());
		textPanel.setBounds(0, 0, 800, 100);

		btnPanel.setLayout(new GridLayout(3, 3));
		btnPanel.setBackground(new Color(50, 50, 50));

		for (int i = 0; i < 9; i++) {
			btns[i] = new JButton();
			btnPanel.add(btns[i]);
			btns[i].setFont(new Font("Arial", Font.BOLD, 120));
			btns[i].setFocusable(false);
			textField.setText("Player1");
			btns[i].addActionListener(this);
		}

		textPanel.add(textField);
		frame.add(textPanel, BorderLayout.NORTH);
		frame.add(btnPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		for (int i = 0; i < 9; i++) {
			if (player1 == true) {
				if (e.getSource() == btns[i]) {
					if (btns[i].getText() == "") {

						btns[i].setForeground(new Color(255, 0, 0));
						textField.setText("Player2");
						game.play(i);
						btns[i].setText("X");
						player1 = false;
						String currentPlayer = "Player1";
						if (game.getStatus() == "Winner" || game.getStatus() == "Game Draw") {
							disableButton();
							String result = game.getStatus();
							ResultPage resultPage = new ResultPage(currentPlayer, result);
							resultPage.setVisible(true);

						}

					}
				}
			} else {
				if (e.getSource() == btns[i]) {
					if (btns[i].getText() == "") {

						btns[i].setForeground(new Color(255, 0, 0));
						textField.setText("Player1");
						game.play(i);
						btns[i].setText("O");
						player1 = true;
						String currentPlayer = "Player2";
						if (game.getStatus() == "Winner" || game.getStatus() == "Game Draw") {
							disableButton();
							String result = game.getStatus();
							ResultPage resultPage = new ResultPage(currentPlayer, result);
							resultPage.setVisible(true);
						}

					}
				}
			}
		}

	}

	private void disableButton() {
		for (int i = 0; i < 9; i++) {
			btns[i].removeActionListener(this);
		}
		return;

	}

}
