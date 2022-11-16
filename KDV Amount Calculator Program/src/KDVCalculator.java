import java.util.Scanner;

public class KDVCalculator {
    public static void main(String[] args) {

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
