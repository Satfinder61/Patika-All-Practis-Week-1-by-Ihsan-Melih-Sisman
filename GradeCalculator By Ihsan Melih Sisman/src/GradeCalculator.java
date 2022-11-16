import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Matematik notunuz: ");
        // Used to get price information of the product from the user
        float math = scanner.nextFloat();
        System.out.print("Fizik notunuz: ");
        // Used to get price information of the product from the user
        float physics = scanner.nextFloat();
        System.out.print("Kimya notunuz: ");
        // Used to get price information of the product from the user
        float chemistry = scanner.nextFloat();
        System.out.print("Türkçe notunuz: ");
        // Used to get price information of the product from the user
        float turkish = scanner.nextFloat();
        System.out.print("Tarih notunuz: ");
        // Used to get price information of the product from the user
        float history = scanner.nextFloat();
        System.out.print("Müzik notunuz: ");
        // Used to get price information of the product from the user
        float music = scanner.nextFloat();

        // Since there are 6 courses, it is divided into 6.
        float average = (math + physics + chemistry + turkish + history + music) / 6;

        System.out.println("Ortalamanız: " + average);

        // If it exceeds 60, it means the average has passed the class.
        String result = average > 60 ? "Sınıfı Geçti" : "Sınıfta kaldı";
        System.out.println(result);


    }
}
