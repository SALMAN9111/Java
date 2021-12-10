package com.monocept.model;

public class ResultAnalyser {

	public String checkResult(Board board) {
		if (checkVertical(board) || checkHorizontal(board) || checkDiagonal(board)) {
			return "Winner";
		}
		for (int i = 0; i < 9; i++) {
			if (board.getCell(i).getMark().toString() == "EMPTY") {
				return "Game is still in progress";
			}
		}
		return "Game Draw";
	}

	private  boolean checkVertical(Board board) {
		if (("XXX").equals(board.getCell(0).getMark().toString() + board.getCell(3).getMark().toString()+board.getCell(6).getMark().toString())||
				(("OOO").equals(board.getCell(0).getMark().toString() + board.getCell(3).getMark().toString()+board.getCell(6).getMark().toString()))) {
			// System.out.println("Winner");
			return true;
		}

		if (("XXX").equals(board.getCell(1).getMark().toString() + board.getCell(4).getMark().toString()+board.getCell(7).getMark().toString()) ||
				(("OOO").equals(board.getCell(1).getMark().toString() + board.getCell(4).getMark().toString()+board.getCell(7).getMark().toString()))
				) {
			// System.out.println("Winner");
			return true;
		}

		if ((("XXX").equals(board.getCell(2).getMark().toString() + board.getCell(5).getMark().toString()+board.getCell(8).getMark().toString()))||
				(("OOO").equals(board.getCell(2).getMark().toString() + board.getCell(5).getMark().toString()+board.getCell(8).getMark().toString()))) {
			// System.out.println("Winner");
			return true;
		}
		return false;
	}

	private boolean checkHorizontal(Board board) {
		if (("XXX").equals(board.getCell(0).getMark().toString() + board.getCell(1).getMark().toString()+board.getCell(2).getMark().toString())|| 
				(("OOO").equals(board.getCell(0).getMark().toString() + board.getCell(1).getMark().toString()+board.getCell(2).getMark().toString()))){
			// System.out.println("Winner");
			return true;
		}

		if (("XXX").equals(board.getCell(3).getMark().toString() + board.getCell(4).getMark().toString()+board.getCell(5).getMark().toString()) ||
				(("OOO").equals(board.getCell(3).getMark().toString() + board.getCell(4).getMark().toString()+board.getCell(5).getMark().toString()))) {
			// System.out.println("Winner");
			return true;
		}

		if (("XXX").equals(board.getCell(6).getMark().toString() + board.getCell(7).getMark().toString()+board.getCell(8).getMark().toString())||
				(("OOO").equals(board.getCell(6).getMark().toString() + board.getCell(7).getMark().toString()+board.getCell(8).getMark().toString()))) {
			// System.out.println("Winner");
			return true;
		}
		return false;
	}

	private boolean checkDiagonal(Board board) {
		if(("XXX").equals(board.getCell(0).getMark().toString() + board.getCell(4).getMark().toString()+board.getCell(8).getMark().toString()) ||
				(("OOO").equals(board.getCell(0).getMark().toString() + board.getCell(4).getMark().toString()+board.getCell(8).getMark().toString()))) {
			// System.out.println("Winner");
			return true;
		}

		if(("XXX").equals(board.getCell(2).getMark().toString() + board.getCell(4).getMark().toString()+board.getCell(6).getMark().toString())||
				(("OOO").equals(board.getCell(2).getMark().toString() + board.getCell(4).getMark().toString()+board.getCell(6).getMark().toString()))) {
			// System.out.println("Winner");
			return true;
		}
		return false;
	}

}

/*
 * public void diaplayWinner() { String winner = checkResult(board); if (winner
 * == "X") { System.out.println("Winner is " + winner); return; } if (winner ==
 * "O") { System.out.println("Winner is " + winner); return; }
 * 
 * System.out.println("Game is " + winner);
 * 
 * }
 */
/*
 * for (int a = 0; a < 8; a++) { String line = null;
 * 
 * switch (a) { case 0: line = board.getCell(0).getMark().toString() +
 * board.getCell(3).getMark().toString() +
 * board.getCell(6).getMark().toString(); break; case 1: line =
 * board.getCell(1).getMark().toString() + board.getCell(4).getMark().toString()
 * + board.getCell(7).getMark().toString(); break; case 2: line =
 * board.getCell(2).getMark().toString() + board.getCell(5).getMark().toString()
 * + board.getCell(8).getMark().toString(); break; case 3: line =
 * board.getCell(0).getMark().toString() + board.getCell(1).getMark().toString()
 * + board.getCell(2).getMark().toString(); break; case 4: line =
 * board.getCell(3).getMark().toString() + board.getCell(4).getMark().toString()
 * + board.getCell(5).getMark().toString(); break; case 5: line =
 * board.getCell(6).getMark().toString() + board.getCell(7).getMark().toString()
 * + board.getCell(8).getMark().toString(); break; case 6: line =
 * board.getCell(0).getMark().toString() + board.getCell(4).getMark().toString()
 * + board.getCell(8).getMark().toString(); break; case 7: line =
 * board.getCell(2).getMark().toString() + board.getCell(4).getMark().toString()
 * + board.getCell(6).getMark().toString(); break; } if (line.equals("XXX")) {
 * return "X"; }
 * 
 * else if (line.equals("OOO")) { return "O"; } } return "In Progress"; }
 */
/*(("XXX").equals(board.getCell(0).getMark().toString() + board.getCell(3).getMark().toString()+board.getCell(6).getMark().toString()))*/