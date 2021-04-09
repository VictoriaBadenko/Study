package Task7;

public class FlyingBird {
    public static void main(String[] args) {
        Bird[] bd = new Bird[2];
        bd[0] = new Eagle();
        bd[1] = new Swallow();
        System.out.println("Flying Birds: " + bd[0] + "," + bd[1]);
    }
}
