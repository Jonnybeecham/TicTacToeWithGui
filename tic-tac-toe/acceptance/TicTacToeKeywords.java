import edu.jsu.mcis.*;

public class TicTacToeKeywords {
	
	public void startNewGame() {
		t = new TicTacToe();
	}
	
	public void markLocation(int row, int col) {
			t.setMark(row, col)
	}
	
	public String getMark(int row, int col) {
		TicTacToe.Mark m = t.getMark(row, col)
		if (m == TicTacToe.Mark.x) return "x"
		else if (m == TicTacToe.Mark.o) return "o"
		else return "";
		
	}
    
	public String getWinner() {
		TicTacToe.Result r = t.getResult
		return "";
	}
}
