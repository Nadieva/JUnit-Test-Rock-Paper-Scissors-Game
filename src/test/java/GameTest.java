

import static org.junit.Assert.*;

import org.junit.Test;

public class GameTest {
	 @Test
	 public void testGameOnlyOnePlayerChoosesRockEverytime() {
		Game g=new Game(100, Choices.ROCK);
		System.out.println(g.toString());
	 }
	 
	@Test
	public void testRockbeatsScissors() {
		assertTrue("Actual result:Rock cannot scissors - Expected result:Rock beats scissors",Choices.ROCK.hasBeaten(Choices.SCISSORS));
	}
	
	@Test
	public void testRockbeatsPaper() {
		assertFalse("Actual result:Rock can beat paper - Expected result:Rock cannot beat paper",Choices.ROCK.hasBeaten(Choices.PAPER));
	}
	
	@Test
	public void testScissorsbeatPaper() {
		assertTrue("Actual result:Scissors cannot beat paper - Expected result:Scissors beat paper",Choices.SCISSORS.hasBeaten(Choices.PAPER));
	}
	
	@Test
	public void testScissorsbeatRock() {
		assertFalse("Actual result:Scissors can beat rock - Expected result:Scissors cannot beat rock",Choices.SCISSORS.hasBeaten(Choices.ROCK));
	}
	
	
	@Test
	public void testPaperbeatsRock() {
		assertTrue("Actual result:Paper cannot beat rock - Expected result:Paper can beat rock",Choices.PAPER.hasBeaten(Choices.ROCK));
	}
	
	@Test
	public void testPaperbeatsScissors() {
		assertFalse("Actual result:Paper cannot beat scissors - Expected result:Paper can beat scissors",Choices.PAPER.hasBeaten(Choices.SCISSORS));
	}

}
