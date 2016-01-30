//package edu.jsu.mcis;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class TicTacToeGame extends JPanel
									 implements ActionListener {
		private TicTacToe model;
		public JButton[][] button;
		
		public TicTacToeGame(){
		
			model = new TicTacToe();
			model.StartNewGame();
			button = new JButton [3][3];
			setLayout(new GridLayout(3,3));
			for(int i = 0; i < 3; i++){
				for(int j = 0; j < 3; j++){
					button[i][j] = new JButton();
					button[i][j].setPreferredSize(new Dimension (100,100));
					button[i][j].addActionListener(this);
					button[i][j].setName("Location" + i + "" + j);
					add(button[i][j]);
				}
			}
		
		}
		private void checkForWin() {
			JOptionPane p = new JOptionPane();
			final String s;
			int isOver = this.model.isGameOver();
			boolean tiedGame = this.model.getTie();
			if (isOver == 1 && this.model.winner.equals("x wins")){
				s = "X";
			}
			else if (isOver == 0 && this.model.winner.equals("o wins")) {
				s = "O";
			}
			else if (tiedGame == true){
				s = "CAT";
			}
			else { s = "";}
			
			if (s.length() > 0){
				new Thread(new Runnable(){
					public void run() {
						
							JOptionPane.showMessageDialog(null, "The winner is " + s, "Game Over", JOptionPane.INFORMATION_MESSAGE);
							System.exit(0);
							
							
				}}).start();
			}
		}
		
		public void actionPerformed(ActionEvent event){
			JButton b =(JButton)event.getSource();
			String Loc = b.getName().substring(8);
			int row = Integer.parseInt(Loc.substring(0,1)) +1;
			int col = Integer.parseInt(Loc.substring(1,2))+1;
			this.model.MarkLocation(row,col);
			char m = this.model.getMark(row,col);
			if(m == 'x') b.setText("x");
			else if(m == 'o') b.setText("o");
			this.model.getWinner();
			this.checkForWin();
			
	
		}
		
		public static void main(String[] args){
		JFrame win = new JFrame();
		win.add(new TicTacToeGame());
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.pack();
		win.setVisible(true);
		
		
		}

	
	}
