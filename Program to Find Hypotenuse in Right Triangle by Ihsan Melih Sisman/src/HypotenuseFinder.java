import java.util.Scanner;

public class HypotenuseFinder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        double firstEdge = scanner.nextDouble();
        // Used to get first edge of triangle
        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        double secondEdge = scanner.nextDouble();
        // Used to get second edge of triangle


        // Calculates the hypotenuse and prints it
        double hypotenuse = Math.hypot(firstEdge, secondEdge);
        System.out.println("Hipotenus: " + hypotenuse);

        // Calculates perimeter of half triangle
        double perimeterOfHalfTriangle = (firstEdge + secondEdge + hypotenuse)/2;

        // Calculates perimeter of triangle
        double perimeterOfTriangle = 2 * perimeterOfHalfTriangle;
        System.out.println("Üçgenin Çevresi: " + perimeterOfTriangle);

        // Calculates area of the triangle
        double areaOfTriangle = perimeterOfHalfTriangle * (perimeterOfHalfTriangle - firstEdge) *
                (perimeterOfHalfTriangle - secondEdge) * (perimeterOfHalfTriangle - hypotenuse);
        areaOfTriangle = Math.sqrt(areaOfTriangle);
        System.out.println("Üçgenin Alanı: "+ areaOfTriangle);

    }
}
