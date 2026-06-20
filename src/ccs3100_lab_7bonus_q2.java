import java.util.Scanner;

public class ccs3100_lab_7bonus_q2 {
	
	 static Scanner input = new Scanner(System.in);
	 static int productId;
	 static double price;
	 static int quantity;
	 
 public static void main(String[] args) {
     
     double totalPrice = 0.00;

     //list
     System.out.println("Product list");
     System.out.println("ID  | Price (RM)");
     System.out.println("1   | 2.90");
     System.out.println("2   | 4.50");
     System.out.println("3   | 9.90");
     System.out.println("4   | 4.50");
     System.out.println("5   | 6.80");

     do {
    	 userInput();

         if(productId != 0) {
        	 matchPrice(productId);
             totalPrice = price * quantity;
             System.out.printf("Total (RM) : (%.2f x %d) = %.2f\n", price, quantity, totalPrice);
         }
         
     } while (productId != 0); 

     System.out.println("Program finish.");
 }
 
 public static void userInput() {
     System.out.print("\nEnter a product number (0 to stop) : ");
     productId = input.nextInt();
     
     if (productId != 0) {
         System.out.print("Enter the quantity of products sold : ");
         quantity = input.nextInt();
     }
 }

 public static void matchPrice(int productId) {
     switch (productId) {
     case 1: price = 2.90; break;
     case 2: price = 4.50; break;
     case 3: price = 9.90; break;
     case 4: price = 4.50; break;
     case 5: price = 6.80; break;
     
     }
 }

}