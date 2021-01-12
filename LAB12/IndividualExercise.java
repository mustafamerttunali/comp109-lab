package lab12;

//By Mustafa Mert Tunali, COMP 109 LAB Week 12, Instructor: Mustafa Ersen

/*
	A program that prompts the user to enter a number between 0 and 511 then creates and 
	displays the corresponding matrix to the user-entered number with the characters H and T as 
	in the example console input and output below. 
	
	Input:
		Enter a number between 0 and 511: 12
	Output:
		T T T
		T T H
		H T T
	
*/

import java.util.Scanner;


public class IndividualExercise {
	
	public static String decimalToBinary(int decimalNumber, int numDigits) {
		
		/*
		 * 
		 * A method that converts decimal to binary and returns binary number as a string.
		 * I used different approach to solve that problem.
		 * My approach is based on a temp variable and reverse method.
		 * We can use some reverse functions in Java but I tried in a different and complex way.
		 * We can simplfy this method using 1 for and 2 if(Checking 0 or 1) then reverse using charAt
		 * 
		 * Arguments: decimalNumber(int), numDigits(int)
		 * Return: binaryString(String)
		 */
		
		String tString = "", binaryString = "";
		
		for(int i = decimalNumber; i > 0; i /= 2){
				
			tString += (i % 2);
		}
		
		
		for(int i = tString.length() - 1; i > -1; i--){
			
			binaryString += tString.charAt(i);
		}
		
		tString = "";
		for(int i = 0; i < numDigits - binaryString.length(); i++) {
			tString += "0";
		}
		
		
		return tString + binaryString;
	}

	public static void main(String[] args) {
		
		// Declare a 9x9 matrix
		String[][] nineCoinMatrix = new String[9][9];
		
		// Counter to check string index
		int counter = 0;
		
		
		// User input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 0 and 511:");
		int decimalNumber = input.nextInt();
		
		
		// Matrix Row
		for (int row = 0; row < nineCoinMatrix.length; row++) {
			
			  // Matrix Column  
			  for (int column = 0; column < nineCoinMatrix[row].length; column++) {
				  
				  // To solve range index error, we cannot check index 9
				  if(counter == decimalToBinary(decimalNumber, 9).length())
					  break;

				  // Check if the binary number is '0' then assign "T" to the [rowth][colth], invoking decimalToBinary method else H
				  if(decimalToBinary(decimalNumber, 9).charAt(counter++) == '0')
					  nineCoinMatrix[row][column] = "T";
				  else
					  nineCoinMatrix[row][column] = "H";			 
				  
				  // Enter a new line in the third columns
				  if(counter == 4 || counter == 7)
					  System.out.println();
				  
				  // Print represented coins.
				  System.out.print(nineCoinMatrix[row][column] + " ");
			  }
		}
		
	}

}
