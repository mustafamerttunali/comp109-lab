package lab11;

// By Mustafa Mert Tunali, COMP 109 LAB Week 11, Instructor: Mustafa Ersen

/*
	A program that prints whick lockers were open in the end of the game as explained in during lab class.

	Output:
		Open lockers: 2 4 8 16 32 64
	
*/


public class IndividualExercise {
	
	public static boolean isSquareFree(int num) {
		/*
		 * A method that returns true if the number is square free or not returns false.
		 * Parameter: Number
		 * Return: True/False
		 * Type: Boolean 
		 * Stars from 2 until find a square free number.
		 */
		for(int div = 2; num != 1; div++) {
			
			int count = 0;
			
			while(num % div == 0) {
				num = num / div;
				count++;
				if(count == 2)
					return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		// Boolean and Int arrays to store the state of each locker and represent student ids.
		int[] studentIds = new int[100];
		boolean[] lockers = new boolean[100];
		
		// An outer loop for each student
		for(int i = 0; i < studentIds.length; i++) {
			
			// If the id is squareFree and even
			if(isSquareFree(i) && i % 2 == 0) {
				
				// Fill with that number - because only we accept that they are not absent.
				studentIds[i] = i;
				
				// We don't look at the default values.
				if(studentIds[i] != 0){
					
					// Start from studentId, increasing by studentId (3, 6, 9, 12, ...)
					for(int j = studentIds[i]; j < 100; j += studentIds[i]){
						
						// Change the state of locker.
						lockers[j - 1] = !lockers[j - 1];
					}
				}
			}
		}
		
		// Print the open lockers 
		System.out.print("Open lockers: ");
		for(int i = 0; i < 100; i++){
			if(lockers[i]){
				System.out.print((i + 1) + " " );
			}
		}
	}
}