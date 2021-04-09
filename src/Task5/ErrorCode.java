package Task5;
import java.util.Scanner;
public class ErrorCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the error number :");
        int a = scan.nextInt();

        if (a == 400) {
            System.out.println(a + ".invalidRequest");
        } else if (a == 401) {
            System.out.println(a + ".invalidCredentials");
        } else if (a == 403) {
            System.out.println(a + ".forbidden");
        } else if (a == 404) {
            System.out.println(a + ".notFound");
        } else if (a == 406) {
            System.out.println(a + ".notAcceptable");
        }
    }
    enum HTTPError {
        invalidCredentials, invalidRequest, notFound, notAcceptable, forbidden
    }
}
