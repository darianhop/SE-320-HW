
public class Calc {
		public static void main(String[] args) {
	        java.util.Scanner calculator = new java.util.Scanner(System.in);
	        int number1 = 0;
	        int number2 = 0;
	        while(true) {
	            System.out.print("This program calculates the sum of two integers. \n\n");        
	            try {
	            	System.out.print("Please enter the first integer:\n");
	                number1 = calculator.nextInt();
	                System.out.print("Please enter the second integer:\n");
	                number2 = calculator.nextInt();
	                
	                break;
	            } 
	            catch (java.util.InputMismatchException ime) {
	               System.out.printf("Error, only two integers are allowed for input. "
	               		+ "Please try again. \n\n");
	               calculator.nextLine(); 
	            }
	            
	        } 
	        System.out.printf("The sum of the two numbers is %d%n", (number1+number2));
	}
}
