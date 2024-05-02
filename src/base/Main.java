package base;

import java.util.Scanner;

/**
 * MainCode class
 * @author Group5
 */
public class Main {

	/**
	 * Main function
	 * @param args
	 */
	public static void main(String[] args) {
		
		/* Fields */
		/**
		 * Main object of the game, it basically starts it
		 */
		Board game;
		
		/**
		 * Difficulty of the game, an integer from 1 to X?
		 */
		int difficulty = 1;
		
		/**
		 * State of the game flag, it is true while the game continues
		 */
		boolean flag = true;
		
		/**
		 * Flag if a fly has been caught
		 */
		boolean caught;
		
		/**
		 * First Axis position
		 */
		int posI;
		
		/**
		 * Second Axis position
		 */
		int posJ;
		
		/* Scanner */
		Scanner scMain = new Scanner(System.in);
		
		/* Build */
		game = new Board(difficulty);
		
		/* Main game loop */
		do {
			
			game.printingBoard();
			
			System.out.println("Golpe I?");
			posI = scMain.nextInt();
			
			System.out.println("Golpe J?");
			posJ = scMain.nextInt();
			
			caught = game.catchFly(posI, posJ);
			
			if(caught) {
				System.out.println("Fly Hit");
			}else { System.out.println("Miss"); }
			
			System.out.println("Seguir?");
			flag = scMain.nextBoolean();
			
		}while(flag);
		
	}

}
