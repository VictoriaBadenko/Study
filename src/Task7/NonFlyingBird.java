package Task7;

public class NonFlyingBird {
    public static void main(String[] args) {
        Bird[] bd = new Bird[4];
        bd[2] = new Penguin();
        bd[3] = new Chicken();
        System.out.println("Non-Flying Birds: " + bd[2] + "," + bd[3]);
    }
}
