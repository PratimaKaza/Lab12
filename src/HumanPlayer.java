

public class HumanPlayer extends Player {
	
	public HumanPlayer(String userName, int iChoice) {
		setName(userName);
		setRoshambo(iChoice);
	}
	public HumanPlayer () {
		
	}
	

	@Override
	public int generateRoshambo() {
		// TODO Auto-generated method stub
		
		return getRoshambo();
		}
	
	

}
