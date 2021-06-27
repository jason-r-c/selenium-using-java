
public class Parent {

	/**
	 * Every java program calls this function first. 
	 * All code should be added here.
	 * Code added outside of this block will not be ran.
	 */
	public static void main(String[] args) {
		Methods methods = new Methods();
		
		// To print to the console we use the below function.
		methods.pStr("Hello world!");
		methods.Pdiv();
		
		// For working with variables, we must add the data type,
		// such as int as below.
		int two = 2;
		int three = 3;
		int sum = two+three;
		methods.pStr("Sum variable is: "+sum);
		methods.Pdiv();
		
		methods.pStr("Im pretending to be a home page");		
		methods.ValidateHeader();
		methods.Pdiv();
		
		String concatString = methods.ReturnString("something");
		methods.pStr(concatString);
		int concatInt = methods.ReturnInt(15);
		methods.pInt(concatInt);
		methods.Pdiv();
		
	}

}
