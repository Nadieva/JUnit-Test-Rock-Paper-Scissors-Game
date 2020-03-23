
public enum Choices {
	ROCK,
	SCISSORS,
	PAPER;

	public boolean hasBeaten(Choices p2_choice) {
		// TODO Auto-generated method stub
		if(this== Choices.ROCK && p2_choice==Choices.SCISSORS) {
			return true;
		}else if(this== Choices.SCISSORS && p2_choice==Choices.PAPER) {
			return true;
		}else if(this== Choices.PAPER && p2_choice==Choices.ROCK) {
			return true;
		}else {
			return false;
		}
	}
	
}
