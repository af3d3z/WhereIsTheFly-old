package base;

import board.items.BoardItems;

/**
 * Class that simulates the board where the flies are gonna be, the unofficial "base" of the game
 * 
 * @author DragonaEileen
 */
public class Board {

	/* Fields */
	/**
	 * Bidimensional array where all the flies and power ups and downs are going to be placed
	 */
	public static BoardItems[][] gameBoard;
	
	/* Constructors */
	/**
	 * Constructor with parameters
	 * 
	 * @param difficulty Difficulty of the game that affects the size of the board
	 */
	public Board(int difficulty) {
		
		//Depending on the difficulty we size the game board
		/* Declaring */
			/* Version 1 */
			/* Size of Axis I */
		//int axisI = (int) (Math.pow(difficulty, 2) + 2);
		
			/* Size of Axis J */
		//int axisJ = (int) (Math.pow(difficulty,2) + 2);
		
			/* Version 2 */
			/* Base of Axis I */
		int randomPowerAxisI = (int) (Math.random()*4 + 2);
			
			/* Size of Axis I */
		int randomAxisI = (int) Math.pow(randomPowerAxisI, difficulty);
		
			/* Base of Axis J */
		int randomPowerAxisJ = (int) (Math.random()*4 + 2);
			
			/* Size of Axis I */
		int randomAxisJ = (int) Math.pow(randomPowerAxisJ, difficulty);
		
		//Now we set the size
			/* Version 1 */
		//this.gameBoard = new Object[axisI][axisJ];
		
			/* Version 2 */
		this.gameBoard = new BoardItems[randomAxisI][randomAxisJ];
		
	}//Fin Constructor With Parameters
	
	/* Setter */
	/**
	 * We ought to fill the cells with something
	 * 
	 * @param item Some kind of board item to fill the cell with
	 * @param posI The position of the cell on the I axis
	 * @param posJ The position of the cell on the J axis
	 */
	public void setBoardCell(BoardItems item, int posI, int posJ) {
		
		gameBoard[posI][posJ] = item;
		
	}//Fin setBoardCell()
	
	/* Methods */
	
	//spublic boolean areThereFlies
	
}
