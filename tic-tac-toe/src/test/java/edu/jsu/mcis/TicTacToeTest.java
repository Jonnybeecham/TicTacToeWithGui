package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class TicTacToeTest {
	
	@Test
	public void testInitialBoardIsEmpty() {
		TicTacToe Board = new TicTacToe();
		Board.StartNewGame();
		boolean IsInitialized = true;
		int row = 0;
		int col = 0;
		while (row<3){
			while(col < 3){
				if (Board.Board[row][col] != '-'){
					
					IsInitialized = false;
					
				}
				col +=1;
			}
			col = 0;
			row+=1;
		}
		assertTrue(IsInitialized);
	}

	@Test
	public void testMarkXInUpperRightCorner() {
		TicTacToe Board = new TicTacToe();
		Board.StartNewGame();
		Board.MarkLocation(1,3,'x');
		boolean mark = true;
		char letter = Board.getMark(1,3);
		if (letter =='x'){
			
			mark = true;
			
		}
		else mark = false;
		assertTrue(mark);
	}
	
	@Test
	public void testMarkOInBottomLeftCorner() {
		
		TicTacToe Board = new TicTacToe();
		Board.StartNewGame();
		Board.MarkLocation(1,3,'x');
		Board.MarkLocation(3,1,'o');
		boolean mark = true;
		char letter = Board.getMark(3,1);
		if (letter =='o'){
			
			mark = true;
			
		}
		else mark = false;
		assertTrue(mark);
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() {
		TicTacToe Board = new TicTacToe();
		Board.StartNewGame();
		Board.MarkLocation(1,3,'x');
		Board.MarkLocation(1,3,'o');
		boolean mark = true;
		char letter = Board.getMark(1,3);
		if (letter =='x'){
			
			mark = true;
			
		}
		else mark = false;
		assertTrue(mark);
	}

	@Test
	public void testGameIsNotOverAfterTheFirstMark() {
		TicTacToe Board = new TicTacToe();
		Board.StartNewGame();
		Board.MarkLocation(1,3,'x');
		Board.getWinner();
		boolean Ended = Board.endGame;
		assertFalse(Ended);
	}

	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
		TicTacToe Board = new TicTacToe();
		Board.StartNewGame();
		Board.MarkLocation(1,1,'x');
		Board.MarkLocation(2,1,'o');
		Board.MarkLocation(1,2,'x');
		Board.MarkLocation(2,2,'o');
		Board.MarkLocation(1,3,'x');
		Board.getWinner();
		boolean Ended = Board.endGame;
		assertTrue(Ended);
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() {
		TicTacToe Board = new TicTacToe();
		Board.StartNewGame();
		Board.MarkLocation(1,1,'x');
		Board.MarkLocation(2,1,'o');
		Board.MarkLocation(1,2,'x');
		Board.MarkLocation(2,2,'o');
		Board.MarkLocation(2,3,'x');
		Board.MarkLocation(1,3,'o');
		Board.MarkLocation(3,3,'x');
		Board.MarkLocation(3,2,'o');
		Board.MarkLocation(3,1,'x');
		Board.getTie();
		boolean Ended = Board.getTie();
		assertTrue(Ended);
	}	
	
}
