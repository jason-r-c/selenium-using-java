package section_3_brush_up_java_concepts_for_selenium_automation;

import java.util.Arrays;

public class Section_3_brush_up_java_concepts_for_selenium_automation {

	public static void main(String[] args) {
		
		/**
		 * NOTES:
		 * 1) For working with variables, we must add the data type, such as int as below.
		 * 2) Integer is a primitive data type, and String is a non-primitive data type
		 */
		
		// Int stores whole numbers
		int two = 2;
		int three = 3;
		int sum = two+three;
		System.out.println("2 + 3 is: "+sum);
		
		// String stores text with multiple characters
		String firstName = "John";
		String lastName = "Smith";
		System.out.println("Hello "+firstName+" "+lastName);
		
		// Char stores a single character. Uses single quotes.
		char singleLetter = 'A';
		System.out.println("A char: "+singleLetter);
		
		// Double stores numbrs with a decimal point
		double costOFItem = 699.99;
		System.out.println("The fridge costs: "+costOFItem);
		
		// Boolean stores true and false values
		boolean amIRight = true;
		System.out.println("Am i right: "+amIRight);
		
		// Creating a new int[] creates a place in memory for storing 7 integers
		int[] sweetsInJars  = new int[3];
		sweetsInJars[0] = 10;
		sweetsInJars[1] = 15;
		sweetsInJars[2] = 20;
		System.out.println("The 2nd jar has "+sweetsInJars[1]+" sweets");
		
		// An alternative way to add numbers to an array
		int[] lotteryNumbers = {2, 19, 23, 30, 32, 45, 48};
		System.out.println("My 2nd lottery number is: "+ lotteryNumbers[1]);
		System.out.println("All my lottery numbers are: "+ Arrays.toString(lotteryNumbers));
		
		// Loop through the array
		for(int i=0; i < lotteryNumbers.length; i++ ) {
			System.out.println(lotteryNumbers[i]);
		}
		
		// Loop through the array using a Switch statement to print different text based on the index number
		String[] reindeerNames = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen", "Rudolph"};
		for(int i = 0; i < reindeerNames.length; i++) {			
			switch (i) {
			case 0:
				System.out.println("The 1st reindeer is: "+reindeerNames[0]);
				break;
			case 1:
				System.out.println("The 2nd reindeer is: "+reindeerNames[1]);
				break;				
			case 2:
				System.out.println("The 3rd reindeer is: "+reindeerNames[2]);
				break;		
			case 3:
				System.out.println("The 4th reindeer is: "+reindeerNames[3]);
				break;				
			case 4:
				System.out.println("The 5th reindeer is: "+reindeerNames[4]);
				break;
			case 5:
				System.out.println("The 6th reindeer is: "+reindeerNames[5]);
				break;	
			case 6:
				System.out.println("The 7th reindeer is: "+reindeerNames[6]);
				break;				
			case 7:
				System.out.println("The 8th reindeer is: "+reindeerNames[7]);
				break;	
			case 8:
				System.out.println("The 9th reindeer is: "+reindeerNames[8]);
				break;								
			default:
				break;
			}
		}

	}

}
