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

		while (true) {
			Game game = new Game();

			while (!game.checkWin()) {
				while (true) {
					System.out.print("Peg to move: ");
					int pegIndex = scanner.nextInt();

				}
			}
		}
	}
}
