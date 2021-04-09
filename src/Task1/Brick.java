package Task1;

import java.util.Scanner;
    public class Brick {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Input data:");
            double a = scan.nextDouble();
            double b = scan.nextDouble();
            double c = scan.nextDouble();
            double x = scan.nextDouble();
            double y = scan.nextDouble();

            if ((a <= 0) || (b <= 0) || (c <= 0) || (x <= 0) || (y <= 0)) {
                System.out.println("The data is not suitable for the task condition");
            } else
            {
                if (((a < x) && (b < y)) || ((a < y) && (b < x)) || ((a < x) && (c < y)) || ((a < y) && (c < x)) ||
                        ((b < x) && (c < y)) || ((b < y) && (c < x))) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }


