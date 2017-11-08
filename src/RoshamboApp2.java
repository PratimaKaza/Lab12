import java.util.Scanner;

/**
 * 
 */

/**
 * @author pratimakaza
 *
 */
public class RoshamboApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// user input - prompt user for name
		System.out.println("Please enter your name: ");

		// get user input
		String userName = scan.nextLine();
		do {
			// prompt user to select opponent
			System.out.println("Please select your opponent (Rock or Random): ");

			// get user opponent input
			String opponent = scan.nextLine();
			// prompt player to selects one of three Rock, Paper, Scissors
			System.out.println("Please select Rock, Paper, or Scissors: ");

			String choice = scan.nextLine();
			// Display user choice

			System.out.println("Your choice was: " + choice);
			choice.toLowerCase();
			// display opponents choice

			int iChoice = 0;
			switch (choice) {
			case "rock":
				iChoice = 1;
				break;
			case "paper":
				iChoice = 2;
				break;
			case "scissors":
				iChoice = 3;
				break;
			default:
				break;
			}
			System.out.println(iChoice);
			Player humanPlayer = new HumanPlayer(userName, iChoice);
			// humanPlayer.setName();
			// humanPlayer.setRoshambo();
			humanPlayer.generateRoshambo();
			Player opponentPlayer = null;
			if (opponent.equalsIgnoreCase("Rock")) {
				opponentPlayer = new RockPlayer();
			} else if (opponent.equalsIgnoreCase("Random")) {
				opponentPlayer = new RandomPlayer(iChoice);
			}
			opponentPlayer.getRoshambo();
			// display match results
			System.out.println("hp:" + humanPlayer.generateRoshambo());
			System.out.println(opponentPlayer.generateRoshambo());
			// System.out.println(getResults(humanPlayer.generateRoshambo(),
			// opponentPlayer.generateRoshambo()));
			// System.out.println(getResults(1, 0));

			System.out.println("Would you like to play again? Please enter: y/n");
		} while (scan.nextLine().equalsIgnoreCase("y"));
		scan.close();

	}

	private static String getResults(int hPlay, int oPlay) {
		// TODO Auto-generated method stub
		if (hPlay == oPlay) {
			return "Draw!";
		} else if (hPlay > oPlay) {
			return ("" + "human player wins!");
		} else {
			return ("" + "oponent player wins!");
		}

	}

}
