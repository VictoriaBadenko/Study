package Task2;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scn.nextInt();
        n = n * n;
        String a = Integer.toString(n);
        boolean is = false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '3') {
                is = true;
                break;
            }
        }
        System.out.println(is);
    }
}
