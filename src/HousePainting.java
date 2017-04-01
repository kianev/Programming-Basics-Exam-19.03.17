import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());

        double frontBackSide = 2 * (x * x) - (1.2 * 2);
        double sides = 2 * (x * y) - 2 *(1.5 * 1.5);
        double greenPaint = (frontBackSide + sides) / 3.4;

        double roofSides = 2 * (x * y);
        double roofFrontBack = 2 * (x * h / 2);
        double redPaint = (roofSides + roofFrontBack) / 4.3;


        System.out.printf("%.2f%n",greenPaint);
        System.out.printf("%.2f",redPaint);
    }
}
