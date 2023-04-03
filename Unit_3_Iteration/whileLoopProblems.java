
// This code calculates the average of marks of students on different tests. It uses a while loop to calculate the sum of the marks and the count of the marks. The total sum of the marks is divided by the total count of the marks to find the average.



// Author: Sanjay Javangula
// Date: 4/3/2023, 9:19:01 AM 


// Import Scanner 
import java.util.Scanner;

public class whileLoopProblems {
   // Main method
   public static void main(String[] args) {

        // Scanner instance
        Scanner scanner = new Scanner(System.in);

        // Use while to calculate the avg

        int mark = 0;
        int count=0;
        int sum=0;
        char option = 'y';
        // If the mark != -1

        while((option == 'y') || (option == 'Y')){

            // Prompt for the mark
            System.out.print("Mark: ");

            // Store the mark
            mark = scanner.nextInt();

                sum+=mark;
                count++;
                System.out.print("Continue enter y or yes and n for no:");
                option = scanner.next().charAt(0);


        }

        // Your avg is the sum /count

        System.out.println("Your avg is " + (sum/count));
   }
}
