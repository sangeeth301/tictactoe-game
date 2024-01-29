package tictactoe_game;

public class Game {
	 char board[][];
	 char currentPlayer;
	 
	Game(char[][]board,char currentPlayer){
		this.board=board;
		this.currentPlayer=currentPlayer;
	}
	public char swichPlayer() {
		return currentPlayer=(currentPlayer=='X')? '0':'X';
	}
	
	public boolean checkwinning() {
		for(int i=0;i<3;i++) {
			if((board[i][0]==currentPlayer && board[i][1]==currentPlayer && board[i][2]==currentPlayer)||(board[0][i]==currentPlayer && board[1][i]==currentPlayer && board[2][i]==currentPlayer))
				return true;
		}
		return (board[0][0]==currentPlayer && board[1][1]==currentPlayer && board[2][2]==currentPlayer) || (board[0][2]==currentPlayer && board[1][1]==currentPlayer && board[2][0]==currentPlayer);
	}
	
	public boolean boardfull() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(board[i][j]==' ')
					return false;
			}
		}
		return true;
	}
	
	public void displayboard() {
		//System.out.println(" 0  1  2");
		for(int i=0;i<3;i++) {
			System.out.print(" ");
			for(int j=0;j<3;j++) {
				System.out.print(board[i][j]);
				if(j<2)
					System.out.print("|");
			}
			System.out.println();
			if(i<2)
				System.out.println("-------");
		}
		
	}

	public boolean isvalid(int row) {
		switch(row) {
		case 1:
			if(board[0][0]==' ') {
				board[0][0]=currentPlayer;
				return true;
			}
			break;
	
		case 2:
			if(board[0][1]==' ') {
				board[0][1]=currentPlayer;
				return true;
			}
			break;
		case 3:
			if(board[0][2]==' ') {
				board[0][2]=currentPlayer;
				return true;
			}
			break;
		case 4:
			if(board[1][0]==' ') {
				board[1][0]=currentPlayer;
				return true;
			}
			break;
		case 5:
			if(board[1][1]==' ') {
				board[1][1]=currentPlayer;
				return true;
			}
			break;
		case 6:
			if(board[1][2]==' ') {
				board[1][2]=currentPlayer;
				return true;
			}
			break;
		case 7:
			if(board[2][0]==' ') {
				board[2][0]=currentPlayer;
				return true;
			}
			break;
		case 8:
			if(board[2][1]==' ') {
				board[2][1]=currentPlayer;
				return true;
			}
			break;
			
		case 9:
			if(board[2][2]==' ') {
				board[2][2]=currentPlayer;
			return true;
			}
			break;
		}
		return false;
	}
}