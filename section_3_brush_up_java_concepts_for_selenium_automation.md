
## Basic Data types

```
/**
 * NOTES:
 * 1) For working with variables, we must add the data type, such as int as below.
 * 2) Integer is a primitive data type, and String is a non-primitive data type
 */

// Int stores whole numbers
System.out.println("\n### Int stores whole numbers ###");
int two = 2;
int three = 3;
int sum = two+three;
System.out.println("2 + 3 is: "+sum);

// String stores text with multiple characters
System.out.println("\n### String stores text with multiple characters ###");
String firstName = "John";
String lastName = "Smith";
System.out.println("Hello "+firstName+" "+lastName);

// Char stores a single character. Uses single quotes.
System.out.println("\n### Char stores a single character. Uses single quotes. ###");
char singleLetter = 'A';
System.out.println("A char: "+singleLetter);

// Double stores numbers with a decimal point
System.out.println("\n### Double stores numbers with a decimal points ###");
double costOFItem = 699.99;
System.out.println("The fridge costs: "+costOFItem);

// Boolean stores true and false values
System.out.println("\n### Boolean stores true and false values ###");
boolean amIRight = true;
System.out.println("Am i right: "+amIRight);

/**
 * NOTES:
 * 1) There are multiple ways to use arays
 */		

// Creating a new int[] creates a place in memory for storing 3 integers.
System.out.println("\n### Creating a new int[] creates a place in memory for storing 3 integers ###");
int[] sweetsInJars  = new int[3];
sweetsInJars[0] = 10;
sweetsInJars[1] = 15;
sweetsInJars[2] = 20;
System.out.println("The 2nd jar has "+sweetsInJars[1]+" sweets");

// An alternative way to add numbers to an array
System.out.println("\n### An alternative way to add numbers to an array ###");
int[] lotteryNumbers = {2, 19, 23, 30, 32, 45, 48};
System.out.println("My 2nd lottery number is: "+ lotteryNumbers[1]);
System.out.println("All my lottery numbers are: "+ Arrays.toString(lotteryNumbers));

// Traditionally iterate through an array
System.out.println("\n### Traditionally iterate through an array ###");
for(int i=0; i < lotteryNumbers.length; i++ ) {
	System.out.println(lotteryNumbers[i]);
}

// Easy for loop
System.out.println("\n### Easy for loop ###");
String[] easyForLoop = {"i", "am", "easy", "to", "iterate"};
for(String s: easyForLoop) {
	System.out.println(s);
}

/**
 * NOTES:
 * 1) Using conditional statements within for loops
 */

// Loop through the array using a Switch statement to print different text based on the index number
System.out.println("\n### Loop through the array using a Switch statement to print different text based on the index number ###");
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

// Adding if statements so to print numbers that are divisible by 3 and NOT divisible by 3
System.out.println("\n### Adding if statements so to print numbers that are divisible by 3 and NOT divisible by 3 ###");
int[] divisibleByThree = {3, 6, 7, 9, 11, 12};
for(int i: divisibleByThree) {
	if(i % 3 == 0) {
		System.out.println(i+" is divisible by 3");

	} else {
		System.out.println(i+" is NOT divisible by 3");

	}
}

// Exit loop as soon as we have found a number to be divisible by 5. We ignore all other numbers.
System.out.println("\n### Exit loop as soon as we have found a number to be divisible by 5. We ignore all other numbers. ###");
System.out.println("### Breaking as soon as we can once we have proven a number is divisible by 5 is a shortcut, enabling the program to exit early, save time and is a form of optimisation. ###");
int[] divisibleByFive = {1, 3, 5, 7, 10, 15};
for(int i: divisibleByFive) {
	if(i % 5 == 0) {
		System.out.println(i+" is divisible by 5");
		break;
	} 
	
}		

/**
 * NOTES:
 * 1) Arraylist enables you add and remove indices dynamically during program execution.
 * This is in contrast to creating a static array where you defined the array size upfront.
 * To create an Arraylist array we need to import the package then create an instance of the class.
 */

System.out.println("\n### Arraylist enables you add and remove indices dynamically during program execution. ###");
ArrayList<String> dyamicArray = new ArrayList();
dyamicArray.add("Removed value");
dyamicArray.add("Im");
dyamicArray.add("Dynamic");
dyamicArray.remove(0);
System.out.println(dyamicArray.get());
System.out.println(dyamicArray.get(1));	
```
