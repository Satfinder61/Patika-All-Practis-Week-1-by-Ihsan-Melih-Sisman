import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {



       /* Write a program that calculates the VAT value and the KDV amount of the money value received from the user with Java and prints it on the screen.
        (Note: Take the KDV amount as 18%)

        Price without KDV = 10;

        Price with KDV = 11.8;

        VAT amount = 1.8;

        If the amount entered is between 0 and 1000 TL, the VAT rate is 18%, if the amount is greater than 1000 TL,
        write the program that calculates the VAT amount as 8%.*/




        // Attributes that requested by given assignment.
        double amount;
        double KDVRate1 = 0.18;
        double KDVRate2 = 0.08;
        double KDVAmount;
        double amountWithKDV;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ücret Tutarınız: ");
        // Used to get price information of the product from the user
        amount = scanner.nextDouble();

        // Used to calculate KDV with some specific properties (e.g.: It is used to set the KDV rate based on Amount.)
        KDVAmount = (amount >= 0 && amount <= 1000) ? (amount*KDVRate1) : (amount*KDVRate2);
        // It performs the collection process with the price according to the adjusted KDV amount.
        amountWithKDV = KDVAmount + amount;

        // Used to perform specific rounding.
        double dfWithKDV = (double) Math.round(KDVAmount * 100) / 100;

        // Determines which KDV rate to use
        String KDVDecision = (amount >=0 && amount <= 1000) ? "%18" : "%8";

        System.out.println("KDV'siz Fiyat: " + amount);
        System.out.println("KDV Oranı: " + KDVDecision);
        System.out.println("KDV Tutarı: " +  dfWithKDV);
        System.out.print("KDV'li Tutar: " + amountWithKDV);


    }
}
