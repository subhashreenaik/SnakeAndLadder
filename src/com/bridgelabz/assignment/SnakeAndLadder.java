
package com.bridgelabz.assignment;

/**
 * @author subhashree
 *
 */
public class SnakeAndLadder {
	
	//Declaring variables
	static int start_Position=0;
	static int diceRolled=0;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int diceValue = (int)(Math.random() *6)+1;
		switch(diceValue) {
		case 1:
			System.out.println("Dice rolled and the value is 1");
			break;
		case 2:
			System.out.println("Dice rolled and the value is 2");
			break;
		case 3:
			System.out.println("Dice rolled and the value is 3");
			break;
		case 4:
			System.out.println("Dice rolled and the value is 4");
			break;
		case 5:
			System.out.println("Dice rolled and the value is 5");
			break;
		default:
			System.out.println("Dice rolled and the value is 6");
			break;
			
		
		}
		

	}

}
