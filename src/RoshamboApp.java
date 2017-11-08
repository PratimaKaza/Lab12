import java.util.Scanner;

/**
 * 
 */

/**
 * @author pratimakaza
 *
 */
public class RoshamboApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//user input - prompt user for name
		System.out.println("Please enter your name: ");
		
		//get user input
		String userName = scan.nextLine();
		
		// prompt user to select opponent
		System.out.println("Please select your opponent (Rock or Random): ");
		
		//get user opponent input
		String opponent = scan.nextLine();
		// prompt player to selects one of three Rock, Paper, Scissors
		System.out.println("Please select Rock, Paper, or Scissors: ");
		
		// get user choice
		//TODO: replace with enums later!
		String choice = scan.nextLine();
		//Display user choice
		//TODO: figure out the ab
		System.out.println("Your choice was: " + choice);
		//display opponents choice
		Player opponentPlayer = null;
		if (opponent.equalsIgnoreCase("Rock")) {
			opponentPlayer = new RockPlayer();
		}
		else if(opponent.equalsIgnoreCase("Random")) {
			opponentPlayer = new RandomPlayer();
		}
		opponentPlayer.getRoshambo();
		// display match results
		int humanPlayer = 2;
		int oppPlayer = 3;
		System.out.println(getResults(userName, opponent, humanPlayer, oppPlayer));
		
		
		
		scan.close();

	}

	private static String getResults(String hName, String oOpp, int hPlay, int oPlay) {
		// TODO Auto-generated method stub
		if (hPlay == oPlay){
			return "Draw!";
		}else if (hPlay > oPlay) {
			return ("" + hName + "wins!");
		}else {
			return ("" + oOpp + "wins!");
		}
		
	}

}
