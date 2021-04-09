package Task2;

public class Move {
    public static void main (String[] args) {
        int number = 1415467;
        String text = String.valueOf(number);
        text = text.substring(text.length()-1)+text.substring(1, text.length()-1)+text.charAt(0);
        number = Integer.parseInt(text);
        System.out.println(number);
    }
}
