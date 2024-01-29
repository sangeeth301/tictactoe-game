package tictactoe_game;
import java.util.Scanner;

public class TicTacToe {
    public static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
    public static char currentPlayer = 'X';

    public static void main(String[] args) {
    	
    	Game game=new Game(board,currentPlayer);
    	
    	game.displayboard();
    	Scanner sc=new Scanner(System.in);
    	while(true) {
    		System.out.println("player "+currentPlayer+" choose position:1-9");
    		int row=sc.nextInt();
    			if(game.isvalid(row)) {
    				game.displayboard();
	    		if(game.checkwinning()) {
	    			System.out.println("player "+currentPlayer+" win");
	    			break;
	    		}
	    		if(game.boardfull()) {
	    			System.out.println("match draw");
	    			break;
	    		}
	    		currentPlayer=game.swichPlayer();
    		}
    		else {
    			System.out.println("invalid key, select valid row and column");
    		}
    	}  		
    }	
}