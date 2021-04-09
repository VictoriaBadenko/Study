package Task2;
import java.util.Scanner;
public class Change {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = scn.nextInt();
        String s = Integer.toString(n);
        String num = s.substring(s.length()-1);

        for (int i = s.length() - 2; i >= 0; i--){
            num = num.concat(s.substring(i, i+1));
        }

        System.out.println("String = " + num);

    }
}
