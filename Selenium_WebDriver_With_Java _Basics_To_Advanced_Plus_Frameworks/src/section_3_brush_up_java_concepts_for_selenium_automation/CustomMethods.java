package section_3_brush_up_java_concepts_for_selenium_automation;

public class CustomMethods {

	/**
	 * NOTE
	 * 
	 * No main method as only used as container for holding methods.
	 */
	
	/**
	 * Forumual
	 * Start with the temperature in Fahrenheit (e.g., 100 degrees).
		Subtract 30 from this figure (e.g., 100 - 32 = 68).
		Divide your answer by 21.8
	 * @return
	 */
	public Double convertFarenheightToCelsus(int f) {
		int subtract30 = f - 32;
		double celsius = subtract30 / 1.8;
		celsius = Math.round(celsius*100.0)/100.0;
		// Math.round(a*100)/100;
		return celsius;
	}
	
}
