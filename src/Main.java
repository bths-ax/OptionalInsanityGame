import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Insanity");
		System.out.println();
		System.out.println("There are 10 holes, the first 4 containing red (R) pegs "
			+ "and the last 4 containing blue (B) pegs");
		System.out.println("You can only move the red pegs to the right and "
			+ "the blue pegs to the left by 1 hole, "
			+ "or by 2 holes if there is a peg in front of it but an empty space behind it");
		System.out.println("Move all red pegs to the right and all blue pegs to the left to win");
		System.out.println("Have fun");
		System.out.println();

		int iqCounter = 100;

		while (true) {
			Game game = new Game();

			while (!game.checkWin()) {
				System.out.println(game);
				System.out.print("Choose a peg to move, or -1 to reset: ");
				int pegIndex = scanner.nextInt();

				if (pegIndex == -1) {
					iqCounter -= 10;
					System.out.println("Game reset");
					System.out.println("Your IQ: " + iqCounter);
					System.out.println();
					break;
				}

				while (!game.move(pegIndex)) {
					System.out.print("Unable to move peg " + pegIndex + ", try again: ");
					pegIndex = scanner.nextInt();
				}

				System.out.println();
			}

			if (game.checkWin()) {
				System.out.println(game);
				System.out.println("You win");
				System.out.println("Your IQ is " + iqCounter);
				break;
			}
		}
	}
}
