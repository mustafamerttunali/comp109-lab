// By Mustafa Mert Tunali, COMP 109 LAB Week 9, Instructor: Mustafa Ersen

/*
    A program that uses nested loops to display the parallelogram shaped number and star pattern.

    Program output:
        7654321*
         54321***
          321*****
           1*******
*/


public class IndividualExercise1 {
    public static void main(String[] args) {

      // Number of rows - It's constant.
      final int N_ROW = 4;

      /*
        - Row loop, starts from 0 to 4 (0, 1, 2, 3)
        - There are 3 loops in nested row loop:
            - A loop that prints blank space based on the nth row. (For example: 2nd Row = 1 blank space)
            - Another loop that prints the numbers, starts from 7  to 1. Each row, the number of the value decreases 2.
                - Row 1: numbers from 7 to 1
                - Row 2: numbers from 5 to 1
                - Row 3: numbers from 3 to 1
                - Row 4: number 1
            - Final loop which prints stars based on the nth row. Each row, the numbers of the stars increases 2.
                - Row 1: 1 star
                - Row 2: 3 stars
                - Row 3: 5 stars
                - Row 4: 7 Stars
            - In last line of the Row loop, It prints a newline to end each row.
       */

      // Start from 0 to 4, increase it 1.
      for(int row = 0; row < N_ROW; row++){

          // Starts from 0 to 4, prints blank space in every row changes.
          for(int i = 0; i < row; i++)
              System.out.print(" ");

          /*
            - Starts from 7 to 1. The calculation is based on the row starting position.
            - For example:
                1.) The first value of the "row" variable is 0.
                2.) Then, based on the calculation, 7 - ( 2 * 0) is 7.
                3.) When the "row" variable increases, the number value decreases by -2.
                    - Row 2: "row" variable is equal to 1 (because row stars from 0) so 7 - ( 2 * 1) is 5
                    - Row 3: "row" variable is equal to 2, the result is 7 - ( 2 * 2) = 3
                    - Row 4: "row" = 3, so the result will be 1 because of 7 - (2 * 3) = 1
            - Print the number.
           */
          for(int j = 7 - ( 2 * row); j >= 1 ; --j)
              System.out.print(j);

          /*
            - Starts from -1 to 2 * row - 1, increases by 1 when the row changes.
            - Prints star or stars based on the nth row.
            - For example:
                1.) Row 1: 1 star because -1 is equal to 2 * 0 - 1; ( -1 <= -1) the loop executed 1 times
                2.) Row 2: 3 star because 0 is lower than 1. It executed 2 times because we use "<=".
           */
          for(int z = -1; z <= 2 * row - 1; z++)
              System.out.print("*");

          // prints a newline to end each row.
          System.out.println();
      }
    }
}
