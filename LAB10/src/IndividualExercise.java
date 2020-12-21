// By Mustafa Mert Tunali, COMP 109 LAB Week 10, Instructor: Mustafa Ersen

/*
    A program that prints the Pascal's Triangle on the console.
    It has 2 method such as factorial and  combination:
        factorial:
            - Computes the factorial of a given positive integer n
        combination:
            - Uses the factorial method.
    Program output:
                [01]
              [01][01]
            [01][02][01]
          [01][03][03][01]
        [01][04][06][04][01]
      [01][05][10][10][05][01]
    [01][06][15][20][15][06][01]
  [01][07][21][35][35][21][07][01]
[01][08][28][56][70][56][28][08][01]

*/


public class IndividualExercise {

    public static int factorial(int n) {
        /*
            - A method that computes the factorial of a given integer n using recursion.
            - Returns computed factorial n!.
         */
        if(n == 0)
            return 1;

        else
            return(n * factorial(n - 1));
    }

    public static int combination(int n, int k) {
        /*
            - Invokes factorial method and returns C(n, k) = N! / (n-k)! * k!
         */
        return factorial(n) / (factorial(n - k) * factorial(k));
    }

    public static void main(String[] args) {

        // First 9 rows of the Pascal's triangle.
        final int N_ROWS = 9;

        // Row for loop - Each iteration, the row increases by 1
        for(int row = 0; row < N_ROWS; row++) {

            // Leading blank spaces, starts from 16. Every iteration, it decreases by 2 * row
            for(int i = 1; i <= 16 - (2 * row); i++)
                System.out.print(" ");

            // Invokes combination method, computes and prints the first 9 rows of the Pascal's triangle
            for(int j = 0; j <= row ; j++)
                System.out.printf("[%02d]", combination(row, j));

            // Enters new line.
            System.out.println();
        }
    }
}