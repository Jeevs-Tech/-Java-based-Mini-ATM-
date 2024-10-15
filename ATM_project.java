import java.util.Scanner;

public class ATM_project {

    public static void main(String[] args) {

        int pinNo = 123;   // pin number
        int balance = 15000; // account balance
        int addAmount = 0; // starting point for deposit
        int takeAmount = 0;
        String name;
        
        Scanner scanner = new Scanner(System.in); // Scanner for user input

        System.out.println("Enter your pin number:");
        int password = scanner.nextInt(); // user input for password

        if (password == pinNo) {
            System.out.println("Enter your Account Name:");
            scanner.nextLine(); // consume newline left after nextInt
            name = scanner.nextLine();
            System.out.println("Welcome, " + name);

            while (true) {
                System.out.println("Press 1 to check your balance");
                System.out.println("Press 2 to Add amount");
                System.out.println("Press 3 to Withdraw amount");
                System.out.println("Press 4 to Get Receipt");
                System.out.println("Press 5 to EXIT");

                int option = scanner.nextInt(); // input option

                switch (option) {
                    case 1:
                        System.out.println("Your current balance is: " + balance);
                        break;

                    case 2:
                        System.out.println("How much amount do you want to add to your account?");
                        addAmount = scanner.nextInt();
                        balance += addAmount; // add the amount to balance
                        System.out.println("Successfully credited.");
                        break;

                    case 3:
                        System.out.println("Enter the amount to withdraw:");
                        takeAmount = scanner.nextInt();

                        if (takeAmount > balance) {
                            System.out.println("Insufficient balance.");
                            System.out.println("Try an amount less than your available balance.");
                        } else {
                            balance -= takeAmount; // subtract the amount from balance
                            System.out.println("Successfully withdrawn.");
                        }
                        break;

                    case 4:
                        System.out.println("ATM Receipt:");
                        System.out.println("Available balance: " + balance);
                        System.out.println("Amount Deposited: " + addAmount);
                        System.out.println("Amount Withdrawn: " + takeAmount);
                        System.out.println("Thank you for using our ATM!");
                        break;

                    default:
                        System.out.println("Please enter a valid option (1-5).");
                        break;
                }

                if (option == 5) {
                    System.out.println("Thank you!");
                    break;
                }
            }
        } else {
            System.out.println("Your password is wrong!");
            System.out.println("Please enter the correct password...");
        }

        scanner.close(); // close the scanner resource
    }
}
