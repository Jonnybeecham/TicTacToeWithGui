//package edu.jsu.mcis;

public class TicTacToe {
	
	char[][] Board;
	char CurrentPlayer;
	char NextPlayer;
	char mark;
	String winner;
	boolean endGame;
	
	public void StartNewGame() {
			this.Board = new char[3][3];
			CurrentPlayer = 'x';
			NextPlayer = 'o';
			InitializeBoard();
			this.endGame = false;
	}
	
	public void InitializeBoard(){
		for (int row = 0; row < 3; row++){
			for (int col = 0; col <3; col++){
				this.Board[row][col] = '-';
			}
		}
	}
	public void MarkLocation(int row, int col) {
		if(this.Board[row-1][col-1]=='-'){
			this.Board[row-1][col-1]=this.CurrentPlayer;
			char playerPlaceholder = this.CurrentPlayer;
			this.CurrentPlayer = NextPlayer;
			NextPlayer=playerPlaceholder;
		}
		
	}
	
	public char getMark(int row, int col) {
		char mark = this.Board[row-1][col-1];
			return mark;
	}
    
	public void getWinner() {
		
		if(this.Board[0][0] == 'x' && this.Board[0][1] == 'x' && this.Board[0][2] == 'x'){
			
			this.winner = "x wins";
			this.endGame = true;
			
		}
		else if(this.Board[0][0] == 'x' && this.Board[1][1] == 'x' && this.Board[2][2] == 'x'){
			
			this.winner = "x wins";
			this.endGame = true;
		}
		else if(this.Board[0][0] == 'x' && this.Board[1][0] == 'x' && this.Board[2][0] == 'x'){
			
			this.winner = "x wins";
			this.endGame = true;
		}
		else if(this.Board[0][1] == 'x' && this.Board[1][1] == 'x' && this.Board[2][1] == 'x'){
			
			this.winner = "x wins";
			this.endGame = true;
		}
		else if(this.Board[0][2] == 'x' && this.Board[1][2] == 'x' && this.Board[2][2] == 'x'){
			
			this.winner = "x wins";
			this.endGame = true;
			
		}
		else if(this.Board[1][0] == 'x' && this.Board[1][1] == 'x' && this.Board[1][2] == 'x'){
			
			this.winner = "x wins";
			this.endGame = true;
		}
		else if(this.Board[2][0] == 'x' && this.Board[2][1] == 'x' && this.Board[2][2] == 'x'){
			
			this.winner = "x wins";
			this.endGame = true;
		}
		else if(this.Board[2][0] == 'x' && this.Board[1][1] == 'x' && this.Board[0][2] == 'x'){
			
			this.winner = "x wins";
			this.endGame = true;
		}
		 
		 
		 else if(this.Board[0][0] == 'o' && this.Board[0][1] == 'o' && this.Board[0][2] == 'o'){
			
			this.winner = "o wins";
			this.endGame = true;
		}
		else if(this.Board[0][0] == 'o' && this.Board[1][1] == 'o' && this.Board[2][2] == 'o'){
			
			this.winner = "o wins";
			this.endGame = true;
		}
		else if(this.Board[0][0] == 'o' && this.Board[1][0] == 'o' && this.Board[2][0] == 'o'){
			
			this.winner = "o wins";
			this.endGame = true;
		}
		else if(this.Board[0][1] == 'o' && this.Board[1][1] == 'o' && this.Board[2][1] == 'o'){
			
			this.winner = "o wins";
			this.endGame = true;
		}
		else if(this.Board[0][2] == 'o' && this.Board[1][2] == 'o' && this.Board[2][2] == 'o'){
			
			this.winner = "o wins";
			this.endGame = true;
		}
		else if(this.Board[1][0] == 'o' && this.Board[1][1] == 'o' && this.Board[1][2] == 'o'){
			
			this.winner = "o wins";
			this.endGame = true;
		}
		else if(this.Board[2][0] == 'o' && this.Board[2][1] == 'o' && this.Board[2][2] == 'o'){
			
			this.winner = "o wins";
			this.endGame = true;
		}
		else if(this.Board[2][0] == 'o' && this.Board[1][1] == 'o' && this.Board[0][2] == 'o'){
			
			this.winner = "o wins";
			this.endGame = true;
		}
		
	}
	public int isGameOver(){
		if (this.endGame == true && this.winner.equals("x wins")){
			return 1;
		}
		else if (this.endGame == true && this.winner.equals ("o wins")){
			return 0;
		}
		else return -1;
		
		
	}
	
	public boolean getTie(){
		
		boolean tiedGame = true;
		int row = 0;
		int col = 0;
		while(row < 3){
			while(col < 3){
				if(this.Board[row][col] == '-'){
					tiedGame = false;
				}
				col +=1;			
			}
			row +=1;
			col = 0;
		}
		return tiedGame;
		
	}
}
