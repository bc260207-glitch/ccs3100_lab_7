import java.util.Scanner;

public class ccs3100_lab_7 {
    static Scanner input = new Scanner(System.in);
    
    static char nationality;    // M, F
    static char classification; // I, E, O
    static char category;       // A, C, S
    
    static int ticketNum;       

    public static void main(String[] args) {
        char processAnotherVisitor = ' '; // While 1
        char buyMoreTicket = ' ';         // While 2
        double totalPay1 = 0.00; 
        double totalPay2 = 0.00;          
  
        System.out.println("ZOO NEGARA ENTRANCE TICKET PAYMENT SYSTEM");

        do {
	    	totalPay2 = 0.00; //reset While data
            System.out.println("\n******VISITOR*******");

            do {
                // methodInput_userInfo
            	methodInput_userInfo();

                // methodCalculate_totalPay1
                totalPay1 = methodCalculate_totalPay1(nationality, classification, category, ticketNum);
                System.out.printf("Total is RM %.2f\n", totalPay1);
                totalPay2 = totalPay2 + totalPay1;

	            System.out.print("\nBuy more ticket (Y/N)?: ");
	            buyMoreTicket = input.next().toUpperCase().charAt(0);

            } while (buyMoreTicket == 'Y');

            // methodOutput_totalPay2
            methodOutput_totalPay2(totalPay2);

            System.out.print("\nProcess another visitor (Y/N)?: ");
            processAnotherVisitor = input.next().toUpperCase().charAt(0);

        } while (processAnotherVisitor == 'Y');

        System.out.println("\nApplication finish.");
    }

    public static void methodInput_userInfo() {
        System.out.print("\nEnter nationality (M=Malaysian, F=Foreigner): ");
        nationality = input.next().toUpperCase().charAt(0);

        if (nationality == 'M') {
            System.out.println("Choose category of visitor");
            System.out.print("(A- Adult, C - Children, S - Senior): ");
            category = input.next().toUpperCase().charAt(0);
        } else if (nationality == 'F') {
            System.out.println("Enter classification");
            System.out.print("(I- Kad/Working Permit/Dependent Pass, E- Asean, O- Others): ");
            classification = input.next().toUpperCase().charAt(0);
            System.out.println("Choose category of visitor");
            System.out.print("(A- Adult, C - Children, S - Senior): ");
            category = input.next().toUpperCase().charAt(0);
        }

        System.out.print("Number of tickets: ");
        ticketNum = input.nextInt();
    }

    public static double methodCalculate_totalPay1(char nationality, char classification, char category, int ticketNum) {
        double totalPay1 = 0.00;
    	double oneTicketPrice = 0.00;

        if (nationality == 'M') {
            switch (category) {
                case 'A': oneTicketPrice = 43.00; break;
                case 'C': oneTicketPrice = 16.00; break;
                case 'S': oneTicketPrice = 20.00; break;
            }
        }else if (nationality == 'F') {
            switch (classification) {
                case 'I':
                    switch (category) {
                        case 'A': oneTicketPrice = 50.00; break;
                        case 'C': oneTicketPrice = 25.00; break;
                        case 'S': oneTicketPrice = 30.00; break;
                    }
                    break;
                case 'E': 
                    switch (category) {
                        case 'A': oneTicketPrice = 61.00; break;
                        case 'C': oneTicketPrice = 30.00; break;
                        case 'S': oneTicketPrice = 35.00; break;
                    }
                    break;
                case 'O': 
                    switch (category) {
                        case 'A': oneTicketPrice = 80.00; break;
                        case 'C': oneTicketPrice = 40.00; break;
                        case 'S': oneTicketPrice = 50.00; break;
                    }
                    break;
            }
        }

        totalPay1 = oneTicketPrice * ticketNum;
        return totalPay1;
    }

    public static void methodOutput_totalPay2(double totalPay2) {
        System.out.printf("\nThe total payment for receipt is RM %.2f\n", totalPay2);
    }
}