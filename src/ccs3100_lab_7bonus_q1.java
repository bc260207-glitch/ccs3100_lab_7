import java.util.Scanner;

public class ccs3100_lab_7bonus_q1 {
 public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int number = 0;

     do {
         System.out.print("Enter an integer: ");
         number = input.nextInt();
         if (number != 0) {
        	 checkNumber(number);
         }
     } while (number != 0);

     System.out.println("Program finish.");
 }

 public static void checkNumber(int number) {
     if (number > 0) {
         System.out.println("Number is positive.\n");
     } else if (number < 0) {
         System.out.println("Number is negative.\n");
     }
 }
}
