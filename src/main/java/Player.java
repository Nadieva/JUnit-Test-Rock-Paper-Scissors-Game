public class Player {
	private String name;
	private int winNb=0;
	private int drawNb=0;

	public Player(String name) {
		this.name=name;
	}
	

	public void addDraw() {
		// TODO Auto-generated method stub
		drawNb++;
	}
	
	public void addWin() {
		// TODO Auto-generated method stub
		winNb++;
	}

	public int getWinNb() {
		return winNb;
	}
	
	public int getDrawNb() {
		return drawNb;
	}
	public String getName() {
		return name;
	}
	
	public String toString() {
		String toPrint= getName() +" won "+getWinNb()+" matche(s) and "+getDrawNb()+ " matche(s) ended in a draw";
		return toPrint;
	}
	
	private static Choices chooses(int random) {
		// TODO Auto-generated method stub
		switch(random) {
		case 1:
			 return Choices.ROCK;
		case 2:
			return Choices.PAPER;
		case 3:
			return Choices.SCISSORS;
		}
		return null;
	}
	


}
