/**
 * 
 */

/**
 * @author pratimakaza
 *
 */
public class RandomPlayer extends Player {

	/* (non-Javadoc)
	 * @see Player#generateRoshambo()
	 */
	
	
//	public RandomPlayer () {
//		
//	}
	public RandomPlayer (int iChoice) {
		setRoshambo(0);
	}
	
	@Override
	public int generateRoshambo() {
		// TODO Auto-generated method stub
		//int roshambo = (int) (Math.random()*3);
		
//		if (randChoice == 1) {
//			choice = 
//		}else if (choice == "p||P") {
//			
//		}else {
//			
//		}
		
		return (int) (Math.random()*3);
	}

}
