
public class Game {

	private Player p1;
	private Player p2;
    private int gameSize;
	
    public Game(int iterations,Choices choice) {
    	//game size
        this.gameSize =iterations;
  
    	    	
    	 //choice size (ROCK,paper,scissors)
    	 int choiceSize=Choices.values().length;
    	   
    	 //Player 1
    	 this.p1 =new Player("Player #1");
    	 Choices p1_choice;
    			
        //Player 2
        this.p2 =new Player("Player #2");
    	Choices p2_choice;
    			

    	//compare results of both players
    	for(int i=0;i<gameSize;i++) {
    				
    		//Player p1 always chooses ROCK
    		p1_choice=choice;

    				
    		//Player p2 selects a choice randomly
    		int random=(int) Math.floor(Math.random()*choiceSize)+1;
    		p2_choice=chooses(random);
  

    			if (p1_choice == p2_choice) {
    					p1.addDraw();
    					p2.addDraw();
    			} else {

    					if (p1_choice.hasBeaten(p2_choice)) {
    						p1.addWin();
    					}else {
    						p2.addWin();
    					}

    			}
    		}

    }   
    
	public Choices chooses(int c) {
		switch(c) {
		case 1:
			 return Choices.ROCK;
		case 2:
			return Choices.PAPER;
		case 3:
			return Choices.SCISSORS;
		}
		return null;
	}
	
	public String toString() {
		return p1.toString() +"\n"+p2.toString();		
	}
		
}