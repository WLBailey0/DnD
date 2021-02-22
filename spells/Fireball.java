import java.util.Scanner;
import java.util.Random;

public class Fireball {
	
    public static void dice(int numDice, int inttypeOfDice){
        Random rand = new Random();
        int i;
	int[] roll = new int[numDice];

	
	for (i = 0; i < numDice; i++) {
            roll[i] = rand.nextInt(inttypeOfDice);
	        if (roll[i] == 0) { // if the roll has 0 as a value, re-roll
			i--;
		}
	    System.out.print(roll[i] + " ");
	}
	System.out.println("");
	
    }
        
    public static void main(String [] args) { 
    
        Scanner scnr = new Scanner(System.in);
	int numberOfDice;
	String typeOfDice;
	int inttypeOfDice;
	
	//get number of dice
	System.out.print("How many dice? ");
        numberOfDice = scnr.nextInt();
        System.out.println("");
	
	//get type of dice as a string then convert to int
	System.out.print("What type of dice (d4, d6, etc...)? ");
	typeOfDice = scnr.next();
	typeOfDice = typeOfDice.substring(1);
	inttypeOfDice = Integer.parseInt(typeOfDice);
	System.out.println(typeOfDice);
	
	// call dice function
	dice(numberOfDice, inttypeOfDice);
    }
}

