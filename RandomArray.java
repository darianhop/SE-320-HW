//Darian D. Hopkins
//CS 320 Software Construction
//Professor Akbas

import java.util.Random;
public class RandomArray {
	
	public static void main(String[] args) {
		java.util.Scanner indexer = new java.util.Scanner(System.in);
		int chosenIndex = 0;
		int[] RanArray = new int[100];
		
		while(true) {
		System.out.println("This program creates an array with 100 random elements. \n\n");
		
		Random ranN = new Random();
		
		for (int i = 0; i < RanArray.length; i++) {
			RanArray[i] = ranN.nextInt(); 
		}
				System.out.println("Please enter which array element/index you would like "
						+ "to view: \n"); 
				
					try {
						
						chosenIndex = indexer.nextInt();
						
						
						break;
					 }
					 catch (java.util.InputMismatchException ime) {
						 System.out.printf("Error, array only consists of indexes from 0 to 99. "
				               		+ "Please try again. \n\n");
						 indexer.nextLine();
						 
					 }
				}
				System.out.println("The array integer in index number "
					 + RanArray[chosenIndex] + " is:");
				
			
	  }

}

