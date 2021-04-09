package Task5;
import java.util.Locale;
import java.util.Scanner;
public class Float {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.ENGLISH);
        System.out.print("Input data: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();


        if (a >= -5f && a <= 5f && b >= -5f && b <= 5f && c >= -5f && c <= 5f)
            System.out.println("True");
        else
            System.out.println("False");

    }
}
