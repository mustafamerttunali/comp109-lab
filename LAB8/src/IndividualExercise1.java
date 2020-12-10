// By Mustafa Mert Tunali, COMP 109 LAB Week 8, Instructor: Mustafa Ersen

import java.util.Scanner;

/*
    A program that determines the decimal part of the number.
    Example 1:
        Input:
            Enter a78 floating point number: 54334,543167
        Output:
            The digits after the decimal point in 54334,543167 is 543167 with length 6

*/

public class IndividualExercise1 {

    public static void PrintDecimalPoint(String number){
        /*
            Finds the comma in the given String type of number and return the index of comma to commaIndex variable.
            Then, subs the string by given number to find decimal point. We add 1 because we don't need the comma.
            Finally, it calculates the length of the decimal point and prints the result.
         */
        int commaIndex = number.indexOf(",");

        if(commaIndex != -1){
           String decimalPoint = number.substring(commaIndex + 1);
           int lengthOfCharacters = decimalPoint.length();
           System.out.println("The digits after the decimal point in " + number + " is " + decimalPoint + " with length " + lengthOfCharacters);
        }

        else{
            System.out.println("No decimal point");
        }
    }


    public static void main(String[] args) {

        // Promp to user to take String number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a floating point number: ");
        String number = input.next();

        // Invokes the PrintDecimalPoint function
        PrintDecimalPoint(number);

    }
}
