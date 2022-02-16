
package com.bridgelabz.assignment;

/**
 * @author subhashree
 *
 */
public class SnakeAndLadder {
	
	//Declaring variables
	static int position=0;
	static int diceRolled=0;
	
	static int diceRolled() {
		int diceValue = (int)(Math.random() *6)+1;
		switch(diceValue) {
		case 1:
			return 1;	
		case 2:
			return 2;
		case 3:
			return 3;
		case 4:
			return 4;
		case 5:
			return 5;
		default:
			return 6;
		}	
	}
	
	static void checkOption(int diceValue) {
		int options = (int)(Math.random() *3)+1;
		
		//option 1 is no play
		//option 2 is ladder
		//option 3 is snake
		
		if(options==1) {
			System.out.println("The player is in same position");
		}
		else if(options==2) {
			
			position=position+diceValue;
			
			if(position >100) {
				position = position-diceValue;
			}
		}
		
		else {
			position=position-diceValue;
			
			if(position <0) {
				position=0;
			}
		}
		
		System.out.println("Position is  "+position+ "");
		
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int dice=diceRolled();
		System.out.println("Dice rolled and the value is  "+ dice );
	
		checkOption(dice);
		
		
	}

}
