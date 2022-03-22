package EnesMentoring.Apps;

import java.util.Scanner;

public class VendoringMachineElif {
    public static void main(String[] args) {
        /*

Vending machine app

Build a simple vending machine

Ask for the item
Give the price
Ask for buy option
sell the product
Give change
Be nice and say thank you at the end :)

// Please use arrays for item storage and price storage

 */
        System.out.println("**********************************");
        System.out.println("");
        System.out.println("Welcome to Batch12 Vending Machine");
        System.out.println("");
        System.out.println("**********************************");
        System.out.println("");


        String[] items = {"doritos", "hershey", "bubble gum", "oreo", "ruffles", "coke", "water"};
        double[] prices = {2.5, 1.75, 1, 2.25, 2.5, 3, .75};

        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to buy?");
        String askItem = input.nextLine().toLowerCase().trim();

        boolean flag = false;


        for (int i = 0; i < items.length; i++) {
            if (askItem.equals(items[i])) {
                System.out.println("Price for " + items[i] + " is $" + prices[i]);

                flag = true;
                System.out.println("Do you want to buy it. Yes/No");
                String yesOrNo = input.nextLine().trim().toLowerCase();

                if (yesOrNo.equals("yes")) {

                    System.out.println("Please enter the money");
                    double money = input.nextDouble();

                    if (money >= prices[i]) {
                        money -= prices[i];
                        System.out.println(items[i] + "has been purchased");
                        System.out.println("Your change is " + money + " $");
                        System.out.println("Have a great day!");

                    } else {
                        System.out.println(money + " is not enough for purchase");
                    }
                } else {
                    System.out.println("No item purchased");
                    System.out.println("Have a great day!");
                }
            }


        }
        if (!flag) {
            System.out.println("Please enter a valid item");
        }
    }
}