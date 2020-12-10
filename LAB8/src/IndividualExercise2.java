// By Mustafa Mert Tunali, COMP 109 LAB Week 8, Instructor: Mustafa Ersen

import java.util.Scanner;

/*
    A program that computes area of a Polygon with different number of sides
    Example 1:
        Input:
            Enter the side length: 12
        Output:
            Area for 3 sides with length 12 is 62,35
            Area for 4 sides with length 12 is 144,00
            Area for 5 sides with length 12 is 247,75
            Area for 6 sides with length 12 is 374,12
            Area for 7 sides with length 12 is 523,28
            Area for 8 sides with length 12 is 695,29
            Area for 9 sides with length 12 is 890,18
*/

public class IndividualExercise2 {

    public static double getArea(int nSide, final int SIDE_LENGTH){
        /*
            - Computes the area of the polygon based on the formula. We invoke that function in a for loop.
            - Returns double
         */
        return nSide * Math.pow(SIDE_LENGTH, 2) / (4.0 * Math.tan(Math.PI / nSide));
    }

    public static void main(String[] args) {

        // Promp to user for side length
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side length: ");
        final int SIDE_LENGTH = input.nextInt();

        /*
            - Number of side ranges start from 3 to 10.
            - Each iteration, we invoke areaOfPolygon function that returns double type area of the polygon.
            - And we print the result with 2 digits after decimal point using printf method.
         */
        for(int i = 3; i <= 10; i++){
            double areaOfPolygon = getArea(i, SIDE_LENGTH);
            System.out.print("Area for " + i + " sides with length " + SIDE_LENGTH + " is ");
            System.out.printf("%.2f\n", areaOfPolygon);
        }
    }
}
