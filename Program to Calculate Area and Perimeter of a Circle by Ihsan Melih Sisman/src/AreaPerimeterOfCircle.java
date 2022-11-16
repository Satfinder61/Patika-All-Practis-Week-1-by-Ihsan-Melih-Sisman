import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaPerimeterOfCircle {
    public static void main(String[] args) {



        /*
        Write a program in Java that calculates the area and perimeter of a circle whose radius you get from the user.

        Area Formula: π * r * r;

        Perimeter Formula: 2 * π * r;
        */

        Scanner scanner = new Scanner(System.in);


        // Makes a new decimal form
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.print("Dairenin Yarıçapı: ");
        // Used to get radius information of the circle from the user
        double radius = scanner.nextDouble();

        // Calculates the area of circle
        double areaOfCircle = Math.PI * radius * radius;
        // Calculates the perimeter of circle
        double perimeterOfCircle = 2 * Math.PI * radius;

        System.out.println("Dairenin Alanı: " + df.format(areaOfCircle));
        System.out.println("Dairenin Çevresi: " + df.format(perimeterOfCircle));

        System.out.print("Merkez Açı Ölçüsünü Giriniz (0-360) : ");
        // Used to get central angle information of the circle from the user
        double measureOfCentralAngle = scanner.nextDouble();

        // Calculates the area of circle slice
        double centralAngle = (Math.PI * (radius * radius) * measureOfCentralAngle) / 360;
        System.out.println("Verilen açıda daire diliminin alanı " + df.format(centralAngle));

    }
}
