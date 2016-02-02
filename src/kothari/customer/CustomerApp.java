package kothari.customer;

import java.util.Scanner;

public class CustomerApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        // create 1 or more line items
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.println("Enter a customer number:");
            String custNum = sc.nextLine();

            // get Customer information
            Customer customer = CustomerDB.getcustNum(custNum);

            // display the output
            String message = customer.getfull_name() + "\n" +
                    customer.getaddress() + "\n" +
                    customer.getcity() + ", " + customer.getstate() + " " +
                    customer.getpostalCode();
            String error_message = "There is no customer number " + custNum + " in our records.";

            if (customer.getfull_name().equalsIgnoreCase("Unknown")) {
                System.out.println(error_message);
            } else {
                System.out.println(message);
            }

            // see if the user wants to continue
            System.out.print("Display another customer? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }

        System.out.println("Goodbye!");
    }

}