package Task3;
import java.util.Scanner;
public class Flower {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input the radius of the circle: ");
        double radius = scn.nextDouble();
        System.out.println("Perimeter is = " + (2 * radius * Math.PI));
        System.out.println("Area is = " + (Math.PI * radius * radius));
    }
}
