// this stuff is always size 10 anyways i can hard code some stuff

public class Game {
	private static const int EMPTY_SPACE = 0;
	private static const int RED_PEG     = 1;
	private static const int BLUE_PEG    = 2;

	private int[] board;

	public Game() {
		this.board = new int[10] {
			RED_PEG,
			RED_PEG,
			RED_PEG,
			RED_PEG,
			EMPTY_SPACE,
			EMPTY_SPACE,
			BLUE_PEG,
			BLUE_PEG,
			BLUE_PEG,
			BLUE_PEG,
		};
	}

	public String toString() {
		String result = "";
		for (int space : board) {
			if (space == EMPTY_SPACE) result += ". ";
			else if (space == RED_PEG) result += "R ";
			else if (space == BLUE_PEG) result += "B ";
		}
		result += "\n0 1 2 3 4 5 6 7 8 9";
		return result;
	}

	public boolean move(int index) {
		if (board[index] == EMPTY_SPACE)
			return false;

		int moveDir = 1;
		if (board[index] == BLUE_PEG)
			moveDir = -1;

		if (board[index + moveDir] == EMPTY_SPACE) {
			board[index + moveDir] = board[index];
			board[index] = EMPTY_SPACE;
			return true;
		} else if (board[index + moveDir * 2] == EMPTY_SPACE) {
			board[index + moveDir * 2] = board[index];
			board[index] = EMPTY_SPACE;
			return true;
		}

		return false;
	}

	public boolean checkWin() {
		return
			board[0] == BLUE_PEG &&
			board[1] == BLUE_PEG &&
			board[2] == BLUE_PEG &&
			board[3] == BLUE_PEG &&
			board[4] == EMPTY_SPACE &&
			board[5] == EMPTY_SPACE &&
			board[6] == RED_PEG &&
			board[7] == RED_PEG &&
			board[8] == RED_PEG &&
			board[9] == RED_PEG;
	}
}
