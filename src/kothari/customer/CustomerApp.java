package kothari.customer;

import java.util.Scanner;

public class CustomerApp {

    private static Scanner sc = new Scanner(System.in);
    public static String message;

    public static String getString(String prompt) {
        System.out.println(prompt);
        String s = sc.nextLine();
        return s;
    }


    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Customer Viewer");
        System.out.println();

        // create 1 or more line items
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get input from user
            System.out.println("Enter a customer number");

            // get Customer information
            Customer customer = CustomerDB.getcustNum(custNum);

            // display the output
            String message = customer.getfull_name() + "\n" +
                    customer.getaddress() + "\n" +
                    customer.getcity() + "," + customer.getstate() + " " +
                    customer.getpostalCode();
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Display another customer? (y/n): ");
            choice = sc.nextLine();
            System.out.println();

        }

        System.out.println("Goodbye!");
    }

}
