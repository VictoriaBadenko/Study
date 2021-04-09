package Task3;
import java.util.Scanner;
public class Address {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What is your name?");
        String line1 = in.nextLine();
        System.out.print("Where do you live,"+ line1+ "?");
        String line2 = in.nextLine();
        System.out.println("Name:"+ line1 +' ' + "Address:" + line2);


    }
}
