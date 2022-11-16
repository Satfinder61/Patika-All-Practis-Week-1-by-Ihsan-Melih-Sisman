import java.util.Scanner;

public class Taximeter {
    public static void main(String[] args) {

        /*
        Write a program that prints the taximeter amount on the screen according to the distance traveled (KM) with Java.

        Taximeter costs 2.20 TL per km.

        The minimum amount to be paid is 20 TL. 20 TL will be charged for the fees below 20 TL.

        The taximeter opening fee is 10 TL.
        */


        // Attributes that requested by given assignment.
        double pricePerKM = 2.20;
        double openingFee = 10.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Gidilecek Mesafe (KM): ");
        double distance = scanner.nextDouble();
        // Used to get price information of the product from the user

        // Calculates the price of taxi according to the assignment
        double price = (pricePerKM * distance) + openingFee;

        // Defines the min price due to short distance
        double min = (price >= 0 && price <=20) ? (price = 20.0) : (price = price);

        // Prints the price
        System.out.print("Ödenecek Tutar: " + price + "TL.");

    }
}
