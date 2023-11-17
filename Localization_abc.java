package pack_3;

import java.text.*;
import java.util.*;
import java.util.Locale;

public class Localization_abc {
	
	public static void main(String[] args) 
    {
		Locale locale = Locale.UK;
		Locale localeUS = Locale.US;
		//Create number variables to be formatted
		double number = 12345.678;
		String num = "12345.678";
		
		//Format number in UK locale: Question 3-A
		NumberFormat nf = NumberFormat.getInstance(Locale.UK);
	
		nf.setMaximumFractionDigits(2);
		System.out.println("UK Form is:.. " + nf.format(number));
		
		//Format number to US currency format: Question 3-B
		NumberFormat nf2 = NumberFormat.getCurrencyInstance(localeUS);
		
		System.out.println("US currency form is:.. " + nf2.format(number));
		
		//Parse string into a double number: Question 3-C
		double parsed_string = Double.parseDouble(num);
		
		System.out.println(parsed_string);
		
    } 

}
